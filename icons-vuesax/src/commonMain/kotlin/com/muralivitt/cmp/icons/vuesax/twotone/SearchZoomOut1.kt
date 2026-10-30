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

val VuesaxIconsTwotone.SearchZoomOut1: ImageVector
    get() {
        if (_SearchZoomOut1 != null) {
            return _SearchZoomOut1!!
        }
        _SearchZoomOut1 = ImageVector.Builder(
            name = "SearchZoomOut1",
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
                moveTo(9f, 11.7f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 21f)
                curveTo(16.747f, 21f, 21f, 16.747f, 21f, 11.5f)
                curveTo(21f, 6.253f, 16.747f, 2f, 11.5f, 2f)
                curveTo(6.253f, 2f, 2f, 6.253f, 2f, 11.5f)
                curveTo(2f, 16.747f, 6.253f, 21f, 11.5f, 21f)
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
                moveTo(22f, 22f)
                lineTo(20f, 20f)
            }
        }.build()

        return _SearchZoomOut1!!
    }

@Suppress("ObjectPropertyName")
private var _SearchZoomOut1: ImageVector? = null
