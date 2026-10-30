package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.SidebarBottom: ImageVector
    get() {
        if (_SidebarBottom != null) {
            return _SidebarBottom!!
        }
        _SidebarBottom = ImageVector.Builder(
            name = "SidebarBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(3.05f, 19.871f)
                curveTo(3.34f, 20.291f, 3.71f, 20.661f, 4.13f, 20.951f)
                curveTo(5.08f, 21.641f, 6.32f, 22.001f, 7.81f, 22.001f)
                horizontalLineTo(16.19f)
                curveTo(19.629f, 22.001f, 21.76f, 20.061f, 21.969f, 16.781f)
                horizontalLineTo(2.02f)
                curveTo(2.1f, 18.011f, 2.45f, 19.051f, 3.05f, 19.871f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.95f, 4.13f)
                curveTo(20.66f, 3.71f, 20.29f, 3.34f, 19.87f, 3.05f)
                curveTo(18.92f, 2.36f, 17.68f, 2f, 16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(15.28f)
                horizontalLineTo(22f)
                verticalLineTo(7.81f)
                curveTo(22f, 6.32f, 21.64f, 5.08f, 20.95f, 4.13f)
                close()
                moveTo(15.09f, 9.56f)
                lineTo(12.53f, 12.12f)
                curveTo(12.24f, 12.41f, 11.76f, 12.41f, 11.47f, 12.12f)
                lineTo(8.91f, 9.56f)
                curveTo(8.76f, 9.41f, 8.69f, 9.22f, 8.69f, 9.03f)
                curveTo(8.69f, 8.84f, 8.76f, 8.64f, 8.91f, 8.5f)
                curveTo(9.2f, 8.2f, 9.68f, 8.2f, 9.97f, 8.5f)
                lineTo(12f, 10.52f)
                lineTo(14.03f, 8.49f)
                curveTo(14.32f, 8.2f, 14.8f, 8.2f, 15.09f, 8.49f)
                curveTo(15.38f, 8.78f, 15.38f, 9.26f, 15.09f, 9.56f)
                close()
            }
        }.build()

        return _SidebarBottom!!
    }

@Suppress("ObjectPropertyName")
private var _SidebarBottom: ImageVector? = null
