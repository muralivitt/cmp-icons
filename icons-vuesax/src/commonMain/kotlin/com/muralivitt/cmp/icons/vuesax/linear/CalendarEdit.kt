package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CalendarEdit: ImageVector
    get() {
        if (_CalendarEdit != null) {
            return _CalendarEdit!!
        }
        _CalendarEdit = ImageVector.Builder(
            name = "CalendarEdit",
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
                moveTo(19.21f, 15.77f)
                lineTo(15.67f, 19.31f)
                curveTo(15.53f, 19.45f, 15.4f, 19.71f, 15.37f, 19.9f)
                lineTo(15.18f, 21.25f)
                curveTo(15.11f, 21.74f, 15.45f, 22.08f, 15.94f, 22.01f)
                lineTo(17.29f, 21.82f)
                curveTo(17.48f, 21.79f, 17.75f, 21.66f, 17.88f, 21.52f)
                lineTo(21.42f, 17.98f)
                curveTo(22.03f, 17.37f, 22.32f, 16.66f, 21.42f, 15.76f)
                curveTo(20.53f, 14.87f, 19.82f, 15.16f, 19.21f, 15.77f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.7f, 16.28f)
                curveTo(19f, 17.36f, 19.84f, 18.2f, 20.92f, 18.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                horizontalLineTo(8f)
                curveTo(4.5f, 22f, 3f, 20f, 3f, 17f)
                verticalLineTo(8.5f)
                curveTo(3f, 5.5f, 4.5f, 3.5f, 8f, 3.5f)
                horizontalLineTo(16f)
                curveTo(19.5f, 3.5f, 21f, 5.5f, 21f, 8.5f)
                verticalLineTo(12f)
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

        return _CalendarEdit!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarEdit: ImageVector? = null
