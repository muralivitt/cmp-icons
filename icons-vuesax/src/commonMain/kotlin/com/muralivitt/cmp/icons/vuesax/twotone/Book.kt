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

val VuesaxIconsTwotone.Book: ImageVector
    get() {
        if (_Book != null) {
            return _Book!!
        }
        _Book = ImageVector.Builder(
            name = "Book",
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
                moveTo(3.5f, 18f)
                verticalLineTo(7f)
                curveTo(3.5f, 3f, 4.5f, 2f, 8.5f, 2f)
                horizontalLineTo(15.5f)
                curveTo(19.5f, 2f, 20.5f, 3f, 20.5f, 7f)
                verticalLineTo(17f)
                curveTo(20.5f, 17.14f, 20.5f, 17.28f, 20.49f, 17.42f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.35f, 15f)
                horizontalLineTo(20.5f)
                verticalLineTo(18.5f)
                curveTo(20.5f, 20.43f, 18.93f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(5.07f, 22f, 3.5f, 20.43f, 3.5f, 18.5f)
                verticalLineTo(17.85f)
                curveTo(3.5f, 16.28f, 4.78f, 15f, 6.35f, 15f)
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
                moveTo(8f, 7f)
                horizontalLineTo(16f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 10.5f)
                horizontalLineTo(13f)
            }
        }.build()

        return _Book!!
    }

@Suppress("ObjectPropertyName")
private var _Book: ImageVector? = null
