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

val VuesaxIconsTwotone.RepeateMusic: ImageVector
    get() {
        if (_RepeateMusic != null) {
            return _RepeateMusic!!
        }
        _RepeateMusic = ImageVector.Builder(
            name = "RepeateMusic",
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
                moveTo(14f, 3f)
                lineTo(16.44f, 5.34f)
                lineTo(8.49f, 5.32f)
                curveTo(4.92f, 5.32f, 1.99f, 8.25f, 1.99f, 11.84f)
                curveTo(1.99f, 13.63f, 2.72f, 15.26f, 3.9f, 16.44f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 21f)
                lineTo(7.561f, 18.66f)
                lineTo(15.51f, 18.68f)
                curveTo(19.08f, 18.68f, 22.01f, 15.75f, 22.01f, 12.16f)
                curveTo(22.01f, 10.37f, 21.281f, 8.74f, 20.101f, 7.56f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                horizontalLineTo(15f)
            }
        }.build()

        return _RepeateMusic!!
    }

@Suppress("ObjectPropertyName")
private var _RepeateMusic: ImageVector? = null
