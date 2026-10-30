package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.AttachSquare: ImageVector
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.2f, 11.8f)
                lineTo(10.79f, 13.21f)
                curveTo(10.01f, 13.99f, 10.01f, 15.26f, 10.79f, 16.04f)
                curveTo(11.57f, 16.82f, 12.84f, 16.82f, 13.62f, 16.04f)
                lineTo(15.84f, 13.82f)
                curveTo(17.4f, 12.26f, 17.4f, 9.73f, 15.84f, 8.16f)
                curveTo(14.28f, 6.6f, 11.75f, 6.6f, 10.18f, 8.16f)
                lineTo(7.76f, 10.58f)
                curveTo(6.42f, 11.92f, 6.42f, 14.09f, 7.76f, 15.43f)
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
