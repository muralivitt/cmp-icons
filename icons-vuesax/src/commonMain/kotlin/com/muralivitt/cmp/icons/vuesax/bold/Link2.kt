package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Link2: ImageVector
    get() {
        if (_Link2 != null) {
            return _Link2!!
        }
        _Link2 = ImageVector.Builder(
            name = "Link2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(7.25f, 12f)
                curveTo(7.25f, 11.59f, 7.59f, 11.25f, 8f, 11.25f)
                horizontalLineTo(11f)
                verticalLineTo(7.5f)
                curveTo(11f, 6.95f, 10.55f, 6.5f, 10f, 6.5f)
                horizontalLineTo(7.77f)
                curveTo(4.62f, 6.5f, 1.88f, 9.08f, 2f, 12.22f)
                curveTo(2.06f, 13.65f, 2.66f, 14.94f, 3.61f, 15.89f)
                curveTo(4.61f, 16.88f, 5.98f, 17.5f, 7.5f, 17.5f)
                horizontalLineTo(10f)
                curveTo(10.55f, 17.5f, 11f, 17.05f, 11f, 16.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 12.75f, 7.25f, 12.41f, 7.25f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.39f, 8.11f)
                curveTo(19.39f, 7.12f, 18.02f, 6.5f, 16.5f, 6.5f)
                horizontalLineTo(14f)
                curveTo(13.45f, 6.5f, 13f, 6.95f, 13f, 7.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16f, 12.75f)
                horizontalLineTo(13f)
                verticalLineTo(16.5f)
                curveTo(13f, 17.05f, 13.45f, 17.5f, 14f, 17.5f)
                horizontalLineTo(16.23f)
                curveTo(19.38f, 17.5f, 22.12f, 14.92f, 21.99f, 11.78f)
                curveTo(21.94f, 10.35f, 21.33f, 9.06f, 20.39f, 8.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(13f, 11.25f)
                horizontalLineTo(11f)
                verticalLineTo(12.75f)
                horizontalLineTo(13f)
                verticalLineTo(11.25f)
                close()
            }
        }.build()

        return _Link2!!
    }

@Suppress("ObjectPropertyName")
private var _Link2: ImageVector? = null
