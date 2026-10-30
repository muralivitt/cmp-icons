package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.SliderVertical1: ImageVector
    get() {
        if (_SliderVertical1 != null) {
            return _SliderVertical1!!
        }
        _SliderVertical1 = ImageVector.Builder(
            name = "SliderVertical1",
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
                moveTo(7.5f, 5f)
                horizontalLineTo(16.5f)
                curveTo(17.12f, 5f, 17.67f, 5.02f, 18.16f, 5.09f)
                curveTo(20.79f, 5.38f, 21.5f, 6.62f, 21.5f, 10f)
                verticalLineTo(14f)
                curveTo(21.5f, 17.38f, 20.79f, 18.62f, 18.16f, 18.91f)
                curveTo(17.67f, 18.98f, 17.12f, 19f, 16.5f, 19f)
                horizontalLineTo(7.5f)
                curveTo(6.88f, 19f, 6.33f, 18.98f, 5.84f, 18.91f)
                curveTo(3.21f, 18.62f, 2.5f, 17.38f, 2.5f, 14f)
                verticalLineTo(10f)
                curveTo(2.5f, 6.62f, 3.21f, 5.38f, 5.84f, 5.09f)
                curveTo(6.33f, 5.02f, 6.88f, 5f, 7.5f, 5f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 2f)
                horizontalLineTo(19.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 22f)
                horizontalLineTo(20f)
            }
        }.build()

        return _SliderVertical1!!
    }

@Suppress("ObjectPropertyName")
private var _SliderVertical1: ImageVector? = null
