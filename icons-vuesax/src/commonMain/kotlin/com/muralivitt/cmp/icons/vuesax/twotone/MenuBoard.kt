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

val VuesaxIconsTwotone.MenuBoard: ImageVector
    get() {
        if (_MenuBoard != null) {
            return _MenuBoard!!
        }
        _MenuBoard = ImageVector.Builder(
            name = "MenuBoard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(21.929f, 6.76f)
                lineTo(18.559f, 20.29f)
                curveTo(18.319f, 21.3f, 17.419f, 22f, 16.379f, 22f)
                horizontalLineTo(3.239f)
                curveTo(1.729f, 22f, 0.649f, 20.52f, 1.099f, 19.07f)
                lineTo(5.309f, 5.55f)
                curveTo(5.599f, 4.61f, 6.469f, 3.96f, 7.449f, 3.96f)
                horizontalLineTo(19.749f)
                curveTo(20.699f, 3.96f, 21.489f, 4.54f, 21.819f, 5.34f)
                curveTo(22.009f, 5.77f, 22.049f, 6.26f, 21.929f, 6.76f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 22f)
                horizontalLineTo(20.78f)
                curveTo(22.07f, 22f, 23.08f, 20.91f, 22.99f, 19.62f)
                lineTo(22f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.68f, 6.38f)
                lineTo(10.72f, 2.06f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.381f, 6.39f)
                lineTo(17.321f, 2.05f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.699f, 12f)
                horizontalLineTo(15.699f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.699f, 16f)
                horizontalLineTo(14.699f)
            }
        }.build()

        return _MenuBoard!!
    }

@Suppress("ObjectPropertyName")
private var _MenuBoard: ImageVector? = null
