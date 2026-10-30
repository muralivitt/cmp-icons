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

val VuesaxIconsTwotone.Bill: ImageVector
    get() {
        if (_Bill != null) {
            return _Bill!!
        }
        _Bill = ImageVector.Builder(
            name = "Bill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(3.67f, 2.5f)
                verticalLineTo(14.47f)
                curveTo(3.67f, 15.45f, 4.13f, 16.38f, 4.92f, 16.97f)
                lineTo(10.13f, 20.87f)
                curveTo(11.24f, 21.7f, 12.77f, 21.7f, 13.88f, 20.87f)
                lineTo(19.09f, 16.97f)
                curveTo(19.88f, 16.38f, 20.34f, 15.45f, 20.34f, 14.47f)
                verticalLineTo(2.5f)
                horizontalLineTo(3.67f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(2f, 2.5f)
                horizontalLineTo(22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 8f)
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
                moveTo(8f, 13f)
                horizontalLineTo(16f)
            }
        }.build()

        return _Bill!!
    }

@Suppress("ObjectPropertyName")
private var _Bill: ImageVector? = null
