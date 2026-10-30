package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Stickynote: ImageVector
    get() {
        if (_Stickynote != null) {
            return _Stickynote!!
        }
        _Stickynote = ImageVector.Builder(
            name = "Stickynote",
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
                moveTo(8f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 11f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 15f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 22f)
                horizontalLineTo(9f)
                curveTo(4f, 22f, 3f, 19.94f, 3f, 15.82f)
                verticalLineTo(9.65f)
                curveTo(3f, 4.95f, 4.67f, 3.69f, 8f, 3.5f)
                horizontalLineTo(16f)
                curveTo(19.33f, 3.68f, 21f, 4.95f, 21f, 9.65f)
                verticalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 16f)
                lineTo(15f, 22f)
                verticalLineTo(19f)
                curveTo(15f, 17f, 16f, 16f, 18f, 16f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _Stickynote!!
    }

@Suppress("ObjectPropertyName")
private var _Stickynote: ImageVector? = null
