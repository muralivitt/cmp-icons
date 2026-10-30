package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Grid5: ImageVector
    get() {
        if (_Grid5 != null) {
            return _Grid5!!
        }
        _Grid5 = ImageVector.Builder(
            name = "Grid5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(8.25f, 2f)
                verticalLineTo(22f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 22f, 2f, 19.83f, 2f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2f, 4.17f, 4.17f, 2f, 7.81f, 2f)
                horizontalLineTo(8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 7.81f)
                verticalLineTo(11.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(2f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 2f, 22f, 4.17f, 22f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 12.75f)
                verticalLineTo(16.19f)
                curveTo(22f, 19.83f, 19.83f, 22f, 16.19f, 22f)
                horizontalLineTo(9.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _Grid5!!
    }

@Suppress("ObjectPropertyName")
private var _Grid5: ImageVector? = null
