package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Star",
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
                moveTo(15.39f, 5.21f)
                lineTo(16.8f, 8.03f)
                curveTo(16.99f, 8.42f, 17.5f, 8.79f, 17.93f, 8.87f)
                lineTo(20.48f, 9.29f)
                curveTo(22.11f, 9.56f, 22.49f, 10.74f, 21.32f, 11.92f)
                lineTo(19.33f, 13.91f)
                curveTo(19f, 14.24f, 18.81f, 14.89f, 18.92f, 15.36f)
                lineTo(19.49f, 17.82f)
                curveTo(19.94f, 19.76f, 18.9f, 20.52f, 17.19f, 19.5f)
                lineTo(14.8f, 18.08f)
                curveTo(14.37f, 17.82f, 13.65f, 17.82f, 13.22f, 18.08f)
                lineTo(10.83f, 19.5f)
                curveTo(9.12f, 20.51f, 8.08f, 19.76f, 8.53f, 17.82f)
                lineTo(9.1f, 15.36f)
                curveTo(9.21f, 14.9f, 9.02f, 14.25f, 8.69f, 13.91f)
                lineTo(6.7f, 11.92f)
                curveTo(5.53f, 10.75f, 5.91f, 9.57f, 7.54f, 9.29f)
                lineTo(10.09f, 8.87f)
                curveTo(10.52f, 8.8f, 11.03f, 8.42f, 11.22f, 8.03f)
                lineTo(12.63f, 5.21f)
                curveTo(13.38f, 3.68f, 14.62f, 3.68f, 15.39f, 5.21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 5f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 19f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                horizontalLineTo(2f)
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null
