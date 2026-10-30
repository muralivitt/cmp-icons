package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MessageFavorite: ImageVector
    get() {
        if (_MessageFavorite != null) {
            return _MessageFavorite!!
        }
        _MessageFavorite = ImageVector.Builder(
            name = "MessageFavorite",
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
                moveTo(22f, 8f)
                verticalLineTo(13f)
                curveTo(22f, 17f, 20f, 19f, 16f, 19f)
                horizontalLineTo(15.5f)
                curveTo(15.19f, 19f, 14.89f, 19.15f, 14.7f, 19.4f)
                lineTo(13.2f, 21.4f)
                curveTo(12.54f, 22.28f, 11.46f, 22.28f, 10.8f, 21.4f)
                lineTo(9.3f, 19.4f)
                curveTo(9.14f, 19.18f, 8.77f, 19f, 8.5f, 19f)
                horizontalLineTo(8f)
                curveTo(4f, 19f, 2f, 18f, 2f, 13f)
                verticalLineTo(8f)
                curveTo(2f, 4f, 4f, 2f, 8f, 2f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.2f, 4.62f)
                curveTo(14.87f, 3.63f, 15.26f, 2.41f, 16.34f, 2.07f)
                curveTo(16.9f, 1.9f, 17.6f, 2.04f, 18f, 2.57f)
                curveTo(18.38f, 2.02f, 19.1f, 1.9f, 19.66f, 2.07f)
                curveTo(20.74f, 2.4f, 21.13f, 3.63f, 20.8f, 4.62f)
                curveTo(20.29f, 6.19f, 18.5f, 7f, 18f, 7f)
                curveTo(17.5f, 7f, 15.73f, 6.2f, 15.2f, 4.62f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.997f, 11f)
                horizontalLineTo(16.005f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.995f, 11f)
                horizontalLineTo(12.005f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.995f, 11f)
                horizontalLineTo(8.003f)
            }
        }.build()

        return _MessageFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _MessageFavorite: ImageVector? = null
