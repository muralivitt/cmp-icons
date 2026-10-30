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

val VuesaxIconsTwotone.SmartHome: ImageVector
    get() {
        if (_SmartHome != null) {
            return _SmartHome!!
        }
        _SmartHome = ImageVector.Builder(
            name = "SmartHome",
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
                moveTo(11.399f, 21.81f)
                horizontalLineTo(17.599f)
                curveTo(19.029f, 21.81f, 20.399f, 20.65f, 20.639f, 19.24f)
                lineTo(21.969f, 11.28f)
                curveTo(22.129f, 10.3f, 21.629f, 8.99f, 20.859f, 8.37f)
                lineTo(13.929f, 2.83f)
                curveTo(12.859f, 1.97f, 11.129f, 1.97f, 10.069f, 2.82f)
                lineTo(3.139f, 8.37f)
                curveTo(2.359f, 8.99f, 1.859f, 10.3f, 2.029f, 11.28f)
                lineTo(2.309f, 12.96f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 19f)
                curveTo(3.76f, 19.04f, 4.96f, 20.24f, 5f, 22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 22f)
                curveTo(7.99f, 21.24f, 7.86f, 20.53f, 7.63f, 19.88f)
                curveTo(7.04f, 18.21f, 5.78f, 16.96f, 4.12f, 16.37f)
                curveTo(3.47f, 16.14f, 2.76f, 16.01f, 2f, 16f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1.995f, 22f)
                horizontalLineTo(2.004f)
            }
        }.build()

        return _SmartHome!!
    }

@Suppress("ObjectPropertyName")
private var _SmartHome: ImageVector? = null
