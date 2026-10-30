package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowSquareUp: ImageVector
    get() {
        if (_ArrowSquareUp != null) {
            return _ArrowSquareUp!!
        }
        _ArrowSquareUp = ImageVector.Builder(
            name = "ArrowSquareUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(16.06f, 14f)
                curveTo(15.91f, 14.15f, 15.72f, 14.22f, 15.53f, 14.22f)
                curveTo(15.34f, 14.22f, 15.15f, 14.14f, 15f, 14f)
                lineTo(12f, 11f)
                lineTo(9f, 14f)
                curveTo(8.71f, 14.29f, 8.23f, 14.29f, 7.94f, 14f)
                curveTo(7.65f, 13.71f, 7.65f, 13.23f, 7.94f, 12.94f)
                lineTo(11.47f, 9.41f)
                curveTo(11.76f, 9.12f, 12.24f, 9.12f, 12.53f, 9.41f)
                lineTo(16.06f, 12.94f)
                curveTo(16.35f, 13.23f, 16.35f, 13.7f, 16.06f, 14f)
                close()
            }
        }.build()

        return _ArrowSquareUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSquareUp: ImageVector? = null
