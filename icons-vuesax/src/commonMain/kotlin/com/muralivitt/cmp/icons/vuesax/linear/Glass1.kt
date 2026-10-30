package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Glass1: ImageVector
    get() {
        if (_Glass1 != null) {
            return _Glass1!!
        }
        _Glass1 = ImageVector.Builder(
            name = "Glass1",
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
                moveTo(10f, 17.5f)
                horizontalLineTo(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 17.5f)
                verticalLineTo(7.5f)
                curveTo(2f, 3.5f, 3f, 2.5f, 7f, 2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 17.5f)
                verticalLineTo(7.5f)
                curveTo(22f, 3.5f, 21f, 2.5f, 17f, 2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 15.91f)
                verticalLineTo(19.2f)
                curveTo(10f, 21.2f, 9.2f, 22f, 7.2f, 22f)
                horizontalLineTo(4.8f)
                curveTo(2.8f, 22f, 2f, 21.2f, 2f, 19.2f)
                verticalLineTo(15.91f)
                curveTo(2f, 13.91f, 2.8f, 13.11f, 4.8f, 13.11f)
                horizontalLineTo(7.2f)
                curveTo(9.2f, 13.11f, 10f, 13.91f, 10f, 15.91f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 15.91f)
                verticalLineTo(19.2f)
                curveTo(22f, 21.2f, 21.2f, 22f, 19.2f, 22f)
                horizontalLineTo(16.8f)
                curveTo(14.8f, 22f, 14f, 21.2f, 14f, 19.2f)
                verticalLineTo(15.91f)
                curveTo(14f, 13.91f, 14.8f, 13.11f, 16.8f, 13.11f)
                horizontalLineTo(19.2f)
                curveTo(21.2f, 13.11f, 22f, 13.91f, 22f, 15.91f)
                close()
            }
        }.build()

        return _Glass1!!
    }

@Suppress("ObjectPropertyName")
private var _Glass1: ImageVector? = null
