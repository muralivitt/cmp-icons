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

val VuesaxIconsTwotone.Gameboy: ImageVector
    get() {
        if (_Gameboy != null) {
            return _Gameboy!!
        }
        _Gameboy = ImageVector.Builder(
            name = "Gameboy",
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
                moveTo(21f, 7f)
                verticalLineTo(17f)
                curveTo(21f, 20f, 19.5f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(4.5f, 22f, 3f, 20f, 3f, 17f)
                verticalLineTo(7f)
                curveTo(3f, 4f, 4.5f, 2f, 8f, 2f)
                horizontalLineTo(16f)
                curveTo(19.5f, 2f, 21f, 4f, 21f, 7f)
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
                moveTo(16.25f, 11f)
                horizontalLineTo(7.75f)
                curveTo(6.79f, 11f, 6f, 10.21f, 6f, 9.25f)
                verticalLineTo(6.75f)
                curveTo(6f, 5.79f, 6.79f, 5f, 7.75f, 5f)
                horizontalLineTo(16.25f)
                curveTo(17.21f, 5f, 18f, 5.79f, 18f, 6.75f)
                verticalLineTo(9.25f)
                curveTo(18f, 10.21f, 17.21f, 11f, 16.25f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.3f, 15.28f)
                lineTo(8f, 17.58f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.03f, 15.31f)
                lineTo(10.33f, 17.61f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.49f, 15.33f)
                horizontalLineTo(16.51f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.49f, 17.5f)
                verticalLineTo(17.48f)
            }
        }.build()

        return _Gameboy!!
    }

@Suppress("ObjectPropertyName")
private var _Gameboy: ImageVector? = null
