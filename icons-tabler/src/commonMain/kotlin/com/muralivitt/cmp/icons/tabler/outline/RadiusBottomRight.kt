package com.muralivitt.cmp.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TablerIconOutline.RadiusBottomRight: ImageVector
    get() {
        if (_RadiusBottomRight != null) {
            return _RadiusBottomRight!!
        }
        _RadiusBottomRight = ImageVector.Builder(
            name = "RadiusBottomRight",
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
                moveTo(19f, 5f)
                verticalLineToRelative(6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineToRelative(-6f)
            }
        }.build()

        return _RadiusBottomRight!!
    }

@Suppress("ObjectPropertyName")
private var _RadiusBottomRight: ImageVector? = null
