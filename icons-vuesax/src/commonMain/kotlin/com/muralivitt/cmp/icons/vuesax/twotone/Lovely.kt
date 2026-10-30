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

val VuesaxIconsTwotone.Lovely: ImageVector
    get() {
        if (_Lovely != null) {
            return _Lovely!!
        }
        _Lovely = ImageVector.Builder(
            name = "Lovely",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.86f, 8.09f)
                curveTo(19.86f, 8.51f, 19.83f, 8.92f, 19.78f, 9.31f)
                curveTo(19.32f, 9.11f, 18.82f, 9f, 18.29f, 9f)
                curveTo(17.07f, 9f, 15.99f, 9.59f, 15.32f, 10.49f)
                curveTo(14.64f, 9.59f, 13.56f, 9f, 12.34f, 9f)
                curveTo(10.29f, 9f, 8.63f, 10.67f, 8.63f, 12.74f)
                curveTo(8.63f, 15.42f, 10.05f, 17.47f, 11.63f, 18.86f)
                curveTo(11.58f, 18.89f, 11.53f, 18.9f, 11.48f, 18.92f)
                curveTo(11.18f, 19.03f, 10.68f, 19.03f, 10.38f, 18.92f)
                curveTo(7.79f, 18.03f, 2f, 14.35f, 2f, 8.09f)
                curveTo(2f, 5.33f, 4.22f, 3.1f, 6.96f, 3.1f)
                curveTo(8.59f, 3.1f, 10.03f, 3.88f, 10.93f, 5.09f)
                curveTo(11.84f, 3.88f, 13.28f, 3.1f, 14.9f, 3.1f)
                curveTo(17.64f, 3.1f, 19.86f, 5.33f, 19.86f, 8.09f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22.001f, 12.74f)
                curveTo(22.001f, 17.42f, 17.671f, 20.18f, 15.731f, 20.84f)
                curveTo(15.501f, 20.92f, 15.131f, 20.92f, 14.901f, 20.84f)
                curveTo(14.071f, 20.56f, 12.801f, 19.89f, 11.631f, 18.86f)
                curveTo(10.051f, 17.47f, 8.631f, 15.42f, 8.631f, 12.74f)
                curveTo(8.631f, 10.67f, 10.291f, 9f, 12.341f, 9f)
                curveTo(13.561f, 9f, 14.641f, 9.59f, 15.321f, 10.49f)
                curveTo(15.991f, 9.59f, 17.071f, 9f, 18.291f, 9f)
                curveTo(18.821f, 9f, 19.321f, 9.11f, 19.781f, 9.31f)
                curveTo(21.091f, 9.89f, 22.001f, 11.2f, 22.001f, 12.74f)
                close()
            }
        }.build()

        return _Lovely!!
    }

@Suppress("ObjectPropertyName")
private var _Lovely: ImageVector? = null
