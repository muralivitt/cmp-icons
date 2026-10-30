package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ChartSquare: ImageVector
    get() {
        if (_ChartSquare != null) {
            return _ChartSquare!!
        }
        _ChartSquare = ImageVector.Builder(
            name = "ChartSquare",
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
                moveTo(10.11f, 11.15f)
                horizontalLineTo(7.46f)
                curveTo(6.83f, 11.15f, 6.32f, 11.66f, 6.32f, 12.29f)
                verticalLineTo(17.41f)
                horizontalLineTo(10.11f)
                verticalLineTo(11.15f)
                verticalLineTo(11.15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.761f, 6.6f)
                horizontalLineTo(11.241f)
                curveTo(10.611f, 6.6f, 10.101f, 7.11f, 10.101f, 7.74f)
                verticalLineTo(17.4f)
                horizontalLineTo(13.891f)
                verticalLineTo(7.74f)
                curveTo(13.891f, 7.11f, 13.391f, 6.6f, 12.761f, 6.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.548f, 12.85f)
                horizontalLineTo(13.898f)
                verticalLineTo(17.4f)
                horizontalLineTo(17.688f)
                verticalLineTo(13.99f)
                curveTo(17.678f, 13.36f, 17.168f, 12.85f, 16.548f, 12.85f)
                close()
            }
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
        }.build()

        return _ChartSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ChartSquare: ImageVector? = null
