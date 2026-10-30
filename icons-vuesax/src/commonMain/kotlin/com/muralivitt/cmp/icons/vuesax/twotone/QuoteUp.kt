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

val VuesaxIconsTwotone.QuoteUp: ImageVector
    get() {
        if (_QuoteUp != null) {
            return _QuoteUp!!
        }
        _QuoteUp = ImageVector.Builder(
            name = "QuoteUp",
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
                moveTo(2f, 12.35f)
                horizontalLineTo(7.8f)
                curveTo(9.33f, 12.35f, 10.38f, 13.51f, 10.38f, 14.93f)
                verticalLineTo(18.15f)
                curveTo(10.38f, 19.57f, 9.33f, 20.73f, 7.8f, 20.73f)
                horizontalLineTo(4.58f)
                curveTo(3.16f, 20.73f, 2f, 19.57f, 2f, 18.15f)
                verticalLineTo(12.35f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12.35f)
                curveTo(2f, 6.3f, 3.13f, 5.3f, 6.53f, 3.28f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.631f, 12.35f)
                horizontalLineTo(19.431f)
                curveTo(20.961f, 12.35f, 22.011f, 13.51f, 22.011f, 14.93f)
                verticalLineTo(18.15f)
                curveTo(22.011f, 19.57f, 20.961f, 20.73f, 19.431f, 20.73f)
                horizontalLineTo(16.211f)
                curveTo(14.791f, 20.73f, 13.631f, 19.57f, 13.631f, 18.15f)
                verticalLineTo(12.35f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.631f, 12.35f)
                curveTo(13.631f, 6.3f, 14.761f, 5.3f, 18.161f, 3.28f)
            }
        }.build()

        return _QuoteUp!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteUp: ImageVector? = null
