package com.muralivitt.cmp.icons.vuesax.extra

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VuesaxExtra.QrCodeScan: ImageVector
    get() {
        if (_QrCodeScan != null) {
            return _QrCodeScan!!
        }
        _QrCodeScan = ImageVector.Builder(
            name = "QrCodeScanSvgrepoCom",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                strokeLineWidth = 2f
            ) {
                moveTo(13f, 11f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(7f, 13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineTo(13f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 11f)
                lineTo(13f, 7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(17f, 17f)
                lineTo(17f, 15f)
                lineTo(15f, 15f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                lineTo(11f, 13f)
                close()
                moveTo(7f, 7f)
                lineTo(7f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 8f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 21f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 3f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                verticalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 16f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(8f)
            }
        }.build()

        return _QrCodeScan!!
    }

@Suppress("ObjectPropertyName")
private var _QrCodeScan: ImageVector? = null
