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

val VuesaxIconsTwotone.ReceiptAdd: ImageVector
    get() {
        if (_ReceiptAdd != null) {
            return _ReceiptAdd!!
        }
        _ReceiptAdd = ImageVector.Builder(
            name = "ReceiptAdd",
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
                moveTo(22f, 6f)
                verticalLineTo(8.42f)
                curveTo(22f, 10f, 21f, 11f, 19.42f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(4.01f)
                curveTo(16f, 2.9f, 16.91f, 2f, 18.02f, 2f)
                curveTo(19.11f, 2.01f, 20.11f, 2.45f, 20.83f, 3.17f)
                curveTo(21.55f, 3.9f, 22f, 4.9f, 22f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 7f)
                verticalLineTo(21f)
                curveTo(2f, 21.83f, 2.94f, 22.3f, 3.6f, 21.8f)
                lineTo(5.31f, 20.52f)
                curveTo(5.71f, 20.22f, 6.27f, 20.26f, 6.63f, 20.62f)
                lineTo(8.29f, 22.29f)
                curveTo(8.68f, 22.68f, 9.32f, 22.68f, 9.71f, 22.29f)
                lineTo(11.39f, 20.61f)
                curveTo(11.74f, 20.26f, 12.3f, 20.22f, 12.69f, 20.52f)
                lineTo(14.4f, 21.8f)
                curveTo(15.06f, 22.29f, 16f, 21.82f, 16f, 21f)
                verticalLineTo(4f)
                curveTo(16f, 2.9f, 16.9f, 2f, 18f, 2f)
                horizontalLineTo(7f)
                horizontalLineTo(6f)
                curveTo(3f, 2f, 2f, 3.79f, 2f, 6f)
                verticalLineTo(7f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.25f, 10f)
                horizontalLineTo(11.75f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12.75f)
                verticalLineTo(7.25f)
            }
        }.build()

        return _ReceiptAdd!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptAdd: ImageVector? = null
