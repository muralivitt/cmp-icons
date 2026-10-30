package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.TextUnderline: ImageVector
    get() {
        if (_TextUnderline != null) {
            return _TextUnderline!!
        }
        _TextUnderline = ImageVector.Builder(
            name = "TextUnderline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(19f, 21.75f)
                horizontalLineTo(5f)
                curveTo(4.59f, 21.75f, 4.25f, 21.41f, 4.25f, 21f)
                curveTo(4.25f, 20.59f, 4.59f, 20.25f, 5f, 20.25f)
                horizontalLineTo(19f)
                curveTo(19.41f, 20.25f, 19.75f, 20.59f, 19.75f, 21f)
                curveTo(19.75f, 21.41f, 19.41f, 21.75f, 19f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 17.75f)
                curveTo(7.73f, 17.75f, 4.25f, 14.27f, 4.25f, 10f)
                verticalLineTo(3f)
                curveTo(4.25f, 2.59f, 4.59f, 2.25f, 5f, 2.25f)
                curveTo(5.41f, 2.25f, 5.75f, 2.59f, 5.75f, 3f)
                verticalLineTo(10f)
                curveTo(5.75f, 13.45f, 8.55f, 16.25f, 12f, 16.25f)
                curveTo(15.45f, 16.25f, 18.25f, 13.45f, 18.25f, 10f)
                verticalLineTo(3f)
                curveTo(18.25f, 2.59f, 18.59f, 2.25f, 19f, 2.25f)
                curveTo(19.41f, 2.25f, 19.75f, 2.59f, 19.75f, 3f)
                verticalLineTo(10f)
                curveTo(19.75f, 14.27f, 16.27f, 17.75f, 12f, 17.75f)
                close()
            }
        }.build()

        return _TextUnderline!!
    }

@Suppress("ObjectPropertyName")
private var _TextUnderline: ImageVector? = null
