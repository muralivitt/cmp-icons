package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.ClipboardClose: ImageVector
    get() {
        if (_ClipboardClose != null) {
            return _ClipboardClose!!
        }
        _ClipboardClose = ImageVector.Builder(
            name = "ClipboardClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.999f, 16.16f)
                lineTo(10.039f, 12.2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.96f, 12.24f)
                lineTo(10f, 16.2f)
            }
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
                moveTo(16f, 4.02f)
                curveTo(19.33f, 4.2f, 21f, 5.43f, 21f, 10f)
                verticalLineTo(16f)
                curveTo(21f, 20f, 20f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(4f, 22f, 3f, 20f, 3f, 16f)
                verticalLineTo(10f)
                curveTo(3f, 5.44f, 4.67f, 4.2f, 8f, 4.02f)
            }
        }.build()

        return _ClipboardClose!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardClose: ImageVector? = null
