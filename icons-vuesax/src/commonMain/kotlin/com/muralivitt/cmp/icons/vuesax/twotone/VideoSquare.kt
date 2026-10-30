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

val VuesaxIconsTwotone.VideoSquare: ImageVector
    get() {
        if (_VideoSquare != null) {
            return _VideoSquare!!
        }
        _VideoSquare = ImageVector.Builder(
            name = "VideoSquare",
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
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
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
        }.build()

        return _VideoSquare!!
    }

@Suppress("ObjectPropertyName")
private var _VideoSquare: ImageVector? = null
