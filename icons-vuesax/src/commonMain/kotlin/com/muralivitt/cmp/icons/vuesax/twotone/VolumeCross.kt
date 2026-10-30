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

val VuesaxIconsTwotone.VolumeCross: ImageVector
    get() {
        if (_VolumeCross != null) {
            return _VolumeCross!!
        }
        _VolumeCross = ImageVector.Builder(
            name = "VolumeCross",
            defaultWidth = 22.dp,
            defaultHeight = 18.dp,
            viewportWidth = 22f,
            viewportHeight = 18f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(1f, 7.001f)
                verticalLineTo(11.001f)
                curveTo(1f, 13.001f, 2f, 14.001f, 4f, 14.001f)
                horizontalLineTo(5.43f)
                curveTo(5.8f, 14.001f, 6.17f, 14.111f, 6.49f, 14.301f)
                lineTo(9.41f, 16.131f)
                curveTo(11.93f, 17.711f, 14f, 16.561f, 14f, 13.591f)
                verticalLineTo(4.411f)
                curveTo(14f, 1.431f, 11.93f, 0.291f, 9.41f, 1.871f)
                lineTo(6.49f, 3.701f)
                curveTo(6.17f, 3.891f, 5.8f, 4.001f, 5.43f, 4.001f)
                horizontalLineTo(4f)
                curveTo(2f, 4.001f, 1f, 5.001f, 1f, 7.001f)
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
                moveTo(20.999f, 10.961f)
                lineTo(17.039f, 7.001f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.96f, 7.041f)
                lineTo(17f, 11.001f)
            }
        }.build()

        return _VolumeCross!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeCross: ImageVector? = null
