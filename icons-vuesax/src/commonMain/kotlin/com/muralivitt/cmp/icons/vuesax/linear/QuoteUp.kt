package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.QuoteUp: ImageVector
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
                stroke = SolidColor(Color(0xFF292D32)),
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
                stroke = SolidColor(Color(0xFF292D32)),
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
                moveTo(13.63f, 12.35f)
                horizontalLineTo(19.43f)
                curveTo(20.96f, 12.35f, 22.01f, 13.51f, 22.01f, 14.93f)
                verticalLineTo(18.15f)
                curveTo(22.01f, 19.57f, 20.96f, 20.73f, 19.43f, 20.73f)
                horizontalLineTo(16.21f)
                curveTo(14.79f, 20.73f, 13.63f, 19.57f, 13.63f, 18.15f)
                verticalLineTo(12.35f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.63f, 12.35f)
                curveTo(13.63f, 6.3f, 14.76f, 5.3f, 18.16f, 3.28f)
            }
        }.build()

        return _QuoteUp!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteUp: ImageVector? = null
