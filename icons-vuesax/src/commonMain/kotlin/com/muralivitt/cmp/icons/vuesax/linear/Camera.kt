package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Camera: ImageVector
    get() {
        if (_Camera != null) {
            return _Camera!!
        }
        _Camera = ImageVector.Builder(
            name = "Camera",
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
                moveTo(6.76f, 22f)
                horizontalLineTo(17.24f)
                curveTo(20f, 22f, 21.1f, 20.31f, 21.23f, 18.25f)
                lineTo(21.75f, 9.99f)
                curveTo(21.89f, 7.83f, 20.17f, 6f, 18f, 6f)
                curveTo(17.39f, 6f, 16.83f, 5.65f, 16.55f, 5.11f)
                lineTo(15.83f, 3.66f)
                curveTo(15.37f, 2.75f, 14.17f, 2f, 13.15f, 2f)
                horizontalLineTo(10.86f)
                curveTo(9.83f, 2f, 8.63f, 2.75f, 8.17f, 3.66f)
                lineTo(7.45f, 5.11f)
                curveTo(7.17f, 5.65f, 6.61f, 6f, 6f, 6f)
                curveTo(3.83f, 6f, 2.11f, 7.83f, 2.25f, 9.99f)
                lineTo(2.77f, 18.25f)
                curveTo(2.89f, 20.31f, 4f, 22f, 6.76f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 8f)
                horizontalLineTo(13.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                curveTo(13.79f, 18f, 15.25f, 16.54f, 15.25f, 14.75f)
                curveTo(15.25f, 12.96f, 13.79f, 11.5f, 12f, 11.5f)
                curveTo(10.21f, 11.5f, 8.75f, 12.96f, 8.75f, 14.75f)
                curveTo(8.75f, 16.54f, 10.21f, 18f, 12f, 18f)
                close()
            }
        }.build()

        return _Camera!!
    }

@Suppress("ObjectPropertyName")
private var _Camera: ImageVector? = null
