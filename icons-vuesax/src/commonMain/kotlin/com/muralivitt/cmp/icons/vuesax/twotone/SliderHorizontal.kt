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

val VuesaxIconsTwotone.SliderHorizontal: ImageVector
    get() {
        if (_SliderHorizontal != null) {
            return _SliderHorizontal!!
        }
        _SliderHorizontal = ImageVector.Builder(
            name = "SliderHorizontal",
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
                moveTo(18f, 7f)
                verticalLineTo(17f)
                curveTo(18f, 17.62f, 17.98f, 18.17f, 17.91f, 18.66f)
                curveTo(17.62f, 21.29f, 16.38f, 22f, 13f, 22f)
                horizontalLineTo(11f)
                curveTo(7.62f, 22f, 6.38f, 21.29f, 6.09f, 18.66f)
                curveTo(6.02f, 18.17f, 6f, 17.62f, 6f, 17f)
                verticalLineTo(7f)
                curveTo(6f, 6.38f, 6.02f, 5.83f, 6.09f, 5.34f)
                curveTo(6.38f, 2.71f, 7.62f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(16.38f, 2f, 17.62f, 2.71f, 17.91f, 5.34f)
                curveTo(17.98f, 5.83f, 18f, 6.38f, 18f, 7f)
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
                moveTo(6f, 17f)
                curveTo(6f, 17.62f, 6.02f, 18.17f, 6.09f, 18.66f)
                curveTo(5.95f, 18.67f, 5.82f, 18.67f, 5.67f, 18.67f)
                horizontalLineTo(5.33f)
                curveTo(2.67f, 18.67f, 2f, 18f, 2f, 15.33f)
                verticalLineTo(8.67f)
                curveTo(2f, 6f, 2.67f, 5.33f, 5.33f, 5.33f)
                horizontalLineTo(5.67f)
                curveTo(5.82f, 5.33f, 5.95f, 5.33f, 6.09f, 5.34f)
                curveTo(6.02f, 5.83f, 6f, 6.38f, 6f, 7f)
                verticalLineTo(17f)
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
                moveTo(22f, 8.67f)
                verticalLineTo(15.33f)
                curveTo(22f, 18f, 21.33f, 18.67f, 18.67f, 18.67f)
                horizontalLineTo(18.33f)
                curveTo(18.18f, 18.67f, 18.05f, 18.67f, 17.91f, 18.66f)
                curveTo(17.98f, 18.17f, 18f, 17.62f, 18f, 17f)
                verticalLineTo(7f)
                curveTo(18f, 6.38f, 17.98f, 5.83f, 17.91f, 5.34f)
                curveTo(18.05f, 5.33f, 18.18f, 5.33f, 18.33f, 5.33f)
                horizontalLineTo(18.67f)
                curveTo(21.33f, 5.33f, 22f, 6f, 22f, 8.67f)
                close()
            }
        }.build()

        return _SliderHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _SliderHorizontal: ImageVector? = null
