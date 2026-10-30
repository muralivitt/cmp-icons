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

val VuesaxIconsTwotone.Microphone2: ImageVector
    get() {
        if (_Microphone2 != null) {
            return _Microphone2!!
        }
        _Microphone2 = ImageVector.Builder(
            name = "Microphone2",
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
                moveTo(12f, 15.5f)
                curveTo(14.21f, 15.5f, 16f, 13.71f, 16f, 11.5f)
                verticalLineTo(6f)
                curveTo(16f, 3.79f, 14.21f, 2f, 12f, 2f)
                curveTo(9.79f, 2f, 8f, 3.79f, 8f, 6f)
                verticalLineTo(11.5f)
                curveTo(8f, 13.71f, 9.79f, 15.5f, 12f, 15.5f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.609f, 6.43f)
                curveTo(11.509f, 6.1f, 12.489f, 6.1f, 13.389f, 6.43f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.199f, 8.55f)
                curveTo(11.729f, 8.41f, 12.279f, 8.41f, 12.809f, 8.55f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.35f, 9.65f)
                verticalLineTo(11.35f)
                curveTo(4.35f, 15.57f, 7.78f, 19f, 12f, 19f)
                curveTo(16.22f, 19f, 19.65f, 15.57f, 19.65f, 11.35f)
                verticalLineTo(9.65f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                verticalLineTo(22f)
            }
        }.build()

        return _Microphone2!!
    }

@Suppress("ObjectPropertyName")
private var _Microphone2: ImageVector? = null
