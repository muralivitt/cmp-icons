package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Simcard1: ImageVector
    get() {
        if (_Simcard1 != null) {
            return _Simcard1!!
        }
        _Simcard1 = ImageVector.Builder(
            name = "Simcard1",
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
                moveTo(19.54f, 6.54f)
                lineTo(16.47f, 3.47f)
                curveTo(15.53f, 2.53f, 14.26f, 2f, 12.93f, 2f)
                horizontalLineTo(8f)
                curveTo(5f, 2f, 3f, 4f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 20f, 5f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(19f, 22f, 21f, 20f, 21f, 17f)
                verticalLineTo(10.07f)
                curveTo(21f, 8.74f, 20.47f, 7.47f, 19.54f, 6.54f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 18.5f)
                horizontalLineTo(14f)
                curveTo(15.65f, 18.5f, 17f, 17.15f, 17f, 15.5f)
                verticalLineTo(12.5f)
                curveTo(17f, 10.85f, 15.65f, 9.5f, 14f, 9.5f)
                horizontalLineTo(10f)
                curveTo(8.35f, 9.5f, 7f, 10.85f, 7f, 12.5f)
                verticalLineTo(15.5f)
                curveTo(7f, 17.15f, 8.35f, 18.5f, 10f, 18.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9.5f)
                verticalLineTo(18.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 14f)
                horizontalLineTo(16.5f)
            }
        }.build()

        return _Simcard1!!
    }

@Suppress("ObjectPropertyName")
private var _Simcard1: ImageVector? = null
