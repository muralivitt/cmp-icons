package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BitcoinCard: ImageVector
    get() {
        if (_BitcoinCard != null) {
            return _BitcoinCard!!
        }
        _BitcoinCard = ImageVector.Builder(
            name = "BitcoinCard",
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
                moveTo(2f, 8.5f)
                horizontalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16.5f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 16.5f)
                horizontalLineTo(14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 11.33f)
                verticalLineTo(16.11f)
                curveTo(22f, 19.62f, 21.11f, 20.5f, 17.56f, 20.5f)
                horizontalLineTo(6.44f)
                curveTo(2.89f, 20.5f, 2f, 19.62f, 2f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(2f, 4.38f, 2.89f, 3.5f, 6.44f, 3.5f)
                horizontalLineTo(13.28f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 3.25f)
                horizontalLineTo(20.13f)
                curveTo(20.82f, 3.25f, 21.38f, 3.88f, 21.38f, 4.5f)
                curveTo(21.38f, 5.19f, 20.82f, 5.75f, 20.13f, 5.75f)
                horizontalLineTo(17f)
                verticalLineTo(3.25f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 5.75f)
                horizontalLineTo(20.57f)
                curveTo(21.36f, 5.75f, 22f, 6.31f, 22f, 7f)
                curveTo(22f, 7.69f, 21.36f, 8.25f, 20.57f, 8.25f)
                horizontalLineTo(17f)
                verticalLineTo(5.75f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.76f, 8.25f)
                verticalLineTo(9.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.76f, 2f)
                verticalLineTo(3.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.19f, 3.25f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.19f, 8.25f)
                horizontalLineTo(16f)
            }
        }.build()

        return _BitcoinCard!!
    }

@Suppress("ObjectPropertyName")
private var _BitcoinCard: ImageVector? = null
