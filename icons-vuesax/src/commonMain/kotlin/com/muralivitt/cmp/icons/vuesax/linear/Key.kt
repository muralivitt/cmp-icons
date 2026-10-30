package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Key: ImageVector
    get() {
        if (_Key != null) {
            return _Key!!
        }
        _Key = ImageVector.Builder(
            name = "Key",
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
                moveTo(19.79f, 14.93f)
                curveTo(17.73f, 16.98f, 14.78f, 17.61f, 12.19f, 16.8f)
                lineTo(7.48f, 21.5f)
                curveTo(7.14f, 21.85f, 6.47f, 22.06f, 5.99f, 21.99f)
                lineTo(3.81f, 21.69f)
                curveTo(3.09f, 21.59f, 2.42f, 20.91f, 2.31f, 20.19f)
                lineTo(2.01f, 18.01f)
                curveTo(1.94f, 17.53f, 2.17f, 16.86f, 2.5f, 16.52f)
                lineTo(7.2f, 11.82f)
                curveTo(6.4f, 9.22f, 7.02f, 6.27f, 9.08f, 4.22f)
                curveTo(12.03f, 1.27f, 16.82f, 1.27f, 19.78f, 4.22f)
                curveTo(22.74f, 7.17f, 22.74f, 11.98f, 19.79f, 14.93f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.89f, 17.49f)
                lineTo(9.19f, 19.79f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 11f)
                curveTo(15.328f, 11f, 16f, 10.328f, 16f, 9.5f)
                curveTo(16f, 8.672f, 15.328f, 8f, 14.5f, 8f)
                curveTo(13.672f, 8f, 13f, 8.672f, 13f, 9.5f)
                curveTo(13f, 10.328f, 13.672f, 11f, 14.5f, 11f)
                close()
            }
        }.build()

        return _Key!!
    }

@Suppress("ObjectPropertyName")
private var _Key: ImageVector? = null
