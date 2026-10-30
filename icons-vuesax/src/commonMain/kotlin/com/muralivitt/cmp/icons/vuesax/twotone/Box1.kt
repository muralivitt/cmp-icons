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

val VuesaxIconsTwotone.Box1: ImageVector
    get() {
        if (_Box1 != null) {
            return _Box1!!
        }
        _Box1 = ImageVector.Builder(
            name = "Box1",
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.931f, 2.48f)
                lineTo(4.591f, 5.44f)
                curveTo(3.381f, 6.11f, 2.391f, 7.79f, 2.391f, 9.17f)
                verticalLineTo(14.82f)
                curveTo(2.391f, 16.2f, 3.381f, 17.88f, 4.591f, 18.55f)
                lineTo(9.931f, 21.52f)
                curveTo(11.071f, 22.15f, 12.941f, 22.15f, 14.081f, 21.52f)
                lineTo(19.421f, 18.55f)
                curveTo(20.631f, 17.88f, 21.621f, 16.2f, 21.621f, 14.82f)
                verticalLineTo(9.17f)
                curveTo(21.621f, 7.79f, 20.631f, 6.11f, 19.421f, 5.44f)
                lineTo(14.081f, 2.47f)
                curveTo(12.931f, 1.84f, 11.071f, 1.84f, 9.931f, 2.48f)
                close()
            }
        }.build()

        return _Box1!!
    }

@Suppress("ObjectPropertyName")
private var _Box1: ImageVector? = null
