package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.FlashCircle: ImageVector
    get() {
        if (_FlashCircle != null) {
            return _FlashCircle!!
        }
        _FlashCircle = ImageVector.Builder(
            name = "FlashCircle",
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
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.68f, 11.91f)
                lineTo(10.33f, 12.32f)
                lineTo(9.38f, 16.16f)
                curveTo(9.16f, 17.06f, 9.6f, 17.36f, 10.36f, 16.83f)
                lineTo(15.54f, 13.24f)
                curveTo(16.17f, 12.8f, 16.08f, 12.29f, 15.33f, 12.1f)
                lineTo(13.68f, 11.69f)
                lineTo(14.63f, 7.85f)
                curveTo(14.85f, 6.95f, 14.41f, 6.65f, 13.65f, 7.18f)
                lineTo(8.47f, 10.77f)
                curveTo(7.84f, 11.21f, 7.93f, 11.72f, 8.68f, 11.91f)
                close()
            }
        }.build()

        return _FlashCircle!!
    }

@Suppress("ObjectPropertyName")
private var _FlashCircle: ImageVector? = null
