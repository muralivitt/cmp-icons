package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.User: ImageVector
    get() {
        if (_User != null) {
            return _User!!
        }
        _User = ImageVector.Builder(
            name = "User",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 12.75f)
                curveTo(8.83f, 12.75f, 6.25f, 10.17f, 6.25f, 7f)
                curveTo(6.25f, 3.83f, 8.83f, 1.25f, 12f, 1.25f)
                curveTo(15.17f, 1.25f, 17.75f, 3.83f, 17.75f, 7f)
                curveTo(17.75f, 10.17f, 15.17f, 12.75f, 12f, 12.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(9.66f, 2.75f, 7.75f, 4.66f, 7.75f, 7f)
                curveTo(7.75f, 9.34f, 9.66f, 11.25f, 12f, 11.25f)
                curveTo(14.34f, 11.25f, 16.25f, 9.34f, 16.25f, 7f)
                curveTo(16.25f, 4.66f, 14.34f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.59f, 22.75f)
                curveTo(20.18f, 22.75f, 19.84f, 22.41f, 19.84f, 22f)
                curveTo(19.84f, 18.55f, 16.32f, 15.75f, 12f, 15.75f)
                curveTo(7.68f, 15.75f, 4.16f, 18.55f, 4.16f, 22f)
                curveTo(4.16f, 22.41f, 3.82f, 22.75f, 3.41f, 22.75f)
                curveTo(3f, 22.75f, 2.66f, 22.41f, 2.66f, 22f)
                curveTo(2.66f, 17.73f, 6.85f, 14.25f, 12f, 14.25f)
                curveTo(17.15f, 14.25f, 21.34f, 17.73f, 21.34f, 22f)
                curveTo(21.34f, 22.41f, 21f, 22.75f, 20.59f, 22.75f)
                close()
            }
        }.build()

        return _User!!
    }

@Suppress("ObjectPropertyName")
private var _User: ImageVector? = null
