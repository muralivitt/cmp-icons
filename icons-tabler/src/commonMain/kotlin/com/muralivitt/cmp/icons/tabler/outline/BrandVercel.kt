package com.muralivitt.cmp.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TablerIconOutline.BrandVercel: ImageVector
    get() {
        if (_BrandVercel != null) {
            return _BrandVercel!!
        }
        _BrandVercel = ImageVector.Builder(
            name = "BrandVercel",
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
                moveTo(3f, 19f)
                horizontalLineToRelative(18f)
                lineToRelative(-9f, -15f)
                close()
            }
        }.build()

        return _BrandVercel!!
    }

@Suppress("ObjectPropertyName")
private var _BrandVercel: ImageVector? = null
