package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MessageSquare: ImageVector
    get() {
        if (_MessageSquare != null) {
            return _MessageSquare!!
        }
        _MessageSquare = ImageVector.Builder(
            name = "MessageSquare",
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
                moveTo(18.28f, 9.76f)
                verticalLineTo(12.9f)
                curveTo(18.28f, 13.1f, 18.27f, 13.3f, 18.25f, 13.49f)
                curveTo(18.07f, 15.61f, 16.82f, 16.67f, 14.52f, 16.67f)
                horizontalLineTo(14.21f)
                curveTo(14.01f, 16.67f, 13.82f, 16.76f, 13.71f, 16.92f)
                lineTo(12.77f, 18.18f)
                curveTo(12.35f, 18.74f, 11.68f, 18.74f, 11.26f, 18.18f)
                lineTo(10.32f, 16.92f)
                curveTo(10.22f, 16.79f, 9.99f, 16.67f, 9.82f, 16.67f)
                horizontalLineTo(9.51f)
                curveTo(7f, 16.67f, 5.75f, 16.05f, 5.75f, 12.91f)
                verticalLineTo(9.77f)
                curveTo(5.75f, 7.47f, 6.81f, 6.22f, 8.93f, 6.04f)
                curveTo(9.12f, 6.02f, 9.32f, 6.01f, 9.52f, 6.01f)
                horizontalLineTo(14.55f)
                curveTo(17.02f, 6f, 18.28f, 7.26f, 18.28f, 9.76f)
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

        return _MessageSquare!!
    }

@Suppress("ObjectPropertyName")
private var _MessageSquare: ImageVector? = null
