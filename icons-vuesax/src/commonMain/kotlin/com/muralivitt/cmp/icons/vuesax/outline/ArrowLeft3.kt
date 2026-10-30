package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.ArrowLeft3: ImageVector
    get() {
        if (_ArrowLeft3 != null) {
            return _ArrowLeft3!!
        }
        _ArrowLeft3 = ImageVector.Builder(
            name = "ArrowLeft3",
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
                moveTo(15.5f, 12.75f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 12.75f, 8.75f, 12.41f, 8.75f, 12f)
                curveTo(8.75f, 11.59f, 9.09f, 11.25f, 9.5f, 11.25f)
                horizontalLineTo(15.5f)
                curveTo(15.91f, 11.25f, 16.25f, 11.59f, 16.25f, 12f)
                curveTo(16.25f, 12.41f, 15.91f, 12.75f, 15.5f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(11.5f, 15.75f)
                curveTo(11.309f, 15.75f, 11.12f, 15.68f, 10.969f, 15.53f)
                lineTo(7.969f, 12.53f)
                curveTo(7.679f, 12.24f, 7.679f, 11.76f, 7.969f, 11.47f)
                lineTo(10.969f, 8.47f)
                curveTo(11.259f, 8.18f, 11.74f, 8.18f, 12.03f, 8.47f)
                curveTo(12.319f, 8.76f, 12.319f, 9.24f, 12.03f, 9.53f)
                lineTo(9.559f, 12f)
                lineTo(12.03f, 14.47f)
                curveTo(12.319f, 14.76f, 12.319f, 15.24f, 12.03f, 15.53f)
                curveTo(11.88f, 15.68f, 11.689f, 15.75f, 11.5f, 15.75f)
                close()
            }
        }.build()

        return _ArrowLeft3!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft3: ImageVector? = null
