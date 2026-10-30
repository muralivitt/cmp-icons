package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Frame5: ImageVector
    get() {
        if (_Frame5 != null) {
            return _Frame5!!
        }
        _Frame5 = ImageVector.Builder(
            name = "Frame5",
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
                moveTo(19.26f, 18.9f)
                verticalLineTo(7.1f)
                curveTo(19.26f, 5.6f, 18.62f, 5f, 17.03f, 5f)
                horizontalLineTo(15.99f)
                curveTo(14.4f, 5f, 13.76f, 5.6f, 13.76f, 7.1f)
                verticalLineTo(18.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.26f, 18.9f)
                verticalLineTo(12.1f)
                curveTo(5.26f, 10.6f, 5.9f, 10f, 7.49f, 10f)
                horizontalLineTo(8.53f)
                curveTo(10.12f, 10f, 10.76f, 10.6f, 10.76f, 12.1f)
                verticalLineTo(18.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 19f)
                horizontalLineTo(22f)
            }
        }.build()

        return _Frame5!!
    }

@Suppress("ObjectPropertyName")
private var _Frame5: ImageVector? = null
