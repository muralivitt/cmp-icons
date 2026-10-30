package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.TickCircle: ImageVector
    get() {
        if (_TickCircle != null) {
            return _TickCircle!!
        }
        _TickCircle = ImageVector.Builder(
            name = "TickCircle",
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
                moveTo(10.58f, 15.58f)
                curveTo(10.38f, 15.58f, 10.189f, 15.5f, 10.05f, 15.36f)
                lineTo(7.219f, 12.53f)
                curveTo(6.929f, 12.24f, 6.929f, 11.76f, 7.219f, 11.47f)
                curveTo(7.509f, 11.18f, 7.989f, 11.18f, 8.279f, 11.47f)
                lineTo(10.58f, 13.77f)
                lineTo(15.719f, 8.63f)
                curveTo(16.01f, 8.34f, 16.49f, 8.34f, 16.779f, 8.63f)
                curveTo(17.069f, 8.92f, 17.069f, 9.4f, 16.779f, 9.69f)
                lineTo(11.109f, 15.36f)
                curveTo(10.969f, 15.5f, 10.78f, 15.58f, 10.58f, 15.58f)
                close()
            }
        }.build()

        return _TickCircle!!
    }

@Suppress("ObjectPropertyName")
private var _TickCircle: ImageVector? = null
