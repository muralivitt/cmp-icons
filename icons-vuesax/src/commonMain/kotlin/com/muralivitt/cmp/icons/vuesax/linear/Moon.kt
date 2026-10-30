package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Moon: ImageVector
    get() {
        if (_Moon != null) {
            return _Moon!!
        }
        _Moon = ImageVector.Builder(
            name = "Moon",
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
                moveTo(2.03f, 12.42f)
                curveTo(2.39f, 17.57f, 6.76f, 21.76f, 11.99f, 21.99f)
                curveTo(15.68f, 22.15f, 18.98f, 20.43f, 20.96f, 17.72f)
                curveTo(21.78f, 16.61f, 21.34f, 15.87f, 19.97f, 16.12f)
                curveTo(19.3f, 16.24f, 18.61f, 16.29f, 17.89f, 16.26f)
                curveTo(13f, 16.06f, 9f, 11.97f, 8.98f, 7.14f)
                curveTo(8.97f, 5.84f, 9.24f, 4.61f, 9.73f, 3.49f)
                curveTo(10.27f, 2.25f, 9.62f, 1.66f, 8.37f, 2.19f)
                curveTo(4.41f, 3.86f, 1.7f, 7.85f, 2.03f, 12.42f)
                close()
            }
        }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null
