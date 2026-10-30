package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Timer1: ImageVector
    get() {
        if (_Timer1 != null) {
            return _Timer1!!
        }
        _Timer1 = ImageVector.Builder(
            name = "Timer1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 22.75f)
                curveTo(6.76f, 22.75f, 2.5f, 18.49f, 2.5f, 13.25f)
                curveTo(2.5f, 8.01f, 6.76f, 3.75f, 12f, 3.75f)
                curveTo(17.24f, 3.75f, 21.5f, 8.01f, 21.5f, 13.25f)
                curveTo(21.5f, 18.49f, 17.24f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 5.25f)
                curveTo(7.59f, 5.25f, 4f, 8.84f, 4f, 13.25f)
                curveTo(4f, 17.66f, 7.59f, 21.25f, 12f, 21.25f)
                curveTo(16.41f, 21.25f, 20f, 17.66f, 20f, 13.25f)
                curveTo(20f, 8.84f, 16.41f, 5.25f, 12f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 13.75f)
                curveTo(11.59f, 13.75f, 11.25f, 13.41f, 11.25f, 13f)
                verticalLineTo(8f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12f, 7.25f)
                curveTo(12.41f, 7.25f, 12.75f, 7.59f, 12.75f, 8f)
                verticalLineTo(13f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 2.75f, 8.25f, 2.41f, 8.25f, 2f)
                curveTo(8.25f, 1.59f, 8.59f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 1.25f, 15.75f, 1.59f, 15.75f, 2f)
                curveTo(15.75f, 2.41f, 15.41f, 2.75f, 15f, 2.75f)
                close()
            }
        }.build()

        return _Timer1!!
    }

@Suppress("ObjectPropertyName")
private var _Timer1: ImageVector? = null
