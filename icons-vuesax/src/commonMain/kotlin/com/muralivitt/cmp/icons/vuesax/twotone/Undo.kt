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

val VuesaxIconsTwotone.Undo: ImageVector
    get() {
        if (_Undo != null) {
            return _Undo!!
        }
        _Undo = ImageVector.Builder(
            name = "Undo",
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
                moveTo(7.131f, 18.31f)
                horizontalLineTo(15.131f)
                curveTo(17.891f, 18.31f, 20.131f, 16.07f, 20.131f, 13.31f)
                curveTo(20.131f, 10.55f, 17.891f, 8.31f, 15.131f, 8.31f)
                horizontalLineTo(4.131f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.429f, 10.81f)
                lineTo(3.869f, 8.25f)
                lineTo(6.429f, 5.69f)
            }
        }.build()

        return _Undo!!
    }

@Suppress("ObjectPropertyName")
private var _Undo: ImageVector? = null
