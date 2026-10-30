package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Heart: ImageVector
    get() {
        if (_Heart != null) {
            return _Heart!!
        }
        _Heart = ImageVector.Builder(
            name = "Heart",
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
                moveTo(12.62f, 20.81f)
                curveTo(12.28f, 20.93f, 11.72f, 20.93f, 11.38f, 20.81f)
                curveTo(8.48f, 19.82f, 2f, 15.69f, 2f, 8.69f)
                curveTo(2f, 5.6f, 4.49f, 3.1f, 7.56f, 3.1f)
                curveTo(9.38f, 3.1f, 10.99f, 3.98f, 12f, 5.34f)
                curveTo(13.01f, 3.98f, 14.63f, 3.1f, 16.44f, 3.1f)
                curveTo(19.51f, 3.1f, 22f, 5.6f, 22f, 8.69f)
                curveTo(22f, 15.69f, 15.52f, 19.82f, 12.62f, 20.81f)
                close()
            }
        }.build()

        return _Heart!!
    }

@Suppress("ObjectPropertyName")
private var _Heart: ImageVector? = null
