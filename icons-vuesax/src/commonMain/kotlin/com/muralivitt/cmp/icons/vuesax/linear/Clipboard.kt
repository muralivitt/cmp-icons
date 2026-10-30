package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Clipboard: ImageVector
    get() {
        if (_Clipboard != null) {
            return _Clipboard!!
        }
        _Clipboard = ImageVector.Builder(
            name = "Clipboard",
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
                moveTo(18.63f, 7.15f)
                curveTo(18.67f, 7.76f, 18.62f, 8.45f, 18.5f, 9.22f)
                lineTo(17.77f, 13.91f)
                curveTo(17.15f, 17.82f, 15.34f, 19.14f, 11.43f, 18.53f)
                lineTo(6.74f, 17.79f)
                curveTo(5.39f, 17.58f, 4.35f, 17.22f, 3.59f, 16.68f)
                curveTo(2.14f, 15.67f, 1.72f, 14.01f, 2.12f, 11.45f)
                lineTo(2.86f, 6.76f)
                curveTo(3.48f, 2.85f, 5.29f, 1.53f, 9.2f, 2.14f)
                lineTo(13.89f, 2.88f)
                curveTo(17.03f, 3.37f, 18.5f, 4.65f, 18.63f, 7.15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.5f, 13.47f)
                lineTo(19f, 17.98f)
                curveTo(17.75f, 21.74f, 15.75f, 22.74f, 11.99f, 21.49f)
                lineTo(7.48f, 19.99f)
                curveTo(5.21f, 19.24f, 3.95f, 18.2f, 3.59f, 16.68f)
                curveTo(4.35f, 17.22f, 5.39f, 17.58f, 6.74f, 17.79f)
                lineTo(11.43f, 18.53f)
                curveTo(15.34f, 19.14f, 17.15f, 17.82f, 17.77f, 13.91f)
                lineTo(18.5f, 9.22f)
                curveTo(18.62f, 8.45f, 18.67f, 7.76f, 18.63f, 7.15f)
                curveTo(21.02f, 8.42f, 21.54f, 10.34f, 20.5f, 13.47f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.24f, 8.98f)
                curveTo(9.201f, 8.98f, 9.98f, 8.201f, 9.98f, 7.24f)
                curveTo(9.98f, 6.279f, 9.201f, 5.5f, 8.24f, 5.5f)
                curveTo(7.279f, 5.5f, 6.5f, 6.279f, 6.5f, 7.24f)
                curveTo(6.5f, 8.201f, 7.279f, 8.98f, 8.24f, 8.98f)
                close()
            }
        }.build()

        return _Clipboard!!
    }

@Suppress("ObjectPropertyName")
private var _Clipboard: ImageVector? = null
