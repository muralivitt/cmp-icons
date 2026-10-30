package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Component: ImageVector
    get() {
        if (_Component != null) {
            return _Component!!
        }
        _Component = ImageVector.Builder(
            name = "Component",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.95f, 14.55f)
                lineTo(14.56f, 20.94f)
                curveTo(13.16f, 22.34f, 10.86f, 22.34f, 9.45f, 20.94f)
                lineTo(3.06f, 14.55f)
                curveTo(1.66f, 13.15f, 1.66f, 10.85f, 3.06f, 9.44f)
                lineTo(9.45f, 3.05f)
                curveTo(10.85f, 1.65f, 13.15f, 1.65f, 14.56f, 3.05f)
                lineTo(20.95f, 9.44f)
                curveTo(22.35f, 10.85f, 22.35f, 13.15f, 20.95f, 14.55f)
                close()
            }
        }.build()

        return _Component!!
    }

@Suppress("ObjectPropertyName")
private var _Component: ImageVector? = null
