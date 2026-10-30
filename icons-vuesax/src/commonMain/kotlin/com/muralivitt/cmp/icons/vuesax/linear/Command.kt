package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Command: ImageVector
    get() {
        if (_Command != null) {
            return _Command!!
        }
        _Command = ImageVector.Builder(
            name = "Command",
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
                moveTo(16f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 22f)
                curveTo(6.65f, 22f, 8f, 20.65f, 8f, 19f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                curveTo(3.35f, 16f, 2f, 17.35f, 2f, 19f)
                curveTo(2f, 20.65f, 3.35f, 22f, 5f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                curveTo(8f, 3.35f, 6.65f, 2f, 5f, 2f)
                curveTo(3.35f, 2f, 2f, 3.35f, 2f, 5f)
                curveTo(2f, 6.65f, 3.35f, 8f, 5f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                horizontalLineTo(19f)
                curveTo(20.65f, 8f, 22f, 6.65f, 22f, 5f)
                curveTo(22f, 3.35f, 20.65f, 2f, 19f, 2f)
                curveTo(17.35f, 2f, 16f, 3.35f, 16f, 5f)
                verticalLineTo(8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22f)
                curveTo(20.65f, 22f, 22f, 20.65f, 22f, 19f)
                curveTo(22f, 17.35f, 20.65f, 16f, 19f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                curveTo(16f, 20.65f, 17.35f, 22f, 19f, 22f)
                close()
            }
        }.build()

        return _Command!!
    }

@Suppress("ObjectPropertyName")
private var _Command: ImageVector? = null
