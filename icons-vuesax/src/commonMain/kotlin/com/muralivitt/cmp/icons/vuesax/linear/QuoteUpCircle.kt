package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.QuoteUpCircle: ImageVector
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 11.84f)
                horizontalLineTo(14.32f)
                curveTo(13.61f, 11.84f, 13.13f, 11.3f, 13.13f, 10.65f)
                verticalLineTo(9.16f)
                curveTo(13.13f, 8.51f, 13.61f, 7.97f, 14.32f, 7.97f)
                horizontalLineTo(15.81f)
                curveTo(16.46f, 7.97f, 17f, 8.51f, 17f, 9.16f)
                verticalLineTo(11.84f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 11.84f)
                curveTo(17f, 14.63f, 16.48f, 15.1f, 14.91f, 16.03f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.86f, 11.84f)
                curveTo(10.86f, 14.63f, 10.34f, 15.1f, 8.77f, 16.03f)
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
