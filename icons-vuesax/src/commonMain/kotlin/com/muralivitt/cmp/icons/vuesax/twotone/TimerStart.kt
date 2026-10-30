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

val VuesaxIconsTwotone.TimerStart: ImageVector
    get() {
        if (_TimerStart != null) {
            return _TimerStart!!
        }
        _TimerStart = ImageVector.Builder(
            name = "TimerStart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(7.17f, 22f, 3.25f, 18.08f, 3.25f, 13.25f)
                curveTo(3.25f, 8.42f, 7.17f, 4.5f, 12f, 4.5f)
                curveTo(16.83f, 4.5f, 20.75f, 8.42f, 20.75f, 13.25f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 2f)
                horizontalLineTo(15f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.9f, 18.5f)
                verticalLineTo(17.34f)
                curveTo(14.9f, 15.91f, 15.92f, 15.32f, 17.16f, 16.04f)
                lineTo(18.16f, 16.62f)
                lineTo(19.16f, 17.2f)
                curveTo(20.4f, 17.92f, 20.4f, 19.09f, 19.16f, 19.81f)
                lineTo(18.16f, 20.39f)
                lineTo(17.16f, 20.97f)
                curveTo(15.92f, 21.69f, 14.9f, 21.1f, 14.9f, 19.67f)
                verticalLineTo(18.5f)
                close()
            }
        }.build()

        return _TimerStart!!
    }

@Suppress("ObjectPropertyName")
private var _TimerStart: ImageVector? = null
