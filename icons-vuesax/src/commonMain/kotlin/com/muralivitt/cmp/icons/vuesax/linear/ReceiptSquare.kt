package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ReceiptSquare: ImageVector
    get() {
        if (_ReceiptSquare != null) {
            return _ReceiptSquare!!
        }
        _ReceiptSquare = ImageVector.Builder(
            name = "ReceiptSquare",
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
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.9f, 16.53f)
                curveTo(9.38f, 16.01f, 10.12f, 16.05f, 10.54f, 16.62f)
                lineTo(11.14f, 17.42f)
                curveTo(11.61f, 18.05f, 12.39f, 18.05f, 12.86f, 17.42f)
                lineTo(13.45f, 16.63f)
                curveTo(13.87f, 16.07f, 14.61f, 16.03f, 15.09f, 16.54f)
                curveTo(16.14f, 17.66f, 16.99f, 17.29f, 16.99f, 15.72f)
                verticalLineTo(9.09f)
                curveTo(16.99f, 6.72f, 16.43f, 6.13f, 14.21f, 6.13f)
                horizontalLineTo(9.77f)
                curveTo(7.55f, 6.13f, 6.99f, 6.72f, 6.99f, 9.09f)
                verticalLineTo(15.72f)
                curveTo(7f, 17.27f, 7.86f, 17.64f, 8.9f, 16.53f)
                close()
            }
        }.build()

        return _ReceiptSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptSquare: ImageVector? = null
