package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Watch: ImageVector
    get() {
        if (_Watch != null) {
            return _Watch!!
        }
        _Watch = ImageVector.Builder(
            name = "Watch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.5f, 19.75f)
                horizontalLineTo(8.5f)
                curveTo(5.76f, 19.75f, 4.25f, 18.24f, 4.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(4.25f, 5.76f, 5.76f, 4.25f, 8.5f, 4.25f)
                horizontalLineTo(15.5f)
                curveTo(18.24f, 4.25f, 19.75f, 5.76f, 19.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(19.75f, 18.24f, 18.24f, 19.75f, 15.5f, 19.75f)
                close()
                moveTo(8.5f, 5.75f)
                curveTo(6.57f, 5.75f, 5.75f, 6.57f, 5.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(5.75f, 17.43f, 6.57f, 18.25f, 8.5f, 18.25f)
                horizontalLineTo(15.5f)
                curveTo(17.43f, 18.25f, 18.25f, 17.43f, 18.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(18.25f, 6.57f, 17.43f, 5.75f, 15.5f, 5.75f)
                horizontalLineTo(8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16f, 2.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 2.75f, 7.25f, 2.41f, 7.25f, 2f)
                curveTo(7.25f, 1.59f, 7.59f, 1.25f, 8f, 1.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 1.25f, 16.75f, 1.59f, 16.75f, 2f)
                curveTo(16.75f, 2.41f, 16.41f, 2.75f, 16f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 22.75f, 7.25f, 22.41f, 7.25f, 22f)
                curveTo(7.25f, 21.59f, 7.59f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 21.25f, 16.75f, 21.59f, 16.75f, 22f)
                curveTo(16.75f, 22.41f, 16.41f, 22.75f, 16f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14.5f, 13.25f)
                horizontalLineTo(11.5f)
                curveTo(11.09f, 13.25f, 10.75f, 12.91f, 10.75f, 12.5f)
                verticalLineTo(9.5f)
                curveTo(10.75f, 9.09f, 11.09f, 8.75f, 11.5f, 8.75f)
                curveTo(11.91f, 8.75f, 12.25f, 9.09f, 12.25f, 9.5f)
                verticalLineTo(11.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 11.75f, 15.25f, 12.09f, 15.25f, 12.5f)
                curveTo(15.25f, 12.91f, 14.91f, 13.25f, 14.5f, 13.25f)
                close()
            }
        }.build()

        return _Watch!!
    }

@Suppress("ObjectPropertyName")
private var _Watch: ImageVector? = null
