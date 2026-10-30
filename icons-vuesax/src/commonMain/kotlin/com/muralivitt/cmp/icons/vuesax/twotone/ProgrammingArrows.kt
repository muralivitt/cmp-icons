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

val VuesaxIconsTwotone.ProgrammingArrows: ImageVector
    get() {
        if (_ProgrammingArrows != null) {
            return _ProgrammingArrows!!
        }
        _ProgrammingArrows = ImageVector.Builder(
            name = "ProgrammingArrows",
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
                moveTo(19f, 22f)
                curveTo(20.657f, 22f, 22f, 20.657f, 22f, 19f)
                curveTo(22f, 17.343f, 20.657f, 16f, 19f, 16f)
                curveTo(17.343f, 16f, 16f, 17.343f, 16f, 19f)
                curveTo(16f, 20.657f, 17.343f, 22f, 19f, 22f)
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
                moveTo(19f, 16f)
                verticalLineTo(6.5f)
                curveTo(19f, 5.4f, 18.1f, 4.5f, 17f, 4.5f)
                horizontalLineTo(11.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                lineTo(11f, 4.5f)
                lineTo(14f, 7f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                verticalLineTo(17.5f)
                curveTo(5f, 18.6f, 5.9f, 19.5f, 7f, 19.5f)
                horizontalLineTo(12.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 22f)
                lineTo(13f, 19.5f)
                lineTo(10f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                curveTo(6.657f, 8f, 8f, 6.657f, 8f, 5f)
                curveTo(8f, 3.343f, 6.657f, 2f, 5f, 2f)
                curveTo(3.343f, 2f, 2f, 3.343f, 2f, 5f)
                curveTo(2f, 6.657f, 3.343f, 8f, 5f, 8f)
                close()
            }
        }.build()

        return _ProgrammingArrows!!
    }

@Suppress("ObjectPropertyName")
private var _ProgrammingArrows: ImageVector? = null
