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

    jvm()

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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()

    coordinates(
        groupId = "io.github.muralivitt",
        artifactId = "cmp-icons-tabler",
        version = System.getenv("RELEASE_VERSION") ?: "1.0.0"
    )

    pom {
        name.set("CMP Icons - Tabler")
        description.set("Tabler icon pack compiled for Compose Multiplatform (Android, iOS & Desktop).")
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
}
