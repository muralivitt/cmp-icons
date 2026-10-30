package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.LocationSlash: ImageVector
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
                moveTo(10.42f, 13f)
                curveTo(9.5f, 12.46f, 8.88f, 11.46f, 8.88f, 10.31f)
                curveTo(8.88f, 8.59f, 10.27f, 7.19f, 12f, 7.19f)
                curveTo(13.15f, 7.19f, 14.15f, 7.81f, 14.69f, 8.74f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.99f, 17.81f)
                curveTo(4.15f, 15.3f, 2.81f, 12.09f, 3.63f, 8.49f)
                curveTo(5.28f, 1.23f, 14.57f, 0.06f, 18.68f, 4.98f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.38f, 8.5f)
                curveTo(21.53f, 13.58f, 18.37f, 17.88f, 15.6f, 20.54f)
                curveTo(13.59f, 22.48f, 10.41f, 22.48f, 8.39f, 20.54f)
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
