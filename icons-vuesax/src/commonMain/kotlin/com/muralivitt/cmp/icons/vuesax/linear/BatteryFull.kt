package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BatteryFull: ImageVector
    get() {
        if (_BatteryFull != null) {
            return _BatteryFull!!
        }
        _BatteryFull = ImageVector.Builder(
            name = "BatteryFull",
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
                moveTo(6.38f, 10f)
                curveTo(6.71f, 11.31f, 6.71f, 12.69f, 6.38f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.88f, 10f)
                curveTo(10.21f, 11.31f, 10.21f, 12.69f, 9.88f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.38f, 10f)
                curveTo(13.71f, 11.31f, 13.71f, 12.69f, 13.38f, 14f)
            }
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
        }.build()

        return _BatteryFull!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryFull: ImageVector? = null
