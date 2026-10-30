package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.TagRight: ImageVector
    get() {
        if (_TagRight != null) {
            return _TagRight!!
        }
        _TagRight = ImageVector.Builder(
            name = "TagRight",
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
                moveTo(4.22f, 3.1f)
                horizontalLineTo(15.66f)
                curveTo(16.34f, 3.1f, 17.19f, 3.57f, 17.55f, 4.15f)
                lineTo(21.73f, 10.83f)
                curveTo(22.13f, 11.48f, 22.09f, 12.5f, 21.63f, 13.11f)
                lineTo(16.45f, 20.01f)
                curveTo(16.08f, 20.5f, 15.28f, 20.9f, 14.67f, 20.9f)
                horizontalLineTo(4.22f)
                curveTo(2.47f, 20.9f, 1.41f, 18.98f, 2.33f, 17.49f)
                lineTo(5.1f, 13.06f)
                curveTo(5.47f, 12.47f, 5.47f, 11.51f, 5.1f, 10.92f)
                lineTo(2.33f, 6.49f)
                curveTo(1.41f, 5.02f, 2.48f, 3.1f, 4.22f, 3.1f)
                close()
            }
        }.build()

        return _TagRight!!
    }

@Suppress("ObjectPropertyName")
private var _TagRight: ImageVector? = null
