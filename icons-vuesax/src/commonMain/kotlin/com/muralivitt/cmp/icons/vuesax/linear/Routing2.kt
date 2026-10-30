package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Routing2: ImageVector
    get() {
        if (_Routing2 != null) {
            return _Routing2!!
        }
        _Routing2 = ImageVector.Builder(
            name = "Routing2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(5.47f, 9f)
                curveTo(7.403f, 9f, 8.97f, 7.433f, 8.97f, 5.5f)
                curveTo(8.97f, 3.567f, 7.403f, 2f, 5.47f, 2f)
                curveTo(3.537f, 2f, 1.97f, 3.567f, 1.97f, 5.5f)
                curveTo(1.97f, 7.433f, 3.537f, 9f, 5.47f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(16.97f, 15f)
                horizontalLineTo(19.97f)
                curveTo(21.07f, 15f, 21.97f, 15.9f, 21.97f, 17f)
                verticalLineTo(20f)
                curveTo(21.97f, 21.1f, 21.07f, 22f, 19.97f, 22f)
                horizontalLineTo(16.97f)
                curveTo(15.87f, 22f, 14.97f, 21.1f, 14.97f, 20f)
                verticalLineTo(17f)
                curveTo(14.97f, 15.9f, 15.87f, 15f, 16.97f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                horizontalLineTo(14.68f)
                curveTo(16.53f, 5f, 17.39f, 7.29f, 16f, 8.51f)
                lineTo(8.01f, 15.5f)
                curveTo(6.62f, 16.71f, 7.48f, 19f, 9.32f, 19f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.486f, 5.5f)
                horizontalLineTo(5.498f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.486f, 18.5f)
                horizontalLineTo(18.498f)
            }
        }.build()

        return _Routing2!!
    }

@Suppress("ObjectPropertyName")
private var _Routing2: ImageVector? = null
