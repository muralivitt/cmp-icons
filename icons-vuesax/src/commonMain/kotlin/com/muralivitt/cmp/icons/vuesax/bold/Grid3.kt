package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Grid3: ImageVector
    get() {
        if (_Grid3 != null) {
            return _Grid3!!
        }
        _Grid3 = ImageVector.Builder(
            name = "Grid3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(12.75f)
                verticalLineTo(8f)
                verticalLineTo(8.75f)
                verticalLineTo(13.75f)
                horizontalLineTo(22f)
                verticalLineTo(8.75f)
                verticalLineTo(8f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(2f, 10.25f)
                verticalLineTo(15.25f)
                verticalLineTo(15.75f)
                verticalLineTo(16.19f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(11.25f)
                verticalLineTo(15.75f)
                verticalLineTo(15.25f)
                verticalLineTo(10.25f)
                horizontalLineTo(2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(11.25f, 2f)
                verticalLineTo(8.75f)
                horizontalLineTo(2f)
                verticalLineTo(7.81f)
                curveTo(2f, 4.17f, 4.17f, 2f, 7.81f, 2f)
                horizontalLineTo(11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 15.25f)
                verticalLineTo(16.19f)
                curveTo(22f, 19.83f, 19.83f, 22f, 16.19f, 22f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.25f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _Grid3!!
    }

@Suppress("ObjectPropertyName")
private var _Grid3: ImageVector? = null
