package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Speaker: ImageVector
    get() {
        if (_Speaker != null) {
            return _Speaker!!
        }
        _Speaker = ImageVector.Builder(
            name = "Speaker",
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
                curveTo(18f, 22f, 19f, 21f, 19f, 18f)
                verticalLineTo(6f)
                curveTo(19f, 3f, 18f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(6f, 2f, 5f, 3f, 5f, 6f)
                verticalLineTo(18f)
                curveTo(5f, 21f, 6f, 22f, 9f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                curveTo(13.657f, 18f, 15f, 16.657f, 15f, 15f)
                curveTo(15f, 13.343f, 13.657f, 12f, 12f, 12f)
                curveTo(10.343f, 12f, 9f, 13.343f, 9f, 15f)
                curveTo(9f, 16.657f, 10.343f, 18f, 12f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                curveTo(12.828f, 9f, 13.5f, 8.328f, 13.5f, 7.5f)
                curveTo(13.5f, 6.672f, 12.828f, 6f, 12f, 6f)
                curveTo(11.172f, 6f, 10.5f, 6.672f, 10.5f, 7.5f)
                curveTo(10.5f, 8.328f, 11.172f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _Speaker!!
    }

@Suppress("ObjectPropertyName")
private var _Speaker: ImageVector? = null
