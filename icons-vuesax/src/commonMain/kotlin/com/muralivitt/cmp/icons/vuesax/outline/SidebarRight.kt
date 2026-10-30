package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.SidebarRight: ImageVector
    get() {
        if (_SidebarRight != null) {
            return _SidebarRight!!
        }
        _SidebarRight = ImageVector.Builder(
            name = "SidebarRight",
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
                moveTo(14.971f, 22.75f)
                curveTo(14.561f, 22.75f, 14.221f, 22.41f, 14.221f, 22f)
                verticalLineTo(2f)
                curveTo(14.221f, 1.59f, 14.561f, 1.25f, 14.971f, 1.25f)
                curveTo(15.381f, 1.25f, 15.721f, 1.59f, 15.721f, 2f)
                verticalLineTo(22f)
                curveTo(15.721f, 22.41f, 15.391f, 22.75f, 14.971f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(7.97f, 15.31f)
                curveTo(7.78f, 15.31f, 7.59f, 15.24f, 7.44f, 15.09f)
                curveTo(7.15f, 14.8f, 7.15f, 14.32f, 7.44f, 14.03f)
                lineTo(9.47f, 12f)
                lineTo(7.44f, 9.97f)
                curveTo(7.15f, 9.68f, 7.15f, 9.2f, 7.44f, 8.91f)
                curveTo(7.73f, 8.62f, 8.21f, 8.62f, 8.5f, 8.91f)
                lineTo(11.06f, 11.47f)
                curveTo(11.35f, 11.76f, 11.35f, 12.24f, 11.06f, 12.53f)
                lineTo(8.5f, 15.09f)
                curveTo(8.36f, 15.24f, 8.17f, 15.31f, 7.97f, 15.31f)
                close()
            }
        }.build()

        return _SidebarRight!!
    }

@Suppress("ObjectPropertyName")
private var _SidebarRight: ImageVector? = null
