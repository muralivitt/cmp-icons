package com.muralivitt.cmp.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TablerIconOutline.ArrowForward: ImageVector
    get() {
        if (_ArrowForward != null) {
            return _ArrowForward!!
        }
        _ArrowForward = ImageVector.Builder(
            name = "ArrowForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 11f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
                moveToRelative(4f, -4f)
                horizontalLineToRelative(-11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                horizontalLineToRelative(1f)
            }
        }.build()

        return _ArrowForward!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowForward: ImageVector? = null
