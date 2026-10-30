package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BagCross: ImageVector
    get() {
        if (_BagCross != null) {
            return _BagCross!!
        }
        _BagCross = ImageVector.Builder(
            name = "BagCross",
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
                moveTo(13.39f, 17.36f)
                lineTo(10.64f, 14.61f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.36f, 14.64f)
                lineTo(10.61f, 17.39f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.81f, 2f)
                lineTo(5.19f, 5.63f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.19f, 2f)
                lineTo(18.81f, 5.63f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(2f, 7.85f)
                curveTo(2f, 6f, 2.99f, 5.85f, 4.22f, 5.85f)
                horizontalLineTo(19.78f)
                curveTo(21.01f, 5.85f, 22f, 6f, 22f, 7.85f)
                curveTo(22f, 10f, 21.01f, 9.85f, 19.78f, 9.85f)
                horizontalLineTo(4.22f)
                curveTo(2.99f, 9.85f, 2f, 10f, 2f, 7.85f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(3.5f, 10f)
                lineTo(4.91f, 18.64f)
                curveTo(5.23f, 20.58f, 6f, 22f, 8.86f, 22f)
                horizontalLineTo(14.89f)
                curveTo(18f, 22f, 18.46f, 20.64f, 18.82f, 18.76f)
                lineTo(20.5f, 10f)
            }
        }.build()

        return _BagCross!!
    }

@Suppress("ObjectPropertyName")
private var _BagCross: ImageVector? = null
