package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Frame4: ImageVector
    get() {
        if (_Frame4 != null) {
            return _Frame4!!
        }
        _Frame4 = ImageVector.Builder(
            name = "Frame4",
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
                moveTo(9.25f, 9.05f)
                curveTo(11.03f, 9.7f, 12.97f, 9.7f, 14.75f, 9.05f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.82f, 2f)
                horizontalLineTo(7.18f)
                curveTo(5.05f, 2f, 3.32f, 3.74f, 3.32f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(3.32f, 21.75f, 4.61f, 22.51f, 6.19f, 21.64f)
                lineTo(11.07f, 18.93f)
                curveTo(11.59f, 18.64f, 12.43f, 18.64f, 12.94f, 18.93f)
                lineTo(17.82f, 21.64f)
                curveTo(19.4f, 22.52f, 20.69f, 21.76f, 20.69f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(20.68f, 3.74f, 18.95f, 2f, 16.82f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.82f, 2f)
                horizontalLineTo(7.18f)
                curveTo(5.05f, 2f, 3.32f, 3.74f, 3.32f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(3.32f, 21.75f, 4.61f, 22.51f, 6.19f, 21.64f)
                lineTo(11.07f, 18.93f)
                curveTo(11.59f, 18.64f, 12.43f, 18.64f, 12.94f, 18.93f)
                lineTo(17.82f, 21.64f)
                curveTo(19.4f, 22.52f, 20.69f, 21.76f, 20.69f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(20.68f, 3.74f, 18.95f, 2f, 16.82f, 2f)
                close()
            }
        }.build()

        return _Frame4!!
    }

@Suppress("ObjectPropertyName")
private var _Frame4: ImageVector? = null
