package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BluetoothRectangle: ImageVector
    get() {
        if (_BluetoothRectangle != null) {
            return _BluetoothRectangle!!
        }
        _BluetoothRectangle = ImageVector.Builder(
            name = "BluetoothRectangle",
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
                moveTo(8.59f, 15.56f)
                lineTo(15.21f, 9.49f)
                curveTo(15.49f, 9.24f, 15.48f, 8.84f, 15.19f, 8.6f)
                lineTo(13.13f, 6.88f)
                curveTo(12.59f, 6.43f, 12.16f, 6.64f, 12.16f, 7.34f)
                verticalLineTo(16.67f)
                curveTo(12.16f, 17.37f, 12.6f, 17.57f, 13.13f, 17.13f)
                lineTo(15.19f, 15.41f)
                curveTo(15.48f, 15.17f, 15.49f, 14.77f, 15.21f, 14.52f)
                lineTo(8.59f, 8.45f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 22f)
                horizontalLineTo(9f)
                curveTo(6f, 22f, 4f, 20f, 4f, 17f)
                verticalLineTo(7f)
                curveTo(4f, 4f, 6f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(18f, 2f, 20f, 4f, 20f, 7f)
                verticalLineTo(17f)
                curveTo(20f, 20f, 18f, 22f, 15f, 22f)
                close()
            }
        }.build()

        return _BluetoothRectangle!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothRectangle: ImageVector? = null
