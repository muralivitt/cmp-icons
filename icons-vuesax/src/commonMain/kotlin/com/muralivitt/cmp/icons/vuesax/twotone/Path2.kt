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

val VuesaxIconsTwotone.Path2: ImageVector
    get() {
        if (_Path2 != null) {
            return _Path2!!
        }
        _Path2 = ImageVector.Builder(
            name = "Path2",
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
                moveTo(9.87f, 22f)
                horizontalLineTo(14.16f)
                curveTo(15.78f, 22f, 16.85f, 20.84f, 16.53f, 19.43f)
                lineTo(15.84f, 16.35f)
                horizontalLineTo(8.2f)
                lineTo(7.51f, 19.43f)
                curveTo(7.2f, 20.76f, 8.34f, 22f, 9.87f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.829f, 16.35f)
                lineTo(18.769f, 13.74f)
                curveTo(20.409f, 12.28f, 20.479f, 11.26f, 19.179f, 9.61f)
                lineTo(13.989f, 3.03f)
                curveTo(12.899f, 1.65f, 11.119f, 1.65f, 10.019f, 3.03f)
                lineTo(4.839f, 9.61f)
                curveTo(3.539f, 11.26f, 3.539f, 12.33f, 5.249f, 13.74f)
                lineTo(8.189f, 16.35f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.01f, 2.67f)
                verticalLineTo(6.97f)
            }
        }.build()

        return _Path2!!
    }

@Suppress("ObjectPropertyName")
private var _Path2: ImageVector? = null
