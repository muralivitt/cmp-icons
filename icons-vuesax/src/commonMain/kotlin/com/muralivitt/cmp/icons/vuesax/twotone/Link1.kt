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

val VuesaxIconsTwotone.Link1: ImageVector
    get() {
        if (_Link1 != null) {
            return _Link1!!
        }
        _Link1 = ImageVector.Builder(
            name = "Link1",
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
                moveTo(14.99f, 17.5f)
                horizontalLineTo(16.5f)
                curveTo(19.52f, 17.5f, 22f, 15.03f, 22f, 12f)
                curveTo(22f, 8.98f, 19.53f, 6.5f, 16.5f, 6.5f)
                horizontalLineTo(14.99f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 6.5f)
                horizontalLineTo(7.5f)
                curveTo(4.47f, 6.5f, 2f, 8.97f, 2f, 12f)
                curveTo(2f, 15.02f, 4.47f, 17.5f, 7.5f, 17.5f)
                horizontalLineTo(9f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                horizontalLineTo(16f)
            }
        }.build()

        return _Link1!!
    }

@Suppress("ObjectPropertyName")
private var _Link1: ImageVector? = null
