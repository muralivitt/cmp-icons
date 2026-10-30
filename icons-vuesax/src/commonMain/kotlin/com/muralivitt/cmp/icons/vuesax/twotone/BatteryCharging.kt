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

val VuesaxIconsTwotone.BatteryCharging: ImageVector
    get() {
        if (_BatteryCharging != null) {
            return _BatteryCharging!!
        }
        _BatteryCharging = ImageVector.Builder(
            name = "BatteryCharging",
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
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.999f, 8f)
                lineTo(8.109f, 10.5f)
                curveTo(7.719f, 11.17f, 8.199f, 12f, 8.969f, 12f)
                horizontalLineTo(11.269f)
                curveTo(12.039f, 12f, 12.519f, 12.83f, 12.139f, 13.5f)
                lineTo(9.999f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                curveTo(3f, 19f, 2f, 18f, 2f, 14f)
                verticalLineTo(10f)
                curveTo(2f, 6f, 3f, 5f, 7f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 5f)
                curveTo(17f, 5f, 18f, 6f, 18f, 10f)
                verticalLineTo(14f)
                curveTo(18f, 18f, 17f, 19f, 13f, 19f)
            }
        }.build()

        return _BatteryCharging!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryCharging: ImageVector? = null
