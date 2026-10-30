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

val VuesaxIconsTwotone.Radar2: ImageVector
    get() {
        if (_Radar2 != null) {
            return _Radar2!!
        }
        _Radar2 = ImageVector.Builder(
            name = "Radar2",
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
                moveTo(6f, 4f)
                curveTo(7.67f, 2.75f, 9.75f, 2f, 12f, 2f)
                curveTo(17.52f, 2f, 22f, 6.48f, 22f, 12f)
                curveTo(22f, 17.52f, 17.52f, 22f, 12f, 22f)
                curveTo(6.48f, 22f, 2f, 17.52f, 2f, 12f)
                curveTo(2f, 10.19f, 2.48f, 8.49f, 3.33f, 7.02f)
                lineTo(12f, 12f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.83f, 8.96f)
                curveTo(6.3f, 9.85f, 6f, 10.89f, 6f, 12f)
                curveTo(6f, 15.31f, 8.69f, 18f, 12f, 18f)
                curveTo(15.31f, 18f, 18f, 15.31f, 18f, 12f)
                curveTo(18f, 8.69f, 15.31f, 6f, 12f, 6f)
                curveTo(11.09f, 6f, 10.22f, 6.2f, 9.45f, 6.57f)
            }
        }.build()

        return _Radar2!!
    }

@Suppress("ObjectPropertyName")
private var _Radar2: ImageVector? = null
