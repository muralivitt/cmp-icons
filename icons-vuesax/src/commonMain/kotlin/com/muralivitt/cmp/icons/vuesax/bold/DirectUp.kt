package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.DirectUp: ImageVector
    get() {
        if (_DirectUp != null) {
            return _DirectUp!!
        }
        _DirectUp = ImageVector.Builder(
            name = "DirectUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17.019f, 21.292f)
                lineTo(13.539f, 19.552f)
                curveTo(12.569f, 19.072f, 11.439f, 19.072f, 10.469f, 19.552f)
                lineTo(6.989f, 21.292f)
                curveTo(3.999f, 22.782f, 0.849f, 19.572f, 2.409f, 16.622f)
                lineTo(3.229f, 15.082f)
                curveTo(3.339f, 14.872f, 3.519f, 14.702f, 3.739f, 14.602f)
                lineTo(16.379f, 8.902f)
                curveTo(16.899f, 8.672f, 17.509f, 8.882f, 17.769f, 9.382f)
                lineTo(21.579f, 16.622f)
                curveTo(23.139f, 19.572f, 19.999f, 22.782f, 17.019f, 21.292f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.6f, 7.69f)
                lineTo(7.32f, 11.42f)
                curveTo(6.39f, 11.84f, 5.45f, 10.84f, 5.93f, 9.94f)
                lineTo(8.97f, 4.17f)
                curveTo(10.26f, 1.72f, 13.76f, 1.72f, 15.05f, 4.17f)
                lineTo(16.12f, 6.21f)
                curveTo(16.4f, 6.76f, 16.16f, 7.44f, 15.6f, 7.69f)
                close()
            }
        }.build()

        return _DirectUp!!
    }

@Suppress("ObjectPropertyName")
private var _DirectUp: ImageVector? = null
