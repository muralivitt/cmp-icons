package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ArrowBottom: ImageVector
    get() {
        if (_ArrowBottom != null) {
            return _ArrowBottom!!
        }
        _ArrowBottom = ImageVector.Builder(
            name = "ArrowBottom",
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
                moveTo(12f, 6f)
                horizontalLineTo(14.67f)
                curveTo(17.98f, 6f, 19.34f, 8.35f, 17.68f, 11.22f)
                lineTo(16.34f, 13.53f)
                lineTo(15f, 15.84f)
                curveTo(13.34f, 18.71f, 10.63f, 18.71f, 8.97f, 15.84f)
                lineTo(7.63f, 13.53f)
                lineTo(6.29f, 11.22f)
                curveTo(4.66f, 8.35f, 6.01f, 6f, 9.33f, 6f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _ArrowBottom!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottom: ImageVector? = null
