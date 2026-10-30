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

val VuesaxIconsTwotone.VolumeSlash: ImageVector
    get() {
        if (_VolumeSlash != null) {
            return _VolumeSlash!!
        }
        _VolumeSlash = ImageVector.Builder(
            name = "VolumeSlash",
            defaultWidth = 22.dp,
            defaultHeight = 22.dp,
            viewportWidth = 22f,
            viewportHeight = 22f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 7.37f)
                verticalLineTo(6.41f)
                curveTo(14f, 3.43f, 11.93f, 2.29f, 9.41f, 3.87f)
                lineTo(6.49f, 5.7f)
                curveTo(6.17f, 5.89f, 5.8f, 6f, 5.43f, 6f)
                horizontalLineTo(4f)
                curveTo(2f, 6f, 1f, 7f, 1f, 9f)
                verticalLineTo(13f)
                curveTo(1f, 15f, 2f, 16f, 4f, 16f)
                horizontalLineTo(6f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.41f, 18.13f)
                curveTo(11.93f, 19.71f, 14f, 18.56f, 14f, 15.59f)
                verticalLineTo(11.95f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.81f, 8.42f)
                curveTo(18.71f, 10.57f, 18.44f, 13.08f, 17f, 15f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.15f, 6.8f)
                curveTo(21.62f, 10.29f, 21.18f, 14.37f, 18.83f, 17.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 1f)
                lineTo(1f, 21f)
            }
        }.build()

        return _VolumeSlash!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeSlash: ImageVector? = null
