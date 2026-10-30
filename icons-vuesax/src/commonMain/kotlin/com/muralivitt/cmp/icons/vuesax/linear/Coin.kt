package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Coin: ImageVector
    get() {
        if (_Coin != null) {
            return _Coin!!
        }
        _Coin = ImageVector.Builder(
            name = "Coin",
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
                moveTo(18.5f, 12.65f)
                verticalLineTo(16.35f)
                curveTo(18.5f, 19.47f, 15.59f, 22f, 12f, 22f)
                curveTo(8.41f, 22f, 5.5f, 19.47f, 5.5f, 16.35f)
                verticalLineTo(12.65f)
                curveTo(5.5f, 15.77f, 8.41f, 18f, 12f, 18f)
                curveTo(15.59f, 18f, 18.5f, 15.77f, 18.5f, 12.65f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 7.65f)
                curveTo(18.5f, 8.56f, 18.25f, 9.4f, 17.81f, 10.12f)
                curveTo(16.74f, 11.88f, 14.54f, 13f, 12f, 13f)
                curveTo(9.46f, 13f, 7.26f, 11.88f, 6.19f, 10.12f)
                curveTo(5.75f, 9.4f, 5.5f, 8.56f, 5.5f, 7.65f)
                curveTo(5.5f, 6.09f, 6.23f, 4.68f, 7.4f, 3.66f)
                curveTo(8.58f, 2.63f, 10.2f, 2f, 12f, 2f)
                curveTo(13.8f, 2f, 15.42f, 2.63f, 16.6f, 3.65f)
                curveTo(17.77f, 4.68f, 18.5f, 6.09f, 18.5f, 7.65f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 7.65f)
                verticalLineTo(12.65f)
                curveTo(18.5f, 15.77f, 15.59f, 18f, 12f, 18f)
                curveTo(8.41f, 18f, 5.5f, 15.77f, 5.5f, 12.65f)
                verticalLineTo(7.65f)
                curveTo(5.5f, 4.53f, 8.41f, 2f, 12f, 2f)
                curveTo(13.8f, 2f, 15.42f, 2.63f, 16.6f, 3.65f)
                curveTo(17.77f, 4.68f, 18.5f, 6.09f, 18.5f, 7.65f)
                close()
            }
        }.build()

        return _Coin!!
    }

@Suppress("ObjectPropertyName")
private var _Coin: ImageVector? = null
