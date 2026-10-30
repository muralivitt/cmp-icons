package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.LinkSquare: ImageVector
    get() {
        if (_LinkSquare != null) {
            return _LinkSquare!!
        }
        _LinkSquare = ImageVector.Builder(
            name = "LinkSquare",
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
                moveTo(8.18f, 16.02f)
                curveTo(7.42f, 15.95f, 6.67f, 15.6f, 6.09f, 14.99f)
                curveTo(4.77f, 13.6f, 4.77f, 11.32f, 6.09f, 9.93f)
                lineTo(8.28f, 7.63f)
                curveTo(9.6f, 6.24f, 11.77f, 6.24f, 13.1f, 7.63f)
                curveTo(14.42f, 9.02f, 14.42f, 11.3f, 13.1f, 12.69f)
                lineTo(12.01f, 13.84f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.82f, 7.98f)
                curveTo(16.58f, 8.05f, 17.33f, 8.4f, 17.91f, 9.01f)
                curveTo(19.23f, 10.4f, 19.23f, 12.68f, 17.91f, 14.07f)
                lineTo(15.72f, 16.37f)
                curveTo(14.4f, 17.76f, 12.23f, 17.76f, 10.9f, 16.37f)
                curveTo(9.58f, 14.98f, 9.58f, 12.7f, 10.9f, 11.31f)
                lineTo(11.99f, 10.16f)
            }
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
        }.build()

        return _LinkSquare!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSquare: ImageVector? = null
