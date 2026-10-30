package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowRight: ImageVector
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
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(16.03f, 12.53f)
                lineTo(13.03f, 15.53f)
                curveTo(12.88f, 15.68f, 12.69f, 15.75f, 12.5f, 15.75f)
                curveTo(12.31f, 15.75f, 12.12f, 15.68f, 11.97f, 15.53f)
                curveTo(11.68f, 15.24f, 11.68f, 14.76f, 11.97f, 14.47f)
                lineTo(13.69f, 12.75f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 12.75f, 7.75f, 12.41f, 7.75f, 12f)
                curveTo(7.75f, 11.59f, 8.09f, 11.25f, 8.5f, 11.25f)
                horizontalLineTo(13.69f)
                lineTo(11.97f, 9.53f)
                curveTo(11.68f, 9.24f, 11.68f, 8.76f, 11.97f, 8.47f)
                curveTo(12.26f, 8.18f, 12.74f, 8.18f, 13.03f, 8.47f)
                lineTo(16.03f, 11.47f)
                curveTo(16.32f, 11.76f, 16.32f, 12.24f, 16.03f, 12.53f)
                close()
            }
        }.build()

        return _ArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight: ImageVector? = null
