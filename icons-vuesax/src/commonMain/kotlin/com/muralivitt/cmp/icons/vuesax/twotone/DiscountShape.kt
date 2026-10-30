package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.DiscountShape: ImageVector
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
                moveTo(3.991f, 14.66f)
                lineTo(2.471f, 13.14f)
                curveTo(1.851f, 12.52f, 1.851f, 11.5f, 2.471f, 10.88f)
                lineTo(3.991f, 9.36f)
                curveTo(4.251f, 9.1f, 4.461f, 8.59f, 4.461f, 8.23f)
                verticalLineTo(6.08f)
                curveTo(4.461f, 5.2f, 5.181f, 4.48f, 6.061f, 4.48f)
                horizontalLineTo(8.211f)
                curveTo(8.571f, 4.48f, 9.081f, 4.27f, 9.341f, 4.01f)
                lineTo(10.861f, 2.49f)
                curveTo(11.481f, 1.87f, 12.501f, 1.87f, 13.121f, 2.49f)
                lineTo(14.641f, 4.01f)
                curveTo(14.901f, 4.27f, 15.411f, 4.48f, 15.771f, 4.48f)
                horizontalLineTo(17.921f)
                curveTo(18.801f, 4.48f, 19.521f, 5.2f, 19.521f, 6.08f)
                verticalLineTo(8.23f)
                curveTo(19.521f, 8.59f, 19.731f, 9.1f, 19.991f, 9.36f)
                lineTo(21.511f, 10.88f)
                curveTo(22.131f, 11.5f, 22.131f, 12.52f, 21.511f, 13.14f)
                lineTo(19.991f, 14.66f)
                curveTo(19.731f, 14.92f, 19.521f, 15.43f, 19.521f, 15.79f)
                verticalLineTo(17.94f)
                curveTo(19.521f, 18.82f, 18.801f, 19.54f, 17.921f, 19.54f)
                horizontalLineTo(15.771f)
                curveTo(15.411f, 19.54f, 14.901f, 19.75f, 14.641f, 20.01f)
                lineTo(13.121f, 21.53f)
                curveTo(12.501f, 22.15f, 11.481f, 22.15f, 10.861f, 21.53f)
                lineTo(9.341f, 20.01f)
                curveTo(9.081f, 19.75f, 8.571f, 19.54f, 8.211f, 19.54f)
                horizontalLineTo(6.061f)
                curveTo(5.181f, 19.54f, 4.461f, 18.82f, 4.461f, 17.94f)
                verticalLineTo(15.79f)
                curveTo(4.461f, 15.42f, 4.251f, 14.91f, 3.991f, 14.66f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15f)
                lineTo(15f, 9f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.495f, 14.5f)
                horizontalLineTo(14.503f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
