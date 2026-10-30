package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.DocumentSketch: ImageVector
    get() {
        if (_DocumentSketch != null) {
            return _DocumentSketch!!
        }
        _DocumentSketch = ImageVector.Builder(
            name = "DocumentSketch",
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
                moveTo(22f, 10f)
                verticalLineTo(15f)
                curveTo(22f, 20f, 20f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(4f, 22f, 2f, 20f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 4f, 4f, 2f, 9f, 2f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                horizontalLineTo(18f)
                curveTo(15f, 10f, 14f, 9f, 14f, 6f)
                verticalLineTo(2f)
                lineTo(22f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.32f, 12f)
                horizontalLineTo(10.97f)
                curveTo(11.24f, 12f, 11.58f, 12.18f, 11.72f, 12.4f)
                lineTo(12.85f, 14.1f)
                curveTo(13.08f, 14.44f, 13.03f, 14.95f, 12.74f, 15.24f)
                lineTo(10.28f, 17.7f)
                curveTo(9.93f, 18.05f, 9.35f, 18.05f, 9f, 17.7f)
                lineTo(6.54f, 15.24f)
                curveTo(6.25f, 14.95f, 6.2f, 14.44f, 6.43f, 14.1f)
                lineTo(7.56f, 12.4f)
                curveTo(7.72f, 12.18f, 8.06f, 12f, 8.32f, 12f)
                close()
            }
        }.build()

        return _DocumentSketch!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentSketch: ImageVector? = null
