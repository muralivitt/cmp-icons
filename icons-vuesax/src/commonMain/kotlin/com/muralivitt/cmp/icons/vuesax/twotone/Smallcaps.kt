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

val VuesaxIconsTwotone.Smallcaps: ImageVector
    get() {
        if (_Smallcaps != null) {
            return _Smallcaps!!
        }
        _Smallcaps = ImageVector.Builder(
            name = "Smallcaps",
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
                moveTo(1.99f, 5.93f)
                verticalLineTo(4.42f)
                curveTo(1.99f, 3.4f, 2.82f, 2.57f, 3.84f, 2.57f)
                horizontalLineTo(16.76f)
                curveTo(17.78f, 2.57f, 18.61f, 3.4f, 18.61f, 4.42f)
                verticalLineTo(5.93f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.301f, 18.1f)
                verticalLineTo(3.32f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.9f, 18.1f)
                horizontalLineTo(12.48f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.68f, 10.34f)
                horizontalLineTo(20.69f)
                curveTo(21.42f, 10.34f, 22.01f, 10.93f, 22.01f, 11.66f)
                verticalLineTo(12.46f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.08f, 21.43f)
                verticalLineTo(10.87f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.939f, 21.43f)
                horizontalLineTo(18.219f)
            }
        }.build()

        return _Smallcaps!!
    }

@Suppress("ObjectPropertyName")
private var _Smallcaps: ImageVector? = null
