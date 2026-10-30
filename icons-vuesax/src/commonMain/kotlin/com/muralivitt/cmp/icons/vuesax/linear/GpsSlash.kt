package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.GpsSlash: ImageVector
    get() {
        if (_GpsSlash != null) {
            return _GpsSlash!!
        }
        _GpsSlash = ImageVector.Builder(
            name = "GpsSlash",
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
                moveTo(9f, 18.88f)
                curveTo(9.92f, 19.28f, 10.93f, 19.5f, 12f, 19.5f)
                curveTo(16.14f, 19.5f, 19.5f, 16.14f, 19.5f, 12f)
                curveTo(19.5f, 10.93f, 19.28f, 9.92f, 18.88f, 9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.21f, 6.6f)
                curveTo(15.86f, 5.3f, 14.02f, 4.5f, 12f, 4.5f)
                curveTo(7.86f, 4.5f, 4.5f, 7.86f, 4.5f, 12f)
                curveTo(4.5f, 14.01f, 5.29f, 15.84f, 6.58f, 17.19f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                verticalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 12f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.12f, 9.88f)
                lineTo(9.88f, 14.12f)
                curveTo(9.34f, 13.58f, 9f, 12.83f, 9f, 12f)
                curveTo(9f, 10.34f, 10.34f, 9f, 12f, 9f)
                curveTo(12.83f, 9f, 13.58f, 9.34f, 14.12f, 9.88f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
        }.build()

        return _GpsSlash!!
    }

@Suppress("ObjectPropertyName")
private var _GpsSlash: ImageVector? = null
