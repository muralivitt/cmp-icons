package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.PercentageSquare: ImageVector
    get() {
        if (_PercentageSquare != null) {
            return _PercentageSquare!!
        }
        _PercentageSquare = ImageVector.Builder(
            name = "PercentageSquare",
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
                moveTo(9f, 2f)
                horizontalLineTo(15f)
                curveTo(20f, 2f, 22f, 4f, 22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 20f, 20f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(4f, 22f, 2f, 20f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 4f, 4f, 2f, 9f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.57f, 15.27f)
                lineTo(15.11f, 8.73f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.98f, 10.37f)
                curveTo(9.659f, 10.37f, 10.21f, 9.819f, 10.21f, 9.14f)
                curveTo(10.21f, 8.461f, 9.659f, 7.91f, 8.98f, 7.91f)
                curveTo(8.301f, 7.91f, 7.75f, 8.461f, 7.75f, 9.14f)
                curveTo(7.75f, 9.819f, 8.301f, 10.37f, 8.98f, 10.37f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.52f, 16.09f)
                curveTo(16.199f, 16.09f, 16.75f, 15.539f, 16.75f, 14.86f)
                curveTo(16.75f, 14.181f, 16.199f, 13.63f, 15.52f, 13.63f)
                curveTo(14.841f, 13.63f, 14.29f, 14.181f, 14.29f, 14.86f)
                curveTo(14.29f, 15.539f, 14.841f, 16.09f, 15.52f, 16.09f)
                close()
            }
        }.build()

        return _PercentageSquare!!
    }

@Suppress("ObjectPropertyName")
private var _PercentageSquare: ImageVector? = null
