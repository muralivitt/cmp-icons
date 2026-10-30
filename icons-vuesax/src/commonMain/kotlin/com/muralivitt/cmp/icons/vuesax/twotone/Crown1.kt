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

val VuesaxIconsTwotone.Crown1: ImageVector
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
                moveTo(16.699f, 18.98f)
                horizontalLineTo(7.299f)
                curveTo(6.879f, 18.98f, 6.409f, 18.65f, 6.269f, 18.25f)
                lineTo(2.129f, 6.67f)
                curveTo(1.539f, 5.01f, 2.229f, 4.5f, 3.649f, 5.52f)
                lineTo(7.549f, 8.31f)
                curveTo(8.199f, 8.76f, 8.939f, 8.53f, 9.219f, 7.8f)
                lineTo(10.979f, 3.11f)
                curveTo(11.539f, 1.61f, 12.469f, 1.61f, 13.029f, 3.11f)
                lineTo(14.789f, 7.8f)
                curveTo(15.069f, 8.53f, 15.809f, 8.76f, 16.449f, 8.31f)
                lineTo(20.109f, 5.7f)
                curveTo(21.669f, 4.58f, 22.419f, 5.15f, 21.779f, 6.96f)
                lineTo(17.739f, 18.27f)
                curveTo(17.589f, 18.65f, 17.119f, 18.98f, 16.699f, 18.98f)
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
                moveTo(6.5f, 22f)
                horizontalLineTo(17.5f)
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
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
