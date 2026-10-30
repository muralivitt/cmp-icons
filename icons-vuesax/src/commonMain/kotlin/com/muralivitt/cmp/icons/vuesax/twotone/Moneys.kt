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

val VuesaxIconsTwotone.Moneys: ImageVector
    get() {
        if (_Moneys != null) {
            return _Moneys!!
        }
        _Moneys = ImageVector.Builder(
            name = "Moneys",
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
                moveTo(19.301f, 7.92f)
                verticalLineTo(13.07f)
                curveTo(19.301f, 16.15f, 17.541f, 17.47f, 14.901f, 17.47f)
                horizontalLineTo(6.111f)
                curveTo(5.661f, 17.47f, 5.231f, 17.43f, 4.831f, 17.34f)
                curveTo(4.581f, 17.3f, 4.341f, 17.23f, 4.121f, 17.15f)
                curveTo(2.621f, 16.59f, 1.711f, 15.29f, 1.711f, 13.07f)
                verticalLineTo(7.92f)
                curveTo(1.711f, 4.84f, 3.471f, 3.52f, 6.111f, 3.52f)
                horizontalLineTo(14.901f)
                curveTo(17.141f, 3.52f, 18.751f, 4.47f, 19.181f, 6.64f)
                curveTo(19.251f, 7.04f, 19.301f, 7.45f, 19.301f, 7.92f)
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
                moveTo(22.3f, 10.92f)
                verticalLineTo(16.07f)
                curveTo(22.3f, 19.15f, 20.54f, 20.47f, 17.9f, 20.47f)
                horizontalLineTo(9.11f)
                curveTo(8.37f, 20.47f, 7.7f, 20.37f, 7.12f, 20.15f)
                curveTo(5.93f, 19.71f, 5.12f, 18.8f, 4.83f, 17.34f)
                curveTo(5.23f, 17.43f, 5.66f, 17.47f, 6.11f, 17.47f)
                horizontalLineTo(14.9f)
                curveTo(17.54f, 17.47f, 19.3f, 16.15f, 19.3f, 13.07f)
                verticalLineTo(7.92f)
                curveTo(19.3f, 7.45f, 19.26f, 7.03f, 19.18f, 6.64f)
                curveTo(21.08f, 7.04f, 22.3f, 8.38f, 22.3f, 10.92f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.499f, 13.14f)
                curveTo(11.957f, 13.14f, 13.139f, 11.958f, 13.139f, 10.5f)
                curveTo(13.139f, 9.042f, 11.957f, 7.86f, 10.499f, 7.86f)
                curveTo(9.041f, 7.86f, 7.859f, 9.042f, 7.859f, 10.5f)
                curveTo(7.859f, 11.958f, 9.041f, 13.14f, 10.499f, 13.14f)
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
                moveTo(4.779f, 8.3f)
                verticalLineTo(12.7f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.221f, 8.3f)
                verticalLineTo(12.7f)
            }
        }.build()

        return _Moneys!!
    }

@Suppress("ObjectPropertyName")
private var _Moneys: ImageVector? = null
