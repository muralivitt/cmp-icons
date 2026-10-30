package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Wind: ImageVector
    get() {
        if (_Wind != null) {
            return _Wind!!
        }
        _Wind = ImageVector.Builder(
            name = "Wind",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18.5f, 22.75f)
                curveTo(16.16f, 22.75f, 14.25f, 20.84f, 14.25f, 18.5f)
                verticalLineTo(18f)
                curveTo(14.25f, 17.59f, 14.59f, 17.25f, 15f, 17.25f)
                curveTo(15.41f, 17.25f, 15.75f, 17.59f, 15.75f, 18f)
                verticalLineTo(18.5f)
                curveTo(15.75f, 20.02f, 16.98f, 21.25f, 18.5f, 21.25f)
                curveTo(20.02f, 21.25f, 21.25f, 20.02f, 21.25f, 18.5f)
                curveTo(21.25f, 16.98f, 20.02f, 15.75f, 18.5f, 15.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 15.75f, 1.25f, 15.41f, 1.25f, 15f)
                curveTo(1.25f, 14.59f, 1.59f, 14.25f, 2f, 14.25f)
                horizontalLineTo(18.5f)
                curveTo(20.84f, 14.25f, 22.75f, 16.16f, 22.75f, 18.5f)
                curveTo(22.75f, 20.84f, 20.84f, 22.75f, 18.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18.5f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                horizontalLineTo(18.5f)
                curveTo(20.02f, 11.25f, 21.25f, 10.02f, 21.25f, 8.5f)
                curveTo(21.25f, 6.98f, 20.02f, 5.75f, 18.5f, 5.75f)
                curveTo(16.98f, 5.75f, 15.75f, 6.98f, 15.75f, 8.5f)
                verticalLineTo(9f)
                curveTo(15.75f, 9.41f, 15.41f, 9.75f, 15f, 9.75f)
                curveTo(14.59f, 9.75f, 14.25f, 9.41f, 14.25f, 9f)
                verticalLineTo(8.5f)
                curveTo(14.25f, 6.16f, 16.16f, 4.25f, 18.5f, 4.25f)
                curveTo(20.84f, 4.25f, 22.75f, 6.16f, 22.75f, 8.5f)
                curveTo(22.75f, 10.84f, 20.84f, 12.75f, 18.5f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(9.31f, 9.751f)
                horizontalLineTo(2f)
                curveTo(1.59f, 9.751f, 1.25f, 9.411f, 1.25f, 9.001f)
                curveTo(1.25f, 8.591f, 1.59f, 8.251f, 2f, 8.251f)
                horizontalLineTo(9.31f)
                curveTo(10.38f, 8.251f, 11.25f, 7.381f, 11.25f, 6.311f)
                curveTo(11.25f, 5.241f, 10.38f, 4.371f, 9.31f, 4.371f)
                curveTo(8.24f, 4.371f, 7.37f, 5.241f, 7.37f, 6.311f)
                verticalLineTo(6.691f)
                curveTo(7.37f, 7.101f, 7.03f, 7.441f, 6.62f, 7.441f)
                curveTo(6.21f, 7.441f, 5.87f, 7.111f, 5.87f, 6.691f)
                verticalLineTo(6.311f)
                curveTo(5.87f, 4.411f, 7.41f, 2.871f, 9.31f, 2.871f)
                curveTo(11.21f, 2.871f, 12.75f, 4.411f, 12.75f, 6.311f)
                curveTo(12.75f, 8.211f, 11.21f, 9.751f, 9.31f, 9.751f)
                close()
            }
        }.build()

        return _Wind!!
    }

@Suppress("ObjectPropertyName")
private var _Wind: ImageVector? = null
