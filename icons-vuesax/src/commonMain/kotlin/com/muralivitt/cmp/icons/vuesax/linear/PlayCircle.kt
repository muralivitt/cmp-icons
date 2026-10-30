package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.PlayCircle: ImageVector
    get() {
        if (_PlayCircle != null) {
            return _PlayCircle!!
        }
        _PlayCircle = ImageVector.Builder(
            name = "PlayCircle",
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
                moveTo(8.74f, 12.23f)
                verticalLineTo(10.56f)
                curveTo(8.74f, 8.48f, 10.21f, 7.63f, 12.01f, 8.67f)
                lineTo(13.46f, 9.51f)
                lineTo(14.91f, 10.35f)
                curveTo(16.71f, 11.39f, 16.71f, 13.09f, 14.91f, 14.13f)
                lineTo(13.46f, 14.97f)
                lineTo(12.01f, 15.81f)
                curveTo(10.21f, 16.85f, 8.74f, 16f, 8.74f, 13.92f)
                verticalLineTo(12.23f)
                close()
            }
        }.build()

        return _PlayCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PlayCircle: ImageVector? = null
