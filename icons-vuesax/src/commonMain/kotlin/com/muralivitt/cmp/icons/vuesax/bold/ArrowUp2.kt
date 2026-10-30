package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowUp2: ImageVector
    get() {
        if (_ArrowUp2 != null) {
            return _ArrowUp2!!
        }
        _ArrowUp2 = ImageVector.Builder(
            name = "ArrowUp2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(9.329f, 18f)
                horizontalLineTo(14.669f)
                curveTo(17.989f, 18f, 19.339f, 15.65f, 17.689f, 12.78f)
                lineTo(16.949f, 11.5f)
                curveTo(16.769f, 11.19f, 16.439f, 11f, 16.079f, 11f)
                horizontalLineTo(7.919f)
                curveTo(7.559f, 11f, 7.229f, 11.19f, 7.049f, 11.5f)
                lineTo(6.309f, 12.78f)
                curveTo(4.659f, 15.65f, 6.009f, 18f, 9.329f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(8.792f, 9.999f)
                horizontalLineTo(15.222f)
                curveTo(15.611f, 9.999f, 15.851f, 9.579f, 15.651f, 9.249f)
                lineTo(15.012f, 8.149f)
                curveTo(13.361f, 5.279f, 10.642f, 5.279f, 8.992f, 8.149f)
                lineTo(8.352f, 9.249f)
                curveTo(8.162f, 9.579f, 8.402f, 9.999f, 8.792f, 9.999f)
                close()
            }
        }.build()

        return _ArrowUp2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUp2: ImageVector? = null
