package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.SliderHorizontal1: ImageVector
    get() {
        if (_SliderHorizontal1 != null) {
            return _SliderHorizontal1!!
        }
        _SliderHorizontal1 = ImageVector.Builder(
            name = "SliderHorizontal1",
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
                moveTo(5f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(5f, 6.88f, 5.02f, 6.33f, 5.09f, 5.84f)
                curveTo(5.38f, 3.21f, 6.62f, 2.5f, 10f, 2.5f)
                horizontalLineTo(14f)
                curveTo(17.38f, 2.5f, 18.62f, 3.21f, 18.91f, 5.84f)
                curveTo(18.98f, 6.33f, 19f, 6.88f, 19f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19f, 17.12f, 18.98f, 17.67f, 18.91f, 18.16f)
                curveTo(18.62f, 20.79f, 17.38f, 21.5f, 14f, 21.5f)
                horizontalLineTo(10f)
                curveTo(6.62f, 21.5f, 5.38f, 20.79f, 5.09f, 18.16f)
                curveTo(5.02f, 17.67f, 5f, 17.12f, 5f, 16.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 19.5f)
                verticalLineTo(4.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 19f)
                verticalLineTo(4f)
            }
        }.build()

        return _SliderHorizontal1!!
    }

@Suppress("ObjectPropertyName")
private var _SliderHorizontal1: ImageVector? = null
