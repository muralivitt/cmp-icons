package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Forward: ImageVector
    get() {
        if (_Forward != null) {
            return _Forward!!
        }
        _Forward = ImageVector.Builder(
            name = "Forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(2f, 8.34f)
                verticalLineTo(15.66f)
                curveTo(2f, 17.16f, 3.63f, 18.1f, 4.93f, 17.35f)
                lineTo(8.1f, 15.52f)
                lineTo(11.27f, 13.69f)
                lineTo(11.76f, 13.41f)
                verticalLineTo(10.59f)
                lineTo(11.27f, 10.31f)
                lineTo(8.1f, 8.48f)
                lineTo(4.93f, 6.65f)
                curveTo(3.63f, 5.9f, 2f, 6.84f, 2f, 8.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(11.762f, 8.34f)
                verticalLineTo(15.66f)
                curveTo(11.762f, 17.16f, 13.392f, 18.1f, 14.682f, 17.35f)
                lineTo(17.862f, 15.52f)
                lineTo(21.032f, 13.69f)
                curveTo(22.322f, 12.94f, 22.322f, 11.06f, 21.032f, 10.31f)
                lineTo(17.862f, 8.48f)
                lineTo(14.682f, 6.65f)
                curveTo(13.392f, 5.9f, 11.762f, 6.84f, 11.762f, 8.34f)
                close()
            }
        }.build()

        return _Forward!!
    }

@Suppress("ObjectPropertyName")
private var _Forward: ImageVector? = null
