package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.Routing2: ImageVector
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(5.471f, 9f)
                curveTo(7.404f, 9f, 8.971f, 7.433f, 8.971f, 5.5f)
                curveTo(8.971f, 3.567f, 7.404f, 2f, 5.471f, 2f)
                curveTo(3.538f, 2f, 1.971f, 3.567f, 1.971f, 5.5f)
                curveTo(1.971f, 7.433f, 3.538f, 9f, 5.471f, 9f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(16.971f, 15f)
                horizontalLineTo(19.971f)
                curveTo(21.071f, 15f, 21.971f, 15.9f, 21.971f, 17f)
                verticalLineTo(20f)
                curveTo(21.971f, 21.1f, 21.071f, 22f, 19.971f, 22f)
                horizontalLineTo(16.971f)
                curveTo(15.871f, 22f, 14.971f, 21.1f, 14.971f, 20f)
                verticalLineTo(17f)
                curveTo(14.971f, 15.9f, 15.871f, 15f, 16.971f, 15f)
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
                horizontalLineTo(5.497f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.486f, 18.5f)
                horizontalLineTo(18.497f)
            }
        }.build()

        return _Routing2!!
    }

@Suppress("ObjectPropertyName")
private var _Routing2: ImageVector? = null
