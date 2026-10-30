package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.User: ImageVector
    get() {
        if (_User != null) {
            return _User!!
        }
        _User = ImageVector.Builder(
            name = "User",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 12f)
                curveTo(14.761f, 12f, 17f, 9.761f, 17f, 7f)
                curveTo(17f, 4.239f, 14.761f, 2f, 12f, 2f)
                curveTo(9.239f, 2f, 7f, 4.239f, 7f, 7f)
                curveTo(7f, 9.761f, 9.239f, 12f, 12f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 14.5f)
                curveTo(6.99f, 14.5f, 2.91f, 17.86f, 2.91f, 22f)
                curveTo(2.91f, 22.28f, 3.13f, 22.5f, 3.41f, 22.5f)
                horizontalLineTo(20.59f)
                curveTo(20.87f, 22.5f, 21.09f, 22.28f, 21.09f, 22f)
                curveTo(21.09f, 17.86f, 17.01f, 14.5f, 12f, 14.5f)
                close()
            }
        }.build()

        return _User!!
    }

@Suppress("ObjectPropertyName")
private var _User: ImageVector? = null
