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

val VuesaxIconsTwotone.MicrophoneSlash: ImageVector
    get() {
        if (_MicrophoneSlash != null) {
            return _MicrophoneSlash!!
        }
        _MicrophoneSlash = ImageVector.Builder(
            name = "MicrophoneSlash",
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
                moveTo(16f, 6.3f)
                verticalLineTo(6f)
                curveTo(16f, 3.79f, 14.21f, 2f, 12f, 2f)
                curveTo(9.79f, 2f, 8f, 3.79f, 8f, 6f)
                verticalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.35f, 9.65f)
                verticalLineTo(11.35f)
                curveTo(4.35f, 12.41f, 4.56f, 13.41f, 4.95f, 14.33f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.07f, 2.84f)
                lineTo(3.93f, 18.99f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 3f)
                verticalLineTo(6f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.039f, 14.19f)
                curveTo(9.769f, 15f, 10.829f, 15.5f, 11.999f, 15.5f)
                curveTo(14.209f, 15.5f, 15.999f, 13.71f, 15.999f, 11.5f)
                verticalLineTo(11f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.779f, 16.95f)
                curveTo(8.149f, 18.22f, 9.979f, 19f, 11.999f, 19f)
                curveTo(16.219f, 19f, 19.649f, 15.57f, 19.649f, 11.35f)
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

        return _MicrophoneSlash!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneSlash: ImageVector? = null
