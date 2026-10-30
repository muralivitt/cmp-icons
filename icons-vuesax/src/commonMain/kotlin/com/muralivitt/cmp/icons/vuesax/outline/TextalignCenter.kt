package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.TextalignCenter: ImageVector
    get() {
        if (_TextalignCenter != null) {
            return _TextalignCenter!!
        }
        _TextalignCenter = ImageVector.Builder(
            name = "TextalignCenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21f, 5.25f)
                horizontalLineTo(3f)
                curveTo(2.59f, 5.25f, 2.25f, 4.91f, 2.25f, 4.5f)
                curveTo(2.25f, 4.09f, 2.59f, 3.75f, 3f, 3.75f)
                horizontalLineTo(21f)
                curveTo(21.41f, 3.75f, 21.75f, 4.09f, 21.75f, 4.5f)
                curveTo(21.75f, 4.91f, 21.41f, 5.25f, 21f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.74f, 10.25f)
                horizontalLineTo(7.26f)
                curveTo(6.85f, 10.25f, 6.51f, 9.91f, 6.51f, 9.5f)
                curveTo(6.51f, 9.09f, 6.85f, 8.75f, 7.26f, 8.75f)
                horizontalLineTo(16.73f)
                curveTo(17.14f, 8.75f, 17.48f, 9.09f, 17.48f, 9.5f)
                curveTo(17.48f, 9.91f, 17.15f, 10.25f, 16.74f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21f, 15.25f)
                horizontalLineTo(3f)
                curveTo(2.59f, 15.25f, 2.25f, 14.91f, 2.25f, 14.5f)
                curveTo(2.25f, 14.09f, 2.59f, 13.75f, 3f, 13.75f)
                horizontalLineTo(21f)
                curveTo(21.41f, 13.75f, 21.75f, 14.09f, 21.75f, 14.5f)
                curveTo(21.75f, 14.91f, 21.41f, 15.25f, 21f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.74f, 20.25f)
                horizontalLineTo(7.26f)
                curveTo(6.85f, 20.25f, 6.51f, 19.91f, 6.51f, 19.5f)
                curveTo(6.51f, 19.09f, 6.85f, 18.75f, 7.26f, 18.75f)
                horizontalLineTo(16.73f)
                curveTo(17.14f, 18.75f, 17.48f, 19.09f, 17.48f, 19.5f)
                curveTo(17.48f, 19.91f, 17.15f, 20.25f, 16.74f, 20.25f)
                close()
            }
        }.build()

        return _TextalignCenter!!
    }

@Suppress("ObjectPropertyName")
private var _TextalignCenter: ImageVector? = null
