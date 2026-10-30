package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Document: ImageVector
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
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(15.75f, 15.75f)
                horizontalLineTo(8.25f)
                curveTo(7.84f, 15.75f, 7.5f, 15.41f, 7.5f, 15f)
                curveTo(7.5f, 14.59f, 7.84f, 14.25f, 8.25f, 14.25f)
                horizontalLineTo(15.75f)
                curveTo(16.16f, 14.25f, 16.5f, 14.59f, 16.5f, 15f)
                curveTo(16.5f, 15.41f, 16.16f, 15.75f, 15.75f, 15.75f)
                close()
                moveTo(15.75f, 9.75f)
                horizontalLineTo(8.25f)
                curveTo(7.84f, 9.75f, 7.5f, 9.41f, 7.5f, 9f)
                curveTo(7.5f, 8.59f, 7.84f, 8.25f, 8.25f, 8.25f)
                horizontalLineTo(15.75f)
                curveTo(16.16f, 8.25f, 16.5f, 8.59f, 16.5f, 9f)
                curveTo(16.5f, 9.41f, 16.16f, 9.75f, 15.75f, 9.75f)
                close()
            }
        }.build()

        return _Document!!
    }

@Suppress("ObjectPropertyName")
private var _Document: ImageVector? = null
