package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.SidebarTop: ImageVector
    get() {
        if (_SidebarTop != null) {
            return _SidebarTop!!
        }
        _SidebarTop = ImageVector.Builder(
            name = "SidebarTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.949f, 4.13f)
                curveTo(20.659f, 3.71f, 20.289f, 3.34f, 19.869f, 3.05f)
                curveTo(18.919f, 2.36f, 17.679f, 2f, 16.189f, 2f)
                horizontalLineTo(7.809f)
                curveTo(4.369f, 2f, 2.239f, 3.94f, 2.029f, 7.22f)
                horizontalLineTo(21.979f)
                curveTo(21.899f, 5.99f, 21.549f, 4.95f, 20.949f, 4.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(2f, 16.189f)
                curveTo(2f, 17.679f, 2.36f, 18.919f, 3.05f, 19.869f)
                curveTo(3.34f, 20.289f, 3.71f, 20.659f, 4.13f, 20.949f)
                curveTo(5.08f, 21.639f, 6.32f, 21.999f, 7.81f, 21.999f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 21.999f, 22f, 19.829f, 22f, 16.189f)
                verticalLineTo(8.719f)
                horizontalLineTo(2f)
                verticalLineTo(16.189f)
                close()
                moveTo(8.91f, 14.439f)
                lineTo(11.47f, 11.879f)
                curveTo(11.76f, 11.589f, 12.24f, 11.589f, 12.53f, 11.879f)
                lineTo(15.09f, 14.439f)
                curveTo(15.24f, 14.589f, 15.31f, 14.779f, 15.31f, 14.969f)
                curveTo(15.31f, 15.159f, 15.24f, 15.349f, 15.09f, 15.499f)
                curveTo(14.8f, 15.789f, 14.32f, 15.789f, 14.03f, 15.499f)
                lineTo(12f, 13.479f)
                lineTo(9.97f, 15.499f)
                curveTo(9.68f, 15.789f, 9.2f, 15.789f, 8.91f, 15.499f)
                curveTo(8.62f, 15.209f, 8.62f, 14.739f, 8.91f, 14.439f)
                close()
            }
        }.build()

        return _SidebarTop!!
    }

@Suppress("ObjectPropertyName")
private var _SidebarTop: ImageVector? = null
