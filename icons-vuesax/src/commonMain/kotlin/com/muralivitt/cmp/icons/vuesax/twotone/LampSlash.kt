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

val VuesaxIconsTwotone.LampSlash: ImageVector
    get() {
        if (_LampSlash != null) {
            return _LampSlash!!
        }
        _LampSlash = ImageVector.Builder(
            name = "LampSlash",
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
                moveTo(20.03f, 2.48f)
                lineTo(4.18f, 18.33f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.25f, 13f)
                curveTo(4.83f, 12.03f, 4.58f, 10.98f, 4.58f, 9.9f)
                curveTo(4.58f, 4.99f, 8.8f, 1.12f, 13.6f, 2.17f)
                curveTo(15.06f, 2.49f, 16.36f, 3.27f, 17.36f, 4.35f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.06f, 7.3f)
                curveTo(20.28f, 11.18f, 18.31f, 15.08f, 15.52f, 16.87f)
                verticalLineTo(18.03f)
                curveTo(15.52f, 18.32f, 15.62f, 18.99f, 14.62f, 18.99f)
                horizontalLineTo(9.42f)
                curveTo(8.39f, 18.99f, 8.52f, 18.56f, 8.52f, 18.03f)
                verticalLineTo(16.87f)
                curveTo(8.04f, 16.57f, 7.59f, 16.2f, 7.16f, 15.77f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 22f)
                curveTo(10.79f, 21.35f, 13.21f, 21.35f, 15.5f, 22f)
            }
        }.build()

        return _LampSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LampSlash: ImageVector? = null
