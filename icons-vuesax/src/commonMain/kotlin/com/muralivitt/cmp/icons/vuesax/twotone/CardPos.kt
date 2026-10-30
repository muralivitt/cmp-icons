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

val VuesaxIconsTwotone.CardPos: ImageVector
    get() {
        if (_CardPos != null) {
            return _CardPos!!
        }
        _CardPos = ImageVector.Builder(
            name = "CardPos",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.93f, 15.879f)
                lineTo(15.88f, 3.929f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.102f, 18.279f)
                lineTo(12.302f, 17.079f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.793f, 15.589f)
                lineTo(16.183f, 13.199f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.601f, 10.239f)
                lineTo(10.241f, 3.599f)
                curveTo(12.361f, 1.479f, 13.421f, 1.469f, 15.521f, 3.569f)
                lineTo(20.431f, 8.479f)
                curveTo(22.531f, 10.579f, 22.521f, 11.639f, 20.401f, 13.759f)
                lineTo(13.761f, 20.399f)
                curveTo(11.641f, 22.519f, 10.581f, 22.529f, 8.481f, 20.429f)
                lineTo(3.571f, 15.519f)
                curveTo(1.471f, 13.419f, 1.471f, 12.369f, 3.601f, 10.239f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21.999f)
                horizontalLineTo(22f)
            }
        }.build()

        return _CardPos!!
    }

@Suppress("ObjectPropertyName")
private var _CardPos: ImageVector? = null
