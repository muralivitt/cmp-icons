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

val VuesaxIconsTwotone.Eraser1: ImageVector
    get() {
        if (_Eraser1 != null) {
            return _Eraser1!!
        }
        _Eraser1 = ImageVector.Builder(
            name = "Eraser1",
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
                moveTo(9f, 22f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.911f, 17.58f)
                lineTo(6.421f, 21.09f)
                curveTo(7.591f, 22.26f, 9.501f, 22.26f, 10.661f, 21.09f)
                lineTo(21.091f, 10.66f)
                curveTo(22.261f, 9.49f, 22.261f, 7.58f, 21.091f, 6.42f)
                lineTo(17.581f, 2.91f)
                curveTo(16.411f, 1.74f, 14.501f, 1.74f, 13.341f, 2.91f)
                lineTo(2.911f, 13.34f)
                curveTo(1.741f, 14.5f, 1.741f, 16.41f, 2.911f, 17.58f)
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
                moveTo(7.119f, 9.13f)
                lineTo(14.869f, 16.88f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.52f, 17.66f)
                lineTo(9.169f, 12f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.34f, 20.49f)
                lineTo(12f, 14.83f)
            }
        }.build()

        return _Eraser1!!
    }

@Suppress("ObjectPropertyName")
private var _Eraser1: ImageVector? = null
