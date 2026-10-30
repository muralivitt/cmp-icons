package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BatteryEmpty: ImageVector
    get() {
        if (_BatteryEmpty != null) {
            return _BatteryEmpty!!
        }
        _BatteryEmpty = ImageVector.Builder(
            name = "BatteryEmpty",
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.5f, 9.5f)
                curveTo(22f, 9.5f, 22f, 10f, 22f, 11f)
                verticalLineTo(13f)
                curveTo(22f, 14f, 22f, 14.5f, 20.5f, 14.5f)
            }
        }.build()

        return _BatteryEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryEmpty: ImageVector? = null
