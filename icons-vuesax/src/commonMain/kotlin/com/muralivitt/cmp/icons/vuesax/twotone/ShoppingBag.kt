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

val VuesaxIconsTwotone.ShoppingBag: ImageVector
    get() {
        if (_ShoppingBag != null) {
            return _ShoppingBag!!
        }
        _ShoppingBag = ImageVector.Builder(
            name = "ShoppingBag",
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
                moveTo(8.4f, 6.5f)
                horizontalLineTo(15.6f)
                curveTo(19f, 6.5f, 19.34f, 8.09f, 19.57f, 10.03f)
                lineTo(20.47f, 17.53f)
                curveTo(20.76f, 19.99f, 20f, 22f, 16.5f, 22f)
                horizontalLineTo(7.51f)
                curveTo(4f, 22f, 3.24f, 19.99f, 3.54f, 17.53f)
                lineTo(4.44f, 10.03f)
                curveTo(4.66f, 8.09f, 5f, 6.5f, 8.4f, 6.5f)
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
                moveTo(8f, 8f)
                verticalLineTo(4.5f)
                curveTo(8f, 3f, 9f, 2f, 10.5f, 2f)
                horizontalLineTo(13.5f)
                curveTo(15f, 2f, 16f, 3f, 16f, 4.5f)
                verticalLineTo(8f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.41f, 17.03f)
                horizontalLineTo(8f)
            }
        }.build()

        return _ShoppingBag!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBag: ImageVector? = null
