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

val VuesaxIconsTwotone.Lamp1: ImageVector
    get() {
        if (_Lamp1 != null) {
            return _Lamp1!!
        }
        _Lamp1 = ImageVector.Builder(
            name = "Lamp1",
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
                moveTo(20.781f, 13.65f)
                verticalLineTo(18.59f)
                horizontalLineTo(3.221f)
                verticalLineTo(13.65f)
                curveTo(3.221f, 8.83f, 7.121f, 4.93f, 11.941f, 4.93f)
                horizontalLineTo(12.061f)
                curveTo(16.881f, 4.93f, 20.781f, 8.83f, 20.781f, 13.65f)
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
                moveTo(12f, 2f)
                verticalLineTo(4.93f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.65f, 18.59f)
                curveTo(15.52f, 20.5f, 13.93f, 22f, 12f, 22f)
                curveTo(10.07f, 22f, 8.48f, 20.5f, 8.35f, 18.59f)
                horizontalLineTo(15.65f)
                close()
            }
        }.build()

        return _Lamp1!!
    }

@Suppress("ObjectPropertyName")
private var _Lamp1: ImageVector? = null
