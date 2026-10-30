package com.muralivitt.cmp.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TablerIconOutline.TickSvgrepoCom: ImageVector
    get() {
        if (_TickSvgrepoCom != null) {
            return _TickSvgrepoCom!!
        }
        _TickSvgrepoCom = ImageVector.Builder(
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

        return _TickSvgrepoCom!!
    }

@Suppress("ObjectPropertyName")
private var _TickSvgrepoCom: ImageVector? = null
