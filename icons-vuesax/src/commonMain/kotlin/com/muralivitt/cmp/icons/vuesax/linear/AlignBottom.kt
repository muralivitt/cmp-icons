package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.AlignBottom: ImageVector
    get() {
        if (_AlignBottom != null) {
            return _AlignBottom!!
        }
        _AlignBottom = ImageVector.Builder(
            name = "AlignBottom",
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
                moveTo(19.26f, 5.1f)
                verticalLineTo(16.9f)
                curveTo(19.26f, 18.4f, 18.62f, 19f, 17.03f, 19f)
                horizontalLineTo(15.99f)
                curveTo(14.4f, 19f, 13.76f, 18.4f, 13.76f, 16.9f)
                verticalLineTo(5.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.26f, 5.1f)
                verticalLineTo(11.9f)
                curveTo(5.26f, 13.4f, 5.9f, 14f, 7.49f, 14f)
                horizontalLineTo(8.53f)
                curveTo(10.12f, 14f, 10.76f, 13.4f, 10.76f, 11.9f)
                verticalLineTo(5.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 5f)
                horizontalLineTo(22f)
            }
        }.build()

        return _AlignBottom!!
    }

@Suppress("ObjectPropertyName")
private var _AlignBottom: ImageVector? = null
