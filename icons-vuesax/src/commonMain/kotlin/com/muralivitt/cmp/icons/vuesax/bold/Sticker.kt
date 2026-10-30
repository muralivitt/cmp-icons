package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Sticker: ImageVector
    get() {
        if (_Sticker != null) {
            return _Sticker!!
        }
        _Sticker = ImageVector.Builder(
            name = "Sticker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.959f, 11.661f)
                curveTo(20.77f, 10.911f, 19.389f, 10.501f, 17.969f, 10.501f)
                curveTo(13.83f, 10.501f, 10.469f, 13.861f, 10.469f, 18.001f)
                curveTo(10.469f, 19.421f, 10.87f, 20.791f, 11.62f, 21.981f)
                curveTo(11.16f, 21.971f, 10.689f, 21.921f, 10.21f, 21.851f)
                curveTo(6.1f, 21.151f, 2.789f, 17.821f, 2.109f, 13.701f)
                curveTo(0.98f, 6.851f, 6.819f, 1.011f, 13.67f, 2.141f)
                curveTo(17.789f, 2.821f, 21.119f, 6.131f, 21.819f, 10.241f)
                curveTo(21.899f, 10.721f, 21.949f, 11.201f, 21.959f, 11.661f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(13.381f, 21.86f)
                curveTo(12.501f, 20.82f, 11.971f, 19.47f, 11.971f, 18f)
                curveTo(11.971f, 14.69f, 14.661f, 12f, 17.971f, 12f)
                curveTo(19.441f, 12f, 20.791f, 12.53f, 21.831f, 13.41f)
            }
        }.build()

        return _Sticker!!
    }

@Suppress("ObjectPropertyName")
private var _Sticker: ImageVector? = null
