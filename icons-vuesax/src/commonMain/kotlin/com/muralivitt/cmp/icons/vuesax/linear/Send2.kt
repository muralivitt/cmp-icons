package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Send2: ImageVector
    get() {
        if (_Send2 != null) {
            return _Send2!!
        }
        _Send2 = ImageVector.Builder(
            name = "Send2",
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
                moveTo(7.4f, 6.32f)
                lineTo(15.89f, 3.49f)
                curveTo(19.7f, 2.22f, 21.77f, 4.3f, 20.51f, 8.11f)
                lineTo(17.68f, 16.6f)
                curveTo(15.78f, 22.31f, 12.66f, 22.31f, 10.76f, 16.6f)
                lineTo(9.92f, 14.08f)
                lineTo(7.4f, 13.24f)
                curveTo(1.69f, 11.34f, 1.69f, 8.23f, 7.4f, 6.32f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.11f, 13.65f)
                lineTo(13.69f, 10.06f)
            }
        }.build()

        return _Send2!!
    }

@Suppress("ObjectPropertyName")
private var _Send2: ImageVector? = null
