package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DiscountShape: ImageVector
    get() {
        if (_DiscountShape != null) {
            return _DiscountShape!!
        }
        _DiscountShape = ImageVector.Builder(
            name = "DiscountShape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.989f, 14.66f)
                lineTo(2.469f, 13.14f)
                curveTo(1.849f, 12.52f, 1.849f, 11.5f, 2.469f, 10.88f)
                lineTo(3.989f, 9.36f)
                curveTo(4.249f, 9.1f, 4.459f, 8.59f, 4.459f, 8.23f)
                verticalLineTo(6.08f)
                curveTo(4.459f, 5.2f, 5.179f, 4.48f, 6.059f, 4.48f)
                horizontalLineTo(8.209f)
                curveTo(8.569f, 4.48f, 9.079f, 4.27f, 9.339f, 4.01f)
                lineTo(10.859f, 2.49f)
                curveTo(11.479f, 1.87f, 12.499f, 1.87f, 13.119f, 2.49f)
                lineTo(14.639f, 4.01f)
                curveTo(14.899f, 4.27f, 15.409f, 4.48f, 15.769f, 4.48f)
                horizontalLineTo(17.919f)
                curveTo(18.799f, 4.48f, 19.519f, 5.2f, 19.519f, 6.08f)
                verticalLineTo(8.23f)
                curveTo(19.519f, 8.59f, 19.729f, 9.1f, 19.989f, 9.36f)
                lineTo(21.509f, 10.88f)
                curveTo(22.129f, 11.5f, 22.129f, 12.52f, 21.509f, 13.14f)
                lineTo(19.989f, 14.66f)
                curveTo(19.729f, 14.92f, 19.519f, 15.43f, 19.519f, 15.79f)
                verticalLineTo(17.94f)
                curveTo(19.519f, 18.82f, 18.799f, 19.54f, 17.919f, 19.54f)
                horizontalLineTo(15.769f)
                curveTo(15.409f, 19.54f, 14.899f, 19.75f, 14.639f, 20.01f)
                lineTo(13.119f, 21.53f)
                curveTo(12.499f, 22.15f, 11.479f, 22.15f, 10.859f, 21.53f)
                lineTo(9.339f, 20.01f)
                curveTo(9.079f, 19.75f, 8.569f, 19.54f, 8.209f, 19.54f)
                horizontalLineTo(6.059f)
                curveTo(5.179f, 19.54f, 4.459f, 18.82f, 4.459f, 17.94f)
                verticalLineTo(15.79f)
                curveTo(4.459f, 15.42f, 4.249f, 14.91f, 3.989f, 14.66f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15f)
                lineTo(15f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.495f, 14.5f)
                horizontalLineTo(14.503f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.495f, 9.5f)
                horizontalLineTo(9.503f)
            }
        }.build()

        return _DiscountShape!!
    }

@Suppress("ObjectPropertyName")
private var _DiscountShape: ImageVector? = null
