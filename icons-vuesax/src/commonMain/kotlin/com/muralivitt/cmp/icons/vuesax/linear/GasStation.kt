package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.GasStation: ImageVector
    get() {
        if (_GasStation != null) {
            return _GasStation!!
        }
        _GasStation = ImageVector.Builder(
            name = "GasStation",
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
                moveTo(3.5f, 22f)
                verticalLineTo(5f)
                curveTo(3.5f, 3f, 4.84f, 2f, 6.5f, 2f)
                horizontalLineTo(14.5f)
                curveTo(16.16f, 2f, 17.5f, 3f, 17.5f, 5f)
                verticalLineTo(22f)
                horizontalLineTo(3.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 22f)
                horizontalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.39f, 10f)
                horizontalLineTo(12.62f)
                curveTo(13.66f, 10f, 14.51f, 9.5f, 14.51f, 8.11f)
                verticalLineTo(6.88f)
                curveTo(14.51f, 5.49f, 13.66f, 4.99f, 12.62f, 4.99f)
                horizontalLineTo(8.39f)
                curveTo(7.35f, 4.99f, 6.5f, 5.49f, 6.5f, 6.88f)
                verticalLineTo(8.11f)
                curveTo(6.5f, 9.5f, 7.35f, 10f, 8.39f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.5f, 13f)
                horizontalLineTo(9.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 16.01f)
                lineTo(22f, 16f)
                verticalLineTo(10f)
                lineTo(20f, 9f)
            }
        }.build()

        return _GasStation!!
    }

@Suppress("ObjectPropertyName")
private var _GasStation: ImageVector? = null
