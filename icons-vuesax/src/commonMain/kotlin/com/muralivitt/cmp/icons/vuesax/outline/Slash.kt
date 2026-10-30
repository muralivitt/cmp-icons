package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Slash: ImageVector
    get() {
        if (_Slash != null) {
            return _Slash!!
        }
        _Slash = ImageVector.Builder(
            name = "Slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(4.9f, 19.75f)
                curveTo(4.71f, 19.75f, 4.52f, 19.68f, 4.37f, 19.53f)
                curveTo(4.08f, 19.24f, 4.08f, 18.76f, 4.37f, 18.47f)
                lineTo(18.37f, 4.47f)
                curveTo(18.66f, 4.18f, 19.14f, 4.18f, 19.43f, 4.47f)
                curveTo(19.72f, 4.76f, 19.72f, 5.24f, 19.43f, 5.53f)
                lineTo(5.43f, 19.53f)
                curveTo(5.28f, 19.68f, 5.09f, 19.75f, 4.9f, 19.75f)
                close()
            }
        }.build()

        return _Slash!!
    }

@Suppress("ObjectPropertyName")
private var _Slash: ImageVector? = null
