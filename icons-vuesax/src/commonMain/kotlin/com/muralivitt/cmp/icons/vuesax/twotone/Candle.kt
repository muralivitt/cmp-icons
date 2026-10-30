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

val VuesaxIconsTwotone.Candle: ImageVector
    get() {
        if (_Candle != null) {
            return _Candle!!
        }
        _Candle = ImageVector.Builder(
            name = "Candle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 22f)
                verticalLineTo(15f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 5f)
                verticalLineTo(2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 22f)
                verticalLineTo(19f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 9f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 7f)
                verticalLineTo(13f)
                curveTo(9.5f, 14.1f, 9f, 15f, 7.5f, 15f)
                horizontalLineTo(5.5f)
                curveTo(4f, 15f, 3.5f, 14.1f, 3.5f, 13f)
                verticalLineTo(7f)
                curveTo(3.5f, 5.9f, 4f, 5f, 5.5f, 5f)
                horizontalLineTo(7.5f)
                curveTo(9f, 5f, 9.5f, 5.9f, 9.5f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.5f, 11f)
                verticalLineTo(17f)
                curveTo(20.5f, 18.1f, 20f, 19f, 18.5f, 19f)
                horizontalLineTo(16.5f)
                curveTo(15f, 19f, 14.5f, 18.1f, 14.5f, 17f)
                verticalLineTo(11f)
                curveTo(14.5f, 9.9f, 15f, 9f, 16.5f, 9f)
                horizontalLineTo(18.5f)
                curveTo(20f, 9f, 20.5f, 9.9f, 20.5f, 11f)
                close()
            }
        }.build()

        return _Candle!!
    }

@Suppress("ObjectPropertyName")
private var _Candle: ImageVector? = null
