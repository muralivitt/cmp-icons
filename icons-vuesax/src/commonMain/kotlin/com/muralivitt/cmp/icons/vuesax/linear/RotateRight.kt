package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.RotateRight: ImageVector
    get() {
        if (_RotateRight != null) {
            return _RotateRight!!
        }
        _RotateRight = ImageVector.Builder(
            name = "RotateRight",
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
                moveTo(14.89f, 5.08f)
                curveTo(14.02f, 4.82f, 13.06f, 4.65f, 12f, 4.65f)
                curveTo(7.21f, 4.65f, 3.33f, 8.53f, 3.33f, 13.32f)
                curveTo(3.33f, 18.12f, 7.21f, 22f, 12f, 22f)
                curveTo(16.79f, 22f, 20.67f, 18.12f, 20.67f, 13.33f)
                curveTo(20.67f, 11.55f, 20.13f, 9.89f, 19.21f, 8.51f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.13f, 5.32f)
                lineTo(13.24f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.13f, 5.32f)
                lineTo(12.76f, 7.78f)
            }
        }.build()

        return _RotateRight!!
    }

@Suppress("ObjectPropertyName")
private var _RotateRight: ImageVector? = null
