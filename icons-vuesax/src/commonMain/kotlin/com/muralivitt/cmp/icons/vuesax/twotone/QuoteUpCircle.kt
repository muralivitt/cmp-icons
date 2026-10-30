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

val VuesaxIconsTwotone.QuoteUpCircle: ImageVector
    get() {
        if (_QuoteUpCircle != null) {
            return _QuoteUpCircle!!
        }
        _QuoteUpCircle = ImageVector.Builder(
            name = "QuoteUpCircle",
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
                moveTo(16.999f, 11.84f)
                horizontalLineTo(14.319f)
                curveTo(13.609f, 11.84f, 13.129f, 11.3f, 13.129f, 10.65f)
                verticalLineTo(9.16f)
                curveTo(13.129f, 8.51f, 13.609f, 7.97f, 14.319f, 7.97f)
                horizontalLineTo(15.809f)
                curveTo(16.459f, 7.97f, 16.999f, 8.51f, 16.999f, 9.16f)
                verticalLineTo(11.84f)
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
                moveTo(17f, 11.84f)
                curveTo(17f, 14.63f, 16.48f, 15.1f, 14.91f, 16.03f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.86f, 11.84f)
                horizontalLineTo(8.18f)
                curveTo(7.47f, 11.84f, 6.99f, 11.3f, 6.99f, 10.65f)
                verticalLineTo(9.16f)
                curveTo(6.99f, 8.51f, 7.47f, 7.97f, 8.18f, 7.97f)
                horizontalLineTo(9.67f)
                curveTo(10.32f, 7.97f, 10.86f, 8.51f, 10.86f, 9.16f)
                verticalLineTo(11.84f)
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
                moveTo(10.859f, 11.84f)
                curveTo(10.859f, 14.63f, 10.34f, 15.1f, 8.77f, 16.03f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _QuoteUpCircle!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteUpCircle: ImageVector? = null
