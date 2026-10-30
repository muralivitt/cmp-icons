package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.CalendarTick: ImageVector
    get() {
        if (_CalendarTick != null) {
            return _CalendarTick!!
        }
        _CalendarTick = ImageVector.Builder(
            name = "CalendarTick",
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
                moveTo(22f, 19f)
                curveTo(22f, 19.75f, 21.79f, 20.46f, 21.42f, 21.06f)
                curveTo(20.73f, 22.22f, 19.46f, 23f, 18f, 23f)
                curveTo(16.99f, 23f, 16.07f, 22.63f, 15.37f, 22f)
                curveTo(15.06f, 21.74f, 14.79f, 21.42f, 14.58f, 21.06f)
                curveTo(14.21f, 20.46f, 14f, 19.75f, 14f, 19f)
                curveTo(14f, 16.79f, 15.79f, 15f, 18f, 15f)
                curveTo(19.2f, 15f, 20.27f, 15.53f, 21f, 16.36f)
                curveTo(21.62f, 17.07f, 22f, 17.99f, 22f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.44f, 19f)
                lineTo(17.43f, 19.99f)
                lineTo(19.56f, 18.02f)
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.995f, 13.7f)
                horizontalLineTo(12.005f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.294f, 13.7f)
                horizontalLineTo(8.303f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.295f, 16.7f)
                horizontalLineTo(8.304f)
            }
        }.build()

        return _CalendarTick!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarTick: ImageVector? = null
