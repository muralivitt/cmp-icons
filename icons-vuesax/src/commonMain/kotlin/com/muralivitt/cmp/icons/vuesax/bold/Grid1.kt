package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Grid1: ImageVector
    get() {
        if (_Grid1 != null) {
            return _Grid1!!
        }
        _Grid1 = ImageVector.Builder(
            name = "Grid1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(7.75f, 2f)
                verticalLineTo(7.8f)
                horizontalLineTo(2f)
                curveTo(2f, 4.19f, 4.15f, 2.02f, 7.75f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 7.8f)
                horizontalLineTo(16.25f)
                verticalLineTo(2f)
                curveTo(19.85f, 2.02f, 22f, 4.19f, 22f, 7.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 16.301f)
                curveTo(21.96f, 19.851f, 19.82f, 21.981f, 16.25f, 22.001f)
                verticalLineTo(16.301f)
                horizontalLineTo(22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(7.75f, 16.301f)
                verticalLineTo(22.001f)
                curveTo(4.18f, 21.981f, 2.04f, 19.851f, 2f, 16.301f)
                horizontalLineTo(7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(7.75f, 9.301f)
                horizontalLineTo(2f)
                verticalLineTo(14.801f)
                horizontalLineTo(7.75f)
                verticalLineTo(9.301f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 9.301f)
                horizontalLineTo(16.25f)
                verticalLineTo(14.801f)
                horizontalLineTo(22f)
                verticalLineTo(9.301f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14.75f, 9.301f)
                horizontalLineTo(9.25f)
                verticalLineTo(14.801f)
                horizontalLineTo(14.75f)
                verticalLineTo(9.301f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14.75f, 2f)
                horizontalLineTo(9.25f)
                verticalLineTo(7.8f)
                horizontalLineTo(14.75f)
                verticalLineTo(2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14.75f, 16.301f)
                horizontalLineTo(9.25f)
                verticalLineTo(22.001f)
                horizontalLineTo(14.75f)
                verticalLineTo(16.301f)
                close()
            }
        }.build()

        return _Grid1!!
    }

@Suppress("ObjectPropertyName")
private var _Grid1: ImageVector? = null
