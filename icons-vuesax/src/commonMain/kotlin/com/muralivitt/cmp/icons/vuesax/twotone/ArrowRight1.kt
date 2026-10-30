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

val VuesaxIconsTwotone.ArrowRight1: ImageVector
    get() {
        if (_ArrowRight1 != null) {
            return _ArrowRight1!!
        }
        _ArrowRight1 = ImageVector.Builder(
            name = "ArrowRight1",
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
                moveTo(8.91f, 19.92f)
                lineTo(15.43f, 13.4f)
                curveTo(16.2f, 12.63f, 16.2f, 11.37f, 15.43f, 10.6f)
                lineTo(8.91f, 4.08f)
            }
        }.build()

        return _ArrowRight1!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight1: ImageVector? = null
