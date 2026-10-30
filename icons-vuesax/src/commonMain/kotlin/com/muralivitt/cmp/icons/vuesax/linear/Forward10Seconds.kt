package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Forward10Seconds: ImageVector
    get() {
        if (_Forward10Seconds != null) {
            return _Forward10Seconds!!
        }
        _Forward10Seconds = ImageVector.Builder(
            name = "Forward10Seconds",
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
                moveTo(13.98f, 4.47f)
                lineTo(12f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.09f, 7.8f)
                curveTo(20.2f, 9.28f, 20.89f, 11.11f, 20.89f, 13.11f)
                curveTo(20.89f, 18.02f, 16.91f, 22f, 12f, 22f)
                curveTo(7.09f, 22f, 3.11f, 18.02f, 3.11f, 13.11f)
                curveTo(3.11f, 8.2f, 7.09f, 4.22f, 12f, 4.22f)
                curveTo(12.68f, 4.22f, 13.34f, 4.31f, 13.98f, 4.46f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.54f, 15.92f)
                verticalLineTo(10.58f)
                lineTo(8.04f, 12.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10.58f)
                curveTo(15.1f, 10.58f, 16f, 11.48f, 16f, 12.58f)
                verticalLineTo(13.93f)
                curveTo(16f, 15.03f, 15.1f, 15.93f, 14f, 15.93f)
                curveTo(12.9f, 15.93f, 12f, 15.03f, 12f, 13.93f)
                verticalLineTo(12.58f)
                curveTo(12f, 11.47f, 12.9f, 10.58f, 14f, 10.58f)
                close()
            }
        }.build()

        return _Forward10Seconds!!
    }

@Suppress("ObjectPropertyName")
private var _Forward10Seconds: ImageVector? = null
