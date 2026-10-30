package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.AudioSquare: ImageVector
    get() {
        if (_AudioSquare != null) {
            return _AudioSquare!!
        }
        _AudioSquare = ImageVector.Builder(
            name = "AudioSquare",
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
                moveTo(22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.62f, 17.3f)
                curveTo(10.791f, 17.3f, 11.74f, 16.351f, 11.74f, 15.18f)
                curveTo(11.74f, 14.009f, 10.791f, 13.06f, 9.62f, 13.06f)
                curveTo(8.449f, 13.06f, 7.5f, 14.009f, 7.5f, 15.18f)
                curveTo(7.5f, 16.351f, 8.449f, 17.3f, 9.62f, 17.3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.74f, 15.18f)
                verticalLineTo(7.77f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.13f, 6.77f)
                lineTo(15.47f, 7.55f)
                curveTo(16.04f, 7.74f, 16.5f, 8.38f, 16.5f, 8.98f)
                verticalLineTo(9.6f)
                curveTo(16.5f, 10.41f, 15.87f, 10.86f, 15.11f, 10.6f)
                lineTo(12.77f, 9.82f)
                curveTo(12.2f, 9.63f, 11.74f, 8.99f, 11.74f, 8.39f)
                verticalLineTo(7.77f)
                curveTo(11.74f, 6.97f, 12.36f, 6.51f, 13.13f, 6.77f)
                close()
            }
        }.build()

        return _AudioSquare!!
    }

@Suppress("ObjectPropertyName")
private var _AudioSquare: ImageVector? = null
