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

val VuesaxIconsTwotone.Book1: ImageVector
    get() {
        if (_Book1 != null) {
            return _Book1!!
        }
        _Book1 = ImageVector.Builder(
            name = "Book1",
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
                moveTo(22f, 16.74f)
                verticalLineTo(4.67f)
                curveTo(22f, 3.47f, 21.02f, 2.58f, 19.83f, 2.68f)
                horizontalLineTo(19.77f)
                curveTo(17.67f, 2.86f, 14.48f, 3.93f, 12.7f, 5.05f)
                lineTo(12.53f, 5.16f)
                curveTo(12.24f, 5.34f, 11.76f, 5.34f, 11.47f, 5.16f)
                lineTo(11.22f, 5.01f)
                curveTo(9.44f, 3.9f, 6.26f, 2.84f, 4.16f, 2.67f)
                curveTo(2.97f, 2.57f, 2f, 3.47f, 2f, 4.66f)
                verticalLineTo(16.74f)
                curveTo(2f, 17.7f, 2.78f, 18.6f, 3.74f, 18.72f)
                lineTo(4.03f, 18.76f)
                curveTo(6.2f, 19.05f, 9.55f, 20.15f, 11.47f, 21.2f)
                lineTo(11.51f, 21.22f)
                curveTo(11.78f, 21.37f, 12.21f, 21.37f, 12.47f, 21.22f)
                curveTo(14.39f, 20.16f, 17.75f, 19.05f, 19.93f, 18.76f)
                lineTo(20.26f, 18.72f)
                curveTo(21.22f, 18.6f, 22f, 17.7f, 22f, 16.74f)
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
                moveTo(12f, 5.49f)
                verticalLineTo(20.49f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.75f, 8.49f)
                horizontalLineTo(5.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 11.49f)
                horizontalLineTo(5.5f)
            }
        }.build()

        return _Book1!!
    }

@Suppress("ObjectPropertyName")
private var _Book1: ImageVector? = null
