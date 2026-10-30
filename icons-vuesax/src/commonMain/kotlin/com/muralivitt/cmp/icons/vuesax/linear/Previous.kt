package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Previous: ImageVector
    get() {
        if (_Previous != null) {
            return _Previous!!
        }
        _Previous = ImageVector.Builder(
            name = "Previous",
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
                moveTo(20.24f, 7.22f)
                verticalLineTo(16.79f)
                curveTo(20.24f, 18.75f, 18.11f, 19.98f, 16.41f, 19f)
                lineTo(12.26f, 16.61f)
                lineTo(8.11f, 14.21f)
                curveTo(6.41f, 13.23f, 6.41f, 10.78f, 8.11f, 9.8f)
                lineTo(12.26f, 7.4f)
                lineTo(16.41f, 5.01f)
                curveTo(18.11f, 4.03f, 20.24f, 5.25f, 20.24f, 7.22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.76f, 18.18f)
                verticalLineTo(5.82f)
            }
        }.build()

        return _Previous!!
    }

@Suppress("ObjectPropertyName")
private var _Previous: ImageVector? = null
