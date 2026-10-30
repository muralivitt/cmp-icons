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

val VuesaxIconsTwotone.VolumeLow1: ImageVector
    get() {
        if (_VolumeLow1 != null) {
            return _VolumeLow1!!
        }
        _VolumeLow1 = ImageVector.Builder(
            name = "VolumeLow1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(3.33f, 10f)
                verticalLineTo(14f)
                curveTo(3.33f, 16f, 4.33f, 17f, 6.33f, 17f)
                horizontalLineTo(7.76f)
                curveTo(8.13f, 17f, 8.5f, 17.11f, 8.82f, 17.3f)
                lineTo(11.74f, 19.13f)
                curveTo(14.26f, 20.71f, 16.33f, 19.56f, 16.33f, 16.59f)
                verticalLineTo(7.41f)
                curveTo(16.33f, 4.43f, 14.26f, 3.29f, 11.74f, 4.87f)
                lineTo(8.82f, 6.7f)
                curveTo(8.5f, 6.89f, 8.13f, 7f, 7.76f, 7f)
                horizontalLineTo(6.33f)
                curveTo(4.33f, 7f, 3.33f, 8f, 3.33f, 10f)
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
                moveTo(19.33f, 8f)
                curveTo(21.11f, 10.37f, 21.11f, 13.63f, 19.33f, 16f)
            }
        }.build()

        return _VolumeLow1!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeLow1: ImageVector? = null
