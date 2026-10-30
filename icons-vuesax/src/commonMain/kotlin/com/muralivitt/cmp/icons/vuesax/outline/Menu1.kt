package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Menu1: ImageVector
    get() {
        if (_Menu1 != null) {
            return _Menu1!!
        }
        _Menu1 = ImageVector.Builder(
            name = "Menu1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21f, 7.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 7.75f, 2.25f, 7.41f, 2.25f, 7f)
                curveTo(2.25f, 6.59f, 2.59f, 6.25f, 3f, 6.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 6.25f, 21.75f, 6.59f, 21.75f, 7f)
                curveTo(21.75f, 7.41f, 21.41f, 7.75f, 21f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21f, 12.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 12.75f, 2.25f, 12.41f, 2.25f, 12f)
                curveTo(2.25f, 11.59f, 2.59f, 11.25f, 3f, 11.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 11.25f, 21.75f, 11.59f, 21.75f, 12f)
                curveTo(21.75f, 12.41f, 21.41f, 12.75f, 21f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21f, 17.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 17.75f, 2.25f, 17.41f, 2.25f, 17f)
                curveTo(2.25f, 16.59f, 2.59f, 16.25f, 3f, 16.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 16.25f, 21.75f, 16.59f, 21.75f, 17f)
                curveTo(21.75f, 17.41f, 21.41f, 17.75f, 21f, 17.75f)
                close()
            }
        }.build()

        return _Menu1!!
    }

@Suppress("ObjectPropertyName")
private var _Menu1: ImageVector? = null
