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

val VuesaxIconsTwotone.Keyboard: ImageVector
    get() {
        if (_Keyboard != null) {
            return _Keyboard!!
        }
        _Keyboard = ImageVector.Builder(
            name = "Keyboard",
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
                moveTo(7.5f, 4f)
                horizontalLineTo(16.5f)
                curveTo(17.12f, 4f, 17.67f, 4.02f, 18.16f, 4.09f)
                curveTo(20.79f, 4.38f, 21.5f, 5.62f, 21.5f, 9f)
                verticalLineTo(15f)
                curveTo(21.5f, 18.38f, 20.79f, 19.62f, 18.16f, 19.91f)
                curveTo(17.67f, 19.98f, 17.12f, 20f, 16.5f, 20f)
                horizontalLineTo(7.5f)
                curveTo(6.88f, 20f, 6.33f, 19.98f, 5.84f, 19.91f)
                curveTo(3.21f, 19.62f, 2.5f, 18.38f, 2.5f, 15f)
                verticalLineTo(9f)
                curveTo(2.5f, 5.62f, 3.21f, 4.38f, 5.84f, 4.09f)
                curveTo(6.33f, 4.02f, 6.88f, 4f, 7.5f, 4f)
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
                moveTo(13.5f, 10f)
                horizontalLineTo(17f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 15.5f)
                horizontalLineTo(7.02f)
                horizontalLineTo(17f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.094f, 10f)
                horizontalLineTo(10.103f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.094f, 10f)
                horizontalLineTo(7.103f)
            }
        }.build()

        return _Keyboard!!
    }

@Suppress("ObjectPropertyName")
private var _Keyboard: ImageVector? = null
