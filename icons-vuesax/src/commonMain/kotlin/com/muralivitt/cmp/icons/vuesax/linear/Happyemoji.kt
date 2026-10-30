package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Happyemoji: ImageVector
    get() {
        if (_Happyemoji != null) {
            return _Happyemoji!!
        }
        _Happyemoji = ImageVector.Builder(
            name = "Happyemoji",
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
                moveTo(11.97f, 22f)
                curveTo(17.493f, 22f, 21.97f, 17.523f, 21.97f, 12f)
                curveTo(21.97f, 6.477f, 17.493f, 2f, 11.97f, 2f)
                curveTo(6.447f, 2f, 1.97f, 6.477f, 1.97f, 12f)
                curveTo(1.97f, 17.523f, 6.447f, 22f, 11.97f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.21f, 16f)
                curveTo(8.26f, 17.51f, 10.02f, 18.5f, 12f, 18.5f)
                curveTo(13.98f, 18.5f, 15.73f, 17.51f, 16.79f, 16f)
            }
        }.build()

        return _Happyemoji!!
    }

@Suppress("ObjectPropertyName")
private var _Happyemoji: ImageVector? = null
