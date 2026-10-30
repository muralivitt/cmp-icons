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

val VuesaxIconsTwotone.RouteSquare: ImageVector
    get() {
        if (_RouteSquare != null) {
            return _RouteSquare!!
        }
        _RouteSquare = ImageVector.Builder(
            name = "RouteSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.351f, 9.05f)
                lineTo(15.011f, 16.59f)
                curveTo(14.451f, 18.38f, 11.941f, 18.41f, 11.351f, 16.63f)
                lineTo(10.651f, 14.56f)
                curveTo(10.461f, 13.99f, 10.011f, 13.53f, 9.441f, 13.35f)
                lineTo(7.361f, 12.65f)
                curveTo(5.591f, 12.06f, 5.621f, 9.53f, 7.411f, 8.99f)
                lineTo(14.951f, 6.64f)
                curveTo(16.431f, 6.19f, 17.821f, 7.58f, 17.351f, 9.05f)
                close()
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

        return _RouteSquare!!
    }

@Suppress("ObjectPropertyName")
private var _RouteSquare: ImageVector? = null
