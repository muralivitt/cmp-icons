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

val VuesaxIconsTwotone.Colorfilter: ImageVector
    get() {
        if (_Colorfilter != null) {
            return _Colorfilter!!
        }
        _Colorfilter = ImageVector.Builder(
            name = "Colorfilter",
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
                moveTo(14f, 16f)
                curveTo(14f, 17.77f, 13.23f, 19.37f, 12f, 20.46f)
                curveTo(10.94f, 21.42f, 9.54f, 22f, 8f, 22f)
                curveTo(4.69f, 22f, 2f, 19.31f, 2f, 16f)
                curveTo(2f, 13.24f, 3.88f, 10.9f, 6.42f, 10.21f)
                curveTo(7.11f, 11.95f, 8.59f, 13.29f, 10.42f, 13.79f)
                curveTo(10.92f, 13.93f, 11.45f, 14f, 12f, 14f)
                curveTo(12.55f, 14f, 13.08f, 13.93f, 13.58f, 13.79f)
                curveTo(13.85f, 14.47f, 14f, 15.22f, 14f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 8f)
                curveTo(18f, 8.78f, 17.85f, 9.53f, 17.58f, 10.21f)
                curveTo(16.89f, 11.95f, 15.41f, 13.29f, 13.58f, 13.79f)
                curveTo(13.08f, 13.93f, 12.55f, 14f, 12f, 14f)
                curveTo(11.45f, 14f, 10.92f, 13.93f, 10.42f, 13.79f)
                curveTo(8.59f, 13.29f, 7.11f, 11.95f, 6.42f, 10.21f)
                curveTo(6.15f, 9.53f, 6f, 8.78f, 6f, 8f)
                curveTo(6f, 4.69f, 8.69f, 2f, 12f, 2f)
                curveTo(15.31f, 2f, 18f, 4.69f, 18f, 8f)
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
                moveTo(22f, 16f)
                curveTo(22f, 19.31f, 19.31f, 22f, 16f, 22f)
                curveTo(14.46f, 22f, 13.06f, 21.42f, 12f, 20.46f)
                curveTo(13.23f, 19.37f, 14f, 17.77f, 14f, 16f)
                curveTo(14f, 15.22f, 13.85f, 14.47f, 13.58f, 13.79f)
                curveTo(15.41f, 13.29f, 16.89f, 11.95f, 17.58f, 10.21f)
                curveTo(20.12f, 10.9f, 22f, 13.24f, 22f, 16f)
                close()
            }
        }.build()

        return _Colorfilter!!
    }

@Suppress("ObjectPropertyName")
private var _Colorfilter: ImageVector? = null
