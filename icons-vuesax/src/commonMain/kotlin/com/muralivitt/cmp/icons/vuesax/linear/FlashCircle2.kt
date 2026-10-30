package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.FlashCircle2: ImageVector
    get() {
        if (_FlashCircle2 != null) {
            return _FlashCircle2!!
        }
        _FlashCircle2 = ImageVector.Builder(
            name = "FlashCircle2",
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
                moveTo(8.68f, 12.72f)
                horizontalLineTo(10.42f)
                verticalLineTo(16.77f)
                curveTo(10.42f, 17.37f, 11.16f, 17.65f, 11.56f, 17.2f)
                lineTo(15.82f, 12.36f)
                curveTo(16.19f, 11.94f, 15.89f, 11.28f, 15.33f, 11.28f)
                horizontalLineTo(13.59f)
                verticalLineTo(7.23f)
                curveTo(13.59f, 6.63f, 12.85f, 6.35f, 12.45f, 6.8f)
                lineTo(8.19f, 11.64f)
                curveTo(7.82f, 12.06f, 8.12f, 12.72f, 8.68f, 12.72f)
                close()
            }
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
        }.build()

        return _FlashCircle2!!
    }

@Suppress("ObjectPropertyName")
private var _FlashCircle2: ImageVector? = null
