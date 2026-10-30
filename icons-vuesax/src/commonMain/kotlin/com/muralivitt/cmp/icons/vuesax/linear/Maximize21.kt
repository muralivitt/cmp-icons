package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Maximize21: ImageVector
    get() {
        if (_Maximize21 != null) {
            return _Maximize21!!
        }
        _Maximize21 = ImageVector.Builder(
            name = "Maximize21",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                verticalLineTo(6.5f)
                curveTo(2f, 4.01f, 4.01f, 2f, 6.5f, 2f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                horizontalLineTo(17.5f)
                curveTo(19.99f, 2f, 22f, 4.01f, 22f, 6.5f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 16f)
                verticalLineTo(17.5f)
                curveTo(22f, 19.99f, 19.99f, 22f, 17.5f, 22f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                horizontalLineTo(6.5f)
                curveTo(4.01f, 22f, 2f, 19.99f, 2f, 17.5f)
                verticalLineTo(15f)
            }
        }.build()

        return _Maximize21!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize21: ImageVector? = null
