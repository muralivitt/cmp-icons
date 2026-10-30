package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Mouse: ImageVector
    get() {
        if (_Mouse != null) {
            return _Mouse!!
        }
        _Mouse = ImageVector.Builder(
            name = "Mouse",
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
                moveTo(12f, 22f)
                curveTo(16.13f, 22f, 19.5f, 18.63f, 19.5f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(19.5f, 5.37f, 16.13f, 2f, 12f, 2f)
                curveTo(7.87f, 2f, 4.5f, 5.37f, 4.5f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(4.5f, 18.63f, 7.87f, 22f, 12f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11f)
                curveTo(11.17f, 11f, 10.5f, 10.33f, 10.5f, 9.5f)
                verticalLineTo(7.5f)
                curveTo(10.5f, 6.67f, 11.17f, 6f, 12f, 6f)
                curveTo(12.82f, 6f, 13.5f, 6.67f, 13.5f, 7.5f)
                verticalLineTo(9.5f)
                curveTo(13.5f, 10.33f, 12.82f, 11f, 12f, 11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                verticalLineTo(2f)
            }
        }.build()

        return _Mouse!!
    }

@Suppress("ObjectPropertyName")
private var _Mouse: ImageVector? = null
