package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Calculator: ImageVector
    get() {
        if (_Calculator != null) {
            return _Calculator!!
        }
        _Calculator = ImageVector.Builder(
            name = "Calculator",
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
                moveTo(10f, 22f)
                horizontalLineTo(14f)
                curveTo(19f, 22f, 21f, 20f, 21f, 15f)
                verticalLineTo(9f)
                curveTo(21f, 4f, 19f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                curveTo(5f, 2f, 3f, 4f, 3f, 9f)
                verticalLineTo(15f)
                curveTo(3f, 20f, 5f, 22f, 10f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 7.58f)
                verticalLineTo(8.58f)
                curveTo(16.5f, 9.4f, 15.83f, 10.08f, 15f, 10.08f)
                horizontalLineTo(9f)
                curveTo(8.18f, 10.08f, 7.5f, 9.41f, 7.5f, 8.58f)
                verticalLineTo(7.58f)
                curveTo(7.5f, 6.76f, 8.17f, 6.08f, 9f, 6.08f)
                horizontalLineTo(15f)
                curveTo(15.83f, 6.08f, 16.5f, 6.75f, 16.5f, 7.58f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.136f, 14f)
                horizontalLineTo(8.148f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.995f, 14f)
                horizontalLineTo(12.007f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.854f, 14f)
                horizontalLineTo(15.866f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.136f, 17.5f)
                horizontalLineTo(8.148f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.995f, 17.5f)
                horizontalLineTo(12.007f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.854f, 17.5f)
                horizontalLineTo(15.866f)
            }
        }.build()

        return _Calculator!!
    }

@Suppress("ObjectPropertyName")
private var _Calculator: ImageVector? = null
