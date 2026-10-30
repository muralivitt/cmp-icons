package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.TrushSquare: ImageVector
    get() {
        if (_TrushSquare != null) {
            return _TrushSquare!!
        }
        _TrushSquare = ImageVector.Builder(
            name = "TrushSquare",
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
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.9f, 9.05f)
                curveTo(15.72f, 8.83f, 13.52f, 8.72f, 11.33f, 8.72f)
                curveTo(10.03f, 8.72f, 8.73f, 8.79f, 7.44f, 8.92f)
                lineTo(6.1f, 9.05f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.71f, 8.39f)
                lineTo(9.85f, 7.53f)
                curveTo(9.95f, 6.91f, 10.03f, 6.44f, 11.14f, 6.44f)
                horizontalLineTo(12.86f)
                curveTo(13.97f, 6.44f, 14.05f, 6.93f, 14.15f, 7.53f)
                lineTo(14.29f, 8.38f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.49f, 9.13f)
                lineTo(16.06f, 15.73f)
                curveTo(15.99f, 16.76f, 15.93f, 17.56f, 14.1f, 17.56f)
                horizontalLineTo(9.89f)
                curveTo(8.06f, 17.56f, 8f, 16.76f, 7.93f, 15.73f)
                lineTo(7.5f, 9.13f)
            }
        }.build()

        return _TrushSquare!!
    }

@Suppress("ObjectPropertyName")
private var _TrushSquare: ImageVector? = null
