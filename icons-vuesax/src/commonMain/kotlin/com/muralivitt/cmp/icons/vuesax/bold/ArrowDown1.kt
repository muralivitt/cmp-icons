package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowDown1: ImageVector
    get() {
        if (_ArrowDown1 != null) {
            return _ArrowDown1!!
        }
        _ArrowDown1 = ImageVector.Builder(
            name = "ArrowDown1",
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
                moveTo(16.82f, 14.24f)
                lineTo(12.53f, 18.53f)
                curveTo(12.39f, 18.67f, 12.2f, 18.75f, 12f, 18.75f)
                curveTo(11.8f, 18.75f, 11.61f, 18.67f, 11.47f, 18.53f)
                lineTo(7.18f, 14.24f)
                curveTo(6.89f, 13.95f, 6.89f, 13.47f, 7.18f, 13.18f)
                curveTo(7.47f, 12.89f, 7.95f, 12.89f, 8.24f, 13.18f)
                lineTo(11.25f, 16.19f)
                verticalLineTo(6f)
                curveTo(11.25f, 5.59f, 11.59f, 5.25f, 12f, 5.25f)
                curveTo(12.41f, 5.25f, 12.75f, 5.59f, 12.75f, 6f)
                verticalLineTo(16.19f)
                lineTo(15.76f, 13.18f)
                curveTo(16.05f, 12.89f, 16.53f, 12.89f, 16.82f, 13.18f)
                curveTo(16.97f, 13.33f, 17.04f, 13.52f, 17.04f, 13.71f)
                curveTo(17.04f, 13.9f, 16.96f, 14.1f, 16.82f, 14.24f)
                close()
            }
        }.build()

        return _ArrowDown1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDown1: ImageVector? = null
