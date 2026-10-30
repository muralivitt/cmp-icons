package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.GalleryTick: ImageVector
    get() {
        if (_GalleryTick != null) {
            return _GalleryTick!!
        }
        _GalleryTick = ImageVector.Builder(
            name = "GalleryTick",
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 4.99f)
                lineTo(17.46f, 6.45f)
                lineTo(21.36f, 2.55f)
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

        return _GalleryTick!!
    }

@Suppress("ObjectPropertyName")
private var _GalleryTick: ImageVector? = null
