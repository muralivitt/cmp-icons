package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Microscope: ImageVector
    get() {
        if (_Microscope != null) {
            return _Microscope!!
        }
        _Microscope = ImageVector.Builder(
            name = "Microscope",
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
                moveTo(15.03f, 10.77f)
                lineTo(20.69f, 6.98f)
                curveTo(21.26f, 6.6f, 21.41f, 5.82f, 21.03f, 5.26f)
                lineTo(19.21f, 2.55f)
                curveTo(18.83f, 1.98f, 18.05f, 1.83f, 17.49f, 2.21f)
                lineTo(11.83f, 6f)
                lineTo(15.03f, 10.77f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.174f, 6.479f)
                lineTo(7.396f, 9.679f)
                lineTo(9.956f, 13.501f)
                lineTo(14.734f, 10.301f)
                lineTo(12.174f, 6.479f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.83f, 15.9f)
                lineTo(9.78f, 13.26f)
                lineTo(7.54f, 9.92f)
                lineTo(3.59f, 12.56f)
                curveTo(3.13f, 12.87f, 3.01f, 13.49f, 3.32f, 13.95f)
                lineTo(4.45f, 15.63f)
                curveTo(4.75f, 16.08f, 5.37f, 16.2f, 5.83f, 15.9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.05f, 12.2f)
                lineTo(7.56f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12.2f)
                lineTo(16.44f, 22f)
            }
        }.build()

        return _Microscope!!
    }

@Suppress("ObjectPropertyName")
private var _Microscope: ImageVector? = null
