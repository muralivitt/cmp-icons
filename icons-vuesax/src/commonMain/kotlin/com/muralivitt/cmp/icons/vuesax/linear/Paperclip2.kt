package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Paperclip2: ImageVector
    get() {
        if (_Paperclip2 != null) {
            return _Paperclip2!!
        }
        _Paperclip2 = ImageVector.Builder(
            name = "Paperclip2",
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
                moveTo(12.33f, 12.15f)
                lineTo(9.86f, 14.62f)
                curveTo(8.49f, 15.99f, 8.49f, 18.2f, 9.86f, 19.57f)
                curveTo(11.23f, 20.94f, 13.44f, 20.94f, 14.81f, 19.57f)
                lineTo(18.7f, 15.68f)
                curveTo(21.43f, 12.95f, 21.43f, 8.51f, 18.7f, 5.78f)
                curveTo(15.97f, 3.05f, 11.53f, 3.05f, 8.8f, 5.78f)
                lineTo(4.56f, 10.02f)
                curveTo(2.22f, 12.36f, 2.22f, 16.16f, 4.56f, 18.51f)
            }
        }.build()

        return _Paperclip2!!
    }

@Suppress("ObjectPropertyName")
private var _Paperclip2: ImageVector? = null
