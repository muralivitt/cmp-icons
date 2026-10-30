package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Bubble: ImageVector
    get() {
        if (_Bubble != null) {
            return _Bubble!!
        }
        _Bubble = ImageVector.Builder(
            name = "Bubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.591f, 1.75f)
                curveTo(12.621f, 1.75f, 10.211f, 4.16f, 10.211f, 7.13f)
                curveTo(10.211f, 10.1f, 12.621f, 12.51f, 15.591f, 12.51f)
                curveTo(18.561f, 12.51f, 20.971f, 10.1f, 20.971f, 7.13f)
                curveTo(20.971f, 4.16f, 18.561f, 1.75f, 15.591f, 1.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(6.359f, 13.031f)
                curveTo(4.529f, 13.031f, 3.029f, 14.521f, 3.029f, 16.361f)
                curveTo(3.029f, 18.201f, 4.519f, 19.691f, 6.359f, 19.691f)
                curveTo(8.189f, 19.691f, 9.689f, 18.201f, 9.689f, 16.361f)
                curveTo(9.689f, 14.521f, 8.189f, 13.031f, 6.359f, 13.031f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.621f, 16.621f)
                curveTo(15.071f, 16.621f, 13.811f, 17.881f, 13.811f, 19.431f)
                curveTo(13.811f, 20.981f, 15.071f, 22.241f, 16.621f, 22.241f)
                curveTo(18.17f, 22.241f, 19.431f, 20.981f, 19.431f, 19.431f)
                curveTo(19.431f, 17.881f, 18.17f, 16.621f, 16.621f, 16.621f)
                close()
            }
        }.build()

        return _Bubble!!
    }

@Suppress("ObjectPropertyName")
private var _Bubble: ImageVector? = null
