package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Speaker: ImageVector
    get() {
        if (_Speaker != null) {
            return _Speaker!!
        }
        _Speaker = ImageVector.Builder(
            name = "Speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14.999f, 1.621f)
                horizontalLineTo(8.999f)
                curveTo(5.809f, 1.621f, 4.619f, 2.811f, 4.619f, 6.001f)
                verticalLineTo(18.001f)
                curveTo(4.619f, 21.191f, 5.809f, 22.381f, 8.999f, 22.381f)
                horizontalLineTo(14.999f)
                curveTo(18.189f, 22.381f, 19.379f, 21.191f, 19.379f, 18.001f)
                verticalLineTo(6.001f)
                curveTo(19.379f, 2.811f, 18.189f, 1.621f, 14.999f, 1.621f)
                close()
                moveTo(11.999f, 6.001f)
                curveTo(12.829f, 6.001f, 13.499f, 6.671f, 13.499f, 7.501f)
                curveTo(13.499f, 8.331f, 12.829f, 9.001f, 11.999f, 9.001f)
                curveTo(11.169f, 9.001f, 10.499f, 8.331f, 10.499f, 7.501f)
                curveTo(10.499f, 6.671f, 11.169f, 6.001f, 11.999f, 6.001f)
                close()
                moveTo(11.999f, 18.001f)
                curveTo(10.339f, 18.001f, 8.999f, 16.661f, 8.999f, 15.001f)
                curveTo(8.999f, 13.341f, 10.339f, 12.001f, 11.999f, 12.001f)
                curveTo(13.659f, 12.001f, 14.999f, 13.341f, 14.999f, 15.001f)
                curveTo(14.999f, 16.661f, 13.659f, 18.001f, 11.999f, 18.001f)
                close()
            }
        }.build()

        return _Speaker!!
    }

@Suppress("ObjectPropertyName")
private var _Speaker: ImageVector? = null
