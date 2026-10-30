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

val VuesaxIconsTwotone.HeartCircle: ImageVector
    get() {
        if (_HeartCircle != null) {
            return _HeartCircle!!
        }
        _HeartCircle = ImageVector.Builder(
            name = "HeartCircle",
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
                moveTo(12.33f, 17.45f)
                curveTo(12.15f, 17.51f, 11.84f, 17.51f, 11.66f, 17.45f)
                curveTo(10.1f, 16.92f, 6.6f, 14.69f, 6.6f, 10.91f)
                curveTo(6.6f, 9.24f, 7.94f, 7.89f, 9.6f, 7.89f)
                curveTo(10.58f, 7.89f, 11.45f, 8.36f, 12f, 9.1f)
                curveTo(12.54f, 8.37f, 13.42f, 7.89f, 14.4f, 7.89f)
                curveTo(16.06f, 7.89f, 17.4f, 9.24f, 17.4f, 10.91f)
                curveTo(17.4f, 14.69f, 13.9f, 16.92f, 12.33f, 17.45f)
                close()
            }
        }.build()

        return _HeartCircle!!
    }

@Suppress("ObjectPropertyName")
private var _HeartCircle: ImageVector? = null
