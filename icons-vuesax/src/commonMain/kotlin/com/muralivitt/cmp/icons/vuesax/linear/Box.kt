package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Box: ImageVector
    get() {
        if (_Box != null) {
            return _Box!!
        }
        _Box = ImageVector.Builder(
            name = "Box",
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
                moveTo(3.17f, 7.44f)
                lineTo(12f, 12.55f)
                lineTo(20.77f, 7.47f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21.61f)
                verticalLineTo(12.54f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.93f, 2.48f)
                lineTo(4.59f, 5.45f)
                curveTo(3.38f, 6.12f, 2.39f, 7.8f, 2.39f, 9.18f)
                verticalLineTo(14.83f)
                curveTo(2.39f, 16.21f, 3.38f, 17.89f, 4.59f, 18.56f)
                lineTo(9.93f, 21.53f)
                curveTo(11.07f, 22.16f, 12.94f, 22.16f, 14.08f, 21.53f)
                lineTo(19.42f, 18.56f)
                curveTo(20.63f, 17.89f, 21.62f, 16.21f, 21.62f, 14.83f)
                verticalLineTo(9.18f)
                curveTo(21.62f, 7.8f, 20.63f, 6.12f, 19.42f, 5.45f)
                lineTo(14.08f, 2.48f)
                curveTo(12.93f, 1.84f, 11.07f, 1.84f, 9.93f, 2.48f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 13.24f)
                verticalLineTo(9.58f)
                lineTo(7.51f, 4.1f)
            }
        }.build()

        return _Box!!
    }

@Suppress("ObjectPropertyName")
private var _Box: ImageVector? = null
