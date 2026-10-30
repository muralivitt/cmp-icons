package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Frame3: ImageVector
    get() {
        if (_Frame3 != null) {
            return _Frame3!!
        }
        _Frame3 = ImageVector.Builder(
            name = "Frame3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(11f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(11f, 2.6f, 10.36f, 2f, 8.77f, 2f)
                horizontalLineTo(4.73f)
                curveTo(3.14f, 2f, 2.5f, 2.6f, 2.5f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(2.5f, 21.4f, 3.14f, 22f, 4.73f, 22f)
                horizontalLineTo(8.77f)
                curveTo(10.36f, 22f, 11f, 21.4f, 11f, 19.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.5f, 19.64f)
                verticalLineTo(15.36f)
                curveTo(21.5f, 14.06f, 20.5f, 13f, 19.27f, 13f)
                horizontalLineTo(15.23f)
                curveTo(14f, 13f, 13f, 14.06f, 13f, 15.36f)
                verticalLineTo(19.64f)
                curveTo(13f, 20.94f, 14f, 22f, 15.23f, 22f)
                horizontalLineTo(19.27f)
                curveTo(20.5f, 22f, 21.5f, 20.94f, 21.5f, 19.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.5f, 8.64f)
                verticalLineTo(4.36f)
                curveTo(21.5f, 3.06f, 20.5f, 2f, 19.27f, 2f)
                horizontalLineTo(15.23f)
                curveTo(14f, 2f, 13f, 3.06f, 13f, 4.36f)
                verticalLineTo(8.64f)
                curveTo(13f, 9.94f, 14f, 11f, 15.23f, 11f)
                horizontalLineTo(19.27f)
                curveTo(20.5f, 11f, 21.5f, 9.94f, 21.5f, 8.64f)
                close()
            }
        }.build()

        return _Frame3!!
    }

@Suppress("ObjectPropertyName")
private var _Frame3: ImageVector? = null
