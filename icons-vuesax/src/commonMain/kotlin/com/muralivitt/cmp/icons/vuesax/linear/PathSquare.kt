package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.PathSquare: ImageVector
    get() {
        if (_PathSquare != null) {
            return _PathSquare!!
        }
        _PathSquare = ImageVector.Builder(
            name = "PathSquare",
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
                moveTo(16.75f, 9.12f)
                lineTo(14.9f, 7.27f)
                curveTo(14.2f, 6.57f, 13.24f, 6.61f, 12.77f, 7.35f)
                lineTo(11.74f, 8.98f)
                lineTo(15.03f, 12.27f)
                lineTo(16.66f, 11.24f)
                curveTo(17.37f, 10.8f, 17.41f, 9.77f, 16.75f, 9.12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.74f, 8.98f)
                lineTo(9.35f, 8.84f)
                curveTo(8.01f, 8.76f, 7.55f, 9.17f, 7.4f, 10.44f)
                lineTo(6.8f, 15.51f)
                curveTo(6.67f, 16.58f, 7.44f, 17.34f, 8.51f, 17.22f)
                lineTo(13.58f, 16.62f)
                curveTo(14.85f, 16.47f, 15.31f, 16.01f, 15.18f, 14.67f)
                lineTo(15.04f, 12.28f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.49f, 16.52f)
                lineTo(9.34f, 14.67f)
            }
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
        }.build()

        return _PathSquare!!
    }

@Suppress("ObjectPropertyName")
private var _PathSquare: ImageVector? = null
