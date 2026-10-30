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

val VuesaxIconsTwotone.Microscope: ImageVector
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
                moveTo(15.029f, 10.77f)
                lineTo(20.689f, 6.98f)
                curveTo(21.259f, 6.6f, 21.409f, 5.82f, 21.029f, 5.26f)
                lineTo(19.209f, 2.55f)
                curveTo(18.829f, 1.98f, 18.049f, 1.83f, 17.489f, 2.21f)
                lineTo(11.829f, 6f)
                lineTo(15.029f, 10.77f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.173f, 6.479f)
                lineTo(7.396f, 9.679f)
                lineTo(9.955f, 13.501f)
                lineTo(14.733f, 10.302f)
                lineTo(12.173f, 6.479f)
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.05f, 12.2f)
                lineTo(7.56f, 22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
