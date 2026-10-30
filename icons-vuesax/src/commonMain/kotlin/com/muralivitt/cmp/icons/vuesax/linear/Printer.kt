package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Printer: ImageVector
    get() {
        if (_Printer != null) {
            return _Printer!!
        }
        _Printer = ImageVector.Builder(
            name = "Printer",
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
                moveTo(16f, 15f)
                verticalLineTo(19f)
                curveTo(16f, 21f, 15f, 22f, 13f, 22f)
                horizontalLineTo(11f)
                curveTo(9f, 22f, 8f, 21f, 8f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 10f)
                verticalLineTo(15f)
                curveTo(21f, 17f, 20f, 18f, 18f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                curveTo(4f, 18f, 3f, 17f, 3f, 15f)
                verticalLineTo(10f)
                curveTo(3f, 8f, 4f, 7f, 6f, 7f)
                horizontalLineTo(18f)
                curveTo(20f, 7f, 21f, 8f, 21f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 15f)
                horizontalLineTo(15.79f)
                horizontalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 11f)
                horizontalLineTo(10f)
            }
        }.build()

        return _Printer!!
    }

@Suppress("ObjectPropertyName")
private var _Printer: ImageVector? = null
