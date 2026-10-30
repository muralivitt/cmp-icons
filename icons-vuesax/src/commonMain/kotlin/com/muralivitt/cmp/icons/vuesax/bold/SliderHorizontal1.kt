package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.SliderHorizontal1: ImageVector
    get() {
        if (_SliderHorizontal1 != null) {
            return _SliderHorizontal1!!
        }
        _SliderHorizontal1 = ImageVector.Builder(
            name = "SliderHorizontal1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(3.5f, 5.059f)
                verticalLineTo(18.939f)
                curveTo(3.5f, 19.349f, 3.16f, 19.689f, 2.75f, 19.689f)
                curveTo(2.34f, 19.689f, 2f, 19.349f, 2f, 18.939f)
                verticalLineTo(5.059f)
                curveTo(2f, 4.649f, 2.34f, 4.309f, 2.75f, 4.309f)
                curveTo(3.16f, 4.309f, 3.5f, 4.649f, 3.5f, 5.059f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 5.059f)
                verticalLineTo(18.939f)
                curveTo(22f, 19.349f, 21.66f, 19.689f, 21.25f, 19.689f)
                curveTo(20.84f, 19.689f, 20.5f, 19.349f, 20.5f, 18.939f)
                verticalLineTo(5.059f)
                curveTo(20.5f, 4.649f, 20.84f, 4.309f, 21.25f, 4.309f)
                curveTo(21.66f, 4.309f, 22f, 4.649f, 22f, 5.059f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(17.66f, 21.25f, 19f, 19.91f, 19f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(19f, 4.09f, 17.66f, 2.75f, 16f, 2.75f)
                horizontalLineTo(8f)
                curveTo(6.34f, 2.75f, 5f, 4.09f, 5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(5f, 19.91f, 6.34f, 21.25f, 8f, 21.25f)
                close()
            }
        }.build()

        return _SliderHorizontal1!!
    }

@Suppress("ObjectPropertyName")
private var _SliderHorizontal1: ImageVector? = null
