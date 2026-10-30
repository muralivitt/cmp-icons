package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.TextItalic: ImageVector
    get() {
        if (_TextItalic != null) {
            return _TextItalic!!
        }
        _TextItalic = ImageVector.Builder(
            name = "TextItalic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18.881f, 3.75f)
                horizontalLineTo(9.621f)
                curveTo(9.211f, 3.75f, 8.881f, 3.41f, 8.881f, 3f)
                curveTo(8.881f, 2.59f, 9.221f, 2.25f, 9.631f, 2.25f)
                horizontalLineTo(18.881f)
                curveTo(19.291f, 2.25f, 19.631f, 2.59f, 19.631f, 3f)
                curveTo(19.631f, 3.41f, 19.291f, 3.75f, 18.881f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14.379f, 21.75f)
                horizontalLineTo(5.119f)
                curveTo(4.709f, 21.75f, 4.369f, 21.41f, 4.369f, 21f)
                curveTo(4.369f, 20.59f, 4.709f, 20.25f, 5.119f, 20.25f)
                horizontalLineTo(14.369f)
                curveTo(14.779f, 20.25f, 15.119f, 20.59f, 15.119f, 21f)
                curveTo(15.119f, 21.41f, 14.789f, 21.75f, 14.379f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(9.75f, 21.75f)
                curveTo(9.69f, 21.75f, 9.63f, 21.74f, 9.57f, 21.73f)
                curveTo(9.17f, 21.63f, 8.92f, 21.22f, 9.02f, 20.82f)
                lineTo(13.52f, 2.82f)
                curveTo(13.62f, 2.42f, 14.02f, 2.17f, 14.43f, 2.27f)
                curveTo(14.83f, 2.37f, 15.08f, 2.78f, 14.98f, 3.18f)
                lineTo(10.48f, 21.18f)
                curveTo(10.39f, 21.52f, 10.09f, 21.75f, 9.75f, 21.75f)
                close()
            }
        }.build()

        return _TextItalic!!
    }

@Suppress("ObjectPropertyName")
private var _TextItalic: ImageVector? = null
