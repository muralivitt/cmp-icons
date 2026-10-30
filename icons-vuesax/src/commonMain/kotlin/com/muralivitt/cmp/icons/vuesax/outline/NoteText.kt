package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.NoteText: ImageVector
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
                moveTo(8f, 5.75f)
                curveTo(7.59f, 5.75f, 7.25f, 5.41f, 7.25f, 5f)
                verticalLineTo(2f)
                curveTo(7.25f, 1.59f, 7.59f, 1.25f, 8f, 1.25f)
                curveTo(8.41f, 1.25f, 8.75f, 1.59f, 8.75f, 2f)
                verticalLineTo(5f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16f, 5.75f)
                curveTo(15.59f, 5.75f, 15.25f, 5.41f, 15.25f, 5f)
                verticalLineTo(2f)
                curveTo(15.25f, 1.59f, 15.59f, 1.25f, 16f, 1.25f)
                curveTo(16.41f, 1.25f, 16.75f, 1.59f, 16.75f, 2f)
                verticalLineTo(5f)
                curveTo(16.75f, 5.41f, 16.41f, 5.75f, 16f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(4.35f, 22.75f, 2.25f, 20.65f, 2.25f, 17f)
                verticalLineTo(8.5f)
                curveTo(2.25f, 4.85f, 4.35f, 2.75f, 8f, 2.75f)
                horizontalLineTo(16f)
                curveTo(19.65f, 2.75f, 21.75f, 4.85f, 21.75f, 8.5f)
                verticalLineTo(17f)
                curveTo(21.75f, 20.65f, 19.65f, 22.75f, 16f, 22.75f)
                close()
                moveTo(8f, 4.25f)
                curveTo(5.14f, 4.25f, 3.75f, 5.64f, 3.75f, 8.5f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.86f, 5.14f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(18.86f, 21.25f, 20.25f, 19.86f, 20.25f, 17f)
                verticalLineTo(8.5f)
                curveTo(20.25f, 5.64f, 18.86f, 4.25f, 16f, 4.25f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16f, 11.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 11.75f, 7.25f, 11.41f, 7.25f, 11f)
                curveTo(7.25f, 10.59f, 7.59f, 10.25f, 8f, 10.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 10.25f, 16.75f, 10.59f, 16.75f, 11f)
                curveTo(16.75f, 11.41f, 16.41f, 11.75f, 16f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 16.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 16.75f, 7.25f, 16.41f, 7.25f, 16f)
                curveTo(7.25f, 15.59f, 7.59f, 15.25f, 8f, 15.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 15.25f, 12.75f, 15.59f, 12.75f, 16f)
                curveTo(12.75f, 16.41f, 12.41f, 16.75f, 12f, 16.75f)
                close()
            }
        }.build()

        return _NoteText!!
    }

@Suppress("ObjectPropertyName")
private var _NoteText: ImageVector? = null
