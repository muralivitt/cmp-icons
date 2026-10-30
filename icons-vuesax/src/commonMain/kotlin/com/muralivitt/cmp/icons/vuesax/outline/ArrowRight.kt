package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.ArrowRight: ImageVector
    get() {
        if (_ArrowRight != null) {
            return _ArrowRight!!
        }
        _ArrowRight = ImageVector.Builder(
            name = "ArrowRight",
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
                moveTo(10.74f, 16.28f)
                curveTo(10.55f, 16.28f, 10.36f, 16.21f, 10.21f, 16.06f)
                curveTo(9.92f, 15.77f, 9.92f, 15.29f, 10.21f, 15f)
                lineTo(13.21f, 12f)
                lineTo(10.21f, 9f)
                curveTo(9.92f, 8.71f, 9.92f, 8.23f, 10.21f, 7.94f)
                curveTo(10.5f, 7.65f, 10.98f, 7.65f, 11.27f, 7.94f)
                lineTo(14.8f, 11.47f)
                curveTo(15.09f, 11.76f, 15.09f, 12.24f, 14.8f, 12.53f)
                lineTo(11.27f, 16.06f)
                curveTo(11.12f, 16.21f, 10.93f, 16.28f, 10.74f, 16.28f)
                close()
            }
        }.build()

        return _ArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight: ImageVector? = null
