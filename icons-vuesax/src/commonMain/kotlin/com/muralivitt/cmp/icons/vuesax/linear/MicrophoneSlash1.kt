package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MicrophoneSlash1: ImageVector
    get() {
        if (_MicrophoneSlash1 != null) {
            return _MicrophoneSlash1!!
        }
        _MicrophoneSlash1 = ImageVector.Builder(
            name = "MicrophoneSlash1",
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
                moveTo(17.82f, 6.53f)
                curveTo(17.16f, 3.93f, 14.81f, 2f, 12f, 2f)
                curveTo(8.69f, 2f, 6f, 4.69f, 6f, 8f)
                verticalLineTo(13f)
                curveTo(6f, 14.46f, 6.52f, 15.8f, 7.39f, 16.84f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 9.98f)
                verticalLineTo(13f)
                curveTo(18f, 16.31f, 15.31f, 19f, 12f, 19f)
                curveTo(11.27f, 19f, 10.56f, 18.87f, 9.92f, 18.63f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.86f, 19.58f)
                curveTo(7.47f, 21.08f, 9.63f, 22f, 12f, 22f)
                curveTo(16.97f, 22f, 21f, 17.97f, 21f, 13f)
                verticalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.5f, 2.99f)
                lineTo(2.5f, 21.99f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.55f, 5.5f)
                verticalLineTo(2.26f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 3.5f)
                verticalLineTo(7.5f)
            }
        }.build()

        return _MicrophoneSlash1!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneSlash1: ImageVector? = null
