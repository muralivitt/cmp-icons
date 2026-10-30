package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Convertshape: ImageVector
    get() {
        if (_Convertshape != null) {
            return _Convertshape!!
        }
        _Convertshape = ImageVector.Builder(
            name = "Convertshape",
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
                moveTo(22f, 5.15f)
                verticalLineTo(8.85f)
                curveTo(22f, 11.1f, 21.1f, 12f, 18.85f, 12f)
                horizontalLineTo(16.15f)
                curveTo(13.9f, 12f, 13f, 11.1f, 13f, 8.85f)
                verticalLineTo(5.15f)
                curveTo(13f, 2.9f, 13.9f, 2f, 16.15f, 2f)
                horizontalLineTo(18.85f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 5.15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 15.15f)
                verticalLineTo(18.85f)
                curveTo(11f, 21.1f, 10.1f, 22f, 7.85f, 22f)
                horizontalLineTo(5.15f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 18.85f)
                verticalLineTo(15.15f)
                curveTo(2f, 12.9f, 2.9f, 12f, 5.15f, 12f)
                horizontalLineTo(7.85f)
                curveTo(10.1f, 12f, 11f, 12.9f, 11f, 15.15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 15f)
                curveTo(22f, 18.87f, 18.87f, 22f, 15f, 22f)
                lineTo(16.05f, 20.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                curveTo(2f, 5.13f, 5.13f, 2f, 9f, 2f)
                lineTo(7.95f, 3.75f)
            }
        }.build()

        return _Convertshape!!
    }

@Suppress("ObjectPropertyName")
private var _Convertshape: ImageVector? = null
