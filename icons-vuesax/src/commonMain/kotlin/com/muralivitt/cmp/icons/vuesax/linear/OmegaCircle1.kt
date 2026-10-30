package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.OmegaCircle1: ImageVector
    get() {
        if (_OmegaCircle1 != null) {
            return _OmegaCircle1!!
        }
        _OmegaCircle1 = ImageVector.Builder(
            name = "OmegaCircle1",
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
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16.5f)
                horizontalLineTo(13.9f)
                lineTo(15.52f, 14.71f)
                curveTo(16.32f, 13.82f, 16.76f, 12.69f, 16.76f, 11.53f)
                curveTo(16.76f, 10.33f, 16.26f, 9.18f, 15.37f, 8.33f)
                curveTo(14.48f, 7.48f, 13.27f, 7f, 12f, 7f)
                curveTo(10.74f, 7f, 9.53f, 7.48f, 8.63f, 8.33f)
                curveTo(7.74f, 9.18f, 7.24f, 10.33f, 7.24f, 11.53f)
                curveTo(7.24f, 12.7f, 7.68f, 13.83f, 8.48f, 14.71f)
                lineTo(10.1f, 16.5f)
                horizontalLineTo(7f)
            }
        }.build()

        return _OmegaCircle1!!
    }

@Suppress("ObjectPropertyName")
private var _OmegaCircle1: ImageVector? = null
