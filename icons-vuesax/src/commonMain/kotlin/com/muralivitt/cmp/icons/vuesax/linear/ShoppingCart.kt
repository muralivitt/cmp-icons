package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ShoppingCart: ImageVector
    get() {
        if (_ShoppingCart != null) {
            return _ShoppingCart!!
        }
        _ShoppingCart = ImageVector.Builder(
            name = "ShoppingCart",
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
                moveTo(2f, 2f)
                horizontalLineTo(3.74f)
                curveTo(4.82f, 2f, 5.67f, 2.93f, 5.58f, 4f)
                lineTo(4.75f, 13.96f)
                curveTo(4.61f, 15.59f, 5.9f, 16.99f, 7.54f, 16.99f)
                horizontalLineTo(18.19f)
                curveTo(19.63f, 16.99f, 20.89f, 15.81f, 21f, 14.38f)
                lineTo(21.54f, 6.88f)
                curveTo(21.66f, 5.22f, 20.4f, 3.87f, 18.73f, 3.87f)
                horizontalLineTo(5.82f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.25f, 22f)
                curveTo(16.94f, 22f, 17.5f, 21.44f, 17.5f, 20.75f)
                curveTo(17.5f, 20.06f, 16.94f, 19.5f, 16.25f, 19.5f)
                curveTo(15.56f, 19.5f, 15f, 20.06f, 15f, 20.75f)
                curveTo(15f, 21.44f, 15.56f, 22f, 16.25f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.25f, 22f)
                curveTo(8.94f, 22f, 9.5f, 21.44f, 9.5f, 20.75f)
                curveTo(9.5f, 20.06f, 8.94f, 19.5f, 8.25f, 19.5f)
                curveTo(7.56f, 19.5f, 7f, 20.06f, 7f, 20.75f)
                curveTo(7f, 21.44f, 7.56f, 22f, 8.25f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8f)
                horizontalLineTo(21f)
            }
        }.build()

        return _ShoppingCart!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingCart: ImageVector? = null
