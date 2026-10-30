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

val VuesaxIconsTwotone.VideoSlash: ImageVector
    get() {
        if (_VideoSlash != null) {
            return _VideoSlash!!
        }
        _VideoSlash = ImageVector.Builder(
            name = "VideoSlash",
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
                moveTo(16.63f, 7.58f)
                curveTo(16.63f, 7.58f, 16.66f, 6.63f, 16.63f, 6.32f)
                curveTo(16.46f, 4.28f, 15.13f, 3.58f, 12.52f, 3.58f)
                horizontalLineTo(6.21f)
                curveTo(3.05f, 3.58f, 2f, 4.63f, 2f, 7.79f)
                verticalLineTo(16.21f)
                curveTo(2f, 17.47f, 2.38f, 18.74f, 3.37f, 19.55f)
                lineTo(4f, 20f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.74f, 10.95f)
                verticalLineTo(16.21f)
                curveTo(16.74f, 19.37f, 15.69f, 20.42f, 12.53f, 20.42f)
                horizontalLineTo(7.26f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6.74f)
                verticalLineTo(15.81f)
                curveTo(22f, 17.48f, 20.88f, 18.06f, 19.52f, 17.1f)
                lineTo(16.74f, 15.15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22.02f, 2.19f)
                lineTo(2.02f, 22.19f)
            }
        }.build()

        return _VideoSlash!!
    }

@Suppress("ObjectPropertyName")
private var _VideoSlash: ImageVector? = null
