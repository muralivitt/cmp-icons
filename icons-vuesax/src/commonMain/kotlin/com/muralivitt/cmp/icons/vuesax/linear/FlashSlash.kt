package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.FlashSlash: ImageVector
    get() {
        if (_FlashSlash != null) {
            return _FlashSlash!!
        }
        _FlashSlash = ImageVector.Builder(
            name = "FlashSlash",
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
                moveTo(9.18f, 18.04f)
                verticalLineTo(20.48f)
                curveTo(9.18f, 22.16f, 10.09f, 22.5f, 11.2f, 21.24f)
                lineTo(18.77f, 12.64f)
                curveTo(19.7f, 11.59f, 19.31f, 10.72f, 17.9f, 10.72f)
                horizontalLineTo(16.97f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.82f, 8.84f)
                verticalLineTo(3.52f)
                curveTo(14.82f, 1.84f, 13.91f, 1.5f, 12.8f, 2.76f)
                lineTo(5.23f, 11.36f)
                curveTo(4.3f, 12.41f, 4.69f, 13.28f, 6.1f, 13.28f)
                horizontalLineTo(9.19f)
                verticalLineTo(14.46f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
        }.build()

        return _FlashSlash!!
    }

@Suppress("ObjectPropertyName")
private var _FlashSlash: ImageVector? = null
