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

val VuesaxIconsTwotone.HeartSlash: ImageVector
    get() {
        if (_HeartSlash != null) {
            return _HeartSlash!!
        }
        _HeartSlash = ImageVector.Builder(
            name = "HeartSlash",
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
                moveTo(6.11f, 17.5f)
                curveTo(3.9f, 15.43f, 2f, 12.48f, 2f, 8.68f)
                curveTo(2f, 5.59f, 4.49f, 3.09f, 7.56f, 3.09f)
                curveTo(9.38f, 3.09f, 10.99f, 3.97f, 12f, 5.33f)
                curveTo(13.01f, 3.97f, 14.63f, 3.09f, 16.44f, 3.09f)
                curveTo(17.59f, 3.09f, 18.66f, 3.44f, 19.55f, 4.05f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.74f, 7f)
                curveTo(21.91f, 7.53f, 22f, 8.1f, 22f, 8.69f)
                curveTo(22f, 15.69f, 15.519f, 19.82f, 12.62f, 20.82f)
                curveTo(12.28f, 20.94f, 11.719f, 20.94f, 11.38f, 20.82f)
                curveTo(10.729f, 20.6f, 9.91f, 20.22f, 9.02f, 19.69f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
        }.build()

        return _HeartSlash!!
    }

@Suppress("ObjectPropertyName")
private var _HeartSlash: ImageVector? = null
