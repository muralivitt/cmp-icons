package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Bluetooth: ImageVector
    get() {
        if (_Bluetooth != null) {
            return _Bluetooth!!
        }
        _Bluetooth = ImageVector.Builder(
            name = "Bluetooth",
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
                moveTo(5.64f, 18.64f)
                lineTo(17.99f, 7.32f)
                curveTo(18.5f, 6.85f, 18.49f, 6.1f, 17.95f, 5.65f)
                lineTo(14.1f, 2.44f)
                curveTo(13.1f, 1.61f, 12.28f, 1.99f, 12.28f, 3.29f)
                verticalLineTo(20.71f)
                curveTo(12.28f, 22.01f, 13.1f, 22.39f, 14.1f, 21.56f)
                lineTo(17.95f, 18.35f)
                curveTo(18.49f, 17.9f, 18.5f, 17.15f, 17.99f, 16.68f)
                lineTo(5.64f, 5.36f)
            }
        }.build()

        return _Bluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _Bluetooth: ImageVector? = null
