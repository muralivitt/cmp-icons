package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Speedometer: ImageVector
    get() {
        if (_Speedometer != null) {
            return _Speedometer!!
        }
        _Speedometer = ImageVector.Builder(
            name = "Speedometer",
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
                moveTo(19.14f, 19.5f)
                curveTo(20.91f, 17.7f, 22f, 15.22f, 22f, 12.5f)
                curveTo(22f, 6.98f, 17.52f, 2.5f, 12f, 2.5f)
                curveTo(6.48f, 2.5f, 2f, 6.98f, 2f, 12.5f)
                curveTo(2f, 15.22f, 3.08f, 17.68f, 4.84f, 19.49f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21.5f)
                curveTo(13.867f, 21.5f, 15.38f, 19.987f, 15.38f, 18.12f)
                curveTo(15.38f, 16.253f, 13.867f, 14.74f, 12f, 14.74f)
                curveTo(10.133f, 14.74f, 8.62f, 16.253f, 8.62f, 18.12f)
                curveTo(8.62f, 19.987f, 10.133f, 21.5f, 12f, 21.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.25f, 12f)
                horizontalLineTo(16f)
                curveTo(16.82f, 12f, 17.5f, 11.33f, 17.5f, 10.5f)
                curveTo(17.5f, 9.68f, 16.82f, 9f, 16f, 9f)
                curveTo(15.18f, 9f, 14.5f, 9.67f, 14.5f, 10.5f)
                verticalLineTo(11.25f)
                curveTo(14.5f, 11.66f, 14.84f, 12f, 15.25f, 12f)
                close()
            }
        }.build()

        return _Speedometer!!
    }

@Suppress("ObjectPropertyName")
private var _Speedometer: ImageVector? = null
