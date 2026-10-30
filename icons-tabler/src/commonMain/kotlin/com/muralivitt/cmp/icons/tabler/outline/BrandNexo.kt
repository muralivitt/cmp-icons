package com.muralivitt.cmp.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TablerIconOutline.BrandNexo: ImageVector
    get() {
        if (_BrandNexo != null) {
            return _BrandNexo!!
        }
        _BrandNexo = ImageVector.Builder(
            name = "BrandNexo",
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
                moveTo(17f, 3f)
                lineToRelative(5f, 3f)
                verticalLineToRelative(12f)
                lineToRelative(-5f, 3f)
                lineToRelative(-10f, -6f)
                verticalLineToRelative(-6f)
                lineToRelative(10f, 6f)
                verticalLineToRelative(-6f)
                lineToRelative(-5f, -3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                lineToRelative(-5f, -3f)
                lineToRelative(-5f, 3f)
                verticalLineToRelative(12f)
                lineToRelative(5f, 3f)
                lineToRelative(4.7f, -3.13f)
            }
        }.build()

        return _BrandNexo!!
    }

@Suppress("ObjectPropertyName")
private var _BrandNexo: ImageVector? = null
