package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.SearchZoomIn: ImageVector
    get() {
        if (_SearchZoomIn != null) {
            return _SearchZoomIn!!
        }
        _SearchZoomIn = ImageVector.Builder(
            name = "SearchZoomIn",
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
                moveTo(9.2f, 11.7f)
                horizontalLineTo(14.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.7f, 14.2f)
                verticalLineTo(9.2f)
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                lineTo(20f, 20f)
            }
        }.build()

        return _SearchZoomIn!!
    }

@Suppress("ObjectPropertyName")
private var _SearchZoomIn: ImageVector? = null
