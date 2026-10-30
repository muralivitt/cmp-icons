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

val VuesaxIconsTwotone.GalleryEdit: ImageVector
    get() {
        if (_GalleryEdit != null) {
            return _GalleryEdit!!
        }
        _GalleryEdit = ImageVector.Builder(
            name = "GalleryEdit",
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
                moveTo(9f, 10f)
                curveTo(10.105f, 10f, 11f, 9.105f, 11f, 8f)
                curveTo(11f, 6.895f, 10.105f, 6f, 9f, 6f)
                curveTo(7.895f, 6f, 7f, 6.895f, 7f, 8f)
                curveTo(7f, 9.105f, 7.895f, 10f, 9f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(10f)
            }
            path(
                fillAlpha = 0.45f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.45f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.141f, 2.59f)
                lineTo(15.511f, 6.22f)
                curveTo(15.371f, 6.36f, 15.231f, 6.63f, 15.211f, 6.83f)
                lineTo(15.011f, 8.22f)
                curveTo(14.941f, 8.72f, 15.291f, 9.07f, 15.791f, 9f)
                lineTo(17.181f, 8.8f)
                curveTo(17.371f, 8.77f, 17.651f, 8.64f, 17.791f, 8.5f)
                lineTo(21.421f, 4.87f)
                curveTo(22.051f, 4.24f, 22.341f, 3.52f, 21.421f, 2.6f)
                curveTo(20.491f, 1.66f, 19.771f, 1.96f, 19.141f, 2.59f)
                close()
            }
            path(
                fillAlpha = 0.45f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.45f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.619f, 3.11f)
                curveTo(18.929f, 4.21f, 19.789f, 5.07f, 20.889f, 5.38f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.67f, 18.95f)
                lineTo(7.6f, 15.64f)
                curveTo(8.39f, 15.11f, 9.53f, 15.17f, 10.24f, 15.78f)
                lineTo(10.57f, 16.07f)
                curveTo(11.35f, 16.74f, 12.61f, 16.74f, 13.39f, 16.07f)
                lineTo(17.55f, 12.5f)
                curveTo(18.33f, 11.83f, 19.59f, 11.83f, 20.37f, 12.5f)
                lineTo(22f, 13.9f)
            }
        }.build()

        return _GalleryEdit!!
    }

@Suppress("ObjectPropertyName")
private var _GalleryEdit: ImageVector? = null
