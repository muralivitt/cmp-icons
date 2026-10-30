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

val VuesaxIconsTwotone.HomeWifi: ImageVector
    get() {
        if (_HomeWifi != null) {
            return _HomeWifi!!
        }
        _HomeWifi = ImageVector.Builder(
            name = "HomeWifi",
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
                moveTo(10.069f, 2.82f)
                lineTo(3.139f, 8.37f)
                curveTo(2.359f, 8.99f, 1.859f, 10.3f, 2.029f, 11.28f)
                lineTo(3.359f, 19.24f)
                curveTo(3.599f, 20.66f, 4.959f, 21.81f, 6.399f, 21.81f)
                horizontalLineTo(17.599f)
                curveTo(19.029f, 21.81f, 20.399f, 20.65f, 20.639f, 19.24f)
                lineTo(21.969f, 11.28f)
                curveTo(22.129f, 10.3f, 21.629f, 8.99f, 20.859f, 8.37f)
                lineTo(13.929f, 2.83f)
                curveTo(12.859f, 1.97f, 11.129f, 1.97f, 10.069f, 2.82f)
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
                moveTo(9.881f, 14.38f)
                curveTo(11.151f, 13.17f, 12.851f, 13.17f, 14.121f, 14.38f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.24f, 12.26f)
                curveTo(15.7f, 11.73f, 15.1f, 11.32f, 14.48f, 11.02f)
                curveTo(12.89f, 10.26f, 11.11f, 10.26f, 9.51f, 11.02f)
                curveTo(8.89f, 11.32f, 8.3f, 11.73f, 7.75f, 12.26f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.995f, 16.5f)
                horizontalLineTo(12.005f)
            }
        }.build()

        return _HomeWifi!!
    }

@Suppress("ObjectPropertyName")
private var _HomeWifi: ImageVector? = null
