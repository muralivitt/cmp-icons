package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Driver: ImageVector
    get() {
        if (_Driver != null) {
            return _Driver!!
        }
        _Driver = ImageVector.Builder(
            name = "Driver",
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
                moveTo(19.32f, 10f)
                horizontalLineTo(4.69f)
                curveTo(3.21f, 10f, 2.01f, 8.79f, 2.01f, 7.32f)
                verticalLineTo(4.69f)
                curveTo(2.01f, 3.21f, 3.22f, 2.01f, 4.69f, 2.01f)
                horizontalLineTo(19.32f)
                curveTo(20.8f, 2.01f, 22f, 3.22f, 22f, 4.69f)
                verticalLineTo(7.32f)
                curveTo(22f, 8.79f, 20.79f, 10f, 19.32f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.32f, 22f)
                horizontalLineTo(4.69f)
                curveTo(3.21f, 22f, 2.01f, 20.79f, 2.01f, 19.32f)
                verticalLineTo(16.69f)
                curveTo(2.01f, 15.21f, 3.22f, 14.01f, 4.69f, 14.01f)
                horizontalLineTo(19.32f)
                curveTo(20.8f, 14.01f, 22f, 15.22f, 22f, 16.69f)
                verticalLineTo(19.32f)
                curveTo(22f, 20.79f, 20.79f, 22f, 19.32f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 5f)
                verticalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 5f)
                verticalLineTo(7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 17f)
                verticalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 17f)
                verticalLineTo(19f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 18f)
                horizontalLineTo(18f)
            }
        }.build()

        return _Driver!!
    }

@Suppress("ObjectPropertyName")
private var _Driver: ImageVector? = null
