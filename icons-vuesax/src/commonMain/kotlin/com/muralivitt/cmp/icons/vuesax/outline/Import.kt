package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Import: ImageVector
    get() {
        if (_Import != null) {
            return _Import!!
        }
        _Import = ImageVector.Builder(
            name = "Import",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(11.88f, 14.99f)
                curveTo(11.69f, 14.99f, 11.5f, 14.92f, 11.35f, 14.77f)
                lineTo(8.79f, 12.21f)
                curveTo(8.5f, 11.92f, 8.5f, 11.44f, 8.79f, 11.15f)
                curveTo(9.08f, 10.86f, 9.56f, 10.86f, 9.85f, 11.15f)
                lineTo(11.88f, 13.18f)
                lineTo(13.91f, 11.15f)
                curveTo(14.2f, 10.86f, 14.68f, 10.86f, 14.97f, 11.15f)
                curveTo(15.26f, 11.44f, 15.26f, 11.92f, 14.97f, 12.21f)
                lineTo(12.41f, 14.77f)
                curveTo(12.26f, 14.92f, 12.07f, 14.99f, 11.88f, 14.99f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(11.881f, 14.92f)
                curveTo(11.471f, 14.92f, 11.131f, 14.58f, 11.131f, 14.17f)
                verticalLineTo(4f)
                curveTo(11.131f, 3.59f, 11.471f, 3.25f, 11.881f, 3.25f)
                curveTo(12.291f, 3.25f, 12.631f, 3.59f, 12.631f, 4f)
                verticalLineTo(14.17f)
                curveTo(12.631f, 14.58f, 12.291f, 14.92f, 11.881f, 14.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 20.93f)
                curveTo(6.85f, 20.93f, 3.25f, 17.33f, 3.25f, 12.18f)
                curveTo(3.25f, 11.77f, 3.59f, 11.43f, 4f, 11.43f)
                curveTo(4.41f, 11.43f, 4.75f, 11.77f, 4.75f, 12.18f)
                curveTo(4.75f, 16.45f, 7.73f, 19.43f, 12f, 19.43f)
                curveTo(16.27f, 19.43f, 19.25f, 16.45f, 19.25f, 12.18f)
                curveTo(19.25f, 11.77f, 19.59f, 11.43f, 20f, 11.43f)
                curveTo(20.41f, 11.43f, 20.75f, 11.77f, 20.75f, 12.18f)
                curveTo(20.75f, 17.33f, 17.15f, 20.93f, 12f, 20.93f)
                close()
            }
        }.build()

        return _Import!!
    }

@Suppress("ObjectPropertyName")
private var _Import: ImageVector? = null
