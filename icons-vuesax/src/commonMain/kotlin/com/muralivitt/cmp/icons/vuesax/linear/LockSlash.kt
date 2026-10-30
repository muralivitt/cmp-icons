package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.LockSlash: ImageVector
    get() {
        if (_LockSlash != null) {
            return _LockSlash!!
        }
        _LockSlash = ImageVector.Builder(
            name = "LockSlash",
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
                moveTo(10.02f, 17.52f)
                curveTo(10.48f, 18.11f, 11.2f, 18.5f, 12f, 18.5f)
                curveTo(13.38f, 18.5f, 14.5f, 17.38f, 14.5f, 16f)
                curveTo(14.5f, 15.43f, 14.31f, 14.9f, 13.99f, 14.48f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.82f, 20.8f)
                curveTo(2.21f, 20.04f, 2f, 18.83f, 2f, 17f)
                verticalLineTo(15f)
                curveTo(2f, 11f, 3f, 10f, 7f, 10f)
                horizontalLineTo(17f)
                curveTo(17.36f, 10f, 17.69f, 10.01f, 18f, 10.03f)
                curveTo(21.17f, 10.21f, 22f, 11.36f, 22f, 15f)
                verticalLineTo(17f)
                curveTo(22f, 21f, 21f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(6.64f, 22f, 6.31f, 21.99f, 6f, 21.97f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 10f)
                verticalLineTo(8f)
                curveTo(6f, 4.69f, 7f, 2f, 12f, 2f)
                curveTo(16.15f, 2f, 17.54f, 3.38f, 17.9f, 5.56f)
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

        return _LockSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LockSlash: ImageVector? = null
