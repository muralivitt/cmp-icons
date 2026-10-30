package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Flag2: ImageVector
    get() {
        if (_Flag2 != null) {
            return _Flag2!!
        }
        _Flag2 = ImageVector.Builder(
            name = "Flag2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.199f, 7.16f)
                lineTo(7.199f, 3.7f)
                verticalLineTo(2.75f)
                curveTo(7.199f, 2.34f, 6.859f, 2f, 6.449f, 2f)
                curveTo(6.039f, 2f, 5.699f, 2.34f, 5.699f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(5.699f, 21.66f, 6.039f, 22f, 6.449f, 22f)
                curveTo(6.859f, 22f, 7.199f, 21.66f, 7.199f, 21.25f)
                verticalLineTo(17.29f)
                lineTo(15.419f, 13.23f)
                curveTo(15.419f, 13.23f, 15.419f, 13.23f, 15.429f, 13.23f)
                curveTo(17.089f, 12.37f, 17.979f, 11.26f, 17.929f, 10.09f)
                curveTo(17.879f, 8.92f, 16.909f, 7.88f, 15.199f, 7.16f)
                close()
            }
        }.build()

        return _Flag2!!
    }

@Suppress("ObjectPropertyName")
private var _Flag2: ImageVector? = null
