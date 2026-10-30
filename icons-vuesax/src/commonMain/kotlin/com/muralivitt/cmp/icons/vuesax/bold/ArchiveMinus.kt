package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArchiveMinus: ImageVector
    get() {
        if (_ArchiveMinus != null) {
            return _ArchiveMinus!!
        }
        _ArchiveMinus = ImageVector.Builder(
            name = "ArchiveMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.82f, 2f)
                horizontalLineTo(7.18f)
                curveTo(5.05f, 2f, 3.32f, 3.74f, 3.32f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(3.32f, 21.75f, 4.61f, 22.51f, 6.19f, 21.64f)
                lineTo(11.07f, 18.93f)
                curveTo(11.59f, 18.64f, 12.43f, 18.64f, 12.94f, 18.93f)
                lineTo(17.82f, 21.64f)
                curveTo(19.4f, 22.52f, 20.69f, 21.76f, 20.69f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(20.68f, 3.74f, 18.95f, 2f, 16.82f, 2f)
                close()
                moveTo(14.5f, 11.4f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 11.4f, 8.75f, 11.06f, 8.75f, 10.65f)
                curveTo(8.75f, 10.24f, 9.09f, 9.9f, 9.5f, 9.9f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 9.9f, 15.25f, 10.24f, 15.25f, 10.65f)
                curveTo(15.25f, 11.06f, 14.91f, 11.4f, 14.5f, 11.4f)
                close()
            }
        }.build()

        return _ArchiveMinus!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveMinus: ImageVector? = null
