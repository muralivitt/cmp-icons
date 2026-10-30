package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.RulerPen: ImageVector
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
                moveTo(21.471f, 19f)
                verticalLineTo(5f)
                curveTo(21.471f, 3f, 20.471f, 2f, 18.471f, 2f)
                horizontalLineTo(14.471f)
                curveTo(12.471f, 2f, 11.471f, 3f, 11.471f, 5f)
                verticalLineTo(19f)
                curveTo(11.471f, 21f, 12.471f, 22f, 14.471f, 22f)
                horizontalLineTo(18.471f)
                curveTo(20.471f, 22f, 21.471f, 21f, 21.471f, 19f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.471f, 6f)
                horizontalLineTo(16.471f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.471f, 18f)
                horizontalLineTo(15.471f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.471f, 13.95f)
                lineTo(16.471f, 14f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.471f, 10f)
                horizontalLineTo(14.471f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(5.489f, 2f)
                curveTo(3.859f, 2f, 2.529f, 3.33f, 2.529f, 4.95f)
                verticalLineTo(17.91f)
                curveTo(2.529f, 18.36f, 2.719f, 19.04f, 2.949f, 19.43f)
                lineTo(3.769f, 20.79f)
                curveTo(4.709f, 22.36f, 6.259f, 22.36f, 7.199f, 20.79f)
                lineTo(8.019f, 19.43f)
                curveTo(8.249f, 19.04f, 8.439f, 18.36f, 8.439f, 17.91f)
                verticalLineTo(4.95f)
                curveTo(8.439f, 3.33f, 7.109f, 2f, 5.489f, 2f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(8.439f, 7f)
                horizontalLineTo(2.529f)
            }
        }.build()

        return _RulerPen!!
    }

@Suppress("ObjectPropertyName")
private var _RulerPen: ImageVector? = null
