package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.SafeHome: ImageVector
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.949f, 11.01f)
                lineTo(20.519f, 13.6f)
                lineTo(19.519f, 13.19f)
                curveTo(18.889f, 12.94f, 18.189f, 12.94f, 17.559f, 13.19f)
                lineTo(14.779f, 14.33f)
                curveTo(14.399f, 14.49f, 14.089f, 14.95f, 14.089f, 15.37f)
                verticalLineTo(17.56f)
                curveTo(14.089f, 18.81f, 14.549f, 20.02f, 15.339f, 21f)
                horizontalLineTo(6.179f)
                curveTo(4.809f, 21f, 3.519f, 19.91f, 3.289f, 18.56f)
                lineTo(2.029f, 11.01f)
                curveTo(1.869f, 10.08f, 2.339f, 8.83f, 3.079f, 8.24f)
                lineTo(9.659f, 2.98f)
                curveTo(10.669f, 2.17f, 12.309f, 2.17f, 13.319f, 2.99f)
                lineTo(19.899f, 8.24f)
                curveTo(20.629f, 8.83f, 21.109f, 10.08f, 20.949f, 11.01f)
                close()
            }
        }.build()

        return _SafeHome!!
    }

@Suppress("ObjectPropertyName")
private var _SafeHome: ImageVector? = null
