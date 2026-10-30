package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowDown2: ImageVector
    get() {
        if (_ArrowDown2 != null) {
            return _ArrowDown2!!
        }
        _ArrowDown2 = ImageVector.Builder(
            name = "ArrowDown2",
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
                moveTo(15.53f, 13.03f)
                lineTo(12.53f, 16.03f)
                curveTo(12.38f, 16.18f, 12.19f, 16.25f, 12f, 16.25f)
                curveTo(11.81f, 16.25f, 11.62f, 16.18f, 11.47f, 16.03f)
                lineTo(8.47f, 13.03f)
                curveTo(8.18f, 12.74f, 8.18f, 12.26f, 8.47f, 11.97f)
                curveTo(8.76f, 11.68f, 9.24f, 11.68f, 9.53f, 11.97f)
                lineTo(11.25f, 13.69f)
                verticalLineTo(8.5f)
                curveTo(11.25f, 8.09f, 11.59f, 7.75f, 12f, 7.75f)
                curveTo(12.41f, 7.75f, 12.75f, 8.09f, 12.75f, 8.5f)
                verticalLineTo(13.69f)
                lineTo(14.47f, 11.97f)
                curveTo(14.76f, 11.68f, 15.24f, 11.68f, 15.53f, 11.97f)
                curveTo(15.82f, 12.26f, 15.82f, 12.74f, 15.53f, 13.03f)
                close()
            }
        }.build()

        return _ArrowDown2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDown2: ImageVector? = null
