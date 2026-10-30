package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Convert: ImageVector
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
                curveTo(17.517f, 21.984f, 21.984f, 17.517f, 21.984f, 12.005f)
                curveTo(21.984f, 6.494f, 17.517f, 2.026f, 12.005f, 2.026f)
                curveTo(6.494f, 2.026f, 2.026f, 6.494f, 2.026f, 12.005f)
                curveTo(2.026f, 17.517f, 6.494f, 21.984f, 12.005f, 21.984f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.137f, 4.022f)
                lineTo(14.3f, 12.205f)
                lineTo(14.32f, 7.664f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.863f, 19.978f)
                lineTo(9.7f, 11.805f)
                lineTo(9.68f, 16.336f)
            }
        }.build()

        return _Convert!!
    }

@Suppress("ObjectPropertyName")
private var _Convert: ImageVector? = null
