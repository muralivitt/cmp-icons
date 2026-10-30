package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Diamonds: ImageVector
    get() {
        if (_Diamonds != null) {
            return _Diamonds!!
        }
        _Diamonds = ImageVector.Builder(
            name = "Diamonds",
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
                moveTo(16.29f, 2.15f)
                horizontalLineTo(7.7f)
                curveTo(6f, 2.15f, 5.25f, 3f, 4.79f, 4.04f)
                lineTo(2.23f, 9.8f)
                curveTo(1.77f, 10.84f, 2.02f, 12.39f, 2.79f, 13.23f)
                lineTo(9.65f, 20.77f)
                curveTo(10.95f, 22.19f, 13.07f, 22.19f, 14.36f, 20.77f)
                lineTo(21.21f, 13.22f)
                curveTo(21.98f, 12.37f, 22.23f, 10.83f, 21.76f, 9.79f)
                lineTo(19.2f, 4.03f)
                curveTo(18.74f, 3f, 17.99f, 2.15f, 16.29f, 2.15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.5f, 8f)
                horizontalLineTo(20.5f)
            }
        }.build()

        return _Diamonds!!
    }

@Suppress("ObjectPropertyName")
private var _Diamonds: ImageVector? = null
