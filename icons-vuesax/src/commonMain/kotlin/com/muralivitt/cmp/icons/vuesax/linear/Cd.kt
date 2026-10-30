package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Cd: ImageVector
    get() {
        if (_Cd != null) {
            return _Cd!!
        }
        _Cd = ImageVector.Builder(
            name = "Cd",
            defaultWidth = 22.dp,
            defaultHeight = 22.dp,
            viewportWidth = 22f,
            viewportHeight = 22f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 21f)
                curveTo(16.523f, 21f, 21f, 16.523f, 21f, 11f)
                curveTo(21f, 5.477f, 16.523f, 1f, 11f, 1f)
                curveTo(5.477f, 1f, 1f, 5.477f, 1f, 11f)
                curveTo(1f, 16.523f, 5.477f, 21f, 11f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 13f)
                curveTo(12.105f, 13f, 13f, 12.105f, 13f, 11f)
                curveTo(13f, 9.895f, 12.105f, 9f, 11f, 9f)
                curveTo(9.895f, 9f, 9f, 9.895f, 9f, 11f)
                curveTo(9f, 12.105f, 9.895f, 13f, 11f, 13f)
                close()
            }
        }.build()

        return _Cd!!
    }

@Suppress("ObjectPropertyName")
private var _Cd: ImageVector? = null
