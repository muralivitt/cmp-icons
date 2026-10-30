# Compose Multiplatform Icons (`cmp-icons`)

A curated collection of popular icon packs compiled for **Compose Multiplatform** targeting **Android**, **iOS**, and **Desktop (JVM)**.

- **Vuesax Icons**: Bold, Linear, Outline, Twotone, and Extra sets.
- **Tabler Icons**: Filled and Outline sets (over 5,000+ icons).
- **All-in-One Umbrella**: Bundle including both icon suites.

---

## Published Artifacts

| Module | Artifact ID | Description |
| :--- | :--- | :--- |
| **Vuesax** | `io.github.muralivitt:cmp-icons-vuesax:<version>` | Complete Vuesax icon pack |
| **Tabler** | `io.github.muralivitt:cmp-icons-tabler:<version>` | Complete Tabler icon pack |
| **All-in-One** | `io.github.muralivitt:cmp-icons:<version>` | Umbrella dependency including both |

---

## Installation

### Version Catalog (`gradle/libs.versions.toml`)

```toml
[versions]
cmpIcons = "1.0.0"

[libraries]
# Choose individual packs to minimize bundle size:
cmp-icons-vuesax = { module = "io.github.muralivitt:cmp-icons-vuesax", version.ref = "cmpIcons" }
cmp-icons-tabler = { module = "io.github.muralivitt:cmp-icons-tabler", version.ref = "cmpIcons" }

# Or use the umbrella bundle:
cmp-icons = { module = "io.github.muralivitt:cmp-icons", version.ref = "cmpIcons" }
```

### Module `build.gradle.kts`

```kotlin
kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.cmp.icons.vuesax)
            // or: implementation(libs.cmp.icons.tabler)
            // or: implementation(libs.cmp.icons)
        }
    }
}
```

---

## Usage

All icons are typed Compose `ImageVector` instances that can be directly used in `Icon`, `Image`, or any Compose component:

### Vuesax Icons

```kotlin
import androidx.compose.material3.Icon
import com.muralivitt.cmp.icons.vuesax.bold.VuesaxIconsBold
import com.muralivitt.cmp.icons.vuesax.bold.Teacher
import com.muralivitt.cmp.icons.vuesax.outline.VuesaxIconsOutline
import com.muralivitt.cmp.icons.vuesax.outline.Setting2

@Composable
fun ProfileHeader() {
    Icon(
        imageVector = VuesaxIconsBold.Teacher,
        contentDescription = "Teacher"
    )
    Icon(
        imageVector = VuesaxIconsOutline.Setting2,
        contentDescription = "Settings"
    )
}
```

### Tabler Icons

```kotlin
import androidx.compose.material3.Icon
import com.muralivitt.cmp.icons.tabler.filled.TablerIconFilled
import com.muralivitt.cmp.icons.tabler.filled.SwipeUp
import com.muralivitt.cmp.icons.tabler.outline.TablerIconOutline
import com.muralivitt.cmp.icons.tabler.outline.Home

@Composable
fun NavigationBar() {
    Icon(
        imageVector = TablerIconOutline.Home,
        contentDescription = "Home"
    )
    Icon(
        imageVector = TablerIconFilled.SwipeUp,
        contentDescription = "Swipe Up"
    )
}
```

---

## Publishing

Refer to [CMP_LIBRARY_PUBLISHING_GUIDE.md](CMP_LIBRARY_PUBLISHING_GUIDE.md) for detailed instructions on:
1. Sonatype Central Portal namespace verification (`io.github.muralivitt`).
2. GPG key generation and GitHub secrets configuration.
3. Automated CI/CD deployment via GitHub Actions.

---

## License

Licensed under the [MIT License](LICENSE).
