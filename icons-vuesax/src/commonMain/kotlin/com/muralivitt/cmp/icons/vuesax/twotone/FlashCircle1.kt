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

val VuesaxIconsTwotone.FlashCircle1: ImageVector
    get() {
        if (_FlashCircle1 != null) {
            return _FlashCircle1!!
        }
        _FlashCircle1 = ImageVector.Builder(
            name = "FlashCircle1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.681f, 12.72f)
                horizontalLineTo(10.42f)
                verticalLineTo(16.77f)
                curveTo(10.42f, 17.37f, 11.16f, 17.65f, 11.561f, 17.2f)
                lineTo(15.821f, 12.36f)
                curveTo(16.191f, 11.94f, 15.891f, 11.28f, 15.33f, 11.28f)
                horizontalLineTo(13.59f)
                verticalLineTo(7.23f)
                curveTo(13.59f, 6.63f, 12.851f, 6.35f, 12.45f, 6.8f)
                lineTo(8.191f, 11.64f)
                curveTo(7.821f, 12.06f, 8.121f, 12.72f, 8.681f, 12.72f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.971f, 22f)
                curveTo(17.494f, 22f, 21.971f, 17.523f, 21.971f, 12f)
                curveTo(21.971f, 6.477f, 17.494f, 2f, 11.971f, 2f)
                curveTo(6.448f, 2f, 1.971f, 6.477f, 1.971f, 12f)
                curveTo(1.971f, 17.523f, 6.448f, 22f, 11.971f, 22f)
                close()
            }
        }.build()

        return _FlashCircle1!!
    }

@Suppress("ObjectPropertyName")
private var _FlashCircle1: ImageVector? = null
