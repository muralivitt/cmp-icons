package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ClipboardExport: ImageVector
    get() {
        if (_ClipboardExport != null) {
            return _ClipboardExport!!
        }
        _ClipboardExport = ImageVector.Builder(
            name = "ClipboardExport",
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
                moveTo(10f, 6f)
                horizontalLineTo(14f)
                curveTo(16f, 6f, 16f, 5f, 16f, 4f)
                curveTo(16f, 2f, 15f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                curveTo(9f, 2f, 8f, 2f, 8f, 4f)
                curveTo(8f, 6f, 9f, 6f, 10f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 22f)
                horizontalLineTo(9f)
                curveTo(4f, 22f, 3f, 20f, 3f, 16f)
                verticalLineTo(10f)
                curveTo(3f, 5.44f, 4.67f, 4.2f, 8f, 4.02f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 4.02f)
                curveTo(19.33f, 4.2f, 21f, 5.43f, 21f, 10f)
                verticalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 19f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 22f)
                lineTo(15.04f, 16.04f)
            }
        }.build()

        return _ClipboardExport!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardExport: ImageVector? = null
