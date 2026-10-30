package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DirectRight: ImageVector
    get() {
        if (_DirectRight != null) {
            return _DirectRight!!
        }
        _DirectRight = ImageVector.Builder(
            name = "DirectRight",
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
                moveTo(19.29f, 9.17f)
                lineTo(7.7f, 3.07f)
                curveTo(4.95f, 1.62f, 1.96f, 4.55f, 3.35f, 7.33f)
                lineTo(4.97f, 10.57f)
                curveTo(5.42f, 11.47f, 5.42f, 12.53f, 4.97f, 13.43f)
                lineTo(3.35f, 16.67f)
                curveTo(1.96f, 19.45f, 4.95f, 22.37f, 7.7f, 20.93f)
                lineTo(19.29f, 14.83f)
                curveTo(21.57f, 13.63f, 21.57f, 10.37f, 19.29f, 9.17f)
                close()
            }
        }.build()

        return _DirectRight!!
    }

@Suppress("ObjectPropertyName")
private var _DirectRight: ImageVector? = null
