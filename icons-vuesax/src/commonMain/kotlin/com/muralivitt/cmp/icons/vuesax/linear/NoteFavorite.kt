package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.NoteFavorite: ImageVector
    get() {
        if (_NoteFavorite != null) {
            return _NoteFavorite!!
        }
        _NoteFavorite = ImageVector.Builder(
            name = "NoteFavorite",
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
                moveTo(8f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 8.5f)
                verticalLineTo(13.63f)
                curveTo(20.11f, 12.92f, 18.98f, 12.5f, 17.75f, 12.5f)
                curveTo(16.52f, 12.5f, 15.37f, 12.93f, 14.47f, 13.66f)
                curveTo(13.26f, 14.61f, 12.5f, 16.1f, 12.5f, 17.75f)
                curveTo(12.5f, 18.73f, 12.78f, 19.67f, 13.26f, 20.45f)
                curveTo(13.63f, 21.06f, 14.11f, 21.59f, 14.68f, 22f)
                horizontalLineTo(8f)
                curveTo(4.5f, 22f, 3f, 20f, 3f, 17f)
                verticalLineTo(8.5f)
                curveTo(3f, 5.5f, 4.5f, 3.5f, 8f, 3.5f)
                horizontalLineTo(16f)
                curveTo(19.5f, 3.5f, 21f, 5.5f, 21f, 8.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 11f)
                horizontalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16f)
                horizontalLineTo(9.62f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23f, 17.75f)
                curveTo(23f, 18.73f, 22.72f, 19.67f, 22.24f, 20.45f)
                curveTo(21.96f, 20.93f, 21.61f, 21.35f, 21.2f, 21.69f)
                curveTo(20.28f, 22.51f, 19.08f, 23f, 17.75f, 23f)
                curveTo(16.6f, 23f, 15.54f, 22.63f, 14.68f, 22f)
                curveTo(14.11f, 21.59f, 13.63f, 21.06f, 13.26f, 20.45f)
                curveTo(12.78f, 19.67f, 12.5f, 18.73f, 12.5f, 17.75f)
                curveTo(12.5f, 16.1f, 13.26f, 14.61f, 14.47f, 13.66f)
                curveTo(15.37f, 12.93f, 16.52f, 12.5f, 17.75f, 12.5f)
                curveTo(18.98f, 12.5f, 20.11f, 12.92f, 21f, 13.63f)
                curveTo(22.22f, 14.59f, 23f, 16.08f, 23f, 17.75f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.75f, 20.25f)
                curveTo(17.75f, 18.87f, 18.87f, 17.75f, 20.25f, 17.75f)
                curveTo(18.87f, 17.75f, 17.75f, 16.63f, 17.75f, 15.25f)
                curveTo(17.75f, 16.63f, 16.63f, 17.75f, 15.25f, 17.75f)
                curveTo(16.63f, 17.75f, 17.75f, 18.87f, 17.75f, 20.25f)
                close()
            }
        }.build()

        return _NoteFavorite!!
    }

@Suppress("ObjectPropertyName")
private var _NoteFavorite: ImageVector? = null
