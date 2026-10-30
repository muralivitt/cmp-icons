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

val VuesaxIconsTwotone.RotateLeft: ImageVector
    get() {
        if (_RotateLeft != null) {
            return _RotateLeft!!
        }
        _RotateLeft = ImageVector.Builder(
            name = "RotateLeft",
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
                moveTo(9.11f, 5.08f)
                curveTo(9.98f, 4.82f, 10.94f, 4.65f, 12f, 4.65f)
                curveTo(16.79f, 4.65f, 20.67f, 8.53f, 20.67f, 13.32f)
                curveTo(20.67f, 18.11f, 16.79f, 21.99f, 12f, 21.99f)
                curveTo(7.21f, 21.99f, 3.33f, 18.11f, 3.33f, 13.32f)
                curveTo(3.33f, 11.54f, 3.87f, 9.88f, 4.79f, 8.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.869f, 5.32f)
                lineTo(10.759f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.869f, 5.32f)
                lineTo(11.239f, 7.78f)
            }
        }.build()

        return _RotateLeft!!
    }

@Suppress("ObjectPropertyName")
private var _RotateLeft: ImageVector? = null
