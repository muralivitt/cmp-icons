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

val VuesaxIconsTwotone.LocationSlash: ImageVector
    get() {
        if (_LocationSlash != null) {
            return _LocationSlash!!
        }
        _LocationSlash = ImageVector.Builder(
            name = "LocationSlash",
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
                moveTo(10.421f, 13f)
                curveTo(9.501f, 12.46f, 8.881f, 11.46f, 8.881f, 10.31f)
                curveTo(8.881f, 8.59f, 10.271f, 7.19f, 12.001f, 7.19f)
                curveTo(13.151f, 7.19f, 14.151f, 7.81f, 14.691f, 8.74f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.989f, 17.81f)
                curveTo(4.149f, 15.3f, 2.809f, 12.09f, 3.629f, 8.49f)
                curveTo(5.279f, 1.23f, 14.569f, 0.06f, 18.679f, 4.98f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.381f, 8.5f)
                curveTo(21.531f, 13.58f, 18.371f, 17.88f, 15.601f, 20.54f)
                curveTo(13.591f, 22.48f, 10.411f, 22.48f, 8.391f, 20.54f)
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

        return _LocationSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LocationSlash: ImageVector? = null
