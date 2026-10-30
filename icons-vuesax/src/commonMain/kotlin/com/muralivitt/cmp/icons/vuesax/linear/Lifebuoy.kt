package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Lifebuoy: ImageVector
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
                moveTo(12f, 16.5f)
                curveTo(14.485f, 16.5f, 16.5f, 14.485f, 16.5f, 12f)
                curveTo(16.5f, 9.515f, 14.485f, 7.5f, 12f, 7.5f)
                curveTo(9.515f, 7.5f, 7.5f, 9.515f, 7.5f, 12f)
                curveTo(7.5f, 14.485f, 9.515f, 16.5f, 12f, 16.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.9f, 4.93f)
                lineTo(8.44f, 8.46f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.9f, 19.07f)
                lineTo(8.44f, 15.54f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.05f, 19.07f)
                lineTo(15.51f, 15.54f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
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
