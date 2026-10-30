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

val VuesaxIconsTwotone.Triangle: ImageVector
    get() {
        if (_Triangle != null) {
            return _Triangle!!
        }
        _Triangle = ImageVector.Builder(
            name = "Triangle",
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
                moveTo(11.999f, 21.41f)
                horizontalLineTo(5.939f)
                curveTo(2.469f, 21.41f, 1.019f, 18.93f, 2.699f, 15.9f)
                lineTo(5.819f, 10.28f)
                lineTo(8.759f, 5f)
                curveTo(10.539f, 1.79f, 13.459f, 1.79f, 15.239f, 5f)
                lineTo(18.179f, 10.29f)
                lineTo(21.299f, 15.91f)
                curveTo(22.979f, 18.94f, 21.519f, 21.42f, 18.059f, 21.42f)
                horizontalLineTo(11.999f)
                verticalLineTo(21.41f)
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
                moveTo(21.441f, 20f)
                lineTo(12f, 13.39f)
                lineTo(2.561f, 20f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineTo(13.39f)
            }
        }.build()

        return _Triangle!!
    }

@Suppress("ObjectPropertyName")
private var _Triangle: ImageVector? = null
