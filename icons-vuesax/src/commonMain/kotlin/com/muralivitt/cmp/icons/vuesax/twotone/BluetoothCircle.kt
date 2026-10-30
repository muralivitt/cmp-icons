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

val VuesaxIconsTwotone.BluetoothCircle: ImageVector
    get() {
        if (_BluetoothCircle != null) {
            return _BluetoothCircle!!
        }
        _BluetoothCircle = ImageVector.Builder(
            name = "BluetoothCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _BluetoothCircle!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothCircle: ImageVector? = null
