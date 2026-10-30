package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Setting4: ImageVector
    get() {
        if (_Setting4 != null) {
            return _Setting4!!
        }
        _Setting4 = ImageVector.Builder(
            name = "Setting4",
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
                moveTo(22f, 6.5f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 6.5f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 10f)
                curveTo(11.933f, 10f, 13.5f, 8.433f, 13.5f, 6.5f)
                curveTo(13.5f, 4.567f, 11.933f, 3f, 10f, 3f)
                curveTo(8.067f, 3f, 6.5f, 4.567f, 6.5f, 6.5f)
                curveTo(6.5f, 8.433f, 8.067f, 10f, 10f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 17.5f)
                horizontalLineTo(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17.5f)
                horizontalLineTo(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 21f)
                curveTo(15.933f, 21f, 17.5f, 19.433f, 17.5f, 17.5f)
                curveTo(17.5f, 15.567f, 15.933f, 14f, 14f, 14f)
                curveTo(12.067f, 14f, 10.5f, 15.567f, 10.5f, 17.5f)
                curveTo(10.5f, 19.433f, 12.067f, 21f, 14f, 21f)
                close()
            }
        }.build()

        return _Setting4!!
    }

@Suppress("ObjectPropertyName")
private var _Setting4: ImageVector? = null
