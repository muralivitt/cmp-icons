package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.SafeHome: ImageVector
    get() {
        if (_SafeHome != null) {
            return _SafeHome!!
        }
        _SafeHome = ImageVector.Builder(
            name = "SafeHome",
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
                moveTo(23f, 15.37f)
                verticalLineTo(17.56f)
                curveTo(23f, 20f, 21.22f, 22.3f, 18.8f, 22.97f)
                curveTo(18.63f, 23.01f, 18.45f, 23.01f, 18.29f, 22.97f)
                curveTo(17.11f, 22.65f, 16.07f, 21.93f, 15.34f, 21f)
                curveTo(14.55f, 20.02f, 14.09f, 18.81f, 14.09f, 17.56f)
                verticalLineTo(15.37f)
                curveTo(14.09f, 14.95f, 14.4f, 14.49f, 14.78f, 14.33f)
                lineTo(17.56f, 13.19f)
                curveTo(18.19f, 12.94f, 18.89f, 12.94f, 19.52f, 13.19f)
                lineTo(20.52f, 13.6f)
                lineTo(22.31f, 14.33f)
                curveTo(22.69f, 14.49f, 23f, 14.95f, 23f, 15.37f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.95f, 11.01f)
                lineTo(20.52f, 13.6f)
                lineTo(19.52f, 13.19f)
                curveTo(18.89f, 12.94f, 18.19f, 12.94f, 17.56f, 13.19f)
                lineTo(14.78f, 14.33f)
                curveTo(14.4f, 14.49f, 14.09f, 14.95f, 14.09f, 15.37f)
                verticalLineTo(17.56f)
                curveTo(14.09f, 18.81f, 14.55f, 20.02f, 15.34f, 21f)
                horizontalLineTo(6.18f)
                curveTo(4.81f, 21f, 3.52f, 19.91f, 3.29f, 18.56f)
                lineTo(2.03f, 11.01f)
                curveTo(1.87f, 10.08f, 2.34f, 8.83f, 3.08f, 8.24f)
                lineTo(9.66f, 2.98f)
                curveTo(10.67f, 2.17f, 12.31f, 2.17f, 13.32f, 2.99f)
                lineTo(19.9f, 8.24f)
                curveTo(20.63f, 8.83f, 21.11f, 10.08f, 20.95f, 11.01f)
                close()
            }
        }.build()

        return _SafeHome!!
    }

@Suppress("ObjectPropertyName")
private var _SafeHome: ImageVector? = null
