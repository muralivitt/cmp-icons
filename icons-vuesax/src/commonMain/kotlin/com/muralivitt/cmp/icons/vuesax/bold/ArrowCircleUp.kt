package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowCircleUp: ImageVector
    get() {
        if (_ArrowCircleUp != null) {
            return _ArrowCircleUp!!
        }
        _ArrowCircleUp = ImageVector.Builder(
            name = "ArrowCircleUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                curveTo(2f, 17.51f, 6.49f, 22f, 12f, 22f)
                curveTo(17.51f, 22f, 22f, 17.51f, 22f, 12f)
                curveTo(22f, 6.49f, 17.51f, 2f, 12f, 2f)
                close()
                moveTo(16.06f, 13.79f)
                curveTo(15.91f, 13.94f, 15.72f, 14.01f, 15.53f, 14.01f)
                curveTo(15.34f, 14.01f, 15.15f, 13.94f, 15f, 13.79f)
                lineTo(12f, 10.79f)
                lineTo(9f, 13.79f)
                curveTo(8.71f, 14.08f, 8.23f, 14.08f, 7.94f, 13.79f)
                curveTo(7.65f, 13.5f, 7.65f, 13.02f, 7.94f, 12.73f)
                lineTo(11.47f, 9.2f)
                curveTo(11.76f, 8.91f, 12.24f, 8.91f, 12.53f, 9.2f)
                lineTo(16.06f, 12.73f)
                curveTo(16.35f, 13.03f, 16.35f, 13.5f, 16.06f, 13.79f)
                close()
            }
        }.build()

        return _ArrowCircleUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleUp: ImageVector? = null
