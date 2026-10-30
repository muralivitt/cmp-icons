package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.FavoriteChart: ImageVector
    get() {
        if (_FavoriteChart != null) {
            return _FavoriteChart!!
        }
        _FavoriteChart = ImageVector.Builder(
            name = "FavoriteChart",
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
                moveTo(22f, 13f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.33f, 14.49f)
                lineTo(9.71f, 11.4f)
                curveTo(10.05f, 10.96f, 10.68f, 10.88f, 11.12f, 11.22f)
                lineTo(12.95f, 12.66f)
                curveTo(13.39f, 13f, 14.02f, 12.92f, 14.36f, 12.49f)
                lineTo(16.67f, 9.51f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.48f, 15.82f)
                lineTo(19.76f, 16.39f)
                curveTo(19.9f, 16.67f, 20.25f, 16.93f, 20.56f, 16.99f)
                lineTo(20.94f, 17.05f)
                curveTo(22.08f, 17.24f, 22.35f, 18.08f, 21.53f, 18.91f)
                lineTo(21.18f, 19.26f)
                curveTo(20.95f, 19.5f, 20.82f, 19.96f, 20.89f, 20.28f)
                lineTo(20.94f, 20.49f)
                curveTo(21.25f, 21.87f, 20.52f, 22.4f, 19.32f, 21.68f)
                lineTo(19.06f, 21.53f)
                curveTo(18.75f, 21.35f, 18.25f, 21.35f, 17.94f, 21.53f)
                lineTo(17.68f, 21.68f)
                curveTo(16.47f, 22.41f, 15.74f, 21.87f, 16.06f, 20.49f)
                lineTo(16.11f, 20.28f)
                curveTo(16.18f, 19.96f, 16.05f, 19.5f, 15.82f, 19.26f)
                lineTo(15.47f, 18.91f)
                curveTo(14.65f, 18.08f, 14.92f, 17.24f, 16.06f, 17.05f)
                lineTo(16.44f, 16.99f)
                curveTo(16.74f, 16.94f, 17.1f, 16.67f, 17.24f, 16.39f)
                lineTo(17.52f, 15.82f)
                curveTo(18.06f, 14.73f, 18.94f, 14.73f, 19.48f, 15.82f)
                close()
            }
        }.build()

        return _FavoriteChart!!
    }

@Suppress("ObjectPropertyName")
private var _FavoriteChart: ImageVector? = null
