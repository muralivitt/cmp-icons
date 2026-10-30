package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MinusCirlce: ImageVector
    get() {
        if (_MinusCirlce != null) {
            return _MinusCirlce!!
        }
        _MinusCirlce = ImageVector.Builder(
            name = "MinusCirlce",
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
                moveTo(11.92f, 22f)
                curveTo(17.42f, 22f, 21.92f, 17.5f, 21.92f, 12f)
                curveTo(21.92f, 6.5f, 17.42f, 2f, 11.92f, 2f)
                curveTo(6.42f, 2f, 1.92f, 6.5f, 1.92f, 12f)
                curveTo(1.92f, 17.5f, 6.42f, 22f, 11.92f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.92f, 12f)
                horizontalLineTo(15.92f)
            }
        }.build()

        return _MinusCirlce!!
    }

@Suppress("ObjectPropertyName")
private var _MinusCirlce: ImageVector? = null
