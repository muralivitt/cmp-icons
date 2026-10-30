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

val VuesaxIconsTwotone.Send1: ImageVector
    get() {
        if (_Send1 != null) {
            return _Send1!!
        }
        _Send1 = ImageVector.Builder(
            name = "Send1",
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
                moveTo(9.509f, 4.23f)
                lineTo(18.069f, 8.51f)
                curveTo(21.909f, 10.43f, 21.909f, 13.57f, 18.069f, 15.49f)
                lineTo(9.509f, 19.77f)
                curveTo(3.749f, 22.65f, 1.399f, 20.29f, 4.279f, 14.54f)
                lineTo(5.149f, 12.81f)
                curveTo(5.369f, 12.37f, 5.369f, 11.64f, 5.149f, 11.2f)
                lineTo(4.279f, 9.46f)
                curveTo(1.399f, 3.71f, 3.759f, 1.35f, 9.509f, 4.23f)
                close()
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.439f, 12f)
                horizontalLineTo(10.84f)
            }
        }.build()

        return _Send1!!
    }

@Suppress("ObjectPropertyName")
private var _Send1: ImageVector? = null
