package com.muralivitt.cmp.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TablerIconOutline.ArrowBigLeftLine: ImageVector
    get() {
        if (_ArrowBigLeftLine != null) {
            return _ArrowBigLeftLine!!
        }
        _ArrowBigLeftLine = ImageVector.Builder(
            name = "ArrowBigLeftLine",
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
                moveTo(12f, 15f)
                verticalLineToRelative(3.586f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.707f, 0.707f)
                lineToRelative(-6.586f, -6.586f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
                lineToRelative(6.586f, -6.586f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.707f, 0.707f)
                verticalLineToRelative(3.586f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 15f)
                verticalLineToRelative(-6f)
            }
        }.build()

        return _ArrowBigLeftLine!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigLeftLine: ImageVector? = null
