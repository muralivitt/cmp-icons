package com.muralivitt.cmp.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TablerIconOutline.ArrowBadgeLeft: ImageVector
    get() {
        if (_ArrowBadgeLeft != null) {
            return _ArrowBadgeLeft!!
        }
        _ArrowBadgeLeft = ImageVector.Builder(
            name = "ArrowBadgeLeft",
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
                moveTo(11f, 17f)
                horizontalLineToRelative(6f)
                lineToRelative(-4f, -5f)
                lineToRelative(4f, -5f)
                horizontalLineToRelative(-6f)
                lineToRelative(-4f, 5f)
                close()
            }
        }.build()

        return _ArrowBadgeLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBadgeLeft: ImageVector? = null
