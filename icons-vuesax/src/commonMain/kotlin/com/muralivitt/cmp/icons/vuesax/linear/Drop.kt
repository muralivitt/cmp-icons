package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Drop: ImageVector
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
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(12.61f, 2.21f)
                curveTo(12.25f, 1.93f, 11.75f, 1.93f, 11.39f, 2.21f)
                curveTo(9.49f, 3.66f, 3.88f, 8.39f, 3.91f, 13.9f)
                curveTo(3.91f, 18.36f, 7.54f, 22f, 12.01f, 22f)
                curveTo(16.48f, 22f, 20.11f, 18.37f, 20.11f, 13.91f)
                curveTo(20.12f, 8.48f, 14.5f, 3.67f, 12.61f, 2.21f)
                close()
            }
        }.build()

        return _Drop!!
    }

@Suppress("ObjectPropertyName")
private var _Drop: ImageVector? = null
