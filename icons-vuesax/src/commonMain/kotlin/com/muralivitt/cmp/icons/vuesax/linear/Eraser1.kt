package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Eraser1: ImageVector
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
                moveTo(2.91f, 17.58f)
                lineTo(6.42f, 21.09f)
                curveTo(7.59f, 22.26f, 9.5f, 22.26f, 10.66f, 21.09f)
                lineTo(21.09f, 10.66f)
                curveTo(22.26f, 9.49f, 22.26f, 7.58f, 21.09f, 6.42f)
                lineTo(17.58f, 2.91f)
                curveTo(16.41f, 1.74f, 14.5f, 1.74f, 13.34f, 2.91f)
                lineTo(2.91f, 13.34f)
                curveTo(1.74f, 14.5f, 1.74f, 16.41f, 2.91f, 17.58f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.12f, 9.13f)
                lineTo(14.87f, 16.88f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.52f, 17.66f)
                lineTo(9.17f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
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
