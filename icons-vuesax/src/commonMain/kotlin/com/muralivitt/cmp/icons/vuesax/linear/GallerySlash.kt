package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.GallerySlash: ImageVector
    get() {
        if (_GallerySlash != null) {
            return _GallerySlash!!
        }
        _GallerySlash = ImageVector.Builder(
            name = "GallerySlash",
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
                moveTo(3.37f, 20.1f)
                curveTo(2.43f, 18.97f, 2f, 17.31f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 4f, 4f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(17.19f, 2f, 18.8f, 2.38f, 19.92f, 3.23f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.97f, 7.99f)
                curveTo(21.99f, 8.31f, 22f, 8.65f, 22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 20f, 20f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(8.26f, 22f, 7.58f, 21.96f, 6.96f, 21.86f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 10f)
                curveTo(9.105f, 10f, 10f, 9.105f, 10f, 8f)
                curveTo(10f, 6.895f, 9.105f, 6f, 8f, 6f)
                curveTo(6.895f, 6f, 6f, 6.895f, 6f, 8f)
                curveTo(6f, 9.105f, 6.895f, 10f, 8f, 10f)
                close()
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
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.43f, 16.45f)
                curveTo(11.73f, 16.75f, 12.22f, 16.75f, 12.52f, 16.45f)
                lineTo(17.55f, 11.41f)
                curveTo(18.33f, 10.63f, 19.59f, 10.63f, 20.37f, 11.41f)
                lineTo(22f, 13.05f)
            }
        }.build()

        return _GallerySlash!!
    }

@Suppress("ObjectPropertyName")
private var _GallerySlash: ImageVector? = null
