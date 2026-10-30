package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Weight1: ImageVector
    get() {
        if (_Weight1 != null) {
            return _Weight1!!
        }
        _Weight1 = ImageVector.Builder(
            name = "Weight1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17.18f, 5.25f)
                curveTo(15.47f, 5.25f, 13.43f, 5.9f, 13.43f, 9f)
                verticalLineTo(15f)
                curveTo(13.43f, 18.1f, 15.47f, 18.75f, 17.18f, 18.75f)
                curveTo(18.89f, 18.75f, 20.93f, 18.1f, 20.93f, 15f)
                verticalLineTo(9f)
                curveTo(20.93f, 5.9f, 18.89f, 5.25f, 17.18f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(6.82f, 5.25f)
                curveTo(5.11f, 5.25f, 3.07f, 5.9f, 3.07f, 9f)
                verticalLineTo(15f)
                curveTo(3.07f, 18.1f, 5.11f, 18.75f, 6.82f, 18.75f)
                curveTo(8.53f, 18.75f, 10.57f, 18.1f, 10.57f, 15f)
                verticalLineTo(9f)
                curveTo(10.57f, 5.9f, 8.53f, 5.25f, 6.82f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(13.43f, 11.25f)
                horizontalLineTo(10.57f)
                verticalLineTo(12.75f)
                horizontalLineTo(13.43f)
                verticalLineTo(11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22.5f, 15.25f)
                curveTo(22.09f, 15.25f, 21.75f, 14.91f, 21.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(21.75f, 9.09f, 22.09f, 8.75f, 22.5f, 8.75f)
                curveTo(22.91f, 8.75f, 23.25f, 9.09f, 23.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(23.25f, 14.91f, 22.91f, 15.25f, 22.5f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(1.5f, 15.25f)
                curveTo(1.09f, 15.25f, 0.75f, 14.91f, 0.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(0.75f, 9.09f, 1.09f, 8.75f, 1.5f, 8.75f)
                curveTo(1.91f, 8.75f, 2.25f, 9.09f, 2.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(2.25f, 14.91f, 1.91f, 15.25f, 1.5f, 15.25f)
                close()
            }
        }.build()

        return _Weight1!!
    }

@Suppress("ObjectPropertyName")
private var _Weight1: ImageVector? = null
