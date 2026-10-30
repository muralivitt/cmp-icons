package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Drop: ImageVector
    get() {
        if (_Drop != null) {
            return _Drop!!
        }
        _Drop = ImageVector.Builder(
            name = "Drop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.588f, 7.41f)
                lineTo(6.308f, 17.69f)
                curveTo(5.828f, 18.17f, 5.008f, 18.06f, 4.718f, 17.45f)
                curveTo(4.198f, 16.38f, 3.898f, 15.17f, 3.898f, 13.9f)
                curveTo(3.878f, 8.38f, 9.478f, 3.66f, 11.378f, 2.21f)
                curveTo(11.748f, 1.93f, 12.248f, 1.93f, 12.608f, 2.21f)
                curveTo(13.479f, 2.87f, 15.108f, 4.24f, 16.639f, 6.04f)
                curveTo(16.979f, 6.44f, 16.958f, 7.04f, 16.588f, 7.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.1f, 13.91f)
                curveTo(20.1f, 18.37f, 16.47f, 22f, 12f, 22f)
                curveTo(10.21f, 22f, 8.54f, 21.42f, 7.19f, 20.42f)
                curveTo(6.7f, 20.06f, 6.66f, 19.34f, 7.09f, 18.91f)
                lineTo(17.16f, 8.84f)
                curveTo(17.63f, 8.37f, 18.42f, 8.47f, 18.74f, 9.05f)
                curveTo(19.56f, 10.56f, 20.11f, 12.2f, 20.1f, 13.91f)
                close()
            }
        }.build()

        return _Drop!!
    }

@Suppress("ObjectPropertyName")
private var _Drop: ImageVector? = null
