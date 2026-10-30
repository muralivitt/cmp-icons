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

val VuesaxIconsTwotone.Next: ImageVector
    get() {
        if (_Next != null) {
            return _Next!!
        }
        _Next = ImageVector.Builder(
            name = "Next",
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
                moveTo(3.76f, 7.22f)
                verticalLineTo(16.79f)
                curveTo(3.76f, 18.75f, 5.89f, 19.98f, 7.59f, 19f)
                lineTo(11.74f, 16.61f)
                lineTo(15.89f, 14.21f)
                curveTo(17.59f, 13.23f, 17.59f, 10.78f, 15.89f, 9.8f)
                lineTo(11.74f, 7.4f)
                lineTo(7.59f, 5.01f)
                curveTo(5.89f, 4.03f, 3.76f, 5.25f, 3.76f, 7.22f)
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
                moveTo(20.24f, 18.18f)
                verticalLineTo(5.82f)
            }
        }.build()

        return _Next!!
    }

@Suppress("ObjectPropertyName")
private var _Next: ImageVector? = null
