package com.muralivitt.cmp.icons.vuesax.extra

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VuesaxExtra.MessagePlus: ImageVector
    get() {
        if (_MessagePlusCircleSvgrepoCom != null) {
            return _MessagePlusCircleSvgrepoCom!!
        }
        _MessagePlusCircleSvgrepoCom = ImageVector.Builder(
            name = "MessagePlusCircleSvgrepoCom",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 14.5f)
                verticalLineTo(8.5f)
                moveTo(9.5f, 11.5f)
                horizontalLineTo(15.5f)
                moveTo(12.5f, 20f)
                curveTo(17.194f, 20f, 21f, 16.194f, 21f, 11.5f)
                curveTo(21f, 6.806f, 17.194f, 3f, 12.5f, 3f)
                curveTo(7.805f, 3f, 4f, 6.806f, 4f, 11.5f)
                curveTo(4f, 12.45f, 4.155f, 13.364f, 4.443f, 14.217f)
                curveTo(4.551f, 14.538f, 4.605f, 14.698f, 4.615f, 14.821f)
                curveTo(4.625f, 14.943f, 4.617f, 15.029f, 4.587f, 15.147f)
                curveTo(4.557f, 15.267f, 4.489f, 15.392f, 4.355f, 15.641f)
                lineTo(2.719f, 18.668f)
                curveTo(2.486f, 19.1f, 2.369f, 19.316f, 2.395f, 19.483f)
                curveTo(2.418f, 19.628f, 2.503f, 19.756f, 2.629f, 19.832f)
                curveTo(2.773f, 19.92f, 3.017f, 19.895f, 3.505f, 19.844f)
                lineTo(8.626f, 19.315f)
                curveTo(8.781f, 19.299f, 8.859f, 19.291f, 8.929f, 19.294f)
                curveTo(8.999f, 19.296f, 9.048f, 19.303f, 9.116f, 19.319f)
                curveTo(9.185f, 19.334f, 9.271f, 19.368f, 9.445f, 19.434f)
                curveTo(10.393f, 19.8f, 11.423f, 20f, 12.5f, 20f)
                close()
            }
        }.build()

        return _MessagePlusCircleSvgrepoCom!!
    }

@Suppress("ObjectPropertyName")
private var _MessagePlusCircleSvgrepoCom: ImageVector? = null
