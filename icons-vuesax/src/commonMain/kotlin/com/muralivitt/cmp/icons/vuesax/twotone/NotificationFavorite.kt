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

val VuesaxIconsTwotone.NotificationFavorite: ImageVector
    get() {
        if (_NotificationFavorite != null) {
            return _NotificationFavorite!!
        }
        _NotificationFavorite = ImageVector.Builder(
            name = "NotificationFavorite",
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
                moveTo(19f, 8f)
                curveTo(20.657f, 8f, 22f, 6.657f, 22f, 5f)
                curveTo(22f, 3.343f, 20.657f, 2f, 19f, 2f)
                curveTo(17.343f, 2f, 16f, 3.343f, 16f, 5f)
                curveTo(16f, 6.657f, 17.343f, 8f, 19f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(10f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.81f, 14.93f)
                curveTo(6.46f, 13.83f, 6.87f, 12.46f, 8.03f, 12.09f)
                curveTo(8.64f, 11.89f, 9.39f, 12.06f, 9.82f, 12.65f)
                curveTo(10.22f, 12.04f, 11f, 11.9f, 11.601f, 12.09f)
                curveTo(12.76f, 12.46f, 13.17f, 13.83f, 12.821f, 14.93f)
                curveTo(12.271f, 16.68f, 10.351f, 17.59f, 9.82f, 17.59f)
                curveTo(9.28f, 17.58f, 7.38f, 16.69f, 6.81f, 14.93f)
                close()
            }
        }.build()

        return _NotificationFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationFavorite: ImageVector? = null
