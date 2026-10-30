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

val VuesaxIconsTwotone.AlignLeft: ImageVector
    get() {
        if (_AlignLeft != null) {
            return _AlignLeft!!
        }
        _AlignLeft = ImageVector.Builder(
            name = "AlignLeft",
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
                moveTo(5.1f, 19.25f)
                horizontalLineTo(16.9f)
                curveTo(18.4f, 19.25f, 19f, 18.61f, 19f, 17.02f)
                verticalLineTo(15.98f)
                curveTo(19f, 14.39f, 18.4f, 13.75f, 16.9f, 13.75f)
                horizontalLineTo(5.1f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.1f, 5.25f)
                horizontalLineTo(11.9f)
                curveTo(13.4f, 5.25f, 14f, 5.89f, 14f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(14f, 10.11f, 13.4f, 10.75f, 11.9f, 10.75f)
                horizontalLineTo(5.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 1.99f)
                verticalLineTo(21.99f)
            }
        }.build()

        return _AlignLeft!!
    }

@Suppress("ObjectPropertyName")
private var _AlignLeft: ImageVector? = null
