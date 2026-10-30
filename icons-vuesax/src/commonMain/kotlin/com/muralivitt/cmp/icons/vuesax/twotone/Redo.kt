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

val VuesaxIconsTwotone.Redo: ImageVector
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.869f, 18.31f)
                horizontalLineTo(8.869f)
                curveTo(6.109f, 18.31f, 3.869f, 16.07f, 3.869f, 13.31f)
                curveTo(3.869f, 10.55f, 6.109f, 8.31f, 8.869f, 8.31f)
                horizontalLineTo(19.869f)
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
