package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.VolumeSlash: ImageVector
    get() {
        if (_VolumeSlash != null) {
            return _VolumeSlash!!
        }
        _VolumeSlash = ImageVector.Builder(
            name = "VolumeSlash",
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
                moveTo(15f, 8.37f)
                verticalLineTo(7.41f)
                curveTo(15f, 4.43f, 12.93f, 3.29f, 10.41f, 4.87f)
                lineTo(7.49f, 6.7f)
                curveTo(7.17f, 6.89f, 6.8f, 7f, 6.43f, 7f)
                horizontalLineTo(5f)
                curveTo(3f, 7f, 2f, 8f, 2f, 10f)
                verticalLineTo(14f)
                curveTo(2f, 16f, 3f, 17f, 5f, 17f)
                horizontalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.41f, 19.13f)
                curveTo(12.93f, 20.71f, 15f, 19.56f, 15f, 16.59f)
                verticalLineTo(12.95f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.81f, 9.42f)
                curveTo(19.71f, 11.57f, 19.44f, 14.08f, 18f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.15f, 7.8f)
                curveTo(22.62f, 11.29f, 22.18f, 15.37f, 19.83f, 18.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
        }.build()

        return _VolumeSlash!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeSlash: ImageVector? = null
