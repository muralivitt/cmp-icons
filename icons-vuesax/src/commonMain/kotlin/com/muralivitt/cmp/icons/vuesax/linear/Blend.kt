package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Blend: ImageVector
    get() {
        if (_Blend != null) {
            return _Blend!!
        }
        _Blend = ImageVector.Builder(
            name = "Blend",
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
                moveTo(21.97f, 12f)
                curveTo(21.97f, 15.31f, 19.28f, 18f, 15.97f, 18f)
                curveTo(14.43f, 18f, 13.03f, 17.42f, 11.97f, 16.46f)
                curveTo(13.2f, 15.37f, 13.97f, 13.77f, 13.97f, 12f)
                curveTo(13.97f, 10.23f, 13.2f, 8.63f, 11.97f, 7.54f)
                curveTo(13.03f, 6.58f, 14.43f, 6f, 15.97f, 6f)
                curveTo(19.28f, 6f, 21.97f, 8.69f, 21.97f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.97f, 12f)
                curveTo(13.97f, 13.77f, 13.2f, 15.37f, 11.97f, 16.46f)
                curveTo(10.91f, 17.42f, 9.51f, 18f, 7.97f, 18f)
                curveTo(4.66f, 18f, 1.97f, 15.31f, 1.97f, 12f)
                curveTo(1.97f, 8.69f, 4.66f, 6f, 7.97f, 6f)
                curveTo(9.51f, 6f, 10.91f, 6.58f, 11.97f, 7.54f)
                curveTo(13.2f, 8.63f, 13.97f, 10.23f, 13.97f, 12f)
                close()
            }
        }.build()

        return _Blend!!
    }

@Suppress("ObjectPropertyName")
private var _Blend: ImageVector? = null
