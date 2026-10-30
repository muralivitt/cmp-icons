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

val VuesaxIconsTwotone.Edit2: ImageVector
    get() {
        if (_Edit2 != null) {
            return _Edit2!!
        }
        _Edit2 = ImageVector.Builder(
            name = "Edit2",
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
                moveTo(13.259f, 3.6f)
                lineTo(5.049f, 12.29f)
                curveTo(4.739f, 12.62f, 4.439f, 13.27f, 4.379f, 13.72f)
                lineTo(4.009f, 16.96f)
                curveTo(3.879f, 18.13f, 4.719f, 18.93f, 5.879f, 18.73f)
                lineTo(9.099f, 18.18f)
                curveTo(9.549f, 18.1f, 10.179f, 17.77f, 10.489f, 17.43f)
                lineTo(18.699f, 8.74f)
                curveTo(20.119f, 7.24f, 20.759f, 5.53f, 18.549f, 3.44f)
                curveTo(16.349f, 1.37f, 14.679f, 2.1f, 13.259f, 3.6f)
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
                moveTo(11.891f, 5.05f)
                curveTo(12.321f, 7.81f, 14.561f, 9.92f, 17.341f, 10.2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 22f)
                horizontalLineTo(21f)
            }
        }.build()

        return _Edit2!!
    }

@Suppress("ObjectPropertyName")
private var _Edit2: ImageVector? = null
