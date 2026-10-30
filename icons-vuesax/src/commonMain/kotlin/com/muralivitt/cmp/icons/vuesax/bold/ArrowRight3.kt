package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowRight3: ImageVector
    get() {
        if (_ArrowRight3 != null) {
            return _ArrowRight3!!
        }
        _ArrowRight3 = ImageVector.Builder(
            name = "ArrowRight3",
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
                moveTo(18.53f, 12.53f)
                lineTo(14.24f, 16.82f)
                curveTo(14.09f, 16.97f, 13.9f, 17.04f, 13.71f, 17.04f)
                curveTo(13.52f, 17.04f, 13.33f, 16.97f, 13.18f, 16.82f)
                curveTo(12.89f, 16.53f, 12.89f, 16.05f, 13.18f, 15.76f)
                lineTo(16.19f, 12.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 12.75f, 5.25f, 12.41f, 5.25f, 12f)
                curveTo(5.25f, 11.59f, 5.59f, 11.25f, 6f, 11.25f)
                horizontalLineTo(16.19f)
                lineTo(13.18f, 8.24f)
                curveTo(12.89f, 7.95f, 12.89f, 7.47f, 13.18f, 7.18f)
                curveTo(13.47f, 6.89f, 13.95f, 6.89f, 14.24f, 7.18f)
                lineTo(18.53f, 11.47f)
                curveTo(18.67f, 11.61f, 18.75f, 11.8f, 18.75f, 12f)
                curveTo(18.75f, 12.2f, 18.67f, 12.39f, 18.53f, 12.53f)
                close()
            }
        }.build()

        return _ArrowRight3!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight3: ImageVector? = null
