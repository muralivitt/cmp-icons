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

val VuesaxIconsTwotone.Convert: ImageVector
    get() {
        if (_Convert != null) {
            return _Convert!!
        }
        _Convert = ImageVector.Builder(
            name = "Convert",
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
                moveTo(12.005f, 21.984f)
                curveTo(17.516f, 21.984f, 21.984f, 17.517f, 21.984f, 12.005f)
                curveTo(21.984f, 6.494f, 17.516f, 2.026f, 12.005f, 2.026f)
                curveTo(6.493f, 2.026f, 2.025f, 6.494f, 2.025f, 12.005f)
                curveTo(2.025f, 17.517f, 6.493f, 21.984f, 12.005f, 21.984f)
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
                moveTo(6.137f, 4.021f)
                lineTo(14.3f, 12.204f)
                lineTo(14.32f, 7.664f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.863f, 19.979f)
                lineTo(9.7f, 11.806f)
                lineTo(9.68f, 16.336f)
            }
        }.build()

        return _Convert!!
    }

@Suppress("ObjectPropertyName")
private var _Convert: ImageVector? = null
