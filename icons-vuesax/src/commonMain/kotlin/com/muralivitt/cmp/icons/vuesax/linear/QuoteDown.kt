package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.QuoteDown: ImageVector
    get() {
        if (_QuoteDown != null) {
            return _QuoteDown!!
        }
        _QuoteDown = ImageVector.Builder(
            name = "QuoteDown",
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
                moveTo(22f, 11.65f)
                horizontalLineTo(16.2f)
                curveTo(14.67f, 11.65f, 13.62f, 10.49f, 13.62f, 9.07f)
                verticalLineTo(5.85f)
                curveTo(13.62f, 4.43f, 14.67f, 3.27f, 16.2f, 3.27f)
                horizontalLineTo(19.42f)
                curveTo(20.84f, 3.27f, 22f, 4.43f, 22f, 5.85f)
                verticalLineTo(11.65f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 11.65f)
                curveTo(22f, 17.7f, 20.87f, 18.7f, 17.47f, 20.72f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.37f, 11.65f)
                horizontalLineTo(4.57f)
                curveTo(3.04f, 11.65f, 1.99f, 10.49f, 1.99f, 9.07f)
                verticalLineTo(5.85f)
                curveTo(1.99f, 4.43f, 3.04f, 3.27f, 4.57f, 3.27f)
                horizontalLineTo(7.8f)
                curveTo(9.22f, 3.27f, 10.38f, 4.43f, 10.38f, 5.85f)
                verticalLineTo(11.65f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.37f, 11.65f)
                curveTo(10.37f, 17.7f, 9.24f, 18.7f, 5.84f, 20.72f)
            }
        }.build()

        return _QuoteDown!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteDown: ImageVector? = null
