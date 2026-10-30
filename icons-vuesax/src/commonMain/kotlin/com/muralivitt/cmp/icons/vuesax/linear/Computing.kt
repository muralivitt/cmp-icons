package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Computing: ImageVector
    get() {
        if (_Computing != null) {
            return _Computing!!
        }
        _Computing = ImageVector.Builder(
            name = "Computing",
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
                moveTo(21.97f, 15f)
                verticalLineTo(9f)
                curveTo(21.97f, 4f, 19.97f, 2f, 14.97f, 2f)
                horizontalLineTo(8.97f)
                curveTo(3.97f, 2f, 1.97f, 4f, 1.97f, 9f)
                verticalLineTo(15f)
                curveTo(1.97f, 20f, 3.97f, 22f, 8.97f, 22f)
                horizontalLineTo(14.97f)
                curveTo(19.97f, 22f, 21.97f, 20f, 21.97f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.72f, 3.25f)
                lineTo(3.27f, 19.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.06f, 18f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 15.5f)
                horizontalLineTo(13.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 7.5f)
                horizontalLineTo(5.5f)
            }
        }.build()

        return _Computing!!
    }

@Suppress("ObjectPropertyName")
private var _Computing: ImageVector? = null
