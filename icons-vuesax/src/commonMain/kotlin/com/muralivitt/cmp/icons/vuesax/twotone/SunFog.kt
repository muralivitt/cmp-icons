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

val VuesaxIconsTwotone.SunFog: ImageVector
    get() {
        if (_SunFog != null) {
            return _SunFog!!
        }
        _SunFog = ImageVector.Builder(
            name = "SunFog",
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
                moveTo(18.5f, 12f)
                curveTo(18.5f, 8.41f, 15.59f, 5.5f, 12f, 5.5f)
                curveTo(8.41f, 5.5f, 5.5f, 8.41f, 5.5f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.99f, 4.99f)
                lineTo(4.86f, 4.86f)
                moveTo(19.01f, 4.99f)
                lineTo(19.14f, 4.86f)
                lineTo(19.01f, 4.99f)
                close()
                moveTo(12f, 2.08f)
                verticalLineTo(2f)
                verticalLineTo(2.08f)
                close()
                moveTo(2.08f, 12f)
                horizontalLineTo(2f)
                horizontalLineTo(2.08f)
                close()
                moveTo(22f, 12f)
                horizontalLineTo(21.92f)
                horizontalLineTo(22f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 15f)
                horizontalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 18f)
                horizontalLineTo(18f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 21f)
                horizontalLineTo(15f)
            }
        }.build()

        return _SunFog!!
    }

@Suppress("ObjectPropertyName")
private var _SunFog: ImageVector? = null
