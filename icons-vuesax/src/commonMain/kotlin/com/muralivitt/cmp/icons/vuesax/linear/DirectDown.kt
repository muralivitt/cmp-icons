package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DirectDown: ImageVector
    get() {
        if (_DirectDown != null) {
            return _DirectDown!!
        }
        _DirectDown = ImageVector.Builder(
            name = "DirectDown",
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
                moveTo(9.17f, 19.29f)
                lineTo(3.07f, 7.7f)
                curveTo(1.62f, 4.95f, 4.55f, 1.96f, 7.33f, 3.35f)
                lineTo(10.57f, 4.97f)
                curveTo(11.47f, 5.42f, 12.53f, 5.42f, 13.43f, 4.97f)
                lineTo(16.67f, 3.35f)
                curveTo(19.45f, 1.96f, 22.37f, 4.95f, 20.93f, 7.7f)
                lineTo(14.83f, 19.29f)
                curveTo(13.63f, 21.57f, 10.37f, 21.57f, 9.17f, 19.29f)
                close()
            }
        }.build()

        return _DirectDown!!
    }

@Suppress("ObjectPropertyName")
private var _DirectDown: ImageVector? = null
