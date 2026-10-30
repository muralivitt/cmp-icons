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

val VuesaxIconsTwotone.BoxTime: ImageVector
    get() {
        if (_BoxTime != null) {
            return _BoxTime!!
        }
        _BoxTime = ImageVector.Builder(
            name = "BoxTime",
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
                moveTo(21.611f, 9.17f)
                verticalLineTo(14.83f)
                curveTo(21.611f, 14.88f, 21.611f, 14.92f, 21.601f, 14.97f)
                curveTo(20.901f, 14.36f, 20.001f, 14f, 19.001f, 14f)
                curveTo(18.061f, 14f, 17.191f, 14.33f, 16.501f, 14.88f)
                curveTo(15.581f, 15.61f, 15.001f, 16.74f, 15.001f, 18f)
                curveTo(15.001f, 18.75f, 15.211f, 19.46f, 15.581f, 20.06f)
                curveTo(15.671f, 20.22f, 15.781f, 20.37f, 15.901f, 20.51f)
                lineTo(14.071f, 21.52f)
                curveTo(12.931f, 22.16f, 11.071f, 22.16f, 9.931f, 21.52f)
                lineTo(4.591f, 18.56f)
                curveTo(3.381f, 17.89f, 2.391f, 16.21f, 2.391f, 14.83f)
                verticalLineTo(9.17f)
                curveTo(2.391f, 7.79f, 3.381f, 6.11f, 4.591f, 5.44f)
                lineTo(9.931f, 2.48f)
                curveTo(11.071f, 1.84f, 12.931f, 1.84f, 14.071f, 2.48f)
                lineTo(19.411f, 5.44f)
                curveTo(20.621f, 6.11f, 21.611f, 7.79f, 21.611f, 9.17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23f, 18f)
                curveTo(23f, 19.2f, 22.47f, 20.27f, 21.64f, 21f)
                curveTo(20.93f, 21.62f, 20.01f, 22f, 19f, 22f)
                curveTo(16.79f, 22f, 15f, 20.21f, 15f, 18f)
                curveTo(15f, 16.74f, 15.58f, 15.61f, 16.5f, 14.88f)
                curveTo(17.19f, 14.33f, 18.06f, 14f, 19f, 14f)
                curveTo(21.21f, 14f, 23f, 15.79f, 23f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.25f, 16.75f)
                verticalLineTo(18.25f)
                lineTo(18f, 19f)
            }
        }.build()

        return _BoxTime!!
    }

@Suppress("ObjectPropertyName")
private var _BoxTime: ImageVector? = null
