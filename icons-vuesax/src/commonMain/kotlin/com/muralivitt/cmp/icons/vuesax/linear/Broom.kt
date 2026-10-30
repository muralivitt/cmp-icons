package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Broom: ImageVector
    get() {
        if (_Broom != null) {
            return _Broom!!
        }
        _Broom = ImageVector.Builder(
            name = "Broom",
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
                moveTo(9.87f, 5.67f)
                lineTo(6.45f, 7.75f)
                lineTo(4.89f, 5.19f)
                curveTo(4.32f, 4.25f, 4.62f, 3.01f, 5.56f, 2.44f)
                curveTo(6.5f, 1.87f, 7.74f, 2.17f, 8.31f, 3.11f)
                lineTo(9.87f, 5.67f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.82f, 9.16f)
                lineTo(8.66f, 11.08f)
                curveTo(6.82f, 12.2f, 6.26f, 14.46f, 7.15f, 16.26f)
                lineTo(9.2f, 20.44f)
                curveTo(9.86f, 21.79f, 11.46f, 22.26f, 12.74f, 21.47f)
                lineTo(19.17f, 17.56f)
                curveTo(20.46f, 16.78f, 20.77f, 15.15f, 19.88f, 13.94f)
                lineTo(17.11f, 10.2f)
                curveTo(15.91f, 8.58f, 13.66f, 8.04f, 11.82f, 9.16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.757f, 5.098f)
                lineTo(5.632f, 8.219f)
                lineTo(7.712f, 11.635f)
                lineTo(12.837f, 8.514f)
                lineTo(10.757f, 5.098f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.31f, 16.81f)
                lineTo(15.96f, 19.52f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.75f, 18.37f)
                lineTo(13.4f, 21.08f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.87f, 15.25f)
                lineTo(18.52f, 17.96f)
            }
        }.build()

        return _Broom!!
    }

@Suppress("ObjectPropertyName")
private var _Broom: ImageVector? = null
