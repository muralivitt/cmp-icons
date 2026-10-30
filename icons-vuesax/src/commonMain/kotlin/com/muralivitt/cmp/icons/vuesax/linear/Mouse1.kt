package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Mouse1: ImageVector
    get() {
        if (_Mouse1 != null) {
            return _Mouse1!!
        }
        _Mouse1 = ImageVector.Builder(
            name = "Mouse1",
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
                moveTo(16.15f, 12.83f)
                lineTo(14.42f, 13.41f)
                curveTo(13.94f, 13.57f, 13.57f, 13.94f, 13.41f, 14.42f)
                lineTo(12.83f, 16.15f)
                curveTo(12.34f, 17.64f, 10.24f, 17.61f, 9.78f, 16.12f)
                lineTo(7.83f, 9.84f)
                curveTo(7.45f, 8.59f, 8.6f, 7.44f, 9.83f, 7.82f)
                lineTo(16.12f, 9.77f)
                curveTo(17.61f, 10.24f, 17.63f, 12.34f, 16.15f, 12.83f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _Mouse1!!
    }

@Suppress("ObjectPropertyName")
private var _Mouse1: ImageVector? = null
