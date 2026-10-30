package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Grammerly: ImageVector
    get() {
        if (_Grammerly != null) {
            return _Grammerly!!
        }
        _Grammerly = ImageVector.Builder(
            name = "Grammerly",
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
                moveTo(19.07f, 4.95f)
                curveTo(23.04f, 8.92f, 22.97f, 15.4f, 18.87f, 19.29f)
                curveTo(15.08f, 22.88f, 8.93f, 22.88f, 5.13f, 19.29f)
                curveTo(1.02f, 15.4f, 0.95f, 8.92f, 4.93f, 4.95f)
                curveTo(8.83f, 1.04f, 15.17f, 1.04f, 19.07f, 4.95f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.84f, 16.07f)
                curveTo(13.72f, 18.07f, 10.28f, 18.07f, 8.17f, 16.07f)
            }
        }.build()

        return _Grammerly!!
    }

@Suppress("ObjectPropertyName")
private var _Grammerly: ImageVector? = null
