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

val VuesaxIconsTwotone.Personalcard: ImageVector
    get() {
        if (_Personalcard != null) {
            return _Personalcard!!
        }
        _Personalcard = ImageVector.Builder(
            name = "Personalcard",
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
                moveTo(17f, 21f)
                horizontalLineTo(7f)
                curveTo(3f, 21f, 2f, 20f, 2f, 16f)
                verticalLineTo(8f)
                curveTo(2f, 4f, 3f, 3f, 7f, 3f)
                horizontalLineTo(17f)
                curveTo(21f, 3f, 22f, 4f, 22f, 8f)
                verticalLineTo(16f)
                curveTo(22f, 20f, 21f, 21f, 17f, 21f)
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
                moveTo(14f, 8f)
                horizontalLineTo(19f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                horizontalLineTo(19f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16f)
                horizontalLineTo(19f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 11.29f)
                curveTo(9.5f, 11.29f, 10.31f, 10.48f, 10.31f, 9.48f)
                curveTo(10.31f, 8.48f, 9.5f, 7.67f, 8.5f, 7.67f)
                curveTo(7.501f, 7.67f, 6.69f, 8.48f, 6.69f, 9.48f)
                curveTo(6.69f, 10.48f, 7.501f, 11.29f, 8.5f, 11.29f)
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
                moveTo(12f, 16.33f)
                curveTo(11.86f, 14.88f, 10.71f, 13.74f, 9.26f, 13.61f)
                curveTo(8.76f, 13.56f, 8.25f, 13.56f, 7.74f, 13.61f)
                curveTo(6.29f, 13.75f, 5.14f, 14.88f, 5f, 16.33f)
            }
        }.build()

        return _Personalcard!!
    }

@Suppress("ObjectPropertyName")
private var _Personalcard: ImageVector? = null
