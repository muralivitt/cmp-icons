package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Blend: ImageVector
    get() {
        if (_Blend != null) {
            return _Blend!!
        }
        _Blend = ImageVector.Builder(
            name = "Blend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.971f, 12f)
                curveTo(21.971f, 15.31f, 19.281f, 18f, 15.971f, 18f)
                curveTo(15.226f, 18f, 14.51f, 17.864f, 13.852f, 17.614f)
                curveTo(13.533f, 17.493f, 13.474f, 17.085f, 13.696f, 16.826f)
                curveTo(14.837f, 15.494f, 15.471f, 13.786f, 15.471f, 12f)
                curveTo(15.471f, 10.208f, 14.832f, 8.494f, 13.699f, 7.175f)
                curveTo(13.476f, 6.915f, 13.535f, 6.506f, 13.854f, 6.385f)
                curveTo(14.512f, 6.135f, 15.227f, 6f, 15.971f, 6f)
                curveTo(19.281f, 6f, 21.971f, 8.69f, 21.971f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(13.971f, 12f)
                curveTo(13.971f, 13.77f, 13.201f, 15.37f, 11.971f, 16.46f)
                curveTo(10.911f, 17.42f, 9.511f, 18f, 7.971f, 18f)
                curveTo(4.661f, 18f, 1.971f, 15.31f, 1.971f, 12f)
                curveTo(1.971f, 8.69f, 4.661f, 6f, 7.971f, 6f)
                curveTo(9.511f, 6f, 10.911f, 6.58f, 11.971f, 7.54f)
                curveTo(13.201f, 8.63f, 13.971f, 10.23f, 13.971f, 12f)
                close()
            }
        }.build()

        return _Blend!!
    }

@Suppress("ObjectPropertyName")
private var _Blend: ImageVector? = null
