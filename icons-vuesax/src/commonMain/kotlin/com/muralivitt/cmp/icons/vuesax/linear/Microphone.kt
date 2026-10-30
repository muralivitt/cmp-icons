package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Microphone: ImageVector
    get() {
        if (_Microphone != null) {
            return _Microphone!!
        }
        _Microphone = ImageVector.Builder(
            name = "Microphone",
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
                moveTo(12f, 19f)
                curveTo(15.31f, 19f, 18f, 16.31f, 18f, 13f)
                verticalLineTo(8f)
                curveTo(18f, 4.69f, 15.31f, 2f, 12f, 2f)
                curveTo(8.69f, 2f, 6f, 4.69f, 6f, 8f)
                verticalLineTo(13f)
                curveTo(6f, 16.31f, 8.69f, 19f, 12f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 11f)
                verticalLineTo(13f)
                curveTo(3f, 17.97f, 7.03f, 22f, 12f, 22f)
                curveTo(16.97f, 22f, 21f, 17.97f, 21f, 13f)
                verticalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.11f, 7.48f)
                curveTo(10.89f, 6.83f, 12.83f, 6.83f, 14.61f, 7.48f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.03f, 10.48f)
                curveTo(11.23f, 10.15f, 12.5f, 10.15f, 13.7f, 10.48f)
            }
        }.build()

        return _Microphone!!
    }

@Suppress("ObjectPropertyName")
private var _Microphone: ImageVector? = null
