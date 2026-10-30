package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Danger: ImageVector
    get() {
        if (_Danger != null) {
            return _Danger!!
        }
        _Danger = ImageVector.Builder(
            name = "Danger",
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
                moveTo(12f, 9f)
                verticalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21.41f)
                horizontalLineTo(5.94f)
                curveTo(2.47f, 21.41f, 1.02f, 18.93f, 2.7f, 15.9f)
                lineTo(5.82f, 10.28f)
                lineTo(8.76f, 5f)
                curveTo(10.54f, 1.79f, 13.46f, 1.79f, 15.24f, 5f)
                lineTo(18.18f, 10.29f)
                lineTo(21.3f, 15.91f)
                curveTo(22.98f, 18.94f, 21.52f, 21.42f, 18.06f, 21.42f)
                horizontalLineTo(12f)
                verticalLineTo(21.41f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.995f, 17f)
                horizontalLineTo(12.003f)
            }
        }.build()

        return _Danger!!
    }

@Suppress("ObjectPropertyName")
private var _Danger: ImageVector? = null
