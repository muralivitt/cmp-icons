# Complete Specification & Guide: Multi-Module CMP Icon Library Publishing to Maven Central

* **GitHub Repository:** [https://github.com/muralivitt/cmp-icons](https://github.com/muralivitt/cmp-icons)
* **Maven Group ID:** `io.github.muralivitt`
* **Architecture:** Multi-Module Monorepo (Modular Icon Packs)
* **Published Artifacts:**
  * `io.github.muralivitt:cmp-icons-vuesax:1.0.0`
  * `io.github.muralivitt:cmp-icons-tabler:1.0.0`
  * `io.github.muralivitt:cmp-icons:1.0.0` *(Optional All-in-One umbrella bundle)*

This guide provides an end-to-end blueprint for building, signing, and releasing your multi-module Compose Multiplatform icon suite to **Maven Central** from **`muralivitt/cmp-icons`**.

---

## 1. System Architecture & Flow

```mermaid
flowchart TD
    subgraph Repo["GitHub Repository (muralivitt/cmp-icons)"]
        V["icons-vuesax module"]
        T["icons-tabler module"]
        U["cmp-icons (umbrella bundle)"]
    end

    Repo -->|"Git Tag Push (e.g. v1.0.0)"| CI["GitHub Actions CI Workflow"]
    CI -->|"Builds Android AARs & iOS klibs"| VPK["Vanniktech Maven Publish Plugin"]
    VPK -->|"Signs with GPG & deploys bundles"| SCP["Sonatype Central Portal<br/>(central.sonatype.com)"]
    SCP -->|"Syncs (~15-30 mins)"| MC["Maven Central Repository"]

    MC -->|"implementation('...:cmp-icons-vuesax:1.0.0')"| App1["App Project A (Vuesax only)"]
    MC -->|"implementation('...:cmp-icons-tabler:1.0.0')"| App2["App Project B (Tabler only)"]
    MC -->|"implementation('...:cmp-icons:1.0.0')"| App3["App Project C (All Icons)"]
```

---

## 2. Multi-Module Directory Structure

Inside your `cmp-icons` repository, organize the structure as follows:

```
cmp-icons/
├── .github/
│   └── workflows/
│       └── publish.yml                 # Automated release pipeline
├── gradle/
│   ├── libs.versions.toml              # Version catalog
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
│
├── icons-vuesax/                       # Module 1: Vuesax Icon Pack
│   ├── src/
│   │   └── commonMain/
│   │       └── kotlin/
│   │           └── com/muralivitt/cmp/icons/vuesax/
│   │               ├── bold/
│   │               ├── linear/
│   │               ├── outline/
│   │               ├── twotone/
│   │               ├── other/
│   │               └── extra/
│   └── build.gradle.kts
│
├── icons-tabler/                       # Module 2: Tabler Icon Pack
│   ├── src/
│   │   └── commonMain/
│   │       └── kotlin/
│   │           └── com/muralivitt/cmp/icons/tabler/
│   │               ├── filled/
│   │               └── outline/
│   └── build.gradle.kts
│
├── cmp-icons/                          # Module 3 (Optional): All-in-One Umbrella
│   └── build.gradle.kts
│
├── build.gradle.kts                    # Root build script
├── settings.gradle.kts                 # Root settings
├── gradle.properties                   # Performance & memory settings
├── LICENSE                             # MIT License
└── README.md                           # Documentation & catalog
```

---

## 3. Configuration Files

### 3.1 `settings.gradle.kts`
```kotlin
rootProject.name = "cmp-icons"

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

include(":icons-vuesax")
include(":icons-tabler")
include(":cmp-icons")
```

---

### 3.2 `gradle/libs.versions.toml`
```toml
[versions]
agp = "8.8.2"
kotlin = "2.1.10"
compose-multiplatform = "1.7.3"
vanniktech-publish = "0.30.0"
android-compileSdk = "35"
android-minSdk = "24"

[libraries]
# Compose Multiplatform core dependencies
compose-runtime = { module = "org.jetbrains.compose.runtime:runtime", version.ref = "compose-multiplatform" }
compose-foundation = { module = "org.jetbrains.compose.foundation:foundation", version.ref = "compose-multiplatform" }
compose-ui = { module = "org.jetbrains.compose.ui:ui", version.ref = "compose-multiplatform" }
compose-material3 = { module = "org.jetbrains.compose.material3:material3", version.ref = "compose-multiplatform" }

[plugins]
androidLibrary = { id = "com.android.library", version.ref = "agp" }
kotlinMultiplatform = { id = "org.jetbrains.kotlin.multiplatform", version.ref = "kotlin" }
composeMultiplatform = { id = "org.jetbrains.compose", version.ref = "compose-multiplatform" }
composeCompiler = { id = "org.jetbrains.kotlin.plugin.compose", version.ref = "kotlin" }
vanniktechMavenPublish = { id = "com.vanniktech.maven.publish", version.ref = "vanniktech-publish" }
```

---

### 3.3 Root `build.gradle.kts`
```kotlin
plugins {
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.vanniktechMavenPublish) apply false
}
```

---

### 3.4 Module 1: `icons-vuesax/build.gradle.kts`
```kotlin
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.vanniktechMavenPublish)
}

kotlin {
    androidTarget {
        publishLibraryVariants("release")
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
            implementation(libs.compose.ui)
            implementation(libs.compose.material3)
        }
    }
}

android {
    namespace = "com.muralivitt.cmp.icons.vuesax"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}

mavenPublishing {
    coordinates(
        groupId = "io.github.muralivitt",
        artifactId = "cmp-icons-vuesax",
        version = System.getenv("RELEASE_VERSION") ?: "1.0.0"
    )

    pom {
        name.set("CMP Icons - Vuesax")
        description.set("Vuesax icon pack compiled for Compose Multiplatform (Android & iOS).")
        inceptionYear.set("2026")
        url.set("https://github.com/muralivitt/cmp-icons")
        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        developers {
            developer {
                id.set("muralivitt")
                name.set("Murali Vitt")
                url.set("https://github.com/muralivitt")
            }
        }
        scm {
            url.set("https://github.com/muralivitt/cmp-icons")
            connection.set("scm:git:git://github.com/muralivitt/cmp-icons.git")
            developerConnection.set("scm:git:ssh://git@github.com/muralivitt/cmp-icons.git")
        }
    }

    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
}
```

---

### 3.5 Module 2: `icons-tabler/build.gradle.kts`
```kotlin
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.vanniktechMavenPublish)
}

kotlin {
    androidTarget {
        publishLibraryVariants("release")
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
            implementation(libs.compose.ui)
            implementation(libs.compose.material3)
        }
    }
}

android {
    namespace = "com.muralivitt.cmp.icons.tabler"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}

mavenPublishing {
    coordinates(
        groupId = "io.github.muralivitt",
        artifactId = "cmp-icons-tabler",
        version = System.getenv("RELEASE_VERSION") ?: "1.0.0"
    )

    pom {
        name.set("CMP Icons - Tabler")
        description.set("Tabler icon pack compiled for Compose Multiplatform (Android & iOS).")
        inceptionYear.set("2026")
        url.set("https://github.com/muralivitt/cmp-icons")
        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        developers {
            developer {
                id.set("muralivitt")
                name.set("Murali Vitt")
                url.set("https://github.com/muralivitt")
            }
        }
        scm {
            url.set("https://github.com/muralivitt/cmp-icons")
            connection.set("scm:git:git://github.com/muralivitt/cmp-icons.git")
            developerConnection.set("scm:git:ssh://git@github.com/muralivitt/cmp-icons.git")
        }
    }

    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
}
```

---

### 3.6 Module 3: `cmp-icons/build.gradle.kts` (Umbrella Module)
```kotlin
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.vanniktechMavenPublish)
}

kotlin {
    androidTarget {
        publishLibraryVariants("release")
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            // Re-exports both icon packs via api()
            api(project(":icons-vuesax"))
            api(project(":icons-tabler"))
        }
    }
}

android {
    namespace = "com.muralivitt.cmp.icons"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}

mavenPublishing {
    coordinates(
        groupId = "io.github.muralivitt",
        artifactId = "cmp-icons",
        version = System.getenv("RELEASE_VERSION") ?: "1.0.0"
    )

    pom {
        name.set("CMP Icons - Umbrella Bundle")
        description.set("All-in-one Compose Multiplatform icon pack bundle.")
        inceptionYear.set("2026")
        url.set("https://github.com/muralivitt/cmp-icons")
        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/licenses/MIT")
            }
        }
        developers {
            developer {
                id.set("muralivitt")
                name.set("Murali Vitt")
                url.set("https://github.com/muralivitt")
            }
        }
        scm {
            url.set("https://github.com/muralivitt/cmp-icons")
            connection.set("scm:git:git://github.com/muralivitt/cmp-icons.git")
            developerConnection.set("scm:git:ssh://git@github.com/muralivitt/cmp-icons.git")
        }
    }

    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
}
```

---

## 4. One-Time Setup: Sonatype & GPG Signing

To publish to Maven Central, Maven requires every artifact to be digitally signed with a PGP/GPG key and uploaded under a verified namespace.

### Step 4.1: Verify Namespace on Sonatype Central Portal
1. Go to [https://central.sonatype.com/](https://central.sonatype.com/) and register/sign in with your GitHub account (`muralivitt`).
2. Click your profile avatar (top-right) -> **View Account** -> **Namespaces**.
3. Click **Add Namespace** and enter `io.github.muralivitt`.
4. Sonatype will provide a verification code (e.g. `splendid-kangaroo-12345`).
5. Create a temporary **public** repository named with that verification code under your GitHub account: `github.com/muralivitt/splendid-kangaroo-12345`.
6. Click **Verify** on Sonatype. Once verified, you own `io.github.muralivitt` permanently. You can delete the temporary verification repo.
7. Under your Account, click **Generate User Token**. Copy both:
   * `Username` (token key)
   * `Password` (token secret)

### Step 4.2: Generate GPG Signing Key
On your Mac:

```bash
# 1. Generate key (RSA, 4096 bits)
gpg --gen-key

# 2. List keys to get your Key ID (e.g. the 8 or 16 hex characters after rsa4096/)
gpg --list-secret-keys --keyid-format LONG

# 3. Publish public key to keyservers
gpg --keyserver keys.openpgp.org --send-keys YOUR_KEY_ID
gpg --keyserver keyserver.ubuntu.com --send-keys YOUR_KEY_ID

# 4. Export the private key (ASCII armored) and copy it
gpg --armor --export-secret-keys YOUR_KEY_ID | pbcopy
```

---

## 5. GitHub Repository Secrets Configuration

In your GitHub repository ([muralivitt/cmp-icons](https://github.com/muralivitt/cmp-icons)), go to **Settings** -> **Secrets and variables** -> **Actions** -> **Repository secrets** and add:

| Secret Name | Value |
| :--- | :--- |
| `SONATYPE_CENTRAL_USERNAME` | The generated token username from Sonatype Central |
| `SONATYPE_CENTRAL_PASSWORD` | The generated token password from Sonatype Central |
| `GPG_SIGNING_KEY` | The full ASCII-armored private GPG key (`-----BEGIN PGP PRIVATE KEY BLOCK----- ...`) |
| `GPG_PASSWORD` | The passphrase you chose when creating the GPG key |

---

## 6. GitHub Actions CI/CD Pipeline

In `cmp-icons`, create `.github/workflows/publish.yml`:

```yaml
name: Publish to Maven Central

on:
  release:
    types: [published]
  workflow_dispatch:
    inputs:
      version:
        description: 'Version to publish (e.g. 1.0.0)'
        required: true
        type: string

jobs:
  publish:
    name: Build, Sign, and Publish
    runs-on: macos-14 # macOS runner required for Apple iOS targets (iosArm64, iosX64, iosSimulatorArm64)
    steps:
      - name: Checkout Code
        uses: actions/checkout@v4

      - name: Set up JDK 18
        uses: actions/setup-java@v4
        with:
          distribution: 'zulu'
          java-version: '18'

      - name: Setup Gradle
        uses: gradle/actions/setup-gradle@v3

      - name: Determine Version
        run: |
          if [ "${{ github.event_name }}" = "release" ]; then
            TAG="${{ github.event.release.tag_name }}"
            # Strip leading 'v' if present (v1.0.0 -> 1.0.0)
            VERSION="${TAG#v}"
            echo "RELEASE_VERSION=$VERSION" >> $GITHUB_ENV
          else
            echo "RELEASE_VERSION=${{ inputs.version }}" >> $GITHUB_ENV
          fi

      - name: Publish all modules to Maven Central
        run: ./gradlew publishAndReleaseToMavenCentral --no-configuration-cache
        env:
          RELEASE_VERSION: ${{ env.RELEASE_VERSION }}
          ORG_GRADLE_PROJECT_mavenCentralUsername: ${{ secrets.SONATYPE_CENTRAL_USERNAME }}
          ORG_GRADLE_PROJECT_mavenCentralPassword: ${{ secrets.SONATYPE_CENTRAL_PASSWORD }}
          ORG_GRADLE_PROJECT_signingInMemoryKey: ${{ secrets.GPG_SIGNING_KEY }}
          ORG_GRADLE_PROJECT_signingInMemoryKeyPassword: ${{ secrets.GPG_PASSWORD }}
```

---

## 7. Migration Steps for Vuesax Icons

1. Copy the source files from:
   ```
   vidya-cmp-mobile/shared/vuesax-icons/src/commonMain/kotlin/com/khee/shared/vuesax/icons/
   ```
   into the new repo:
   ```
   cmp-icons/icons-vuesax/src/commonMain/kotlin/com/muralivitt/cmp/icons/vuesax/
   ```
   *(Optionally keep `com.khee.shared.vuesax.icons` as the package if you want zero import changes in your existing app, or refactor to `com.muralivitt.cmp.icons.vuesax`)*.
2. Commit and push everything to `muralivitt/cmp-icons`.
3. Create a Git release:
   ```bash
   git tag v1.0.0
   git push origin v1.0.0
   ```
   Then create a GitHub Release for tag `v1.0.0`.
4. The GitHub Action will publish:
   - `io.github.muralivitt:cmp-icons-vuesax:1.0.0`
   - `io.github.muralivitt:cmp-icons-tabler:1.0.0`
   - `io.github.muralivitt:cmp-icons:1.0.0`
5. Check [central.sonatype.com/publishing/deployments](https://central.sonatype.com/publishing/deployments) to verify that deployment passes validation and is published.

---

## 8. Consuming in App Projects (`vidya-cmp-mobile`)

Once published:

### In `gradle/libs.versions.toml`:
```toml
[versions]
cmpIcons = "1.0.0"

[libraries]
# Choose specific packs:
cmp-icons-vuesax = { module = "io.github.muralivitt:cmp-icons-vuesax", version.ref = "cmpIcons" }
cmp-icons-tabler = { module = "io.github.muralivitt:cmp-icons-tabler", version.ref = "cmpIcons" }

# Or the all-in-one bundle:
cmp-icons-all = { module = "io.github.muralivitt:cmp-icons", version.ref = "cmpIcons" }
```

### In consumer module `build.gradle.kts` (e.g. `shared/ui/build.gradle.kts`):
```kotlin
commonMain.dependencies {
    implementation(libs.cmp.icons.vuesax) // Only pulls Vuesax!
}
```

### In `settings.gradle.kts`:
Remove the local module:
```kotlin
// Remove: include(":shared:vuesax-icons")
```
And delete the local `shared/vuesax-icons` folder. Clean rebuild your project.



