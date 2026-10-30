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

val VuesaxIconsTwotone.Home1: ImageVector
    get() {
        if (_Home1 != null) {
            return _Home1!!
        }
        _Home1 = ImageVector.Builder(
            name = "Home1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                verticalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.069f, 2.82f)
                lineTo(3.139f, 8.37f)
                curveTo(2.359f, 8.99f, 1.859f, 10.3f, 2.029f, 11.28f)
                lineTo(3.359f, 19.24f)
                curveTo(3.599f, 20.66f, 4.959f, 21.81f, 6.399f, 21.81f)
                horizontalLineTo(17.599f)
                curveTo(19.029f, 21.81f, 20.399f, 20.65f, 20.639f, 19.24f)
                lineTo(21.969f, 11.28f)
                curveTo(22.129f, 10.3f, 21.629f, 8.99f, 20.859f, 8.37f)
                lineTo(13.929f, 2.83f)
                curveTo(12.859f, 1.97f, 11.129f, 1.97f, 10.069f, 2.82f)
                close()
            }
        }.build()

        return _Home1!!
    }

@Suppress("ObjectPropertyName")
private var _Home1: ImageVector? = null
