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

val VuesaxIconsTwotone.PresentionChart: ImageVector
    get() {
        if (_PresentionChart != null) {
            return _PresentionChart!!
        }
        _PresentionChart = ImageVector.Builder(
            name = "PresentionChart",
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
                moveTo(5.9f, 17f)
                horizontalLineTo(18.09f)
                curveTo(19.99f, 17f, 20.99f, 16f, 20.99f, 14.1f)
                verticalLineTo(2f)
                horizontalLineTo(2.99f)
                verticalLineTo(14.1f)
                curveTo(3f, 16f, 4f, 17f, 5.9f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
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
                moveTo(8f, 22f)
                lineTo(12f, 20f)
                moveTo(12f, 20f)
                verticalLineTo(17f)
                moveTo(12f, 20f)
                lineTo(16f, 22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 11f)
                lineTo(10.65f, 8.37f)
                curveTo(10.9f, 8.16f, 11.23f, 8.22f, 11.4f, 8.5f)
                lineTo(12.6f, 10.5f)
                curveTo(12.77f, 10.78f, 13.1f, 10.83f, 13.35f, 10.63f)
                lineTo(16.5f, 8f)
            }
        }.build()

        return _PresentionChart!!
    }

@Suppress("ObjectPropertyName")
private var _PresentionChart: ImageVector? = null
