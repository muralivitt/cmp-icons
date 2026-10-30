package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Redo: ImageVector
    get() {
        if (_Redo != null) {
            return _Redo!!
        }
        _Redo = ImageVector.Builder(
            name = "Redo",
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
                moveTo(16.87f, 18.31f)
                horizontalLineTo(8.87f)
                curveTo(6.11f, 18.31f, 3.87f, 16.07f, 3.87f, 13.31f)
                curveTo(3.87f, 10.55f, 6.11f, 8.31f, 8.87f, 8.31f)
                horizontalLineTo(19.87f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.57f, 10.81f)
                lineTo(20.13f, 8.25f)
                lineTo(17.57f, 5.69f)
            }
        }.build()

        return _Redo!!
    }

@Suppress("ObjectPropertyName")
private var _Redo: ImageVector? = null
