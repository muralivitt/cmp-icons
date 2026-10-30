package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Car: ImageVector
    get() {
        if (_Car != null) {
            return _Car!!
        }
        _Car = ImageVector.Builder(
            name = "Car",
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
                moveTo(15.51f, 2.83f)
                horizontalLineTo(8.49f)
                curveTo(6f, 2.83f, 5.45f, 4.07f, 5.13f, 5.59f)
                lineTo(4f, 11f)
                horizontalLineTo(20f)
                lineTo(18.87f, 5.59f)
                curveTo(18.55f, 4.07f, 18f, 2.83f, 15.51f, 2.83f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.99f, 19.82f)
                curveTo(22.1f, 20.99f, 21.16f, 22f, 19.96f, 22f)
                horizontalLineTo(18.08f)
                curveTo(17f, 22f, 16.85f, 21.54f, 16.66f, 20.97f)
                lineTo(16.46f, 20.37f)
                curveTo(16.18f, 19.55f, 16f, 19f, 14.56f, 19f)
                horizontalLineTo(9.44f)
                curveTo(8f, 19f, 7.79f, 19.62f, 7.54f, 20.37f)
                lineTo(7.34f, 20.97f)
                curveTo(7.15f, 21.54f, 7f, 22f, 5.92f, 22f)
                horizontalLineTo(4.04f)
                curveTo(2.84f, 22f, 1.9f, 20.99f, 2.01f, 19.82f)
                lineTo(2.57f, 13.73f)
                curveTo(2.71f, 12.23f, 3f, 11f, 5.62f, 11f)
                horizontalLineTo(18.38f)
                curveTo(21f, 11f, 21.29f, 12.23f, 21.43f, 13.73f)
                lineTo(21.99f, 19.82f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 8f)
                horizontalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 8f)
                horizontalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 5f)
                horizontalLineTo(13.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 15f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 15f)
                horizontalLineTo(18f)
            }
        }.build()

        return _Car!!
    }

@Suppress("ObjectPropertyName")
private var _Car: ImageVector? = null
