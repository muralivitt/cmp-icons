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

val VuesaxIconsTwotone.SliderVertical: ImageVector
    get() {
        if (_SliderVertical != null) {
            return _SliderVertical!!
        }
        _SliderVertical = ImageVector.Builder(
            name = "SliderVertical",
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
                moveTo(7f, 6f)
                horizontalLineTo(17f)
                curveTo(17.62f, 6f, 18.17f, 6.02f, 18.66f, 6.09f)
                curveTo(21.29f, 6.38f, 22f, 7.62f, 22f, 11f)
                verticalLineTo(13f)
                curveTo(22f, 16.38f, 21.29f, 17.62f, 18.66f, 17.91f)
                curveTo(18.17f, 17.98f, 17.62f, 18f, 17f, 18f)
                horizontalLineTo(7f)
                curveTo(6.38f, 18f, 5.83f, 17.98f, 5.34f, 17.91f)
                curveTo(2.71f, 17.62f, 2f, 16.38f, 2f, 13f)
                verticalLineTo(11f)
                curveTo(2f, 7.62f, 2.71f, 6.38f, 5.34f, 6.09f)
                curveTo(5.83f, 6.02f, 6.38f, 6f, 7f, 6f)
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
                moveTo(17f, 18f)
                curveTo(17.62f, 18f, 18.17f, 17.98f, 18.66f, 17.91f)
                curveTo(18.67f, 18.05f, 18.67f, 18.18f, 18.67f, 18.33f)
                verticalLineTo(18.67f)
                curveTo(18.67f, 21.33f, 18f, 22f, 15.33f, 22f)
                horizontalLineTo(8.67f)
                curveTo(6f, 22f, 5.33f, 21.33f, 5.33f, 18.67f)
                verticalLineTo(18.33f)
                curveTo(5.33f, 18.18f, 5.33f, 18.05f, 5.34f, 17.91f)
                curveTo(5.83f, 17.98f, 6.38f, 18f, 7f, 18f)
                horizontalLineTo(17f)
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
                moveTo(8.67f, 2f)
                horizontalLineTo(15.33f)
                curveTo(18f, 2f, 18.67f, 2.67f, 18.67f, 5.33f)
                verticalLineTo(5.67f)
                curveTo(18.67f, 5.82f, 18.67f, 5.95f, 18.66f, 6.09f)
                curveTo(18.17f, 6.02f, 17.62f, 6f, 17f, 6f)
                horizontalLineTo(7f)
                curveTo(6.38f, 6f, 5.83f, 6.02f, 5.34f, 6.09f)
                curveTo(5.33f, 5.95f, 5.33f, 5.82f, 5.33f, 5.67f)
                verticalLineTo(5.33f)
                curveTo(5.33f, 2.67f, 6f, 2f, 8.67f, 2f)
                close()
            }
        }.build()

        return _SliderVertical!!
    }

@Suppress("ObjectPropertyName")
private var _SliderVertical: ImageVector? = null
