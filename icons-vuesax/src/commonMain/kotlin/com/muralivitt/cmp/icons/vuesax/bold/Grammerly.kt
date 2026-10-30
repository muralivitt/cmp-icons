package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Grammerly: ImageVector
    get() {
        if (_Grammerly != null) {
            return _Grammerly!!
        }
        _Grammerly = ImageVector.Builder(
            name = "Grammerly",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(19.111f, 4.96f)
                curveTo(15.2f, 1.05f, 8.85f, 1.05f, 4.94f, 4.96f)
                curveTo(0.96f, 8.94f, 1.03f, 15.43f, 5.14f, 19.33f)
                curveTo(8.94f, 22.92f, 15.101f, 22.92f, 18.9f, 19.33f)
                curveTo(23.021f, 15.43f, 23.09f, 8.94f, 19.111f, 4.96f)
                close()
                moveTo(16.381f, 16.65f)
                curveTo(15.181f, 17.79f, 13.601f, 18.36f, 12.021f, 18.36f)
                curveTo(10.441f, 18.36f, 8.86f, 17.79f, 7.66f, 16.65f)
                curveTo(7.36f, 16.36f, 7.35f, 15.89f, 7.63f, 15.59f)
                curveTo(7.92f, 15.29f, 8.39f, 15.28f, 8.69f, 15.56f)
                curveTo(10.521f, 17.29f, 13.51f, 17.3f, 15.351f, 15.56f)
                curveTo(15.651f, 15.28f, 16.131f, 15.29f, 16.41f, 15.59f)
                curveTo(16.701f, 15.89f, 16.681f, 16.36f, 16.381f, 16.65f)
                close()
            }
        }.build()

        return _Grammerly!!
    }

@Suppress("ObjectPropertyName")
private var _Grammerly: ImageVector? = null
