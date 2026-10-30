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

val VuesaxIconsTwotone.QuoteDown: ImageVector
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
                moveTo(21.999f, 11.65f)
                horizontalLineTo(16.199f)
                curveTo(14.669f, 11.65f, 13.619f, 10.49f, 13.619f, 9.07f)
                verticalLineTo(5.85f)
                curveTo(13.619f, 4.43f, 14.669f, 3.27f, 16.199f, 3.27f)
                horizontalLineTo(19.419f)
                curveTo(20.839f, 3.27f, 21.999f, 4.43f, 21.999f, 5.85f)
                verticalLineTo(11.65f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.999f, 11.65f)
                curveTo(21.999f, 17.7f, 20.869f, 18.7f, 17.469f, 20.72f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
