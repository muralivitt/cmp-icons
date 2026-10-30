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

val VuesaxIconsTwotone.Magicpen: ImageVector
    get() {
        if (_Magicpen != null) {
            return _Magicpen!!
        }
        _Magicpen = ImageVector.Builder(
            name = "Magicpen",
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
                moveTo(3.499f, 20.5f)
                curveTo(4.329f, 21.33f, 5.669f, 21.33f, 6.499f, 20.5f)
                lineTo(19.5f, 7.5f)
                curveTo(20.33f, 6.67f, 20.33f, 5.33f, 19.5f, 4.5f)
                curveTo(18.67f, 3.67f, 17.33f, 3.67f, 16.5f, 4.5f)
                lineTo(3.499f, 17.5f)
                curveTo(2.669f, 18.33f, 2.669f, 19.67f, 3.499f, 20.5f)
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
                moveTo(18.01f, 8.99f)
                lineTo(15.01f, 5.99f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 2.44f)
                lineTo(10f, 2f)
                lineTo(9.56f, 3.5f)
                lineTo(10f, 5f)
                lineTo(8.5f, 4.56f)
                lineTo(7f, 5f)
                lineTo(7.44f, 3.5f)
                lineTo(7f, 2f)
                lineTo(8.5f, 2.44f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 8.44f)
                lineTo(6f, 8f)
                lineTo(5.56f, 9.5f)
                lineTo(6f, 11f)
                lineTo(4.5f, 10.56f)
                lineTo(3f, 11f)
                lineTo(3.44f, 9.5f)
                lineTo(3f, 8f)
                lineTo(4.5f, 8.44f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 13.44f)
                lineTo(21f, 13f)
                lineTo(20.56f, 14.5f)
                lineTo(21f, 16f)
                lineTo(19.5f, 15.56f)
                lineTo(18f, 16f)
                lineTo(18.44f, 14.5f)
                lineTo(18f, 13f)
                lineTo(19.5f, 13.44f)
                close()
            }
        }.build()

        return _Magicpen!!
    }

@Suppress("ObjectPropertyName")
private var _Magicpen: ImageVector? = null
