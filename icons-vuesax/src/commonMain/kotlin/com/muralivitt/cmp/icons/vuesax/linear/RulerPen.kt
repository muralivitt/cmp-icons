package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.RulerPen: ImageVector
    get() {
        if (_RulerPen != null) {
            return _RulerPen!!
        }
        _RulerPen = ImageVector.Builder(
            name = "RulerPen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(21.47f, 19f)
                verticalLineTo(5f)
                curveTo(21.47f, 3f, 20.47f, 2f, 18.47f, 2f)
                horizontalLineTo(14.47f)
                curveTo(12.47f, 2f, 11.47f, 3f, 11.47f, 5f)
                verticalLineTo(19f)
                curveTo(11.47f, 21f, 12.47f, 22f, 14.47f, 22f)
                horizontalLineTo(18.47f)
                curveTo(20.47f, 22f, 21.47f, 21f, 21.47f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.47f, 6f)
                horizontalLineTo(16.47f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.47f, 18f)
                horizontalLineTo(15.47f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.47f, 13.95f)
                lineTo(16.47f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.47f, 10f)
                horizontalLineTo(14.47f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(5.49f, 2f)
                curveTo(3.86f, 2f, 2.53f, 3.33f, 2.53f, 4.95f)
                verticalLineTo(17.91f)
                curveTo(2.53f, 18.36f, 2.72f, 19.04f, 2.95f, 19.43f)
                lineTo(3.77f, 20.79f)
                curveTo(4.71f, 22.36f, 6.26f, 22.36f, 7.2f, 20.79f)
                lineTo(8.02f, 19.43f)
                curveTo(8.25f, 19.04f, 8.44f, 18.36f, 8.44f, 17.91f)
                verticalLineTo(4.95f)
                curveTo(8.44f, 3.33f, 7.11f, 2f, 5.49f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(8.44f, 7f)
                horizontalLineTo(2.53f)
            }
        }.build()

        return _RulerPen!!
    }

@Suppress("ObjectPropertyName")
private var _RulerPen: ImageVector? = null
