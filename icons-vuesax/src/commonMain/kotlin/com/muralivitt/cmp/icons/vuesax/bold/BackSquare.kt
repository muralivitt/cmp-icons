package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.BackSquare: ImageVector
    get() {
        if (_BackSquare != null) {
            return _BackSquare!!
        }
        _BackSquare = ImageVector.Builder(
            name = "BackSquare",
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
                moveTo(13.92f, 16.13f)
                horizontalLineTo(9f)
                curveTo(8.59f, 16.13f, 8.25f, 15.79f, 8.25f, 15.38f)
                curveTo(8.25f, 14.97f, 8.59f, 14.63f, 9f, 14.63f)
                horizontalLineTo(13.92f)
                curveTo(15.2f, 14.63f, 16.25f, 13.59f, 16.25f, 12.3f)
                curveTo(16.25f, 11.01f, 15.21f, 9.97f, 13.92f, 9.97f)
                horizontalLineTo(8.85f)
                lineTo(9.11f, 10.23f)
                curveTo(9.4f, 10.53f, 9.4f, 11f, 9.1f, 11.3f)
                curveTo(8.95f, 11.45f, 8.76f, 11.52f, 8.57f, 11.52f)
                curveTo(8.38f, 11.52f, 8.19f, 11.45f, 8.04f, 11.3f)
                lineTo(6.47f, 9.72f)
                curveTo(6.18f, 9.43f, 6.18f, 8.95f, 6.47f, 8.66f)
                lineTo(8.04f, 7.09f)
                curveTo(8.33f, 6.8f, 8.81f, 6.8f, 9.1f, 7.09f)
                curveTo(9.39f, 7.38f, 9.39f, 7.86f, 9.1f, 8.15f)
                lineTo(8.77f, 8.48f)
                horizontalLineTo(13.92f)
                curveTo(16.03f, 8.48f, 17.75f, 10.2f, 17.75f, 12.31f)
                curveTo(17.75f, 14.42f, 16.03f, 16.13f, 13.92f, 16.13f)
                close()
            }
        }.build()

        return _BackSquare!!
    }

@Suppress("ObjectPropertyName")
private var _BackSquare: ImageVector? = null
