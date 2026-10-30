package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Unlimited: ImageVector
    get() {
        if (_Unlimited != null) {
            return _Unlimited!!
        }
        _Unlimited = ImageVector.Builder(
            name = "Unlimited",
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
                moveTo(10.18f, 9.32f)
                curveTo(9.36f, 8.19f, 8.05f, 7.45f, 6.54f, 7.45f)
                curveTo(4.03f, 7.45f, 1.99f, 9.49f, 1.99f, 12f)
                curveTo(1.99f, 14.51f, 4.03f, 16.55f, 6.54f, 16.55f)
                curveTo(8.23f, 16.55f, 9.8f, 15.66f, 10.67f, 14.21f)
                lineTo(12f, 12f)
                lineTo(13.32f, 9.79f)
                curveTo(14.19f, 8.34f, 15.76f, 7.45f, 17.45f, 7.45f)
                curveTo(19.96f, 7.45f, 22f, 9.49f, 22f, 12f)
                curveTo(22f, 14.51f, 19.96f, 16.55f, 17.45f, 16.55f)
                curveTo(15.95f, 16.55f, 14.64f, 15.81f, 13.81f, 14.68f)
            }
        }.build()

        return _Unlimited!!
    }

@Suppress("ObjectPropertyName")
private var _Unlimited: ImageVector? = null
