package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowUp1: ImageVector
    get() {
        if (_ArrowUp1 != null) {
            return _ArrowUp1!!
        }
        _ArrowUp1 = ImageVector.Builder(
            name = "ArrowUp1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18.681f, 13.978f)
                lineTo(15.471f, 10.768f)
                lineTo(13.511f, 8.798f)
                curveTo(12.681f, 7.968f, 11.331f, 7.968f, 10.501f, 8.798f)
                lineTo(5.321f, 13.978f)
                curveTo(4.641f, 14.658f, 5.131f, 15.818f, 6.081f, 15.818f)
                horizontalLineTo(11.691f)
                horizontalLineTo(17.921f)
                curveTo(18.881f, 15.818f, 19.361f, 14.658f, 18.681f, 13.978f)
                close()
            }
        }.build()

        return _ArrowUp1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUp1: ImageVector? = null
