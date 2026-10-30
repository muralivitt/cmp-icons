package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.SearchZoomIn1: ImageVector
    get() {
        if (_SearchZoomIn1 != null) {
            return _SearchZoomIn1!!
        }
        _SearchZoomIn1 = ImageVector.Builder(
            name = "SearchZoomIn1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.301f, 21.999f)
                curveTo(21.121f, 21.999f, 20.941f, 21.929f, 20.81f, 21.799f)
                lineTo(18.951f, 19.939f)
                curveTo(18.681f, 19.669f, 18.681f, 19.229f, 18.951f, 18.949f)
                curveTo(19.221f, 18.679f, 19.66f, 18.679f, 19.941f, 18.949f)
                lineTo(21.801f, 20.809f)
                curveTo(22.07f, 21.079f, 22.07f, 21.519f, 21.801f, 21.799f)
                curveTo(21.66f, 21.929f, 21.48f, 21.999f, 21.301f, 21.999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(11.5f, 2f)
                curveTo(6.26f, 2f, 2f, 6.26f, 2f, 11.5f)
                curveTo(2f, 16.74f, 6.26f, 21f, 11.5f, 21f)
                curveTo(16.74f, 21f, 21f, 16.74f, 21f, 11.5f)
                curveTo(21f, 6.26f, 16.74f, 2f, 11.5f, 2f)
                close()
                moveTo(14.2f, 12.45f)
                horizontalLineTo(12.45f)
                verticalLineTo(14.2f)
                curveTo(12.45f, 14.61f, 12.11f, 14.95f, 11.7f, 14.95f)
                curveTo(11.29f, 14.95f, 10.95f, 14.61f, 10.95f, 14.2f)
                verticalLineTo(12.45f)
                horizontalLineTo(9.2f)
                curveTo(8.79f, 12.45f, 8.45f, 12.11f, 8.45f, 11.7f)
                curveTo(8.45f, 11.29f, 8.79f, 10.95f, 9.2f, 10.95f)
                horizontalLineTo(10.95f)
                verticalLineTo(9.2f)
                curveTo(10.95f, 8.79f, 11.29f, 8.45f, 11.7f, 8.45f)
                curveTo(12.11f, 8.45f, 12.45f, 8.79f, 12.45f, 9.2f)
                verticalLineTo(10.95f)
                horizontalLineTo(14.2f)
                curveTo(14.61f, 10.95f, 14.95f, 11.29f, 14.95f, 11.7f)
                curveTo(14.95f, 12.11f, 14.61f, 12.45f, 14.2f, 12.45f)
                close()
            }
        }.build()

        return _SearchZoomIn1!!
    }

@Suppress("ObjectPropertyName")
private var _SearchZoomIn1: ImageVector? = null
