package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ReceiptEdit: ImageVector
    get() {
        if (_ReceiptEdit != null) {
            return _ReceiptEdit!!
        }
        _ReceiptEdit = ImageVector.Builder(
            name = "ReceiptEdit",
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
                moveTo(20.5f, 11.3f)
                verticalLineTo(7.04f)
                curveTo(20.5f, 3.01f, 19.56f, 2f, 15.78f, 2f)
                horizontalLineTo(8.22f)
                curveTo(4.44f, 2f, 3.5f, 3.01f, 3.5f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(3.5f, 20.96f, 4.96f, 21.59f, 6.73f, 19.69f)
                lineTo(6.74f, 19.68f)
                curveTo(7.56f, 18.81f, 8.81f, 18.88f, 9.52f, 19.83f)
                lineTo(10.53f, 21.18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 7f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 11f)
                horizontalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.211f, 14.77f)
                lineTo(14.671f, 18.31f)
                curveTo(14.531f, 18.45f, 14.401f, 18.71f, 14.371f, 18.9f)
                lineTo(14.181f, 20.25f)
                curveTo(14.111f, 20.74f, 14.451f, 21.08f, 14.941f, 21.01f)
                lineTo(16.291f, 20.82f)
                curveTo(16.481f, 20.79f, 16.751f, 20.66f, 16.881f, 20.52f)
                lineTo(20.421f, 16.98f)
                curveTo(21.031f, 16.37f, 21.321f, 15.66f, 20.421f, 14.76f)
                curveTo(19.531f, 13.87f, 18.821f, 14.16f, 18.211f, 14.77f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.699f, 15.28f)
                curveTo(17.999f, 16.36f, 18.839f, 17.2f, 19.919f, 17.5f)
            }
        }.build()

        return _ReceiptEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptEdit: ImageVector? = null
