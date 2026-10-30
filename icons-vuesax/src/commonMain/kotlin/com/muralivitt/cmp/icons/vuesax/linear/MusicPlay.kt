package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MusicPlay: ImageVector
    get() {
        if (_MusicPlay != null) {
            return _MusicPlay!!
        }
        _MusicPlay = ImageVector.Builder(
            name = "MusicPlay",
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
                moveTo(5.48f, 18.49f)
                verticalLineTo(15.57f)
                curveTo(5.48f, 14.6f, 6.24f, 13.73f, 7.32f, 13.73f)
                curveTo(8.29f, 13.73f, 9.16f, 14.49f, 9.16f, 15.57f)
                verticalLineTo(18.38f)
                curveTo(9.16f, 20.33f, 7.54f, 21.95f, 5.59f, 21.95f)
                curveTo(3.64f, 21.95f, 2.02f, 20.32f, 2.02f, 18.38f)
                verticalLineTo(12.22f)
                curveTo(1.91f, 6.6f, 6.35f, 2.05f, 11.97f, 2.05f)
                curveTo(17.59f, 2.05f, 22.02f, 6.6f, 22.02f, 12.11f)
                verticalLineTo(18.27f)
                curveTo(22.02f, 20.22f, 20.4f, 21.84f, 18.45f, 21.84f)
                curveTo(16.5f, 21.84f, 14.88f, 20.22f, 14.88f, 18.27f)
                verticalLineTo(15.46f)
                curveTo(14.88f, 14.49f, 15.64f, 13.62f, 16.72f, 13.62f)
                curveTo(17.69f, 13.62f, 18.56f, 14.38f, 18.56f, 15.46f)
                verticalLineTo(18.49f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.53f, 9.12f)
                horizontalLineTo(14.72f)
                curveTo(14.5f, 9.12f, 14.29f, 9.25f, 14.19f, 9.44f)
                lineTo(13.44f, 10.94f)
                curveTo(13.33f, 11.16f, 13.02f, 11.16f, 12.91f, 10.94f)
                lineTo(11.07f, 7.27f)
                curveTo(10.96f, 7.06f, 10.66f, 7.05f, 10.55f, 7.26f)
                lineTo(9.71f, 8.81f)
                curveTo(9.61f, 9f, 9.41f, 9.12f, 9.19f, 9.12f)
                horizontalLineTo(8.46f)
            }
        }.build()

        return _MusicPlay!!
    }

@Suppress("ObjectPropertyName")
private var _MusicPlay: ImageVector? = null
