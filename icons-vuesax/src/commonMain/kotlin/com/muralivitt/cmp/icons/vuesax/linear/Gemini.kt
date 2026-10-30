package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Gemini: ImageVector
    get() {
        if (_Gemini != null) {
            return _Gemini!!
        }
        _Gemini = ImageVector.Builder(
            name = "Gemini",
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
                moveTo(2f, 2f)
                curveTo(8.16f, 5.69f, 15.84f, 5.69f, 22f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 22f)
                curveTo(8.16f, 18.31f, 15.84f, 18.31f, 22f, 22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.3f, 3.58f)
                lineTo(5.43f, 3.82f)
                curveTo(8.17f, 9.03f, 8.12f, 15.25f, 5.33f, 20.41f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.67f, 20.41f)
                curveTo(15.89f, 15.25f, 15.84f, 9.03f, 18.57f, 3.82f)
                lineTo(18.7f, 3.58f)
            }
        }.build()

        return _Gemini!!
    }

@Suppress("ObjectPropertyName")
private var _Gemini: ImageVector? = null
