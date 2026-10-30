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

val VuesaxIconsTwotone.Box: ImageVector
    get() {
        if (_Box != null) {
            return _Box!!
        }
        _Box = ImageVector.Builder(
            name = "Box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.17f, 7.44f)
                lineTo(12f, 12.55f)
                lineTo(20.77f, 7.47f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21.61f)
                verticalLineTo(12.54f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.931f, 2.48f)
                lineTo(4.591f, 5.45f)
                curveTo(3.381f, 6.12f, 2.391f, 7.8f, 2.391f, 9.18f)
                verticalLineTo(14.83f)
                curveTo(2.391f, 16.21f, 3.381f, 17.89f, 4.591f, 18.56f)
                lineTo(9.931f, 21.53f)
                curveTo(11.071f, 22.16f, 12.941f, 22.16f, 14.081f, 21.53f)
                lineTo(19.421f, 18.56f)
                curveTo(20.631f, 17.89f, 21.621f, 16.21f, 21.621f, 14.83f)
                verticalLineTo(9.18f)
                curveTo(21.621f, 7.8f, 20.631f, 6.12f, 19.421f, 5.45f)
                lineTo(14.081f, 2.48f)
                curveTo(12.931f, 1.84f, 11.071f, 1.84f, 9.931f, 2.48f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 13.24f)
                verticalLineTo(9.58f)
                lineTo(7.51f, 4.1f)
            }
        }.build()

        return _Box!!
    }

@Suppress("ObjectPropertyName")
private var _Box: ImageVector? = null
