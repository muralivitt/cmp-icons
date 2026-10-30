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

val VuesaxIconsTwotone.Car: ImageVector
    get() {
        if (_Car != null) {
            return _Car!!
        }
        _Car = ImageVector.Builder(
            name = "Car",
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
                moveTo(15.51f, 2.83f)
                horizontalLineTo(8.49f)
                curveTo(6f, 2.83f, 5.45f, 4.07f, 5.13f, 5.59f)
                lineTo(4f, 11f)
                horizontalLineTo(20f)
                lineTo(18.87f, 5.59f)
                curveTo(18.55f, 4.07f, 18f, 2.83f, 15.51f, 2.83f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.991f, 19.82f)
                curveTo(22.101f, 20.99f, 21.161f, 22f, 19.961f, 22f)
                horizontalLineTo(18.081f)
                curveTo(17.001f, 22f, 16.851f, 21.54f, 16.661f, 20.97f)
                lineTo(16.461f, 20.37f)
                curveTo(16.181f, 19.55f, 16.001f, 19f, 14.561f, 19f)
                horizontalLineTo(9.441f)
                curveTo(8.001f, 19f, 7.791f, 19.62f, 7.541f, 20.37f)
                lineTo(7.341f, 20.97f)
                curveTo(7.151f, 21.54f, 7.001f, 22f, 5.921f, 22f)
                horizontalLineTo(4.041f)
                curveTo(2.841f, 22f, 1.901f, 20.99f, 2.011f, 19.82f)
                lineTo(2.571f, 13.73f)
                curveTo(2.711f, 12.23f, 3.001f, 11f, 5.621f, 11f)
                horizontalLineTo(18.381f)
                curveTo(21.001f, 11f, 21.291f, 12.23f, 21.431f, 13.73f)
                lineTo(21.991f, 19.82f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 8f)
                horizontalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 8f)
                horizontalLineTo(20f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineTo(5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 5f)
                horizontalLineTo(13.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 15f)
                horizontalLineTo(9f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                horizontalLineTo(18f)
            }
        }.build()

        return _Car!!
    }

@Suppress("ObjectPropertyName")
private var _Car: ImageVector? = null
