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

val VuesaxIconsTwotone.GlobalRefresh: ImageVector
    get() {
        if (_GlobalRefresh != null) {
            return _GlobalRefresh!!
        }
        _GlobalRefresh = ImageVector.Builder(
            name = "GlobalRefresh",
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
                moveTo(22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 3f)
                horizontalLineTo(9f)
                curveTo(7.05f, 8.84f, 7.05f, 15.16f, 9f, 21f)
                horizontalLineTo(8f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 3f)
                curveTo(15.97f, 5.92f, 16.46f, 8.96f, 16.46f, 12f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 16f)
                verticalLineTo(15f)
                curveTo(5.92f, 15.97f, 8.96f, 16.46f, 12f, 16.46f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 9f)
                curveTo(8.84f, 7.05f, 15.16f, 7.05f, 21f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 14.7f)
                curveTo(19.13f, 14.59f, 18.71f, 14.52f, 18.25f, 14.52f)
                curveTo(16.18f, 14.52f, 14.51f, 16.2f, 14.51f, 18.26f)
                curveTo(14.51f, 20.33f, 16.19f, 22f, 18.25f, 22f)
                curveTo(20.31f, 22f, 21.99f, 20.32f, 21.99f, 18.26f)
                curveTo(21.99f, 17.49f, 21.76f, 16.77f, 21.36f, 16.18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.041f, 14.8f)
                lineTo(18.791f, 13.37f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.04f, 14.8f)
                lineTo(18.58f, 15.86f)
            }
        }.build()

        return _GlobalRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _GlobalRefresh: ImageVector? = null
