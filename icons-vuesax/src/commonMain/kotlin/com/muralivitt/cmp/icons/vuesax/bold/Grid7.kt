package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Grid7: ImageVector
    get() {
        if (_Grid7 != null) {
            return _Grid7!!
        }
        _Grid7 = ImageVector.Builder(
            name = "Grid7",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(11.25f, 10.5f)
                verticalLineTo(22f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 22f, 2f, 19.83f, 2f, 16.19f)
                verticalLineTo(10.5f)
                horizontalLineTo(11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 10.5f)
                verticalLineTo(16.19f)
                curveTo(22f, 19.83f, 19.83f, 22f, 16.19f, 22f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 7.81f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(7.81f)
                curveTo(2f, 4.17f, 4.17f, 2f, 7.81f, 2f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 2f, 22f, 4.17f, 22f, 7.81f)
                close()
            }
        }.build()

        return _Grid7!!
    }

@Suppress("ObjectPropertyName")
private var _Grid7: ImageVector? = null
