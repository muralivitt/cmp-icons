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

val VuesaxIconsTwotone.BatteryDisable: ImageVector
    get() {
        if (_BatteryDisable != null) {
            return _BatteryDisable!!
        }
        _BatteryDisable = ImageVector.Builder(
            name = "BatteryDisable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.5f, 9.5f)
                curveTo(22f, 9.5f, 22f, 10f, 22f, 11f)
                verticalLineTo(13f)
                curveTo(22f, 14f, 22f, 14.5f, 20.5f, 14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 21.5f)
                lineTo(16f, 2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 5f)
                curveTo(3f, 5f, 2f, 6f, 2f, 10f)
                verticalLineTo(14f)
                curveTo(2f, 17.4f, 2.72f, 18.63f, 5.39f, 18.92f)
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 19f)
                curveTo(17f, 19f, 18f, 18f, 18f, 14f)
                verticalLineTo(10f)
                curveTo(18f, 6.61f, 17.28f, 5.37f, 14.63f, 5.08f)
            }
        }.build()

        return _BatteryDisable!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryDisable: ImageVector? = null
