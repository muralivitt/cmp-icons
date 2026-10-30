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

val VuesaxIconsTwotone.BitcoinRefresh: ImageVector
    get() {
        if (_BitcoinRefresh != null) {
            return _BitcoinRefresh!!
        }
        _BitcoinRefresh = ImageVector.Builder(
            name = "BitcoinRefresh",
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
                moveTo(4.47f, 11.42f)
                lineTo(2.73f, 9.68f)
                lineTo(1f, 11.42f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.529f, 12.58f)
                lineTo(21.269f, 14.32f)
                lineTo(23.009f, 12.58f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.26f, 14.32f)
                verticalLineTo(12f)
                curveTo(21.26f, 6.88f, 17.11f, 2.74f, 12f, 2.74f)
                curveTo(9.08f, 2.74f, 6.47f, 4.1f, 4.77f, 6.21f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.74f, 9.68f)
                verticalLineTo(12f)
                curveTo(2.74f, 17.12f, 6.89f, 21.26f, 12f, 21.26f)
                curveTo(14.92f, 21.26f, 17.53f, 19.9f, 19.23f, 17.79f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8.5f)
                horizontalLineTo(13.38f)
                curveTo(14.35f, 8.5f, 15.13f, 9.38f, 15.13f, 10.25f)
                curveTo(15.13f, 11.22f, 14.35f, 12f, 13.38f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(8.5f)
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
                moveTo(9f, 12f)
                horizontalLineTo(14f)
                curveTo(15.1f, 12f, 16f, 12.78f, 16f, 13.75f)
                curveTo(16f, 14.72f, 15.1f, 15.5f, 14f, 15.5f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
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
                moveTo(11.801f, 15.5f)
                verticalLineTo(17.25f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.801f, 6.75f)
                verticalLineTo(8.5f)
            }
        }.build()

        return _BitcoinRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _BitcoinRefresh: ImageVector? = null
