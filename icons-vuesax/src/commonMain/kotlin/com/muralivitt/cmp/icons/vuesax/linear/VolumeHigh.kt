package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.VolumeHigh: ImageVector
    get() {
        if (_VolumeHigh != null) {
            return _VolumeHigh!!
        }
        _VolumeHigh = ImageVector.Builder(
            name = "VolumeHigh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(2f, 10f)
                verticalLineTo(14f)
                curveTo(2f, 16f, 3f, 17f, 5f, 17f)
                horizontalLineTo(6.43f)
                curveTo(6.8f, 17f, 7.17f, 17.11f, 7.49f, 17.3f)
                lineTo(10.41f, 19.13f)
                curveTo(12.93f, 20.71f, 15f, 19.56f, 15f, 16.59f)
                verticalLineTo(7.41f)
                curveTo(15f, 4.43f, 12.93f, 3.29f, 10.41f, 4.87f)
                lineTo(7.49f, 6.7f)
                curveTo(7.17f, 6.89f, 6.8f, 7f, 6.43f, 7f)
                horizontalLineTo(5f)
                curveTo(3f, 7f, 2f, 8f, 2f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 8f)
                curveTo(19.78f, 10.37f, 19.78f, 13.63f, 18f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.83f, 5.5f)
                curveTo(22.72f, 9.35f, 22.72f, 14.65f, 19.83f, 18.5f)
            }
        }.build()

        return _VolumeHigh!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeHigh: ImageVector? = null
