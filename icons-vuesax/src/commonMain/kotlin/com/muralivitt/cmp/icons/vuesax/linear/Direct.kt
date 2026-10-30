package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Direct: ImageVector
    get() {
        if (_Direct != null) {
            return _Direct!!
        }
        _Direct = ImageVector.Builder(
            name = "Direct",
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
                moveTo(2f, 13f)
                horizontalLineTo(5.76f)
                curveTo(6.52f, 13f, 7.21f, 13.43f, 7.55f, 14.11f)
                lineTo(8.44f, 15.9f)
                curveTo(9f, 17f, 10f, 17f, 10.24f, 17f)
                horizontalLineTo(13.77f)
                curveTo(14.53f, 17f, 15.22f, 16.57f, 15.56f, 15.89f)
                lineTo(16.45f, 14.1f)
                curveTo(16.79f, 13.42f, 17.48f, 12.99f, 18.24f, 12.99f)
                horizontalLineTo(21.98f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.34f, 7f)
                horizontalLineTo(13.67f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 10f)
                horizontalLineTo(14.5f)
            }
        }.build()

        return _Direct!!
    }

@Suppress("ObjectPropertyName")
private var _Direct: ImageVector? = null
