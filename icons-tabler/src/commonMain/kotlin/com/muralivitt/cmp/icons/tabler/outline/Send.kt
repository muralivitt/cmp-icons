package com.muralivitt.cmp.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TablerIconOutline.Send: ImageVector
    get() {
        if (_Send != null) {
            return _Send!!
        }
        _Send = ImageVector.Builder(
            name = "Send",
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
                moveTo(10f, 14f)
                lineToRelative(11f, -11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 3f)
                lineToRelative(-6.5f, 18f)
                arcToRelative(0.55f, 0.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 0f)
                lineToRelative(-3.5f, -7f)
                lineToRelative(-7f, -3.5f)
                arcToRelative(0.55f, 0.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1f)
                lineToRelative(18f, -6.5f)
            }
        }.build()

        return _Send!!
    }

@Suppress("ObjectPropertyName")
private var _Send: ImageVector? = null
