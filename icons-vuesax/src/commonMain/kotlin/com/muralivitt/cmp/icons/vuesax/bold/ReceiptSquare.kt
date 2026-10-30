package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ReceiptSquare: ImageVector
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
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(17f, 15.71f)
                curveTo(17f, 17.28f, 16.14f, 17.65f, 15.1f, 16.53f)
                curveTo(14.62f, 16.02f, 13.88f, 16.06f, 13.46f, 16.62f)
                lineTo(12.87f, 17.41f)
                curveTo(12.4f, 18.04f, 11.62f, 18.04f, 11.15f, 17.41f)
                lineTo(10.55f, 16.61f)
                curveTo(10.13f, 16.05f, 9.39f, 16.01f, 8.91f, 16.52f)
                curveTo(7.86f, 17.64f, 7f, 17.27f, 7f, 15.71f)
                verticalLineTo(9.08f)
                curveTo(7f, 6.71f, 7.56f, 6.12f, 9.78f, 6.12f)
                horizontalLineTo(14.22f)
                curveTo(16.44f, 6.12f, 17f, 6.71f, 17f, 9.08f)
                verticalLineTo(15.71f)
                close()
            }
        }.build()

        return _ReceiptSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptSquare: ImageVector? = null
