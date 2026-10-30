package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Eraser: ImageVector
    get() {
        if (_Eraser != null) {
            return _Eraser!!
        }
        _Eraser = ImageVector.Builder(
            name = "Eraser",
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
                moveTo(12.52f, 15.75f)
                lineTo(11.26f, 17.01f)
                curveTo(10.62f, 17.66f, 9.57f, 17.66f, 8.92f, 17.01f)
                lineTo(6.99f, 15.08f)
                curveTo(6.34f, 14.43f, 6.35f, 13.39f, 6.99f, 12.74f)
                lineTo(8.26f, 11.48f)
                curveTo(8.46f, 11.29f, 8.77f, 11.29f, 8.97f, 11.48f)
                lineTo(12.53f, 15.04f)
                curveTo(12.72f, 15.24f, 12.72f, 15.56f, 12.52f, 15.75f)
                close()
                moveTo(17.01f, 11.26f)
                lineTo(13.93f, 14.34f)
                curveTo(13.73f, 14.54f, 13.42f, 14.54f, 13.22f, 14.34f)
                lineTo(9.66f, 10.78f)
                curveTo(9.46f, 10.58f, 9.46f, 10.27f, 9.66f, 10.07f)
                lineTo(12.74f, 6.99f)
                curveTo(13.38f, 6.34f, 14.43f, 6.34f, 15.08f, 6.99f)
                lineTo(17.01f, 8.92f)
                curveTo(17.66f, 9.57f, 17.66f, 10.62f, 17.01f, 11.26f)
                close()
            }
        }.build()

        return _Eraser!!
    }

@Suppress("ObjectPropertyName")
private var _Eraser: ImageVector? = null
