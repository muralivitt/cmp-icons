package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DollarSquare: ImageVector
    get() {
        if (_DollarSquare != null) {
            return _DollarSquare!!
        }
        _DollarSquare = ImageVector.Builder(
            name = "DollarSquare",
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
                stroke = SolidColor(Color(0xFF292D32)),
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
                moveTo(15f, 22f)
                horizontalLineTo(9f)
                curveTo(4f, 22f, 2f, 20f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 4f, 4f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(20f, 2f, 22f, 4f, 22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 20f, 20f, 22f, 15f, 22f)
                close()
            }
        }.build()

        return _DollarSquare!!
    }

@Suppress("ObjectPropertyName")
private var _DollarSquare: ImageVector? = null
