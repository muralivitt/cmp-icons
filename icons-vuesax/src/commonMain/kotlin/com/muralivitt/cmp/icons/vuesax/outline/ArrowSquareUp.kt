package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.ArrowSquareUp: ImageVector
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
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.53f, 14.21f)
                curveTo(15.34f, 14.21f, 15.15f, 14.14f, 15f, 13.99f)
                lineTo(12f, 10.99f)
                lineTo(9f, 13.99f)
                curveTo(8.71f, 14.28f, 8.23f, 14.28f, 7.94f, 13.99f)
                curveTo(7.65f, 13.7f, 7.65f, 13.22f, 7.94f, 12.93f)
                lineTo(11.47f, 9.4f)
                curveTo(11.76f, 9.11f, 12.24f, 9.11f, 12.53f, 9.4f)
                lineTo(16.06f, 12.93f)
                curveTo(16.35f, 13.22f, 16.35f, 13.7f, 16.06f, 13.99f)
                curveTo(15.91f, 14.14f, 15.72f, 14.21f, 15.53f, 14.21f)
                close()
            }
        }.build()

        return _ArrowSquareUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSquareUp: ImageVector? = null
