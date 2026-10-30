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

val VuesaxIconsTwotone.Shuffle: ImageVector
    get() {
        if (_Shuffle != null) {
            return _Shuffle!!
        }
        _Shuffle = ImageVector.Builder(
            name = "Shuffle",
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
                moveTo(3f, 17.98f)
                lineTo(5.55f, 17.99f)
                curveTo(6.46f, 17.99f, 7.31f, 17.54f, 7.81f, 16.79f)
                lineTo(14.2f, 7.21f)
                curveTo(14.7f, 6.46f, 15.55f, 6f, 16.46f, 6.01f)
                lineTo(21.01f, 6.03f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.89f, 8.62f)
                lineTo(7.81f, 7.12f)
                curveTo(7.3f, 6.41f, 6.48f, 5.99f, 5.61f, 6f)
                lineTo(3f, 6.01f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 19.98f)
                lineTo(21f, 17.98f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.971f, 15.38f)
                lineTo(14.191f, 16.95f)
                curveTo(14.701f, 17.61f, 15.501f, 18f, 16.341f, 18f)
                lineTo(21.011f, 17.98f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 6.02f)
                lineTo(19f, 4.02f)
            }
        }.build()

        return _Shuffle!!
    }

@Suppress("ObjectPropertyName")
private var _Shuffle: ImageVector? = null
