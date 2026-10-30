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

val VuesaxIconsTwotone.VideoCircle: ImageVector
    get() {
        if (_VideoCircle != null) {
            return _VideoCircle!!
        }
        _VideoCircle = ImageVector.Builder(
            name = "VideoCircle",
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
                moveTo(9.1f, 12f)
                verticalLineTo(10.52f)
                curveTo(9.1f, 8.61f, 10.45f, 7.84f, 12.1f, 8.79f)
                lineTo(13.38f, 9.53f)
                lineTo(14.66f, 10.27f)
                curveTo(16.31f, 11.22f, 16.31f, 12.78f, 14.66f, 13.73f)
                lineTo(13.38f, 14.47f)
                lineTo(12.1f, 15.21f)
                curveTo(10.45f, 16.16f, 9.1f, 15.38f, 9.1f, 13.48f)
                verticalLineTo(12f)
                close()
            }
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
        }.build()

        return _VideoCircle!!
    }

@Suppress("ObjectPropertyName")
private var _VideoCircle: ImageVector? = null
