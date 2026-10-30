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

val VuesaxIconsTwotone.Forward15Seconds: ImageVector
    get() {
        if (_Forward15Seconds != null) {
            return _Forward15Seconds!!
        }
        _Forward15Seconds = ImageVector.Builder(
            name = "Forward15Seconds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.961f, 10.83f)
                horizontalLineTo(12.901f)
                lineTo(12.141f, 13.12f)
                horizontalLineTo(14.431f)
                curveTo(15.271f, 13.12f, 15.961f, 13.8f, 15.961f, 14.65f)
                curveTo(15.961f, 15.49f, 15.281f, 16.18f, 14.431f, 16.18f)
                horizontalLineTo(12.141f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.539f, 16.17f)
                verticalLineTo(10.83f)
                lineTo(8.039f, 12.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.98f, 4.47f)
                lineTo(12f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.089f, 7.8f)
                curveTo(20.199f, 9.28f, 20.889f, 11.11f, 20.889f, 13.11f)
                curveTo(20.889f, 18.02f, 16.909f, 22f, 11.999f, 22f)
                curveTo(7.089f, 22f, 3.109f, 18.02f, 3.109f, 13.11f)
                curveTo(3.109f, 8.2f, 7.089f, 4.22f, 11.999f, 4.22f)
                curveTo(12.679f, 4.22f, 13.339f, 4.31f, 13.979f, 4.46f)
            }
        }.build()

        return _Forward15Seconds!!
    }

@Suppress("ObjectPropertyName")
private var _Forward15Seconds: ImageVector? = null
