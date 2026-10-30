package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Music: ImageVector
    get() {
        if (_Music != null) {
            return _Music!!
        }
        _Music = ImageVector.Builder(
            name = "Music",
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
                moveTo(6.28f, 22f)
                curveTo(8.003f, 22f, 9.4f, 20.603f, 9.4f, 18.88f)
                curveTo(9.4f, 17.157f, 8.003f, 15.76f, 6.28f, 15.76f)
                curveTo(4.557f, 15.76f, 3.16f, 17.157f, 3.16f, 18.88f)
                curveTo(3.16f, 20.603f, 4.557f, 22f, 6.28f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.84f, 16.8f)
                verticalLineTo(4.6f)
                curveTo(20.84f, 2f, 19.21f, 1.64f, 17.56f, 2.09f)
                lineTo(11.32f, 3.79f)
                curveTo(10.18f, 4.1f, 9.4f, 5f, 9.4f, 6.3f)
                verticalLineTo(8.47f)
                verticalLineTo(9.93f)
                verticalLineTo(18.87f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.72f, 19.92f)
                curveTo(19.443f, 19.92f, 20.84f, 18.523f, 20.84f, 16.8f)
                curveTo(20.84f, 15.077f, 19.443f, 13.68f, 17.72f, 13.68f)
                curveTo(15.997f, 13.68f, 14.6f, 15.077f, 14.6f, 16.8f)
                curveTo(14.6f, 18.523f, 15.997f, 19.92f, 17.72f, 19.92f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.4f, 9.52f)
                lineTo(20.84f, 6.4f)
            }
        }.build()

        return _Music!!
    }

@Suppress("ObjectPropertyName")
private var _Music: ImageVector? = null
