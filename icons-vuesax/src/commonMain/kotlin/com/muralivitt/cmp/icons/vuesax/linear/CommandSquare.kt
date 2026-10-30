package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CommandSquare: ImageVector
    get() {
        if (_CommandSquare != null) {
            return _CommandSquare!!
        }
        _CommandSquare = ImageVector.Builder(
            name = "CommandSquare",
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
                moveTo(14.4f, 9.6f)
                horizontalLineTo(9.6f)
                verticalLineTo(14.4f)
                horizontalLineTo(14.4f)
                verticalLineTo(9.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.8f, 18f)
                curveTo(8.79f, 18f, 9.6f, 17.19f, 9.6f, 16.2f)
                verticalLineTo(14.4f)
                horizontalLineTo(7.8f)
                curveTo(6.81f, 14.4f, 6f, 15.21f, 6f, 16.2f)
                curveTo(6f, 17.19f, 6.81f, 18f, 7.8f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.8f, 9.6f)
                horizontalLineTo(9.6f)
                verticalLineTo(7.8f)
                curveTo(9.6f, 6.81f, 8.79f, 6f, 7.8f, 6f)
                curveTo(6.81f, 6f, 6f, 6.81f, 6f, 7.8f)
                curveTo(6f, 8.79f, 6.81f, 9.6f, 7.8f, 9.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.4f, 9.6f)
                horizontalLineTo(16.2f)
                curveTo(17.19f, 9.6f, 18f, 8.79f, 18f, 7.8f)
                curveTo(18f, 6.81f, 17.19f, 6f, 16.2f, 6f)
                curveTo(15.21f, 6f, 14.4f, 6.81f, 14.4f, 7.8f)
                verticalLineTo(9.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.2f, 18f)
                curveTo(17.19f, 18f, 18f, 17.19f, 18f, 16.2f)
                curveTo(18f, 15.21f, 17.19f, 14.4f, 16.2f, 14.4f)
                horizontalLineTo(14.4f)
                verticalLineTo(16.2f)
                curveTo(14.4f, 17.19f, 15.21f, 18f, 16.2f, 18f)
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

        return _CommandSquare!!
    }

@Suppress("ObjectPropertyName")
private var _CommandSquare: ImageVector? = null
