package com.muralivitt.cmp.icons.vuesax.extra

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VuesaxExtra.SingleTick: ImageVector
    get() {
        if (_singleTick != null) {
            return _singleTick!!
        }
        _singleTick = ImageVector.Builder(
            name = "TickSvgrepoCom",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 25f,
            viewportHeight = 25f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 13f)
                lineTo(10.167f, 17.5f)
                lineTo(19.5f, 8.5f)
            }
        }.build()

        return _singleTick!!
    }

@Suppress("ObjectPropertyName")
private var _singleTick: ImageVector? = null
