package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Folder: ImageVector
    get() {
        if (_Folder != null) {
            return _Folder!!
        }
        _Folder = ImageVector.Builder(
            name = "Folder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.017f, 7.992f)
                curveTo(21.415f, 8.558f, 20.941f, 9.25f, 20.248f, 9.25f)
                horizontalLineTo(3f)
                curveTo(2.448f, 9.25f, 2f, 8.802f, 2f, 8.25f)
                verticalLineTo(6.42f)
                curveTo(2f, 3.98f, 3.98f, 2f, 6.42f, 2f)
                horizontalLineTo(8.74f)
                curveTo(10.37f, 2f, 10.88f, 2.53f, 11.53f, 3.4f)
                lineTo(12.93f, 5.26f)
                curveTo(13.24f, 5.67f, 13.28f, 5.72f, 13.86f, 5.72f)
                horizontalLineTo(16.65f)
                curveTo(18.455f, 5.72f, 20.052f, 6.617f, 21.017f, 7.992f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.983f, 10.75f)
                curveTo(21.534f, 10.75f, 21.982f, 11.196f, 21.983f, 11.747f)
                lineTo(22f, 16.65f)
                curveTo(22f, 19.6f, 19.6f, 22f, 16.65f, 22f)
                horizontalLineTo(7.35f)
                curveTo(4.4f, 22f, 2f, 19.6f, 2f, 16.65f)
                verticalLineTo(11.75f)
                curveTo(2f, 11.198f, 2.448f, 10.75f, 3f, 10.75f)
                lineTo(20.983f, 10.75f)
                close()
            }
        }.build()

        return _Folder!!
    }

@Suppress("ObjectPropertyName")
private var _Folder: ImageVector? = null
