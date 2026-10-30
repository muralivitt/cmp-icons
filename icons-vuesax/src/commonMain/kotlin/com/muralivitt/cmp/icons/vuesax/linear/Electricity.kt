package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Electricity: ImageVector
    get() {
        if (_Electricity != null) {
            return _Electricity!!
        }
        _Electricity = ImageVector.Builder(
            name = "Electricity",
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
                moveTo(10.5f, 16f)
                horizontalLineTo(13.5f)
                curveTo(16f, 16f, 17.5f, 14.2f, 17.5f, 12f)
                verticalLineTo(6.91f)
                curveTo(17.5f, 5.86f, 16.64f, 5f, 15.59f, 5f)
                horizontalLineTo(8.42f)
                curveTo(7.37f, 5f, 6.51f, 5.86f, 6.51f, 6.91f)
                verticalLineTo(12f)
                curveTo(6.5f, 14.2f, 8f, 16f, 10.5f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineTo(16f)
            }
        }.build()

        return _Electricity!!
    }

@Suppress("ObjectPropertyName")
private var _Electricity: ImageVector? = null
