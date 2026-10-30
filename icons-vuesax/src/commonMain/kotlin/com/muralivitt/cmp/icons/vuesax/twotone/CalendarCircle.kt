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

val VuesaxIconsTwotone.CalendarCircle: ImageVector
    get() {
        if (_CalendarCircle != null) {
            return _CalendarCircle!!
        }
        _CalendarCircle = ImageVector.Builder(
            name = "CalendarCircle",
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
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
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
                moveTo(9.891f, 5.83f)
                verticalLineTo(7.83f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.109f, 5.83f)
                verticalLineTo(7.83f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.529f, 10.14f)
                horizontalLineTo(16.469f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 17.67f)
                horizontalLineTo(10.5f)
                curveTo(8f, 17.67f, 6.5f, 15.87f, 6.5f, 13.67f)
                verticalLineTo(10.67f)
                curveTo(6.5f, 8.47f, 8f, 6.67f, 10.5f, 6.67f)
                horizontalLineTo(13.5f)
                curveTo(16f, 6.67f, 17.5f, 8.47f, 17.5f, 10.67f)
                verticalLineTo(13.67f)
                curveTo(17.5f, 15.87f, 16f, 17.67f, 13.5f, 17.67f)
                close()
            }
        }.build()

        return _CalendarCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarCircle: ImageVector? = null
