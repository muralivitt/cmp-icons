package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Document: ImageVector
    get() {
        if (_Document != null) {
            return _Document!!
        }
        _Document = ImageVector.Builder(
            name = "Document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.75f, 9.75f)
                horizontalLineTo(8.25f)
                curveTo(7.84f, 9.75f, 7.5f, 9.41f, 7.5f, 9f)
                curveTo(7.5f, 8.59f, 7.84f, 8.25f, 8.25f, 8.25f)
                horizontalLineTo(15.75f)
                curveTo(16.16f, 8.25f, 16.5f, 8.59f, 16.5f, 9f)
                curveTo(16.5f, 9.41f, 16.16f, 9.75f, 15.75f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.75f, 15.75f)
                horizontalLineTo(8.25f)
                curveTo(7.84f, 15.75f, 7.5f, 15.41f, 7.5f, 15f)
                curveTo(7.5f, 14.59f, 7.84f, 14.25f, 8.25f, 14.25f)
                horizontalLineTo(15.75f)
                curveTo(16.16f, 14.25f, 16.5f, 14.59f, 16.5f, 15f)
                curveTo(16.5f, 15.41f, 16.16f, 15.75f, 15.75f, 15.75f)
                close()
            }
        }.build()

        return _Document!!
    }

@Suppress("ObjectPropertyName")
private var _Document: ImageVector? = null
