package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.SmartHome: ImageVector
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
                moveTo(11.4f, 21.81f)
                horizontalLineTo(17.6f)
                curveTo(19.03f, 21.81f, 20.4f, 20.65f, 20.64f, 19.24f)
                lineTo(21.97f, 11.28f)
                curveTo(22.13f, 10.3f, 21.63f, 8.99f, 20.86f, 8.37f)
                lineTo(13.93f, 2.83f)
                curveTo(12.86f, 1.97f, 11.13f, 1.97f, 10.07f, 2.82f)
                lineTo(3.14f, 8.37f)
                curveTo(2.36f, 8.99f, 1.86f, 10.3f, 2.03f, 11.28f)
                lineTo(2.31f, 12.96f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 19f)
                curveTo(3.76f, 19.04f, 4.96f, 20.24f, 5f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
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
                stroke = SolidColor(Color(0xFF292D32)),
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
