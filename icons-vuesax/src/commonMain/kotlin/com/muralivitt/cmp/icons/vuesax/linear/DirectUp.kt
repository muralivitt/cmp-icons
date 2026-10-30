package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DirectUp: ImageVector
    get() {
        if (_DirectUp != null) {
            return _DirectUp!!
        }
        _DirectUp = ImageVector.Builder(
            name = "DirectUp",
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
                moveTo(9.17f, 4.71f)
                lineTo(3.07f, 16.3f)
                curveTo(1.62f, 19.05f, 4.55f, 22.04f, 7.33f, 20.65f)
                lineTo(10.57f, 19.03f)
                curveTo(11.47f, 18.58f, 12.53f, 18.58f, 13.43f, 19.03f)
                lineTo(16.67f, 20.65f)
                curveTo(19.45f, 22.04f, 22.37f, 19.05f, 20.93f, 16.3f)
                lineTo(14.83f, 4.71f)
                curveTo(13.63f, 2.43f, 10.37f, 2.43f, 9.17f, 4.71f)
                close()
            }
        }.build()

        return _DirectUp!!
    }

@Suppress("ObjectPropertyName")
private var _DirectUp: ImageVector? = null
