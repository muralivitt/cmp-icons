package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.GalleryFavorite: ImageVector
    get() {
        if (_GalleryFavorite != null) {
            return _GalleryFavorite!!
        }
        _GalleryFavorite = ImageVector.Builder(
            name = "GalleryFavorite",
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
                moveTo(12f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.12f, 5.11f)
                curveTo(15.79f, 4.07f, 16.18f, 2.78f, 17.26f, 2.43f)
                curveTo(17.83f, 2.25f, 18.54f, 2.4f, 18.94f, 2.95f)
                curveTo(19.32f, 2.38f, 20.05f, 2.24f, 20.62f, 2.43f)
                curveTo(21.71f, 2.78f, 22.1f, 4.07f, 21.77f, 5.11f)
                curveTo(21.25f, 6.75f, 19.45f, 7.61f, 18.95f, 7.61f)
                curveTo(18.44f, 7.61f, 16.65f, 6.77f, 16.12f, 5.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
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

        return _GalleryFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _GalleryFavorite: ImageVector? = null
