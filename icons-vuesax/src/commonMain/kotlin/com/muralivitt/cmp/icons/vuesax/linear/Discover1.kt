package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Discover1: ImageVector
    get() {
        if (_Discover1 != null) {
            return _Discover1!!
        }
        _Discover1 = ImageVector.Builder(
            name = "Discover1",
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
                moveTo(17.8f, 2.1f)
                lineTo(7.87f, 4.59f)
                curveTo(6.42f, 4.95f, 4.95f, 6.42f, 4.59f, 7.87f)
                lineTo(2.1f, 17.8f)
                curveTo(1.35f, 20.8f, 3.19f, 22.65f, 6.2f, 21.9f)
                lineTo(16.13f, 19.42f)
                curveTo(17.57f, 19.06f, 19.05f, 17.58f, 19.41f, 16.14f)
                lineTo(21.9f, 6.2f)
                curveTo(22.65f, 3.2f, 20.8f, 1.35f, 17.8f, 2.1f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15.5f)
                curveTo(13.933f, 15.5f, 15.5f, 13.933f, 15.5f, 12f)
                curveTo(15.5f, 10.067f, 13.933f, 8.5f, 12f, 8.5f)
                curveTo(10.067f, 8.5f, 8.5f, 10.067f, 8.5f, 12f)
                curveTo(8.5f, 13.933f, 10.067f, 15.5f, 12f, 15.5f)
                close()
            }
        }.build()

        return _Discover1!!
    }

@Suppress("ObjectPropertyName")
private var _Discover1: ImageVector? = null
