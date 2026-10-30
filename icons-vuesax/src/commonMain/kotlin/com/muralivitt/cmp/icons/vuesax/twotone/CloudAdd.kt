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

val VuesaxIconsTwotone.CloudAdd: ImageVector
    get() {
        if (_CloudAdd != null) {
            return _CloudAdd!!
        }
        _CloudAdd = ImageVector.Builder(
            name = "CloudAdd",
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
                moveTo(5.539f, 11.12f)
                curveTo(0.859f, 11.45f, 0.859f, 18.26f, 5.539f, 18.59f)
                horizontalLineTo(7.459f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.59f, 11.12f)
                curveTo(2.38f, 2.19f, 15.92f, -1.38f, 17.47f, 8f)
                curveTo(21.8f, 8.55f, 23.55f, 14.32f, 20.27f, 17.19f)
                curveTo(19.27f, 18.1f, 17.98f, 18.6f, 16.63f, 18.59f)
                horizontalLineTo(16.54f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16.53f)
                curveTo(17f, 17.27f, 16.84f, 17.97f, 16.54f, 18.59f)
                curveTo(16.46f, 18.77f, 16.37f, 18.94f, 16.27f, 19.1f)
                curveTo(15.41f, 20.55f, 13.82f, 21.53f, 12f, 21.53f)
                curveTo(10.18f, 21.53f, 8.59f, 20.55f, 7.73f, 19.1f)
                curveTo(7.63f, 18.94f, 7.54f, 18.77f, 7.46f, 18.59f)
                curveTo(7.16f, 17.97f, 7f, 17.27f, 7f, 16.53f)
                curveTo(7f, 13.77f, 9.24f, 11.53f, 12f, 11.53f)
                curveTo(14.76f, 11.53f, 17f, 13.77f, 17f, 16.53f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.44f, 16.53f)
                lineTo(11.43f, 17.52f)
                lineTo(13.56f, 15.55f)
            }
        }.build()

        return _CloudAdd!!
    }

@Suppress("ObjectPropertyName")
private var _CloudAdd: ImageVector? = null
