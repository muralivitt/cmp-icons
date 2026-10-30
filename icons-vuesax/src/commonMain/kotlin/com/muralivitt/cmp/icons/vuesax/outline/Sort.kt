package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Sort: ImageVector
    get() {
        if (_Sort != null) {
            return _Sort!!
        }
        _Sort = ImageVector.Builder(
            name = "Sort",
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
                moveTo(18f, 12.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 12.75f, 5.25f, 12.41f, 5.25f, 12f)
                curveTo(5.25f, 11.59f, 5.59f, 11.25f, 6f, 11.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 11.25f, 18.75f, 11.59f, 18.75f, 12f)
                curveTo(18.75f, 12.41f, 18.41f, 12.75f, 18f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14f, 17.75f)
                horizontalLineTo(10f)
                curveTo(9.59f, 17.75f, 9.25f, 17.41f, 9.25f, 17f)
                curveTo(9.25f, 16.59f, 9.59f, 16.25f, 10f, 16.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 16.25f, 14.75f, 16.59f, 14.75f, 17f)
                curveTo(14.75f, 17.41f, 14.41f, 17.75f, 14f, 17.75f)
                close()
            }
        }.build()

        return _Sort!!
    }

@Suppress("ObjectPropertyName")
private var _Sort: ImageVector? = null
