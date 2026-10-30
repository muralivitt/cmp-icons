package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ArrowUp3: ImageVector
    get() {
        if (_ArrowUp3 != null) {
            return _ArrowUp3!!
        }
        _ArrowUp3 = ImageVector.Builder(
            name = "ArrowUp3",
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
                moveTo(12f, 18f)
                horizontalLineTo(9.33f)
                curveTo(6.02f, 18f, 4.66f, 15.65f, 6.32f, 12.78f)
                lineTo(7.66f, 10.47f)
                lineTo(9f, 8.16f)
                curveTo(10.66f, 5.29f, 13.37f, 5.29f, 15.03f, 8.16f)
                lineTo(16.37f, 10.47f)
                lineTo(17.71f, 12.78f)
                curveTo(19.37f, 15.65f, 18.01f, 18f, 14.7f, 18f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _ArrowUp3!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUp3: ImageVector? = null
