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

val VuesaxIconsTwotone.AttachSquare: ImageVector
    get() {
        if (_AttachSquare != null) {
            return _AttachSquare!!
        }
        _AttachSquare = ImageVector.Builder(
            name = "AttachSquare",
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
                moveTo(12.201f, 11.8f)
                lineTo(10.791f, 13.21f)
                curveTo(10.011f, 13.99f, 10.011f, 15.26f, 10.791f, 16.04f)
                curveTo(11.571f, 16.82f, 12.841f, 16.82f, 13.621f, 16.04f)
                lineTo(15.841f, 13.82f)
                curveTo(17.401f, 12.26f, 17.401f, 9.73f, 15.841f, 8.16f)
                curveTo(14.281f, 6.6f, 11.751f, 6.6f, 10.181f, 8.16f)
                lineTo(7.761f, 10.58f)
                curveTo(6.421f, 11.92f, 6.421f, 14.09f, 7.761f, 15.43f)
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

        return _AttachSquare!!
    }

@Suppress("ObjectPropertyName")
private var _AttachSquare: ImageVector? = null
