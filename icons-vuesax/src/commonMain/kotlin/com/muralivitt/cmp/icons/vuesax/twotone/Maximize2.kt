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

val VuesaxIconsTwotone.Maximize2: ImageVector
    get() {
        if (_Maximize2 != null) {
            return _Maximize2!!
        }
        _Maximize2 = ImageVector.Builder(
            name = "Maximize2",
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
                moveTo(2f, 9f)
                verticalLineTo(6.5f)
                curveTo(2f, 4.01f, 4.01f, 2f, 6.5f, 2f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                horizontalLineTo(17.5f)
                curveTo(19.99f, 2f, 22f, 4.01f, 22f, 6.5f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 16f)
                verticalLineTo(17.5f)
                curveTo(22f, 19.99f, 19.99f, 22f, 17.5f, 22f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                horizontalLineTo(6.5f)
                curveTo(4.01f, 22f, 2f, 19.99f, 2f, 17.5f)
                verticalLineTo(15f)
            }
            path(
                fillAlpha = 0.54f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.54f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                verticalLineTo(10f)
                moveTo(6f, 12f)
                horizontalLineTo(12f)
                horizontalLineTo(18f)
                horizontalLineTo(6f)
                close()
                moveTo(6f, 12f)
                verticalLineTo(10f)
                verticalLineTo(12f)
                close()
                moveTo(6f, 12f)
                verticalLineTo(14f)
                verticalLineTo(12f)
                close()
                moveTo(18f, 12f)
                verticalLineTo(14f)
                verticalLineTo(12f)
                close()
            }
            path(
                fillAlpha = 0.54f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.54f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                horizontalLineTo(14f)
                moveTo(12f, 18f)
                verticalLineTo(6f)
                verticalLineTo(18f)
                close()
                moveTo(12f, 18f)
                horizontalLineTo(14f)
                horizontalLineTo(12f)
                close()
                moveTo(12f, 18f)
                horizontalLineTo(10f)
                horizontalLineTo(12f)
                close()
                moveTo(12f, 6f)
                horizontalLineTo(10f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _Maximize2!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize2: ImageVector? = null
