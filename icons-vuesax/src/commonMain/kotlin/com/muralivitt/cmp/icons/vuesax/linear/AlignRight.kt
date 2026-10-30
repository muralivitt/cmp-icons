package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.AlignRight: ImageVector
    get() {
        if (_AlignRight != null) {
            return _AlignRight!!
        }
        _AlignRight = ImageVector.Builder(
            name = "AlignRight",
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
                moveTo(18.9f, 19.25f)
                horizontalLineTo(7.1f)
                curveTo(5.6f, 19.25f, 5f, 18.61f, 5f, 17.02f)
                verticalLineTo(15.98f)
                curveTo(5f, 14.39f, 5.6f, 13.75f, 7.1f, 13.75f)
                horizontalLineTo(18.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.9f, 5.25f)
                horizontalLineTo(12.1f)
                curveTo(10.6f, 5.25f, 10f, 5.89f, 10f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(10f, 10.11f, 10.6f, 10.75f, 12.1f, 10.75f)
                horizontalLineTo(18.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 1.99f)
                verticalLineTo(21.99f)
            }
        }.build()

        return _AlignRight!!
    }

@Suppress("ObjectPropertyName")
private var _AlignRight: ImageVector? = null
