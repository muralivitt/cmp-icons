package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.AlignVertically: ImageVector
    get() {
        if (_AlignVertically != null) {
            return _AlignVertically!!
        }
        _AlignVertically = ImageVector.Builder(
            name = "AlignVertically",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17.4f, 19.25f)
                horizontalLineTo(6.6f)
                curveTo(5.1f, 19.25f, 4.5f, 18.61f, 4.5f, 17.02f)
                verticalLineTo(15.98f)
                curveTo(4.5f, 14.39f, 5.1f, 13.75f, 6.6f, 13.75f)
                horizontalLineTo(17.4f)
                curveTo(18.9f, 13.75f, 19.5f, 14.39f, 19.5f, 15.98f)
                verticalLineTo(17.02f)
                curveTo(19.5f, 18.61f, 18.9f, 19.25f, 17.4f, 19.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12.75f, 19.25f)
                verticalLineTo(21.25f)
                curveTo(12.75f, 21.66f, 12.41f, 22f, 12f, 22f)
                curveTo(11.59f, 22f, 11.25f, 21.66f, 11.25f, 21.25f)
                verticalLineTo(19.25f)
                horizontalLineTo(12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12.75f, 10.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(13.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12.75f, 2.75f)
                verticalLineTo(5.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(2.75f)
                curveTo(11.25f, 2.34f, 11.59f, 2f, 12f, 2f)
                curveTo(12.41f, 2f, 12.75f, 2.34f, 12.75f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.4f, 10.75f)
                horizontalLineTo(8.6f)
                curveTo(7.1f, 10.75f, 6.5f, 10.11f, 6.5f, 8.52f)
                verticalLineTo(7.48f)
                curveTo(6.5f, 5.89f, 7.1f, 5.25f, 8.6f, 5.25f)
                horizontalLineTo(15.4f)
                curveTo(16.9f, 5.25f, 17.5f, 5.89f, 17.5f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(17.5f, 10.11f, 16.9f, 10.75f, 15.4f, 10.75f)
                close()
            }
        }.build()

        return _AlignVertically!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVertically: ImageVector? = null
