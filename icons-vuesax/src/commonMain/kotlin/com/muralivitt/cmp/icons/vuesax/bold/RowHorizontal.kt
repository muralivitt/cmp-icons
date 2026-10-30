package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.RowHorizontal: ImageVector
    get() {
        if (_RowHorizontal != null) {
            return _RowHorizontal!!
        }
        _RowHorizontal = ImageVector.Builder(
            name = "RowHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(13.5f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(13.5f, 21.4f, 14.14f, 22f, 15.73f, 22f)
                horizontalLineTo(19.77f)
                curveTo(21.36f, 22f, 22f, 21.4f, 22f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(22f, 2.6f, 21.36f, 2f, 19.77f, 2f)
                horizontalLineTo(15.73f)
                curveTo(14.14f, 2f, 13.5f, 2.6f, 13.5f, 4.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(2f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(2f, 21.4f, 2.64f, 22f, 4.23f, 22f)
                horizontalLineTo(8.27f)
                curveTo(9.86f, 22f, 10.5f, 21.4f, 10.5f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(10.5f, 2.6f, 9.86f, 2f, 8.27f, 2f)
                horizontalLineTo(4.23f)
                curveTo(2.64f, 2f, 2f, 2.6f, 2f, 4.1f)
                close()
            }
        }.build()

        return _RowHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _RowHorizontal: ImageVector? = null
