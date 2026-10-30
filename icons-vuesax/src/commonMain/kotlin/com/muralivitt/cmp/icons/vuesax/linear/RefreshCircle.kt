package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.RefreshCircle: ImageVector
    get() {
        if (_RefreshCircle != null) {
            return _RefreshCircle!!
        }
        _RefreshCircle = ImageVector.Builder(
            name = "RefreshCircle",
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
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.01f, 14.51f)
                curveTo(8.19f, 14.81f, 8.41f, 15.09f, 8.66f, 15.34f)
                curveTo(10.5f, 17.18f, 13.49f, 17.18f, 15.34f, 15.34f)
                curveTo(16.09f, 14.59f, 16.52f, 13.64f, 16.66f, 12.67f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.34f, 11.33f)
                curveTo(7.48f, 10.35f, 7.91f, 9.41f, 8.66f, 8.66f)
                curveTo(10.5f, 6.82f, 13.49f, 6.82f, 15.34f, 8.66f)
                curveTo(15.6f, 8.92f, 15.81f, 9.2f, 15.99f, 9.49f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.82f, 17.18f)
                verticalLineTo(14.51f)
                horizontalLineTo(10.49f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.18f, 6.82f)
                verticalLineTo(9.49f)
                horizontalLineTo(13.51f)
            }
        }.build()

        return _RefreshCircle!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCircle: ImageVector? = null
