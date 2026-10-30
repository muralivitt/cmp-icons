package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Copyright: ImageVector
    get() {
        if (_Copyright != null) {
            return _Copyright!!
        }
        _Copyright = ImageVector.Builder(
            name = "Copyright",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12.24f, 16.75f)
                curveTo(9.62f, 16.75f, 7.49f, 14.62f, 7.49f, 12f)
                curveTo(7.49f, 9.38f, 9.62f, 7.25f, 12.24f, 7.25f)
                curveTo(13.39f, 7.25f, 14.51f, 7.67f, 15.37f, 8.44f)
                curveTo(15.68f, 8.71f, 15.71f, 9.19f, 15.44f, 9.5f)
                curveTo(15.17f, 9.81f, 14.69f, 9.84f, 14.38f, 9.57f)
                curveTo(13.79f, 9.05f, 13.03f, 8.76f, 12.24f, 8.76f)
                curveTo(10.45f, 8.76f, 8.99f, 10.22f, 8.99f, 12.01f)
                curveTo(8.99f, 13.8f, 10.45f, 15.26f, 12.24f, 15.26f)
                curveTo(13.02f, 15.26f, 13.79f, 14.97f, 14.38f, 14.45f)
                curveTo(14.69f, 14.18f, 15.17f, 14.21f, 15.44f, 14.52f)
                curveTo(15.71f, 14.83f, 15.68f, 15.31f, 15.37f, 15.58f)
                curveTo(14.5f, 16.33f, 13.39f, 16.75f, 12.24f, 16.75f)
                close()
            }
        }.build()

        return _Copyright!!
    }

@Suppress("ObjectPropertyName")
private var _Copyright: ImageVector? = null
