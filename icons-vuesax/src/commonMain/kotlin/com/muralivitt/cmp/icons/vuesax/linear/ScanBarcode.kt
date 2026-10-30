package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.ScanBarcode: ImageVector
    get() {
        if (_ScanBarcode != null) {
            return _ScanBarcode!!
        }
        _ScanBarcode = ImageVector.Builder(
            name = "ScanBarcode",
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
                moveTo(2f, 9f)
                verticalLineTo(6.5f)
                curveTo(2f, 4.01f, 4.01f, 2f, 6.5f, 2f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                horizontalLineTo(17.5f)
                curveTo(19.99f, 2f, 22f, 4.01f, 22f, 6.5f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 16f)
                verticalLineTo(17.5f)
                curveTo(22f, 19.99f, 19.99f, 22f, 17.5f, 22f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                horizontalLineTo(6.5f)
                curveTo(4.01f, 22f, 2f, 19.99f, 2f, 17.5f)
                verticalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 7f)
                verticalLineTo(9f)
                curveTo(10.5f, 10f, 10f, 10.5f, 9f, 10.5f)
                horizontalLineTo(7f)
                curveTo(6f, 10.5f, 5.5f, 10f, 5.5f, 9f)
                verticalLineTo(7f)
                curveTo(5.5f, 6f, 6f, 5.5f, 7f, 5.5f)
                horizontalLineTo(9f)
                curveTo(10f, 5.5f, 10.5f, 6f, 10.5f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 7f)
                verticalLineTo(9f)
                curveTo(18.5f, 10f, 18f, 10.5f, 17f, 10.5f)
                horizontalLineTo(15f)
                curveTo(14f, 10.5f, 13.5f, 10f, 13.5f, 9f)
                verticalLineTo(7f)
                curveTo(13.5f, 6f, 14f, 5.5f, 15f, 5.5f)
                horizontalLineTo(17f)
                curveTo(18f, 5.5f, 18.5f, 6f, 18.5f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 15f)
                verticalLineTo(17f)
                curveTo(10.5f, 18f, 10f, 18.5f, 9f, 18.5f)
                horizontalLineTo(7f)
                curveTo(6f, 18.5f, 5.5f, 18f, 5.5f, 17f)
                verticalLineTo(15f)
                curveTo(5.5f, 14f, 6f, 13.5f, 7f, 13.5f)
                horizontalLineTo(9f)
                curveTo(10f, 13.5f, 10.5f, 14f, 10.5f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 15f)
                verticalLineTo(17f)
                curveTo(18.5f, 18f, 18f, 18.5f, 17f, 18.5f)
                horizontalLineTo(15f)
                curveTo(14f, 18.5f, 13.5f, 18f, 13.5f, 17f)
                verticalLineTo(15f)
                curveTo(13.5f, 14f, 14f, 13.5f, 15f, 13.5f)
                horizontalLineTo(17f)
                curveTo(18f, 13.5f, 18.5f, 14f, 18.5f, 15f)
                close()
            }
        }.build()

        return _ScanBarcode!!
    }

@Suppress("ObjectPropertyName")
private var _ScanBarcode: ImageVector? = null
