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

val VuesaxIconsTwotone.TrushSquare: ImageVector
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.709f, 8.39f)
                lineTo(9.849f, 7.53f)
                curveTo(9.949f, 6.91f, 10.029f, 6.44f, 11.139f, 6.44f)
                horizontalLineTo(12.859f)
                curveTo(13.969f, 6.44f, 14.049f, 6.93f, 14.149f, 7.53f)
                lineTo(14.289f, 8.38f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
