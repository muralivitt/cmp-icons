package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Milk: ImageVector
    get() {
        if (_Milk != null) {
            return _Milk!!
        }
        _Milk = ImageVector.Builder(
            name = "Milk",
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
                moveTo(18f, 15f)
                verticalLineTo(19f)
                curveTo(18f, 20.65f, 16.65f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(7.35f, 22f, 6f, 20.65f, 6f, 19f)
                verticalLineTo(13.98f)
                lineTo(9.89f, 14f)
                curveTo(10.62f, 14f, 11.34f, 14.17f, 12f, 14.5f)
                curveTo(12.66f, 14.83f, 13.38f, 15f, 14.12f, 15f)
                horizontalLineTo(18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 10.83f)
                verticalLineTo(15f)
                horizontalLineTo(14.12f)
                curveTo(13.38f, 15f, 12.66f, 14.83f, 12f, 14.5f)
                curveTo(11.34f, 14.17f, 10.62f, 14f, 9.89f, 14f)
                lineTo(6f, 13.98f)
                verticalLineTo(10.83f)
                curveTo(6f, 10.37f, 6.26f, 9.74f, 6.59f, 9.41f)
                lineTo(8.71f, 7.29f)
                curveTo(8.89f, 7.11f, 9f, 6.85f, 9f, 6.59f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(6.59f)
                curveTo(15f, 6.85f, 15.11f, 7.11f, 15.29f, 7.29f)
                lineTo(17.41f, 9.41f)
                curveTo(17.74f, 9.74f, 18f, 10.37f, 18f, 10.83f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 16f)
                verticalLineTo(15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 14.98f)
                verticalLineTo(13.98f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 5f)
                horizontalLineTo(9.5f)
                curveTo(8.67f, 5f, 8f, 4.32f, 8f, 3.5f)
                curveTo(8f, 2.68f, 8.67f, 2f, 9.5f, 2f)
                horizontalLineTo(14.5f)
                curveTo(15.33f, 2f, 16f, 2.68f, 16f, 3.5f)
                curveTo(16f, 4.32f, 15.33f, 5f, 14.5f, 5f)
                close()
            }
        }.build()

        return _Milk!!
    }

@Suppress("ObjectPropertyName")
private var _Milk: ImageVector? = null
