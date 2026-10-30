package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Level: ImageVector
    get() {
        if (_Level != null) {
            return _Level!!
        }
        _Level = ImageVector.Builder(
            name = "Level",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(7f, 12.75f)
                horizontalLineTo(5f)
                curveTo(4.59f, 12.75f, 4.25f, 12.41f, 4.25f, 12f)
                curveTo(4.25f, 11.59f, 4.59f, 11.25f, 5f, 11.25f)
                horizontalLineTo(7f)
                curveTo(7.41f, 11.25f, 7.75f, 11.59f, 7.75f, 12f)
                curveTo(7.75f, 12.41f, 7.41f, 12.75f, 7f, 12.75f)
                close()
                moveTo(12f, 14.25f)
                curveTo(10.76f, 14.25f, 9.75f, 13.24f, 9.75f, 12f)
                curveTo(9.75f, 10.76f, 10.76f, 9.75f, 12f, 9.75f)
                curveTo(13.24f, 9.75f, 14.25f, 10.76f, 14.25f, 12f)
                curveTo(14.25f, 13.24f, 13.24f, 14.25f, 12f, 14.25f)
                close()
                moveTo(19f, 12.75f)
                horizontalLineTo(17f)
                curveTo(16.59f, 12.75f, 16.25f, 12.41f, 16.25f, 12f)
                curveTo(16.25f, 11.59f, 16.59f, 11.25f, 17f, 11.25f)
                horizontalLineTo(19f)
                curveTo(19.41f, 11.25f, 19.75f, 11.59f, 19.75f, 12f)
                curveTo(19.75f, 12.41f, 19.41f, 12.75f, 19f, 12.75f)
                close()
            }
        }.build()

        return _Level!!
    }

@Suppress("ObjectPropertyName")
private var _Level: ImageVector? = null
