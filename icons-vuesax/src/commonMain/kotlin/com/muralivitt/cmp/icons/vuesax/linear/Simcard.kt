package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Simcard: ImageVector
    get() {
        if (_Simcard != null) {
            return _Simcard!!
        }
        _Simcard = ImageVector.Builder(
            name = "Simcard",
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
                moveTo(19.54f, 6.54f)
                lineTo(16.47f, 3.47f)
                curveTo(15.53f, 2.53f, 14.26f, 2.01f, 12.93f, 2.01f)
                horizontalLineTo(8f)
                curveTo(5f, 2.01f, 3f, 4.01f, 3f, 7.01f)
                verticalLineTo(17.01f)
                curveTo(3f, 20.01f, 5f, 22.01f, 8f, 22.01f)
                horizontalLineTo(16f)
                curveTo(19f, 22.01f, 21f, 20.01f, 21f, 17.01f)
                verticalLineTo(10.08f)
                curveTo(21f, 8.74f, 20.47f, 7.47f, 19.54f, 6.54f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 14f)
                lineTo(7.5f, 16f)
                lineTo(9.5f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 14f)
                lineTo(16.5f, 16f)
                lineTo(14.5f, 18f)
            }
        }.build()

        return _Simcard!!
    }

@Suppress("ObjectPropertyName")
private var _Simcard: ImageVector? = null
