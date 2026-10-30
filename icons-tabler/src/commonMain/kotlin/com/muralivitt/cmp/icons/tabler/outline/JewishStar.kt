package com.muralivitt.cmp.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TablerIconOutline.JewishStar: ImageVector
    get() {
        if (_JewishStar != null) {
            return _JewishStar!!
        }
        _JewishStar = ImageVector.Builder(
            name = "JewishStar",
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
                moveTo(12f, 2f)
                lineToRelative(3f, 5f)
                horizontalLineToRelative(6f)
                lineToRelative(-3f, 5f)
                lineToRelative(3f, 5f)
                horizontalLineToRelative(-6f)
                lineToRelative(-3f, 5f)
                lineToRelative(-3f, -5f)
                horizontalLineToRelative(-6f)
                lineToRelative(3f, -5f)
                lineToRelative(-3f, -5f)
                horizontalLineToRelative(6f)
                close()
            }
        }.build()

        return _JewishStar!!
    }

@Suppress("ObjectPropertyName")
private var _JewishStar: ImageVector? = null
