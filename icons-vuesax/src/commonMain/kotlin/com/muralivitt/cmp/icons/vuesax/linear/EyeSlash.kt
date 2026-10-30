package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.EyeSlash: ImageVector
    get() {
        if (_EyeSlash != null) {
            return _EyeSlash!!
        }
        _EyeSlash = ImageVector.Builder(
            name = "EyeSlash",
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
                moveTo(14.53f, 9.47f)
                lineTo(9.47f, 14.53f)
                curveTo(8.82f, 13.88f, 8.42f, 12.99f, 8.42f, 12f)
                curveTo(8.42f, 10.02f, 10.02f, 8.42f, 12f, 8.42f)
                curveTo(12.99f, 8.42f, 13.88f, 8.82f, 14.53f, 9.47f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.82f, 5.77f)
                curveTo(16.07f, 4.45f, 14.07f, 3.73f, 12f, 3.73f)
                curveTo(8.47f, 3.73f, 5.18f, 5.81f, 2.89f, 9.41f)
                curveTo(1.99f, 10.82f, 1.99f, 13.19f, 2.89f, 14.6f)
                curveTo(3.68f, 15.84f, 4.6f, 16.91f, 5.6f, 17.77f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.42f, 19.53f)
                curveTo(9.56f, 20.01f, 10.77f, 20.27f, 12f, 20.27f)
                curveTo(15.53f, 20.27f, 18.82f, 18.19f, 21.11f, 14.59f)
                curveTo(22.01f, 13.18f, 22.01f, 10.81f, 21.11f, 9.4f)
                curveTo(20.78f, 8.88f, 20.42f, 8.39f, 20.05f, 7.93f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.51f, 12.7f)
                curveTo(15.25f, 14.11f, 14.1f, 15.26f, 12.69f, 15.52f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.47f, 14.53f)
                lineTo(2f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(14.53f, 9.47f)
            }
        }.build()

        return _EyeSlash!!
    }

@Suppress("ObjectPropertyName")
private var _EyeSlash: ImageVector? = null
