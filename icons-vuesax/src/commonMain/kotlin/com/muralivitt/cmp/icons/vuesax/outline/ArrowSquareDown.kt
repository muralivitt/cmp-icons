package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.ArrowSquareDown: ImageVector
    get() {
        if (_ArrowSquareDown != null) {
            return _ArrowSquareDown!!
        }
        _ArrowSquareDown = ImageVector.Builder(
            name = "ArrowSquareDown",
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
                moveTo(12f, 14.91f)
                curveTo(11.81f, 14.91f, 11.62f, 14.84f, 11.47f, 14.69f)
                lineTo(7.94f, 11.16f)
                curveTo(7.65f, 10.87f, 7.65f, 10.39f, 7.94f, 10.1f)
                curveTo(8.23f, 9.81f, 8.71f, 9.81f, 9f, 10.1f)
                lineTo(12f, 13.1f)
                lineTo(15f, 10.1f)
                curveTo(15.29f, 9.81f, 15.77f, 9.81f, 16.06f, 10.1f)
                curveTo(16.35f, 10.39f, 16.35f, 10.87f, 16.06f, 11.16f)
                lineTo(12.53f, 14.69f)
                curveTo(12.38f, 14.84f, 12.19f, 14.91f, 12f, 14.91f)
                close()
            }
        }.build()

        return _ArrowSquareDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSquareDown: ImageVector? = null
