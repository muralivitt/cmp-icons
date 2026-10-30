package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Export: ImageVector
    get() {
        if (_Export != null) {
            return _Export!!
        }
        _Export = ImageVector.Builder(
            name = "Export",
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
                moveTo(16.44f, 8.9f)
                curveTo(20.04f, 9.21f, 21.51f, 11.06f, 21.51f, 15.11f)
                verticalLineTo(15.24f)
                curveTo(21.51f, 19.71f, 19.72f, 21.5f, 15.25f, 21.5f)
                horizontalLineTo(8.74f)
                curveTo(4.27f, 21.5f, 2.48f, 19.71f, 2.48f, 15.24f)
                verticalLineTo(15.11f)
                curveTo(2.48f, 11.09f, 3.93f, 9.24f, 7.47f, 8.91f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineTo(3.62f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.35f, 5.85f)
                lineTo(12f, 2.5f)
                lineTo(8.65f, 5.85f)
            }
        }.build()

        return _Export!!
    }

@Suppress("ObjectPropertyName")
private var _Export: ImageVector? = null
