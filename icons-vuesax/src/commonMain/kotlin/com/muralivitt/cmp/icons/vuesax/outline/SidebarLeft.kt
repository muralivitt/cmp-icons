package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.SidebarLeft: ImageVector
    get() {
        if (_SidebarLeft != null) {
            return _SidebarLeft!!
        }
        _SidebarLeft = ImageVector.Builder(
            name = "SidebarLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14.971f, 22.75f)
                horizontalLineTo(8.971f)
                curveTo(3.541f, 22.75f, 1.221f, 20.43f, 1.221f, 15f)
                verticalLineTo(9f)
                curveTo(1.221f, 3.57f, 3.541f, 1.25f, 8.971f, 1.25f)
                horizontalLineTo(14.971f)
                curveTo(20.401f, 1.25f, 22.721f, 3.57f, 22.721f, 9f)
                verticalLineTo(15f)
                curveTo(22.721f, 20.43f, 20.411f, 22.75f, 14.971f, 22.75f)
                close()
                moveTo(8.971f, 2.75f)
                curveTo(4.361f, 2.75f, 2.721f, 4.39f, 2.721f, 9f)
                verticalLineTo(15f)
                curveTo(2.721f, 19.61f, 4.361f, 21.25f, 8.971f, 21.25f)
                horizontalLineTo(14.971f)
                curveTo(19.581f, 21.25f, 21.221f, 19.61f, 21.221f, 15f)
                verticalLineTo(9f)
                curveTo(21.221f, 4.39f, 19.581f, 2.75f, 14.971f, 2.75f)
                horizontalLineTo(8.971f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(7.971f, 22.75f)
                curveTo(7.561f, 22.75f, 7.221f, 22.41f, 7.221f, 22f)
                verticalLineTo(2f)
                curveTo(7.221f, 1.59f, 7.561f, 1.25f, 7.971f, 1.25f)
                curveTo(8.381f, 1.25f, 8.721f, 1.59f, 8.721f, 2f)
                verticalLineTo(22f)
                curveTo(8.721f, 22.41f, 8.391f, 22.75f, 7.971f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14.97f, 15.31f)
                curveTo(14.78f, 15.31f, 14.59f, 15.24f, 14.44f, 15.09f)
                lineTo(11.88f, 12.53f)
                curveTo(11.59f, 12.24f, 11.59f, 11.76f, 11.88f, 11.47f)
                lineTo(14.44f, 8.91f)
                curveTo(14.73f, 8.62f, 15.21f, 8.62f, 15.5f, 8.91f)
                curveTo(15.79f, 9.2f, 15.79f, 9.68f, 15.5f, 9.97f)
                lineTo(13.48f, 12f)
                lineTo(15.51f, 14.03f)
                curveTo(15.8f, 14.32f, 15.8f, 14.8f, 15.51f, 15.09f)
                curveTo(15.36f, 15.24f, 15.17f, 15.31f, 14.97f, 15.31f)
                close()
            }
        }.build()

        return _SidebarLeft!!
    }

@Suppress("ObjectPropertyName")
private var _SidebarLeft: ImageVector? = null
