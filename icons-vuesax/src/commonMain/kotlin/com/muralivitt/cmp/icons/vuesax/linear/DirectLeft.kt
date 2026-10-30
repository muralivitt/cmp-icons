package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DirectLeft: ImageVector
    get() {
        if (_DirectLeft != null) {
            return _DirectLeft!!
        }
        _DirectLeft = ImageVector.Builder(
            name = "DirectLeft",
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
                moveTo(4.71f, 9.17f)
                lineTo(16.3f, 3.07f)
                curveTo(19.05f, 1.62f, 22.04f, 4.55f, 20.65f, 7.33f)
                lineTo(19.03f, 10.57f)
                curveTo(18.58f, 11.47f, 18.58f, 12.53f, 19.03f, 13.43f)
                lineTo(20.65f, 16.67f)
                curveTo(22.04f, 19.45f, 19.05f, 22.37f, 16.3f, 20.93f)
                lineTo(4.71f, 14.83f)
                curveTo(2.43f, 13.63f, 2.43f, 10.37f, 4.71f, 9.17f)
                close()
            }
        }.build()

        return _DirectLeft!!
    }

@Suppress("ObjectPropertyName")
private var _DirectLeft: ImageVector? = null
