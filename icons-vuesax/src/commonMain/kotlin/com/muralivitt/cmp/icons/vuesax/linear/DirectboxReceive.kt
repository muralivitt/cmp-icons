package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DirectboxReceive: ImageVector
    get() {
        if (_DirectboxReceive != null) {
            return _DirectboxReceive!!
        }
        _DirectboxReceive = ImageVector.Builder(
            name = "DirectboxReceive",
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
                moveTo(12f, 2f)
                verticalLineTo(8f)
                lineTo(14f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                lineTo(10f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 12f)
                curveTo(3f, 12f, 3f, 13.79f, 3f, 16f)
                verticalLineTo(17f)
                curveTo(3f, 19.76f, 3f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(20f, 22f, 21f, 19.76f, 21f, 17f)
                verticalLineTo(16f)
                curveTo(21f, 13.79f, 21f, 12f, 17f, 12f)
                curveTo(16f, 12f, 15.72f, 12.21f, 15.2f, 12.6f)
                lineTo(14.18f, 13.68f)
                curveTo(13f, 14.94f, 11f, 14.94f, 9.81f, 13.68f)
                lineTo(8.8f, 12.6f)
                curveTo(8.28f, 12.21f, 8f, 12f, 7f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12f)
                verticalLineTo(8f)
                curveTo(5f, 5.99f, 5f, 4.33f, 8f, 4.04f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 12f)
                verticalLineTo(8f)
                curveTo(19f, 5.99f, 19f, 4.33f, 16f, 4.04f)
            }
        }.build()

        return _DirectboxReceive!!
    }

@Suppress("ObjectPropertyName")
private var _DirectboxReceive: ImageVector? = null
