package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.GridEraser: ImageVector
    get() {
        if (_GridEraser != null) {
            return _GridEraser!!
        }
        _GridEraser = ImageVector.Builder(
            name = "GridEraser",
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
                moveTo(22f, 11f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.03f, 8.5f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.03f, 15.5f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.51f, 21.99f)
                verticalLineTo(2.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.51f, 11.99f)
                verticalLineTo(2.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.8f, 19.7f)
                lineTo(16.9f, 21.6f)
                curveTo(16.38f, 22.12f, 15.52f, 22.12f, 14.99f, 21.6f)
                lineTo(13.41f, 20.01f)
                curveTo(12.89f, 19.49f, 12.89f, 18.63f, 13.41f, 18.1f)
                lineTo(15.31f, 16.21f)
                lineTo(18.8f, 19.7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.61f, 16.9f)
                lineTo(18.8f, 19.71f)
                lineTo(15.3f, 16.21f)
                lineTo(18.11f, 13.39f)
                curveTo(18.63f, 12.87f, 19.5f, 12.87f, 20.02f, 13.39f)
                lineTo(21.6f, 14.98f)
                curveTo(22.13f, 15.51f, 22.13f, 16.38f, 21.61f, 16.9f)
                close()
            }
        }.build()

        return _GridEraser!!
    }

@Suppress("ObjectPropertyName")
private var _GridEraser: ImageVector? = null
