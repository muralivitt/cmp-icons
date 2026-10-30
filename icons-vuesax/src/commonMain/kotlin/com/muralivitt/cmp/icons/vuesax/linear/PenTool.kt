package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.PenTool: ImageVector
    get() {
        if (_PenTool != null) {
            return _PenTool!!
        }
        _PenTool = ImageVector.Builder(
            name = "PenTool",
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
                moveTo(10.75f, 22.5f)
                horizontalLineTo(13.27f)
                curveTo(14.23f, 22.5f, 14.85f, 21.82f, 14.67f, 20.99f)
                lineTo(14.26f, 19.18f)
                horizontalLineTo(9.76f)
                lineTo(9.35f, 20.99f)
                curveTo(9.17f, 21.77f, 9.85f, 22.5f, 10.75f, 22.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.26f, 19.17f)
                lineTo(15.99f, 17.63f)
                curveTo(16.96f, 16.77f, 17f, 16.17f, 16.23f, 15.2f)
                lineTo(13.18f, 11.33f)
                curveTo(12.54f, 10.52f, 11.49f, 10.52f, 10.85f, 11.33f)
                lineTo(7.8f, 15.2f)
                curveTo(7.03f, 16.17f, 7.03f, 16.8f, 8.04f, 17.63f)
                lineTo(9.77f, 19.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.01f, 11.12f)
                verticalLineTo(13.65f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.15f, 5.19f)
                lineTo(10.37f, 4.41f)
                curveTo(9.9f, 3.94f, 9.9f, 3.18f, 10.37f, 2.71f)
                lineTo(11.15f, 1.93f)
                curveTo(11.62f, 1.46f, 12.38f, 1.46f, 12.85f, 1.93f)
                lineTo(13.63f, 2.71f)
                curveTo(14.1f, 3.18f, 14.1f, 3.94f, 13.63f, 4.41f)
                lineTo(12.85f, 5.19f)
                curveTo(12.38f, 5.66f, 11.62f, 5.66f, 11.15f, 5.19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.45f, 9.81f)
                horizontalLineTo(20.55f)
                curveTo(21.21f, 9.81f, 21.75f, 10.35f, 21.75f, 11.01f)
                verticalLineTo(12.11f)
                curveTo(21.75f, 12.77f, 21.21f, 13.31f, 20.55f, 13.31f)
                horizontalLineTo(19.45f)
                curveTo(18.79f, 13.31f, 18.25f, 12.77f, 18.25f, 12.11f)
                verticalLineTo(11.01f)
                curveTo(18.25f, 10.35f, 18.79f, 9.81f, 19.45f, 9.81f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.55f, 9.81f)
                horizontalLineTo(3.45f)
                curveTo(2.79f, 9.81f, 2.25f, 10.35f, 2.25f, 11.01f)
                verticalLineTo(12.11f)
                curveTo(2.25f, 12.77f, 2.79f, 13.31f, 3.45f, 13.31f)
                horizontalLineTo(4.55f)
                curveTo(5.21f, 13.31f, 5.75f, 12.77f, 5.75f, 12.11f)
                verticalLineTo(11.01f)
                curveTo(5.75f, 10.35f, 5.21f, 9.81f, 4.55f, 9.81f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.54f, 10.1f)
                lineTo(13.24f, 4.8f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.46f, 10.1f)
                lineTo(10.76f, 4.8f)
            }
        }.build()

        return _PenTool!!
    }

@Suppress("ObjectPropertyName")
private var _PenTool: ImageVector? = null
