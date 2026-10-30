package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.LikeTag: ImageVector
    get() {
        if (_LikeTag != null) {
            return _LikeTag!!
        }
        _LikeTag = ImageVector.Builder(
            name = "LikeTag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(9.65f, 13.8f)
                lineTo(11.26f, 15.05f)
                curveTo(11.47f, 15.26f, 11.94f, 15.36f, 12.25f, 15.36f)
                horizontalLineTo(14.23f)
                curveTo(14.85f, 15.36f, 15.53f, 14.89f, 15.69f, 14.27f)
                lineTo(16.94f, 10.48f)
                curveTo(17.2f, 9.75f, 16.73f, 9.13f, 15.95f, 9.13f)
                horizontalLineTo(13.87f)
                curveTo(13.56f, 9.13f, 13.3f, 8.87f, 13.35f, 8.51f)
                lineTo(13.61f, 6.85f)
                curveTo(13.71f, 6.38f, 13.4f, 5.86f, 12.93f, 5.71f)
                curveTo(12.51f, 5.55f, 11.99f, 5.76f, 11.79f, 6.07f)
                lineTo(9.66f, 9.24f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 13.8f)
                verticalLineTo(8.71f)
                curveTo(7f, 7.98f, 7.31f, 7.72f, 8.04f, 7.72f)
                horizontalLineTo(8.56f)
                curveTo(9.29f, 7.72f, 9.6f, 7.98f, 9.6f, 8.71f)
                verticalLineTo(13.8f)
                curveTo(9.6f, 14.53f, 9.29f, 14.79f, 8.56f, 14.79f)
                horizontalLineTo(8.04f)
                curveTo(7.31f, 14.79f, 7f, 14.53f, 7f, 13.8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 18.86f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.86f, 15.68f, 19.17f, 15.12f, 19.73f)
                lineTo(13.41f, 21.42f)
                curveTo(12.63f, 22.19f, 11.36f, 22.19f, 10.58f, 21.42f)
                lineTo(8.87f, 19.73f)
                curveTo(8.31f, 19.17f, 7.54f, 18.86f, 6.75f, 18.86f)
                horizontalLineTo(6f)
                curveTo(4.34f, 18.86f, 3f, 17.53f, 3f, 15.89f)
                verticalLineTo(4.98f)
                curveTo(3f, 3.34f, 4.34f, 2.01f, 6f, 2.01f)
                horizontalLineTo(18f)
                curveTo(19.66f, 2.01f, 21f, 3.34f, 21f, 4.98f)
                verticalLineTo(15.89f)
                curveTo(21f, 17.52f, 19.66f, 18.86f, 18f, 18.86f)
                close()
            }
        }.build()

        return _LikeTag!!
    }

@Suppress("ObjectPropertyName")
private var _LikeTag: ImageVector? = null
