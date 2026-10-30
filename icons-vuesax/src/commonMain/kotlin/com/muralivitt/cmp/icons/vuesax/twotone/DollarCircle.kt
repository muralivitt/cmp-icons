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

val VuesaxIconsTwotone.DollarCircle: ImageVector
    get() {
        if (_DollarCircle != null) {
            return _DollarCircle!!
        }
        _DollarCircle = ImageVector.Builder(
            name = "DollarCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.672f, 14.33f)
                curveTo(8.672f, 15.62f, 9.662f, 16.66f, 10.892f, 16.66f)
                horizontalLineTo(13.402f)
                curveTo(14.472f, 16.66f, 15.342f, 15.75f, 15.342f, 14.63f)
                curveTo(15.342f, 13.41f, 14.812f, 12.98f, 14.022f, 12.7f)
                lineTo(9.992f, 11.3f)
                curveTo(9.202f, 11.02f, 8.672f, 10.59f, 8.672f, 9.37f)
                curveTo(8.672f, 8.25f, 9.542f, 7.34f, 10.612f, 7.34f)
                horizontalLineTo(13.122f)
                curveTo(14.352f, 7.34f, 15.342f, 8.38f, 15.342f, 9.67f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                verticalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _DollarCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DollarCircle: ImageVector? = null
