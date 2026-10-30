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

val VuesaxIconsTwotone.ArrowLeft1: ImageVector
    get() {
        if (_ArrowLeft1 != null) {
            return _ArrowLeft1!!
        }
        _ArrowLeft1 = ImageVector.Builder(
            name = "ArrowLeft1",
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
                moveTo(15f, 19.92f)
                lineTo(8.48f, 13.4f)
                curveTo(7.71f, 12.63f, 7.71f, 11.37f, 8.48f, 10.6f)
                lineTo(15f, 4.08f)
            }
        }.build()

        return _ArrowLeft1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft1: ImageVector? = null
