package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CalendarAdd: ImageVector
    get() {
        if (_CalendarAdd != null) {
            return _CalendarAdd!!
        }
        _CalendarAdd = ImageVector.Builder(
            name = "CalendarAdd",
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
                moveTo(8f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.5f, 9.09f)
                horizontalLineTo(20.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 23f)
                curveTo(20.209f, 23f, 22f, 21.209f, 22f, 19f)
                curveTo(22f, 16.791f, 20.209f, 15f, 18f, 15f)
                curveTo(15.791f, 15f, 14f, 16.791f, 14f, 19f)
                curveTo(14f, 21.209f, 15.791f, 23f, 18f, 23f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.49f, 19.05f)
                horizontalLineTo(16.51f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 17.59f)
                verticalLineTo(20.58f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 8.5f)
                verticalLineTo(16.36f)
                curveTo(20.27f, 15.53f, 19.2f, 15f, 18f, 15f)
                curveTo(15.79f, 15f, 14f, 16.79f, 14f, 19f)
                curveTo(14f, 19.75f, 14.21f, 20.46f, 14.58f, 21.06f)
                curveTo(14.79f, 21.42f, 15.06f, 21.74f, 15.37f, 22f)
                horizontalLineTo(8f)
                curveTo(4.5f, 22f, 3f, 20f, 3f, 17f)
                verticalLineTo(8.5f)
                curveTo(3f, 5.5f, 4.5f, 3.5f, 8f, 3.5f)
                horizontalLineTo(16f)
                curveTo(19.5f, 3.5f, 21f, 5.5f, 21f, 8.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.995f, 13.7f)
                horizontalLineTo(12.005f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.294f, 13.7f)
                horizontalLineTo(8.303f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.294f, 16.7f)
                horizontalLineTo(8.303f)
            }
        }.build()

        return _CalendarAdd!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarAdd: ImageVector? = null
