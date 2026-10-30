package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Lamp: ImageVector
    get() {
        if (_Lamp != null) {
            return _Lamp!!
        }
        _Lamp = ImageVector.Builder(
            name = "Lamp",
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
                moveTo(5.79f, 14.69f)
                horizontalLineTo(18.21f)
                curveTo(19.87f, 14.69f, 20.87f, 13.38f, 20.44f, 11.78f)
                lineTo(18.24f, 3.71f)
                curveTo(17.98f, 2.77f, 16.97f, 2f, 16.01f, 2f)
                horizontalLineTo(7.99f)
                curveTo(7.03f, 2f, 6.02f, 2.77f, 5.77f, 3.7f)
                lineTo(3.57f, 11.77f)
                curveTo(3.13f, 13.38f, 4.13f, 14.69f, 5.79f, 14.69f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 22f)
                horizontalLineTo(16f)
            }
        }.build()

        return _Lamp!!
    }

@Suppress("ObjectPropertyName")
private var _Lamp: ImageVector? = null
