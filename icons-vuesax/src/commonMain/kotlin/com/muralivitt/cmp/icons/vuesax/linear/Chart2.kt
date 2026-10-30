package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Chart2: ImageVector
    get() {
        if (_Chart2 != null) {
            return _Chart2!!
        }
        _Chart2 = ImageVector.Builder(
            name = "Chart2",
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
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 18.5f)
                curveTo(16.6f, 18.5f, 17.5f, 17.6f, 17.5f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(17.5f, 6.4f, 16.6f, 5.5f, 15.5f, 5.5f)
                curveTo(14.4f, 5.5f, 13.5f, 6.4f, 13.5f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(13.5f, 17.6f, 14.39f, 18.5f, 15.5f, 18.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 18.5f)
                curveTo(9.6f, 18.5f, 10.5f, 17.6f, 10.5f, 16.5f)
                verticalLineTo(13f)
                curveTo(10.5f, 11.9f, 9.6f, 11f, 8.5f, 11f)
                curveTo(7.4f, 11f, 6.5f, 11.9f, 6.5f, 13f)
                verticalLineTo(16.5f)
                curveTo(6.5f, 17.6f, 7.39f, 18.5f, 8.5f, 18.5f)
                close()
            }
        }.build()

        return _Chart2!!
    }

@Suppress("ObjectPropertyName")
private var _Chart2: ImageVector? = null
