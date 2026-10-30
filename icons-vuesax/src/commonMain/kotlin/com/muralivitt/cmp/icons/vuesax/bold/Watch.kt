package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Watch: ImageVector
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
                moveTo(16f, 3.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 3.75f, 7.25f, 3.41f, 7.25f, 3f)
                curveTo(7.25f, 2.59f, 7.59f, 2.25f, 8f, 2.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 2.25f, 16.75f, 2.59f, 16.75f, 3f)
                curveTo(16.75f, 3.41f, 16.41f, 3.75f, 16f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16f, 21.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 21.75f, 7.25f, 21.41f, 7.25f, 21f)
                curveTo(7.25f, 20.59f, 7.59f, 20.25f, 8f, 20.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 20.25f, 16.75f, 20.59f, 16.75f, 21f)
                curveTo(16.75f, 21.41f, 16.41f, 21.75f, 16f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.5f, 5f)
                horizontalLineTo(8.5f)
                curveTo(6.17f, 5f, 5f, 6.17f, 5f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(5f, 17.83f, 6.17f, 19f, 8.5f, 19f)
                horizontalLineTo(15.5f)
                curveTo(17.83f, 19f, 19f, 17.83f, 19f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(19f, 6.17f, 17.83f, 5f, 15.5f, 5f)
                close()
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
