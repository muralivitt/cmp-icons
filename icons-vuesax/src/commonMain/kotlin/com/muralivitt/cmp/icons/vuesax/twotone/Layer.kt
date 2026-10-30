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

val VuesaxIconsTwotone.Layer: ImageVector
    get() {
        if (_Layer != null) {
            return _Layer!!
        }
        _Layer = ImageVector.Builder(
            name = "Layer",
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
                moveTo(13.009f, 2.92f)
                lineTo(18.91f, 5.54f)
                curveTo(20.61f, 6.29f, 20.61f, 7.53f, 18.91f, 8.28f)
                lineTo(13.009f, 10.9f)
                curveTo(12.34f, 11.2f, 11.24f, 11.2f, 10.569f, 10.9f)
                lineTo(4.67f, 8.28f)
                curveTo(2.97f, 7.53f, 2.97f, 6.29f, 4.67f, 5.54f)
                lineTo(10.569f, 2.92f)
                curveTo(11.24f, 2.62f, 12.34f, 2.62f, 13.009f, 2.92f)
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
                moveTo(3f, 11f)
                curveTo(3f, 11.84f, 3.63f, 12.81f, 4.4f, 13.15f)
                lineTo(11.19f, 16.17f)
                curveTo(11.71f, 16.4f, 12.3f, 16.4f, 12.81f, 16.17f)
                lineTo(19.6f, 13.15f)
                curveTo(20.37f, 12.81f, 21f, 11.84f, 21f, 11f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 16f)
                curveTo(3f, 16.93f, 3.55f, 17.77f, 4.4f, 18.15f)
                lineTo(11.19f, 21.17f)
                curveTo(11.71f, 21.4f, 12.3f, 21.4f, 12.81f, 21.17f)
                lineTo(19.6f, 18.15f)
                curveTo(20.45f, 17.77f, 21f, 16.93f, 21f, 16f)
            }
        }.build()

        return _Layer!!
    }

@Suppress("ObjectPropertyName")
private var _Layer: ImageVector? = null
