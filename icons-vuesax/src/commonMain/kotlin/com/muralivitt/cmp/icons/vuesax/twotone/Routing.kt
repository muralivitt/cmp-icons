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

val VuesaxIconsTwotone.Routing: ImageVector
    get() {
        if (_Routing != null) {
            return _Routing!!
        }
        _Routing = ImageVector.Builder(
            name = "Routing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(2.07f, 4.6f)
                curveTo(2.87f, 1.14f, 8.08f, 1.14f, 8.87f, 4.6f)
                curveTo(9.34f, 6.63f, 8.05f, 8.35f, 6.93f, 9.42f)
                curveTo(6.11f, 10.2f, 4.82f, 10.19f, 4f, 9.42f)
                curveTo(2.89f, 8.35f, 1.6f, 6.63f, 2.07f, 4.6f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(15.07f, 16.6f)
                curveTo(15.87f, 13.14f, 21.11f, 13.14f, 21.91f, 16.6f)
                curveTo(22.38f, 18.63f, 21.09f, 20.35f, 19.96f, 21.42f)
                curveTo(19.14f, 22.2f, 17.84f, 22.19f, 17.02f, 21.42f)
                curveTo(15.89f, 20.35f, 14.6f, 18.63f, 15.07f, 16.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                horizontalLineTo(14.68f)
                curveTo(16.53f, 5f, 17.39f, 7.29f, 16f, 8.51f)
                lineTo(8.01f, 15.5f)
                curveTo(6.62f, 16.71f, 7.48f, 19f, 9.32f, 19f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.486f, 5.5f)
                horizontalLineTo(5.497f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.486f, 17.5f)
                horizontalLineTo(18.497f)
            }
        }.build()

        return _Routing!!
    }

@Suppress("ObjectPropertyName")
private var _Routing: ImageVector? = null
