package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Mirror: ImageVector
    get() {
        if (_Mirror != null) {
            return _Mirror!!
        }
        _Mirror = ImageVector.Builder(
            name = "Mirror",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 18.75f)
                curveTo(7.17f, 18.75f, 3.25f, 14.82f, 3.25f, 10f)
                curveTo(3.25f, 5.18f, 7.17f, 1.25f, 12f, 1.25f)
                curveTo(16.83f, 1.25f, 20.75f, 5.18f, 20.75f, 10f)
                curveTo(20.75f, 14.82f, 16.83f, 18.75f, 12f, 18.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(8f, 2.75f, 4.75f, 6f, 4.75f, 10f)
                curveTo(4.75f, 14f, 8f, 17.25f, 12f, 17.25f)
                curveTo(16f, 17.25f, 19.25f, 14f, 19.25f, 10f)
                curveTo(19.25f, 6f, 16f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18f, 22.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 22.75f, 5.25f, 22.41f, 5.25f, 22f)
                curveTo(5.25f, 21.59f, 5.59f, 21.25f, 6f, 21.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 21.25f, 18.75f, 21.59f, 18.75f, 22f)
                curveTo(18.75f, 22.41f, 18.41f, 22.75f, 18f, 22.75f)
                close()
            }
        }.build()

        return _Mirror!!
    }

@Suppress("ObjectPropertyName")
private var _Mirror: ImageVector? = null
