package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CardRemove: ImageVector
    get() {
        if (_CardRemove != null) {
            return _CardRemove!!
        }
        _CardRemove = ImageVector.Builder(
            name = "CardRemove",
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
                moveTo(1.898f, 10.03f)
                horizontalLineTo(21.898f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.458f, 20.53f)
                horizontalLineTo(6.348f)
                curveTo(2.798f, 20.53f, 1.898f, 19.65f, 1.898f, 16.14f)
                verticalLineTo(7.92f)
                curveTo(1.898f, 4.74f, 2.638f, 3.72f, 5.428f, 3.56f)
                curveTo(5.708f, 3.55f, 6.018f, 3.54f, 6.348f, 3.54f)
                horizontalLineTo(17.458f)
                curveTo(21.008f, 3.54f, 21.908f, 4.42f, 21.908f, 7.93f)
                verticalLineTo(12.34f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.898f, 22.03f)
                curveTo(20.108f, 22.03f, 21.898f, 20.239f, 21.898f, 18.03f)
                curveTo(21.898f, 15.821f, 20.108f, 14.03f, 17.898f, 14.03f)
                curveTo(15.689f, 14.03f, 13.898f, 15.821f, 13.898f, 18.03f)
                curveTo(13.898f, 20.239f, 15.689f, 22.03f, 17.898f, 22.03f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.969f, 19.15f)
                lineTo(16.859f, 17.03f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.948f, 17.06f)
                lineTo(16.828f, 19.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.898f, 16.03f)
                horizontalLineTo(9.898f)
            }
        }.build()

        return _CardRemove!!
    }

@Suppress("ObjectPropertyName")
private var _CardRemove: ImageVector? = null
