package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Ship: ImageVector
    get() {
        if (_Ship != null) {
            return _Ship!!
        }
        _Ship = ImageVector.Builder(
            name = "Ship",
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
                moveTo(20.42f, 12.37f)
                curveTo(21.29f, 12.72f, 21.83f, 13.75f, 21.63f, 14.66f)
                lineTo(21.22f, 16.52f)
                curveTo(20.51f, 19.72f, 18f, 22f, 14.38f, 22f)
                horizontalLineTo(9.62f)
                curveTo(6f, 22f, 3.49f, 19.72f, 2.78f, 16.52f)
                lineTo(2.37f, 14.66f)
                curveTo(2.17f, 13.75f, 2.71f, 12.72f, 3.58f, 12.37f)
                lineTo(5f, 11.8f)
                lineTo(10.51f, 9.59f)
                curveTo(11.47f, 9.21f, 12.53f, 9.21f, 13.49f, 9.59f)
                lineTo(19f, 11.8f)
                lineTo(20.42f, 12.37f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 8f)
                verticalLineTo(11.8f)
                lineTo(13.49f, 9.59f)
                curveTo(12.53f, 9.21f, 11.47f, 9.21f, 10.51f, 9.59f)
                lineTo(5f, 11.8f)
                verticalLineTo(8f)
                curveTo(5f, 6.35f, 6.35f, 5f, 8f, 5f)
                horizontalLineTo(16f)
                curveTo(17.65f, 5f, 19f, 6.35f, 19f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 5f)
                horizontalLineTo(9.5f)
                verticalLineTo(3f)
                curveTo(9.5f, 2.45f, 9.95f, 2f, 10.5f, 2f)
                horizontalLineTo(13.5f)
                curveTo(14.05f, 2f, 14.5f, 2.45f, 14.5f, 3f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _Ship!!
    }

@Suppress("ObjectPropertyName")
private var _Ship: ImageVector? = null
