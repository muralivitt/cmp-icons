package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Courthouse: ImageVector
    get() {
        if (_Courthouse != null) {
            return _Courthouse!!
        }
        _Courthouse = ImageVector.Builder(
            name = "Courthouse",
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
                moveTo(2f, 22f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                curveTo(13.6f, 2.64f, 15.4f, 2.64f, 17f, 2f)
                verticalLineTo(5f)
                curveTo(15.4f, 5.64f, 13.6f, 5.64f, 12f, 5f)
                verticalLineTo(2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                verticalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 8f)
                horizontalLineTo(7f)
                curveTo(5f, 8f, 4f, 9f, 4f, 11f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                curveTo(20f, 9f, 19f, 8f, 17f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.58f, 12f)
                horizontalLineTo(19.42f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.99f, 12f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.99f, 12f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.99f, 12f)
                verticalLineTo(22f)
            }
        }.build()

        return _Courthouse!!
    }

@Suppress("ObjectPropertyName")
private var _Courthouse: ImageVector? = null
