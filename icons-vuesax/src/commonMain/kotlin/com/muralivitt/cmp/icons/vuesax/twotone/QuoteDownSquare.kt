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

val VuesaxIconsTwotone.QuoteDownSquare: ImageVector
    get() {
        if (_QuoteDownSquare != null) {
            return _QuoteDownSquare!!
        }
        _QuoteDownSquare = ImageVector.Builder(
            name = "QuoteDownSquare",
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
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
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
                moveTo(7f, 12.16f)
                horizontalLineTo(9.68f)
                curveTo(10.39f, 12.16f, 10.87f, 12.7f, 10.87f, 13.35f)
                verticalLineTo(14.84f)
                curveTo(10.87f, 15.49f, 10.39f, 16.03f, 9.68f, 16.03f)
                horizontalLineTo(8.19f)
                curveTo(7.54f, 16.03f, 7f, 15.49f, 7f, 14.84f)
                verticalLineTo(12.16f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 12.16f)
                curveTo(7f, 9.37f, 7.52f, 8.9f, 9.09f, 7.97f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.141f, 12.16f)
                horizontalLineTo(15.821f)
                curveTo(16.531f, 12.16f, 17.011f, 12.7f, 17.011f, 13.35f)
                verticalLineTo(14.84f)
                curveTo(17.011f, 15.49f, 16.531f, 16.03f, 15.821f, 16.03f)
                horizontalLineTo(14.331f)
                curveTo(13.681f, 16.03f, 13.141f, 15.49f, 13.141f, 14.84f)
                verticalLineTo(12.16f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.141f, 12.16f)
                curveTo(13.141f, 9.37f, 13.661f, 8.9f, 15.231f, 7.97f)
            }
        }.build()

        return _QuoteDownSquare!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteDownSquare: ImageVector? = null
