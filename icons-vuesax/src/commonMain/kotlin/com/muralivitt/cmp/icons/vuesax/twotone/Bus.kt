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

val VuesaxIconsTwotone.Bus: ImageVector
    get() {
        if (_Bus != null) {
            return _Bus!!
        }
        _Bus = ImageVector.Builder(
            name = "Bus",
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
                moveTo(16.9f, 22f)
                horizontalLineTo(7.1f)
                curveTo(5.4f, 22f, 4f, 20.61f, 4f, 18.9f)
                verticalLineTo(5.1f)
                curveTo(4f, 3.4f, 5.39f, 2f, 7.1f, 2f)
                horizontalLineTo(16.9f)
                curveTo(18.6f, 2f, 20f, 3.39f, 20f, 5.1f)
                verticalLineTo(18.9f)
                curveTo(20f, 20.61f, 18.61f, 22f, 16.9f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 13f)
                horizontalLineTo(5.5f)
                curveTo(4.67f, 13f, 4f, 12.33f, 4f, 11.5f)
                verticalLineTo(9.5f)
                curveTo(4f, 8.67f, 4.67f, 8f, 5.5f, 8f)
                horizontalLineTo(18.5f)
                curveTo(19.33f, 8f, 20f, 8.67f, 20f, 9.5f)
                verticalLineTo(11.5f)
                curveTo(20f, 12.33f, 19.33f, 13f, 18.5f, 13f)
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
                moveTo(9.5f, 5f)
                horizontalLineTo(14.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.495f, 17.7f)
                horizontalLineTo(8.503f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.495f, 17.7f)
                horizontalLineTo(15.503f)
            }
        }.build()

        return _Bus!!
    }

@Suppress("ObjectPropertyName")
private var _Bus: ImageVector? = null
