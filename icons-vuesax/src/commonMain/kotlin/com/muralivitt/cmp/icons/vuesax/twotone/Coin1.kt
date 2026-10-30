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

val VuesaxIconsTwotone.Coin1: ImageVector
    get() {
        if (_Coin1 != null) {
            return _Coin1!!
        }
        _Coin1 = ImageVector.Builder(
            name = "Coin1",
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
                moveTo(8f, 11.4f)
                curveTo(8f, 12.17f, 8.6f, 12.8f, 9.33f, 12.8f)
                horizontalLineTo(10.83f)
                curveTo(11.47f, 12.8f, 11.99f, 12.25f, 11.99f, 11.58f)
                curveTo(11.99f, 10.85f, 11.67f, 10.59f, 11.2f, 10.42f)
                lineTo(8.8f, 9.58f)
                curveTo(8.32f, 9.41f, 8f, 9.15f, 8f, 8.42f)
                curveTo(8f, 7.75f, 8.52f, 7.2f, 9.16f, 7.2f)
                horizontalLineTo(10.66f)
                curveTo(11.4f, 7.21f, 12f, 7.83f, 12f, 8.6f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12.85f)
                verticalLineTo(13.59f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 6.41f)
                verticalLineTo(7.19f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.99f, 17.98f)
                curveTo(14.403f, 17.98f, 17.98f, 14.403f, 17.98f, 9.99f)
                curveTo(17.98f, 5.577f, 14.403f, 2f, 9.99f, 2f)
                curveTo(5.577f, 2f, 2f, 5.577f, 2f, 9.99f)
                curveTo(2f, 14.403f, 5.577f, 17.98f, 9.99f, 17.98f)
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
                moveTo(12.981f, 19.88f)
                curveTo(13.88f, 21.15f, 15.351f, 21.98f, 17.031f, 21.98f)
                curveTo(19.76f, 21.98f, 21.98f, 19.76f, 21.98f, 17.03f)
                curveTo(21.98f, 15.37f, 21.16f, 13.9f, 19.91f, 13f)
            }
        }.build()

        return _Coin1!!
    }

@Suppress("ObjectPropertyName")
private var _Coin1: ImageVector? = null
