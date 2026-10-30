package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.NoteText: ImageVector
    get() {
        if (_NoteText != null) {
            return _NoteText!!
        }
        _NoteText = ImageVector.Builder(
            name = "NoteText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(8.75f, 3.5f)
                verticalLineTo(2f)
                curveTo(8.75f, 1.59f, 8.41f, 1.25f, 8f, 1.25f)
                curveTo(7.59f, 1.25f, 7.25f, 1.59f, 7.25f, 2f)
                verticalLineTo(3.56f)
                curveTo(7.5f, 3.53f, 7.73f, 3.5f, 8f, 3.5f)
                horizontalLineTo(8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.75f, 3.56f)
                verticalLineTo(2f)
                curveTo(16.75f, 1.59f, 16.41f, 1.25f, 16f, 1.25f)
                curveTo(15.59f, 1.25f, 15.25f, 1.59f, 15.25f, 2f)
                verticalLineTo(3.5f)
                horizontalLineTo(16f)
                curveTo(16.27f, 3.5f, 16.5f, 3.53f, 16.75f, 3.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.75f, 3.56f)
                verticalLineTo(5f)
                curveTo(16.75f, 5.41f, 16.41f, 5.75f, 16f, 5.75f)
                curveTo(15.59f, 5.75f, 15.25f, 5.41f, 15.25f, 5f)
                verticalLineTo(3.5f)
                horizontalLineTo(8.75f)
                verticalLineTo(5f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8f, 5.75f)
                curveTo(7.59f, 5.75f, 7.25f, 5.41f, 7.25f, 5f)
                verticalLineTo(3.56f)
                curveTo(4.3f, 3.83f, 3f, 5.73f, 3f, 8.5f)
                verticalLineTo(17f)
                curveTo(3f, 20f, 4.5f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(19.5f, 22f, 21f, 20f, 21f, 17f)
                verticalLineTo(8.5f)
                curveTo(21f, 5.73f, 19.7f, 3.83f, 16.75f, 3.56f)
                close()
                moveTo(12f, 16.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 16.75f, 7.25f, 16.41f, 7.25f, 16f)
                curveTo(7.25f, 15.59f, 7.59f, 15.25f, 8f, 15.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 15.25f, 12.75f, 15.59f, 12.75f, 16f)
                curveTo(12.75f, 16.41f, 12.41f, 16.75f, 12f, 16.75f)
                close()
                moveTo(16f, 11.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 11.75f, 7.25f, 11.41f, 7.25f, 11f)
                curveTo(7.25f, 10.59f, 7.59f, 10.25f, 8f, 10.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 10.25f, 16.75f, 10.59f, 16.75f, 11f)
                curveTo(16.75f, 11.41f, 16.41f, 11.75f, 16f, 11.75f)
                close()
            }
        }.build()

        return _NoteText!!
    }

@Suppress("ObjectPropertyName")
private var _NoteText: ImageVector? = null
