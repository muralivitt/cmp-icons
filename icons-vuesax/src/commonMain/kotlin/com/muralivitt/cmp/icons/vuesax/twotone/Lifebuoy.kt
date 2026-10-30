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

val VuesaxIconsTwotone.Lifebuoy: ImageVector
    get() {
        if (_Lifebuoy != null) {
            return _Lifebuoy!!
        }
        _Lifebuoy = ImageVector.Builder(
            name = "Lifebuoy",
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
                moveTo(11.971f, 22f)
                curveTo(17.494f, 22f, 21.971f, 17.523f, 21.971f, 12f)
                curveTo(21.971f, 6.477f, 17.494f, 2f, 11.971f, 2f)
                curveTo(6.448f, 2f, 1.971f, 6.477f, 1.971f, 12f)
                curveTo(1.971f, 17.523f, 6.448f, 22f, 11.971f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16.5f)
                curveTo(14.485f, 16.5f, 16.5f, 14.485f, 16.5f, 12f)
                curveTo(16.5f, 9.515f, 14.485f, 7.5f, 12f, 7.5f)
                curveTo(9.515f, 7.5f, 7.5f, 9.515f, 7.5f, 12f)
                curveTo(7.5f, 14.485f, 9.515f, 16.5f, 12f, 16.5f)
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
                moveTo(4.9f, 4.93f)
                lineTo(8.44f, 8.46f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.9f, 19.07f)
                lineTo(8.44f, 15.54f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.05f, 19.07f)
                lineTo(15.51f, 15.54f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.05f, 4.93f)
                lineTo(15.51f, 8.46f)
            }
        }.build()

        return _Lifebuoy!!
    }

@Suppress("ObjectPropertyName")
private var _Lifebuoy: ImageVector? = null
