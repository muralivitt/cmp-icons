package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Archive2: ImageVector
    get() {
        if (_Archive2 != null) {
            return _Archive2!!
        }
        _Archive2 = ImageVector.Builder(
            name = "Archive2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 5f)
                verticalLineTo(7f)
                curveTo(22f, 8.83f, 21.17f, 9.82f, 19.5f, 9.97f)
                curveTo(19.34f, 9.99f, 19.17f, 10f, 19f, 10f)
                horizontalLineTo(5f)
                curveTo(4.83f, 10f, 4.66f, 9.99f, 4.5f, 9.97f)
                curveTo(2.83f, 9.82f, 2f, 8.83f, 2f, 7f)
                verticalLineTo(5f)
                curveTo(2f, 3f, 3f, 2f, 5f, 2f)
                horizontalLineTo(19f)
                curveTo(21f, 2f, 22f, 3f, 22f, 5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(5.5f, 11.25f)
                curveTo(4.95f, 11.25f, 4.5f, 11.7f, 4.5f, 12.25f)
                verticalLineTo(19f)
                curveTo(4.5f, 21f, 5f, 22f, 7.5f, 22f)
                horizontalLineTo(16.5f)
                curveTo(19f, 22f, 19.5f, 21f, 19.5f, 19f)
                verticalLineTo(12.25f)
                curveTo(19.5f, 11.7f, 19.05f, 11.25f, 18.5f, 11.25f)
                horizontalLineTo(5.5f)
                close()
                moveTo(13.82f, 15.75f)
                horizontalLineTo(10.18f)
                curveTo(9.77f, 15.75f, 9.43f, 15.41f, 9.43f, 15f)
                curveTo(9.43f, 14.59f, 9.77f, 14.25f, 10.18f, 14.25f)
                horizontalLineTo(13.82f)
                curveTo(14.23f, 14.25f, 14.57f, 14.59f, 14.57f, 15f)
                curveTo(14.57f, 15.41f, 14.23f, 15.75f, 13.82f, 15.75f)
                close()
            }
        }.build()

        return _Archive2!!
    }

@Suppress("ObjectPropertyName")
private var _Archive2: ImageVector? = null
