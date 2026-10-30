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

val VuesaxIconsTwotone.Bag2: ImageVector
    get() {
        if (_Bag2 != null) {
            return _Bag2!!
        }
        _Bag2 = ImageVector.Builder(
            name = "Bag2",
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
                moveTo(7.5f, 7.67f)
                verticalLineTo(6.7f)
                curveTo(7.5f, 4.45f, 9.31f, 2.24f, 11.56f, 2.03f)
                curveTo(14.24f, 1.77f, 16.5f, 3.88f, 16.5f, 6.51f)
                verticalLineTo(7.89f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.001f, 22f)
                horizontalLineTo(15.001f)
                curveTo(19.021f, 22f, 19.741f, 20.39f, 19.951f, 18.43f)
                lineTo(20.701f, 12.43f)
                curveTo(20.971f, 9.99f, 20.271f, 8f, 16.001f, 8f)
                horizontalLineTo(8.001f)
                curveTo(3.731f, 8f, 3.031f, 9.99f, 3.301f, 12.43f)
                lineTo(4.051f, 18.43f)
                curveTo(4.261f, 20.39f, 4.981f, 22f, 9.001f, 22f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.495f, 12f)
                horizontalLineTo(15.503f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.495f, 12f)
                horizontalLineTo(8.503f)
            }
        }.build()

        return _Bag2!!
    }

@Suppress("ObjectPropertyName")
private var _Bag2: ImageVector? = null
