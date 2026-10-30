package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Bookmark2: ImageVector
    get() {
        if (_Bookmark2 != null) {
            return _Bookmark2!!
        }
        _Bookmark2 = ImageVector.Builder(
            name = "Bookmark2",
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
                moveTo(14f, 2f)
                curveTo(16f, 2f, 17f, 3.01f, 17f, 5.03f)
                verticalLineTo(12.08f)
                curveTo(17f, 14.07f, 15.59f, 14.84f, 13.86f, 13.8f)
                lineTo(12.54f, 13f)
                curveTo(12.24f, 12.82f, 11.76f, 12.82f, 11.46f, 13f)
                lineTo(10.14f, 13.8f)
                curveTo(8.41f, 14.84f, 7f, 14.07f, 7f, 12.08f)
                verticalLineTo(5.03f)
                curveTo(7f, 3.01f, 8f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.82f, 4.99f)
                curveTo(3.41f, 5.56f, 2f, 7.66f, 2f, 11.9f)
                verticalLineTo(14.93f)
                curveTo(2f, 19.98f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 19.98f, 22f, 14.93f)
                verticalLineTo(11.9f)
                curveTo(22f, 7.59f, 20.54f, 5.48f, 17f, 4.96f)
            }
        }.build()

        return _Bookmark2!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmark2: ImageVector? = null
