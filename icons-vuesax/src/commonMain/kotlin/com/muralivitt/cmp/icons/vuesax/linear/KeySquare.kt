package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.KeySquare: ImageVector
    get() {
        if (_KeySquare != null) {
            return _KeySquare!!
        }
        _KeySquare = ImageVector.Builder(
            name = "KeySquare",
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
                moveTo(16.28f, 13.61f)
                curveTo(15.15f, 14.74f, 13.53f, 15.09f, 12.1f, 14.64f)
                lineTo(9.51f, 17.22f)
                curveTo(9.33f, 17.41f, 8.96f, 17.53f, 8.69f, 17.49f)
                lineTo(7.49f, 17.33f)
                curveTo(7.09f, 17.28f, 6.73f, 16.9f, 6.67f, 16.51f)
                lineTo(6.51f, 15.31f)
                curveTo(6.47f, 15.05f, 6.6f, 14.68f, 6.78f, 14.49f)
                lineTo(9.36f, 11.91f)
                curveTo(8.92f, 10.48f, 9.26f, 8.86f, 10.39f, 7.73f)
                curveTo(12.01f, 6.11f, 14.65f, 6.11f, 16.28f, 7.73f)
                curveTo(17.9f, 9.34f, 17.9f, 11.98f, 16.28f, 13.61f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.45f, 16.28f)
                lineTo(9.6f, 15.42f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.394f, 10.7f)
                horizontalLineTo(13.403f)
            }
        }.build()

        return _KeySquare!!
    }

@Suppress("ObjectPropertyName")
private var _KeySquare: ImageVector? = null
