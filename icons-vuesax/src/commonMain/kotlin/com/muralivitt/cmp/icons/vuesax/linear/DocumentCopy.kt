package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DocumentCopy: ImageVector
    get() {
        if (_DocumentCopy != null) {
            return _DocumentCopy!!
        }
        _DocumentCopy = ImageVector.Builder(
            name = "DocumentCopy",
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
                moveTo(17f, 13.4f)
                verticalLineTo(16.4f)
                curveTo(17f, 20.4f, 15.4f, 22f, 11.4f, 22f)
                horizontalLineTo(7.6f)
                curveTo(3.6f, 22f, 2f, 20.4f, 2f, 16.4f)
                verticalLineTo(12.6f)
                curveTo(2f, 8.6f, 3.6f, 7f, 7.6f, 7f)
                horizontalLineTo(10.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 13.4f)
                horizontalLineTo(13.8f)
                curveTo(11.4f, 13.4f, 10.6f, 12.6f, 10.6f, 10.2f)
                verticalLineTo(7f)
                lineTo(17f, 13.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.6f, 2f)
                horizontalLineTo(15.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 5f)
                curveTo(7f, 3.34f, 8.34f, 2f, 10f, 2f)
                horizontalLineTo(12.62f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8f)
                verticalLineTo(14.19f)
                curveTo(22f, 15.74f, 20.74f, 17f, 19.19f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8f)
                horizontalLineTo(19f)
                curveTo(16.75f, 8f, 16f, 7.25f, 16f, 5f)
                verticalLineTo(2f)
                lineTo(22f, 8f)
                close()
            }
        }.build()

        return _DocumentCopy!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCopy: ImageVector? = null
