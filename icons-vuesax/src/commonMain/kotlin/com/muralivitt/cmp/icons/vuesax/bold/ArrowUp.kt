package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowUp: ImageVector
    get() {
        if (_ArrowUp != null) {
            return _ArrowUp!!
        }
        _ArrowUp = ImageVector.Builder(
            name = "ArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(15.53f, 12.03f)
                curveTo(15.38f, 12.18f, 15.19f, 12.25f, 15f, 12.25f)
                curveTo(14.81f, 12.25f, 14.62f, 12.18f, 14.47f, 12.03f)
                lineTo(12.75f, 10.31f)
                verticalLineTo(15.5f)
                curveTo(12.75f, 15.91f, 12.41f, 16.25f, 12f, 16.25f)
                curveTo(11.59f, 16.25f, 11.25f, 15.91f, 11.25f, 15.5f)
                verticalLineTo(10.31f)
                lineTo(9.53f, 12.03f)
                curveTo(9.24f, 12.32f, 8.76f, 12.32f, 8.47f, 12.03f)
                curveTo(8.18f, 11.74f, 8.18f, 11.26f, 8.47f, 10.97f)
                lineTo(11.47f, 7.97f)
                curveTo(11.76f, 7.68f, 12.24f, 7.68f, 12.53f, 7.97f)
                lineTo(15.53f, 10.97f)
                curveTo(15.82f, 11.26f, 15.82f, 11.74f, 15.53f, 12.03f)
                close()
            }
        }.build()

        return _ArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUp: ImageVector? = null
