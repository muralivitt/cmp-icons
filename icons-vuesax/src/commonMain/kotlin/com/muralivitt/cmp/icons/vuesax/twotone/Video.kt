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

val VuesaxIconsTwotone.Video: ImageVector
    get() {
        if (_Video != null) {
            return _Video!!
        }
        _Video = ImageVector.Builder(
            name = "Video",
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
                moveTo(12.53f, 20.42f)
                horizontalLineTo(6.21f)
                curveTo(3.05f, 20.42f, 2f, 18.32f, 2f, 16.21f)
                verticalLineTo(7.79f)
                curveTo(2f, 4.63f, 3.05f, 3.58f, 6.21f, 3.58f)
                horizontalLineTo(12.53f)
                curveTo(15.69f, 3.58f, 16.74f, 4.63f, 16.74f, 7.79f)
                verticalLineTo(16.21f)
                curveTo(16.74f, 19.37f, 15.68f, 20.42f, 12.53f, 20.42f)
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
                moveTo(19.52f, 17.1f)
                lineTo(16.74f, 15.15f)
                verticalLineTo(8.84f)
                lineTo(19.52f, 6.89f)
                curveTo(20.88f, 5.94f, 22f, 6.52f, 22f, 8.19f)
                verticalLineTo(15.81f)
                curveTo(22f, 17.48f, 20.88f, 18.06f, 19.52f, 17.1f)
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
                moveTo(11.5f, 11f)
                curveTo(12.328f, 11f, 13f, 10.328f, 13f, 9.5f)
                curveTo(13f, 8.672f, 12.328f, 8f, 11.5f, 8f)
                curveTo(10.672f, 8f, 10f, 8.672f, 10f, 9.5f)
                curveTo(10f, 10.328f, 10.672f, 11f, 11.5f, 11f)
                close()
            }
        }.build()

        return _Video!!
    }

@Suppress("ObjectPropertyName")
private var _Video: ImageVector? = null
