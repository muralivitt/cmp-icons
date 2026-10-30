package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Teacher: ImageVector
    get() {
        if (_Teacher != null) {
            return _Teacher!!
        }
        _Teacher = ImageVector.Builder(
            name = "Teacher",
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
                moveTo(10.05f, 2.53f)
                lineTo(4.03f, 6.46f)
                curveTo(2.1f, 7.72f, 2.1f, 10.54f, 4.03f, 11.8f)
                lineTo(10.05f, 15.73f)
                curveTo(11.13f, 16.44f, 12.91f, 16.44f, 13.99f, 15.73f)
                lineTo(19.98f, 11.8f)
                curveTo(21.9f, 10.54f, 21.9f, 7.73f, 19.98f, 6.47f)
                lineTo(13.99f, 2.54f)
                curveTo(12.91f, 1.82f, 11.13f, 1.82f, 10.05f, 2.53f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.63f, 13.08f)
                lineTo(5.62f, 17.77f)
                curveTo(5.62f, 19.04f, 6.6f, 20.4f, 7.8f, 20.8f)
                lineTo(10.99f, 21.86f)
                curveTo(11.54f, 22.04f, 12.45f, 22.04f, 13.01f, 21.86f)
                lineTo(16.2f, 20.8f)
                curveTo(17.4f, 20.4f, 18.38f, 19.04f, 18.38f, 17.77f)
                verticalLineTo(13.13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.4f, 15f)
                verticalLineTo(9f)
            }
        }.build()

        return _Teacher!!
    }

@Suppress("ObjectPropertyName")
private var _Teacher: ImageVector? = null
