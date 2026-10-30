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

val VuesaxIconsTwotone.Radar1: ImageVector
    get() {
        if (_Radar1 != null) {
            return _Radar1!!
        }
        _Radar1 = ImageVector.Builder(
            name = "Radar1",
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
                moveTo(12f, 14f)
                curveTo(13.105f, 14f, 14f, 13.105f, 14f, 12f)
                curveTo(14f, 10.895f, 13.105f, 10f, 12f, 10f)
                curveTo(10.895f, 10f, 10f, 10.895f, 10f, 12f)
                curveTo(10f, 13.105f, 10.895f, 14f, 12f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 18f)
                curveTo(21.26f, 16.33f, 22f, 14.25f, 22f, 12f)
                curveTo(22f, 9.75f, 21.26f, 7.67f, 20f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                curveTo(2.74f, 7.67f, 2f, 9.75f, 2f, 12f)
                curveTo(2f, 14.25f, 2.74f, 16.33f, 4f, 18f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.801f, 15.6f)
                curveTo(17.551f, 14.6f, 18.001f, 13.35f, 18.001f, 12f)
                curveTo(18.001f, 10.65f, 17.551f, 9.4f, 16.801f, 8.4f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.2f, 8.4f)
                curveTo(6.45f, 9.4f, 6f, 10.65f, 6f, 12f)
                curveTo(6f, 13.35f, 6.45f, 14.6f, 7.2f, 15.6f)
            }
        }.build()

        return _Radar1!!
    }

@Suppress("ObjectPropertyName")
private var _Radar1: ImageVector? = null
