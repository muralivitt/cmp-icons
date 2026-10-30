package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.PrinterSlash: ImageVector
    get() {
        if (_PrinterSlash != null) {
            return _PrinterSlash!!
        }
        _PrinterSlash = ImageVector.Builder(
            name = "PrinterSlash",
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
                moveTo(7.25f, 7f)
                horizontalLineTo(16.75f)
                verticalLineTo(5f)
                curveTo(16.75f, 3f, 16f, 2f, 13.75f, 2f)
                horizontalLineTo(10.25f)
                curveTo(8f, 2f, 7.25f, 3f, 7.25f, 5f)
                verticalLineTo(7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.97f, 15f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                curveTo(16f, 21f, 15f, 22f, 13f, 22f)
                horizontalLineTo(11f)
                curveTo(9.31f, 22f, 8.33f, 21.29f, 8.07f, 19.86f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 18f)
                curveTo(4f, 18f, 3f, 17f, 3f, 15f)
                verticalLineTo(10f)
                curveTo(3f, 8f, 4f, 7f, 6f, 7f)
                horizontalLineTo(16.59f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.97f, 7.52f)
                curveTo(20.66f, 8f, 21f, 8.83f, 21f, 10f)
                verticalLineTo(15f)
                curveTo(21f, 17f, 20f, 18f, 18f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 15f)
                horizontalLineTo(15.79f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 11f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
        }.build()

        return _PrinterSlash!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterSlash: ImageVector? = null
