package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Mask: ImageVector
    get() {
        if (_Mask != null) {
            return _Mask!!
        }
        _Mask = ImageVector.Builder(
            name = "Mask",
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
                moveTo(19.07f, 4.93f)
                lineTo(4.93f, 19.07f)
                curveTo(3.12f, 17.26f, 2f, 14.76f, 2f, 12f)
                curveTo(2f, 6.48f, 6.48f, 2f, 12f, 2f)
                curveTo(14.76f, 2f, 17.26f, 3.12f, 19.07f, 4.93f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                curveTo(22f, 17.52f, 17.52f, 22f, 12f, 22f)
                curveTo(9.24f, 22f, 6.74f, 20.88f, 4.93f, 19.07f)
                lineTo(19.07f, 4.93f)
                curveTo(20.88f, 6.74f, 22f, 9.24f, 22f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.76f, 16.24f)
                lineTo(13.41f, 21.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.29f, 12.71f)
                lineTo(17.87f, 19.28f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.83f, 9.17f)
                lineTo(21.12f, 15.47f)
            }
        }.build()

        return _Mask!!
    }

@Suppress("ObjectPropertyName")
private var _Mask: ImageVector? = null
