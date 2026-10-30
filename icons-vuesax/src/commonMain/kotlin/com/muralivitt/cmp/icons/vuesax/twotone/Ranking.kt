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

val VuesaxIconsTwotone.Ranking: ImageVector
    get() {
        if (_Ranking != null) {
            return _Ranking!!
        }
        _Ranking = ImageVector.Builder(
            name = "Ranking",
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
                moveTo(13.3f, 8.11f)
                lineTo(14.62f, 10.75f)
                curveTo(14.8f, 11.11f, 15.28f, 11.47f, 15.68f, 11.53f)
                lineTo(18.07f, 11.93f)
                curveTo(19.6f, 12.19f, 19.96f, 13.29f, 18.86f, 14.39f)
                lineTo(17f, 16.25f)
                curveTo(16.69f, 16.56f, 16.51f, 17.17f, 16.61f, 17.61f)
                lineTo(17.14f, 19.92f)
                curveTo(17.56f, 21.74f, 16.59f, 22.45f, 14.98f, 21.5f)
                lineTo(12.74f, 20.17f)
                curveTo(12.33f, 19.93f, 11.67f, 19.93f, 11.26f, 20.17f)
                lineTo(9.02f, 21.5f)
                curveTo(7.41f, 22.45f, 6.44f, 21.74f, 6.86f, 19.92f)
                lineTo(7.39f, 17.61f)
                curveTo(7.49f, 17.18f, 7.31f, 16.57f, 7f, 16.25f)
                lineTo(5.14f, 14.39f)
                curveTo(4.04f, 13.29f, 4.4f, 12.18f, 5.93f, 11.93f)
                lineTo(8.32f, 11.53f)
                curveTo(8.72f, 11.46f, 9.2f, 11.11f, 9.38f, 10.75f)
                lineTo(10.7f, 8.11f)
                curveTo(11.41f, 6.68f, 12.59f, 6.68f, 13.3f, 8.11f)
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
                moveTo(6f, 9f)
                verticalLineTo(2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 9f)
                verticalLineTo(2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                verticalLineTo(2f)
            }
        }.build()

        return _Ranking!!
    }

@Suppress("ObjectPropertyName")
private var _Ranking: ImageVector? = null
