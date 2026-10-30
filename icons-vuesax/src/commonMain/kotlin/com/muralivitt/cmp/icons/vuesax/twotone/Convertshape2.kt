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

val VuesaxIconsTwotone.Convertshape2: ImageVector
    get() {
        if (_Convertshape2 != null) {
            return _Convertshape2!!
        }
        _Convertshape2 = ImageVector.Builder(
            name = "Convertshape2",
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
                moveTo(11f, 16.15f)
                verticalLineTo(18.85f)
                curveTo(11f, 21.1f, 10.1f, 22f, 7.85f, 22f)
                horizontalLineTo(5.15f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 18.85f)
                verticalLineTo(16.15f)
                curveTo(2f, 13.9f, 2.9f, 13f, 5.15f, 13f)
                horizontalLineTo(7.85f)
                curveTo(10.1f, 13f, 11f, 13.9f, 11f, 16.15f)
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
                moveTo(22f, 15f)
                curveTo(22f, 18.87f, 18.87f, 22f, 15f, 22f)
                lineTo(16.05f, 20.25f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                curveTo(2f, 5.13f, 5.13f, 2f, 9f, 2f)
                lineTo(7.95f, 3.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 11f)
                curveTo(19.985f, 11f, 22f, 8.985f, 22f, 6.5f)
                curveTo(22f, 4.015f, 19.985f, 2f, 17.5f, 2f)
                curveTo(15.015f, 2f, 13f, 4.015f, 13f, 6.5f)
                curveTo(13f, 8.985f, 15.015f, 11f, 17.5f, 11f)
                close()
            }
        }.build()

        return _Convertshape2!!
    }

@Suppress("ObjectPropertyName")
private var _Convertshape2: ImageVector? = null
