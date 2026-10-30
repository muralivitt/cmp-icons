package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Shapes: ImageVector
    get() {
        if (_Shapes != null) {
            return _Shapes!!
        }
        _Shapes = ImageVector.Builder(
            name = "Shapes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(13.43f, 15.001f)
                horizontalLineTo(4.4f)
                curveTo(2.58f, 15.001f, 1.42f, 13.051f, 2.3f, 11.451f)
                lineTo(4.63f, 7.211f)
                lineTo(6.81f, 3.241f)
                curveTo(7.72f, 1.591f, 10.1f, 1.591f, 11.01f, 3.241f)
                lineTo(13.2f, 7.211f)
                lineTo(14.25f, 9.121f)
                lineTo(15.53f, 11.451f)
                curveTo(16.41f, 13.051f, 15.25f, 15.001f, 13.43f, 15.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22.651f, 15.999f)
                curveTo(22.651f, 19.589f, 19.741f, 22.499f, 16.151f, 22.499f)
                curveTo(13.101f, 22.499f, 10.551f, 20.409f, 9.841f, 17.569f)
                curveTo(9.771f, 17.269f, 10.001f, 16.999f, 10.311f, 16.999f)
                horizontalLineTo(14.081f)
                curveTo(15.471f, 16.999f, 16.731f, 16.279f, 17.441f, 15.089f)
                curveTo(18.141f, 13.889f, 18.171f, 12.449f, 17.491f, 11.229f)
                lineTo(16.991f, 10.309f)
                curveTo(16.801f, 9.969f, 17.071f, 9.559f, 17.451f, 9.629f)
                curveTo(20.411f, 10.229f, 22.651f, 12.849f, 22.651f, 15.999f)
                close()
            }
        }.build()

        return _Shapes!!
    }

@Suppress("ObjectPropertyName")
private var _Shapes: ImageVector? = null
