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

val VuesaxIconsTwotone.MusicFilter: ImageVector
    get() {
        if (_MusicFilter != null) {
            return _MusicFilter!!
        }
        _MusicFilter = ImageVector.Builder(
            name = "MusicFilter",
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
                moveTo(2f, 3f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                horizontalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 15f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 21f)
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
                moveTo(11.84f, 22f)
                curveTo(13.044f, 22f, 14.02f, 21.024f, 14.02f, 19.82f)
                curveTo(14.02f, 18.616f, 13.044f, 17.64f, 11.84f, 17.64f)
                curveTo(10.636f, 17.64f, 9.66f, 18.616f, 9.66f, 19.82f)
                curveTo(9.66f, 21.024f, 10.636f, 22f, 11.84f, 22f)
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
                moveTo(22f, 18.37f)
                verticalLineTo(9.86f)
                curveTo(22f, 8.05f, 20.86f, 7.8f, 19.709f, 8.11f)
                lineTo(15.359f, 9.3f)
                curveTo(14.569f, 9.52f, 14.019f, 10.14f, 14.019f, 11.05f)
                verticalLineTo(12.57f)
                verticalLineTo(13.59f)
                verticalLineTo(19.82f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.821f, 20.55f)
                curveTo(21.025f, 20.55f, 22.001f, 19.574f, 22.001f, 18.37f)
                curveTo(22.001f, 17.166f, 21.025f, 16.19f, 19.821f, 16.19f)
                curveTo(18.617f, 16.19f, 17.641f, 17.166f, 17.641f, 18.37f)
                curveTo(17.641f, 19.574f, 18.617f, 20.55f, 19.821f, 20.55f)
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
                moveTo(14.019f, 13.6f)
                lineTo(22f, 11.42f)
            }
        }.build()

        return _MusicFilter!!
    }

@Suppress("ObjectPropertyName")
private var _MusicFilter: ImageVector? = null
