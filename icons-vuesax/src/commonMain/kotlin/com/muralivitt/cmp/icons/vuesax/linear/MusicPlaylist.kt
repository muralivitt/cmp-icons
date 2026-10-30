package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MusicPlaylist: ImageVector
    get() {
        if (_MusicPlaylist != null) {
            return _MusicPlaylist!!
        }
        _MusicPlaylist = ImageVector.Builder(
            name = "MusicPlaylist",
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
                moveTo(17f, 22f)
                horizontalLineTo(7f)
                curveTo(4f, 22f, 2f, 20.5f, 2f, 17f)
                verticalLineTo(12f)
                curveTo(2f, 8.5f, 4f, 7f, 7f, 7f)
                horizontalLineTo(17f)
                curveTo(20f, 7f, 22f, 8.5f, 22f, 12f)
                verticalLineTo(17f)
                curveTo(22f, 20.5f, 20f, 22f, 17f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 4.5f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 2f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.89f, 19.11f)
                curveTo(9.647f, 19.11f, 10.26f, 18.497f, 10.26f, 17.74f)
                curveTo(10.26f, 16.983f, 9.647f, 16.37f, 8.89f, 16.37f)
                curveTo(8.133f, 16.37f, 7.52f, 16.983f, 7.52f, 17.74f)
                curveTo(7.52f, 18.497f, 8.133f, 19.11f, 8.89f, 19.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.28f, 16.83f)
                verticalLineTo(11.48f)
                curveTo(15.28f, 10.34f, 14.57f, 10.18f, 13.84f, 10.38f)
                lineTo(11.1f, 11.13f)
                curveTo(10.6f, 11.27f, 10.26f, 11.66f, 10.26f, 12.23f)
                verticalLineTo(13.18f)
                verticalLineTo(13.82f)
                verticalLineTo(17.74f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.91f, 18.2f)
                curveTo(14.667f, 18.2f, 15.28f, 17.587f, 15.28f, 16.83f)
                curveTo(15.28f, 16.073f, 14.667f, 15.46f, 13.91f, 15.46f)
                curveTo(13.153f, 15.46f, 12.54f, 16.073f, 12.54f, 16.83f)
                curveTo(12.54f, 17.587f, 13.153f, 18.2f, 13.91f, 18.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.26f, 13.83f)
                lineTo(15.28f, 12.46f)
            }
        }.build()

        return _MusicPlaylist!!
    }

@Suppress("ObjectPropertyName")
private var _MusicPlaylist: ImageVector? = null
