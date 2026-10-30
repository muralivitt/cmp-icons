package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Grid8: ImageVector
    get() {
        if (_Grid8 != null) {
            return _Grid8!!
        }
        _Grid8 = ImageVector.Builder(
            name = "Grid8",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 7.811f)
                verticalLineTo(11.251f)
                horizontalLineTo(16.75f)
                verticalLineTo(2.031f)
                curveTo(20.05f, 2.231f, 22f, 4.361f, 22f, 7.811f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 12.75f)
                verticalLineTo(16.19f)
                curveTo(22f, 19.64f, 20.05f, 21.77f, 16.75f, 21.97f)
                verticalLineTo(12.75f)
                horizontalLineTo(22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(7.25f, 12.75f)
                verticalLineTo(21.97f)
                curveTo(3.95f, 21.77f, 2f, 19.64f, 2f, 16.19f)
                verticalLineTo(12.75f)
                horizontalLineTo(7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(7.25f, 2.031f)
                verticalLineTo(11.251f)
                horizontalLineTo(2f)
                verticalLineTo(7.811f)
                curveTo(2f, 4.361f, 3.95f, 2.231f, 7.25f, 2.031f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.25f, 2f)
                horizontalLineTo(8.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(15.25f)
                verticalLineTo(2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.25f, 12.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(22f)
                horizontalLineTo(15.25f)
                verticalLineTo(12.75f)
                close()
            }
        }.build()

        return _Grid8!!
    }

@Suppress("ObjectPropertyName")
private var _Grid8: ImageVector? = null
