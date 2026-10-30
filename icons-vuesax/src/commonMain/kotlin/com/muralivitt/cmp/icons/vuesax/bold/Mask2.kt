package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Mask2: ImageVector
    get() {
        if (_Mask2 != null) {
            return _Mask2!!
        }
        _Mask2 = ImageVector.Builder(
            name = "Mask2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18.649f, 4.591f)
                curveTo(16.889f, 2.991f, 14.559f, 2.031f, 11.999f, 2.031f)
                curveTo(6.499f, 2.031f, 2.029f, 6.501f, 2.029f, 12.001f)
                curveTo(2.029f, 17.501f, 6.499f, 21.971f, 11.999f, 21.971f)
                curveTo(14.559f, 21.971f, 16.889f, 21.011f, 18.649f, 19.411f)
                curveTo(20.689f, 17.601f, 21.969f, 14.941f, 21.969f, 12.001f)
                curveTo(21.969f, 9.061f, 20.689f, 6.401f, 18.649f, 4.591f)
                close()
                moveTo(11.969f, 16.391f)
                curveTo(11.949f, 18.041f, 10.719f, 18.441f, 9.569f, 17.981f)
                curveTo(7.199f, 17.031f, 5.529f, 14.711f, 5.529f, 12.001f)
                curveTo(5.529f, 9.291f, 7.199f, 6.971f, 9.569f, 6.011f)
                curveTo(10.719f, 5.551f, 11.949f, 5.961f, 11.969f, 7.601f)
                verticalLineTo(16.391f)
                close()
            }
        }.build()

        return _Mask2!!
    }

@Suppress("ObjectPropertyName")
private var _Mask2: ImageVector? = null
