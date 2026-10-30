package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Crown1: ImageVector
    get() {
        if (_Crown1 != null) {
            return _Crown1!!
        }
        _Crown1 = ImageVector.Builder(
            name = "Crown1",
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
                moveTo(16.7f, 18.98f)
                horizontalLineTo(7.3f)
                curveTo(6.88f, 18.98f, 6.41f, 18.65f, 6.27f, 18.25f)
                lineTo(2.13f, 6.67f)
                curveTo(1.54f, 5.01f, 2.23f, 4.5f, 3.65f, 5.52f)
                lineTo(7.55f, 8.31f)
                curveTo(8.2f, 8.76f, 8.94f, 8.53f, 9.22f, 7.8f)
                lineTo(10.98f, 3.11f)
                curveTo(11.54f, 1.61f, 12.47f, 1.61f, 13.03f, 3.11f)
                lineTo(14.79f, 7.8f)
                curveTo(15.07f, 8.53f, 15.81f, 8.76f, 16.45f, 8.31f)
                lineTo(20.11f, 5.7f)
                curveTo(21.67f, 4.58f, 22.42f, 5.15f, 21.78f, 6.96f)
                lineTo(17.74f, 18.27f)
                curveTo(17.59f, 18.65f, 17.12f, 18.98f, 16.7f, 18.98f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 22f)
                horizontalLineTo(17.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 14f)
                horizontalLineTo(14.5f)
            }
        }.build()

        return _Crown1!!
    }

@Suppress("ObjectPropertyName")
private var _Crown1: ImageVector? = null
