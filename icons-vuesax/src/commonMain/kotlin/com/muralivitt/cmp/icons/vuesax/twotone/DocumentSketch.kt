package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.DocumentSketch: ImageVector
    get() {
        if (_DocumentSketch != null) {
            return _DocumentSketch!!
        }
        _DocumentSketch = ImageVector.Builder(
            name = "DocumentSketch",
            defaultWidth = 22.dp,
            defaultHeight = 22.dp,
            viewportWidth = 22f,
            viewportHeight = 22f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 9f)
                verticalLineTo(14f)
                curveTo(21f, 19f, 19f, 21f, 14f, 21f)
                horizontalLineTo(8f)
                curveTo(3f, 21f, 1f, 19f, 1f, 14f)
                verticalLineTo(8f)
                curveTo(1f, 3f, 3f, 1f, 8f, 1f)
                horizontalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 9f)
                horizontalLineTo(17f)
                curveTo(14f, 9f, 13f, 8f, 13f, 5f)
                verticalLineTo(1f)
                lineTo(21f, 9f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.32f, 11f)
                horizontalLineTo(9.97f)
                curveTo(10.24f, 11f, 10.58f, 11.18f, 10.72f, 11.4f)
                lineTo(11.85f, 13.1f)
                curveTo(12.08f, 13.44f, 12.03f, 13.95f, 11.74f, 14.24f)
                lineTo(9.28f, 16.7f)
                curveTo(8.93f, 17.05f, 8.35f, 17.05f, 8f, 16.7f)
                lineTo(5.54f, 14.24f)
                curveTo(5.25f, 13.95f, 5.2f, 13.44f, 5.43f, 13.1f)
                lineTo(6.56f, 11.4f)
                curveTo(6.72f, 11.18f, 7.06f, 11f, 7.32f, 11f)
                close()
            }
        }.build()

        return _DocumentSketch!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentSketch: ImageVector? = null
