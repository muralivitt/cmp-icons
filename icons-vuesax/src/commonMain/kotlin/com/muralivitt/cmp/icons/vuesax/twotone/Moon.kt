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

val VuesaxIconsTwotone.Moon: ImageVector
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
                moveTo(2.029f, 12.42f)
                curveTo(2.389f, 17.57f, 6.759f, 21.76f, 11.989f, 21.99f)
                curveTo(15.679f, 22.15f, 18.979f, 20.43f, 20.959f, 17.72f)
                curveTo(21.779f, 16.61f, 21.339f, 15.87f, 19.969f, 16.12f)
                curveTo(19.299f, 16.24f, 18.609f, 16.29f, 17.889f, 16.26f)
                curveTo(12.999f, 16.06f, 8.999f, 11.97f, 8.979f, 7.14f)
                curveTo(8.969f, 5.84f, 9.239f, 4.61f, 9.729f, 3.49f)
                curveTo(10.269f, 2.25f, 9.619f, 1.66f, 8.369f, 2.19f)
                curveTo(4.409f, 3.86f, 1.699f, 7.85f, 2.029f, 12.42f)
                close()
            }
        }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null
