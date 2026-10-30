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

val VuesaxIconsTwotone.Key: ImageVector
    get() {
        if (_Key != null) {
            return _Key!!
        }
        _Key = ImageVector.Builder(
            name = "Key",
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
                moveTo(19.791f, 14.93f)
                curveTo(17.731f, 16.98f, 14.781f, 17.61f, 12.191f, 16.8f)
                lineTo(7.481f, 21.5f)
                curveTo(7.141f, 21.85f, 6.471f, 22.06f, 5.991f, 21.99f)
                lineTo(3.811f, 21.69f)
                curveTo(3.091f, 21.59f, 2.421f, 20.91f, 2.311f, 20.19f)
                lineTo(2.011f, 18.01f)
                curveTo(1.941f, 17.53f, 2.171f, 16.86f, 2.501f, 16.52f)
                lineTo(7.201f, 11.82f)
                curveTo(6.401f, 9.22f, 7.021f, 6.27f, 9.081f, 4.22f)
                curveTo(12.031f, 1.27f, 16.821f, 1.27f, 19.781f, 4.22f)
                curveTo(22.741f, 7.17f, 22.741f, 11.98f, 19.791f, 14.93f)
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
                moveTo(6.891f, 17.49f)
                lineTo(9.191f, 19.79f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 11f)
                curveTo(15.328f, 11f, 16f, 10.328f, 16f, 9.5f)
                curveTo(16f, 8.672f, 15.328f, 8f, 14.5f, 8f)
                curveTo(13.672f, 8f, 13f, 8.672f, 13f, 9.5f)
                curveTo(13f, 10.328f, 13.672f, 11f, 14.5f, 11f)
                close()
            }
        }.build()

        return _Key!!
    }

@Suppress("ObjectPropertyName")
private var _Key: ImageVector? = null
