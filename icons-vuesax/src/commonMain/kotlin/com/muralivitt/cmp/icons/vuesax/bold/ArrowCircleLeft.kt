package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowCircleLeft: ImageVector
    get() {
        if (_ArrowCircleLeft != null) {
            return _ArrowCircleLeft!!
        }
        _ArrowCircleLeft = ImageVector.Builder(
            name = "ArrowCircleLeft",
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
                moveTo(13.79f, 15f)
                curveTo(14.08f, 15.29f, 14.08f, 15.77f, 13.79f, 16.06f)
                curveTo(13.64f, 16.21f, 13.45f, 16.28f, 13.26f, 16.28f)
                curveTo(13.07f, 16.28f, 12.88f, 16.21f, 12.73f, 16.06f)
                lineTo(9.2f, 12.53f)
                curveTo(8.91f, 12.24f, 8.91f, 11.76f, 9.2f, 11.47f)
                lineTo(12.73f, 7.94f)
                curveTo(13.02f, 7.65f, 13.5f, 7.65f, 13.79f, 7.94f)
                curveTo(14.08f, 8.23f, 14.08f, 8.71f, 13.79f, 9f)
                lineTo(10.79f, 12f)
                lineTo(13.79f, 15f)
                close()
            }
        }.build()

        return _ArrowCircleLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleLeft: ImageVector? = null
