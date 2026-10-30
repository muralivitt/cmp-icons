package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MenuBoard: ImageVector
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
                moveTo(21.93f, 6.76f)
                lineTo(18.56f, 20.29f)
                curveTo(18.32f, 21.3f, 17.42f, 22f, 16.38f, 22f)
                horizontalLineTo(3.24f)
                curveTo(1.73f, 22f, 0.65f, 20.52f, 1.1f, 19.07f)
                lineTo(5.31f, 5.55f)
                curveTo(5.6f, 4.61f, 6.47f, 3.96f, 7.45f, 3.96f)
                horizontalLineTo(19.75f)
                curveTo(20.7f, 3.96f, 21.49f, 4.54f, 21.82f, 5.34f)
                curveTo(22.01f, 5.77f, 22.05f, 6.26f, 21.93f, 6.76f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
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
                moveTo(16.38f, 6.39f)
                lineTo(17.32f, 2.05f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.7f, 12f)
                horizontalLineTo(15.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.7f, 16f)
                horizontalLineTo(14.7f)
            }
        }.build()

        return _MenuBoard!!
    }

@Suppress("ObjectPropertyName")
private var _MenuBoard: ImageVector? = null
