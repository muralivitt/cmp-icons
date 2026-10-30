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

val VuesaxIconsTwotone.CardRemove: ImageVector
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
                moveTo(1.9f, 10.03f)
                horizontalLineTo(21.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.46f, 20.53f)
                horizontalLineTo(6.35f)
                curveTo(2.8f, 20.53f, 1.9f, 19.65f, 1.9f, 16.14f)
                verticalLineTo(7.92f)
                curveTo(1.9f, 4.74f, 2.64f, 3.72f, 5.43f, 3.56f)
                curveTo(5.71f, 3.55f, 6.02f, 3.54f, 6.35f, 3.54f)
                horizontalLineTo(17.46f)
                curveTo(21.01f, 3.54f, 21.91f, 4.42f, 21.91f, 7.93f)
                verticalLineTo(12.34f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.9f, 22.03f)
                curveTo(20.11f, 22.03f, 21.9f, 20.239f, 21.9f, 18.03f)
                curveTo(21.9f, 15.821f, 20.11f, 14.03f, 17.9f, 14.03f)
                curveTo(15.691f, 14.03f, 13.9f, 15.821f, 13.9f, 18.03f)
                curveTo(13.9f, 20.239f, 15.691f, 22.03f, 17.9f, 22.03f)
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
                moveTo(18.969f, 19.15f)
                lineTo(16.859f, 17.03f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.95f, 17.06f)
                lineTo(16.83f, 19.17f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.9f, 16.03f)
                horizontalLineTo(9.9f)
            }
        }.build()

        return _CardRemove!!
    }

@Suppress("ObjectPropertyName")
private var _CardRemove: ImageVector? = null
