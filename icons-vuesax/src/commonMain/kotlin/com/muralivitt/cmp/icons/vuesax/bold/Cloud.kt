package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Cloud: ImageVector
    get() {
        if (_Cloud != null) {
            return _Cloud!!
        }
        _Cloud = ImageVector.Builder(
            name = "Cloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.74f, 12.909f)
                curveTo(21.48f, 12.049f, 21.05f, 11.299f, 20.48f, 10.689f)
                curveTo(19.75f, 9.859f, 18.78f, 9.289f, 17.69f, 9.039f)
                curveTo(17.14f, 6.539f, 15.6f, 4.739f, 13.41f, 4.069f)
                curveTo(11.03f, 3.329f, 8.27f, 4.049f, 6.54f, 5.859f)
                curveTo(5.02f, 7.449f, 4.52f, 9.639f, 5.11f, 11.969f)
                curveTo(3.11f, 12.459f, 2.12f, 14.129f, 2.01f, 15.719f)
                curveTo(2f, 15.829f, 2f, 15.929f, 2f, 16.029f)
                curveTo(2f, 17.909f, 3.23f, 20.019f, 5.97f, 20.219f)
                horizontalLineTo(16.35f)
                curveTo(17.77f, 20.219f, 19.13f, 19.689f, 20.17f, 18.739f)
                curveTo(21.8f, 17.309f, 22.4f, 15.079f, 21.74f, 12.909f)
                close()
            }
        }.build()

        return _Cloud!!
    }

@Suppress("ObjectPropertyName")
private var _Cloud: ImageVector? = null
