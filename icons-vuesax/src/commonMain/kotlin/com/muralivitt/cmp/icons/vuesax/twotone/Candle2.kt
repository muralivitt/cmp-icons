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

val VuesaxIconsTwotone.Candle2: ImageVector
    get() {
        if (_Candle2 != null) {
            return _Candle2!!
        }
        _Candle2 = ImageVector.Builder(
            name = "Candle2",
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
                moveTo(22f, 17.5f)
                horizontalLineTo(15f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17.5f)
                horizontalLineTo(2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6.5f)
                horizontalLineTo(19f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 6.5f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 14.5f)
                horizontalLineTo(13f)
                curveTo(14.1f, 14.5f, 15f, 15f, 15f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(15f, 20f, 14.1f, 20.5f, 13f, 20.5f)
                horizontalLineTo(7f)
                curveTo(5.9f, 20.5f, 5f, 20f, 5f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(5f, 15f, 5.9f, 14.5f, 7f, 14.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 3.5f)
                horizontalLineTo(17f)
                curveTo(18.1f, 3.5f, 19f, 4f, 19f, 5.5f)
                verticalLineTo(7.5f)
                curveTo(19f, 9f, 18.1f, 9.5f, 17f, 9.5f)
                horizontalLineTo(11f)
                curveTo(9.9f, 9.5f, 9f, 9f, 9f, 7.5f)
                verticalLineTo(5.5f)
                curveTo(9f, 4f, 9.9f, 3.5f, 11f, 3.5f)
                close()
            }
        }.build()

        return _Candle2!!
    }

@Suppress("ObjectPropertyName")
private var _Candle2: ImageVector? = null
