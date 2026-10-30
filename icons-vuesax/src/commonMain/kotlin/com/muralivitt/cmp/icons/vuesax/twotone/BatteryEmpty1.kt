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

val VuesaxIconsTwotone.BatteryEmpty1: ImageVector
    get() {
        if (_BatteryEmpty1 != null) {
            return _BatteryEmpty1!!
        }
        _BatteryEmpty1 = ImageVector.Builder(
            name = "BatteryEmpty1",
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
                moveTo(13f, 19f)
                horizontalLineTo(7f)
                curveTo(3f, 19f, 2f, 18f, 2f, 14f)
                verticalLineTo(10f)
                curveTo(2f, 6f, 3f, 5f, 7f, 5f)
                horizontalLineTo(13f)
                curveTo(17f, 5f, 18f, 6f, 18f, 10f)
                verticalLineTo(14f)
                curveTo(18f, 18f, 17f, 19f, 13f, 19f)
                close()
            }
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
                moveTo(6.381f, 10f)
                curveTo(6.711f, 11.31f, 6.711f, 12.69f, 6.381f, 14f)
            }
        }.build()

        return _BatteryEmpty1!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryEmpty1: ImageVector? = null
