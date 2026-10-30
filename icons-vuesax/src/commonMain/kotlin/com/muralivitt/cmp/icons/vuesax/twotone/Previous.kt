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

val VuesaxIconsTwotone.Previous: ImageVector
    get() {
        if (_Previous != null) {
            return _Previous!!
        }
        _Previous = ImageVector.Builder(
            name = "Previous",
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
                moveTo(20.241f, 7.22f)
                verticalLineTo(16.79f)
                curveTo(20.241f, 18.75f, 18.111f, 19.98f, 16.411f, 19f)
                lineTo(12.261f, 16.61f)
                lineTo(8.111f, 14.21f)
                curveTo(6.411f, 13.23f, 6.411f, 10.78f, 8.111f, 9.8f)
                lineTo(12.261f, 7.4f)
                lineTo(16.411f, 5.01f)
                curveTo(18.111f, 4.03f, 20.241f, 5.25f, 20.241f, 7.22f)
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
                moveTo(3.76f, 18.18f)
                verticalLineTo(5.82f)
            }
        }.build()

        return _Previous!!
    }

@Suppress("ObjectPropertyName")
private var _Previous: ImageVector? = null
