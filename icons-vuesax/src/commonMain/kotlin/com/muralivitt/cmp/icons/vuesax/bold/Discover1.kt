package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Discover1: ImageVector
    get() {
        if (_Discover1 != null) {
            return _Discover1!!
        }
        _Discover1 = ImageVector.Builder(
            name = "Discover1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                curveTo(2f, 17.51f, 6.49f, 22f, 12f, 22f)
                curveTo(17.51f, 22f, 22f, 17.51f, 22f, 12f)
                curveTo(22f, 6.49f, 17.51f, 2f, 12f, 2f)
                close()
                moveTo(10.5f, 16.13f)
                curveTo(9.05f, 16.13f, 7.88f, 14.95f, 7.88f, 13.51f)
                curveTo(7.88f, 10.41f, 10.4f, 7.89f, 13.5f, 7.89f)
                curveTo(14.95f, 7.89f, 16.12f, 9.07f, 16.12f, 10.51f)
                curveTo(16.12f, 13.6f, 13.6f, 16.13f, 10.5f, 16.13f)
                close()
            }
        }.build()

        return _Discover1!!
    }

@Suppress("ObjectPropertyName")
private var _Discover1: ImageVector? = null
