package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Path: ImageVector
    get() {
        if (_Path != null) {
            return _Path!!
        }
        _Path = ImageVector.Builder(
            name = "Path",
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
                moveTo(19.79f, 7.27f)
                lineTo(16.76f, 4.24f)
                curveTo(15.61f, 3.09f, 14.04f, 3.15f, 13.27f, 4.38f)
                lineTo(11.58f, 7.05f)
                lineTo(16.98f, 12.45f)
                lineTo(19.65f, 10.76f)
                curveTo(20.8f, 10.03f, 20.87f, 8.35f, 19.79f, 7.27f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.58f, 7.05f)
                lineTo(7.65f, 6.81f)
                curveTo(5.46f, 6.68f, 4.69f, 7.35f, 4.45f, 9.44f)
                lineTo(3.47f, 17.76f)
                curveTo(3.26f, 19.51f, 4.53f, 20.77f, 6.27f, 20.56f)
                lineTo(14.59f, 19.58f)
                curveTo(16.68f, 19.33f, 17.44f, 18.57f, 17.22f, 16.38f)
                lineTo(16.99f, 12.45f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.61f, 19.42f)
                lineTo(7.64f, 16.38f)
            }
        }.build()

        return _Path!!
    }

@Suppress("ObjectPropertyName")
private var _Path: ImageVector? = null
