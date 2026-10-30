package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.ArrowCircleDown: ImageVector
    get() {
        if (_ArrowCircleDown != null) {
            return _ArrowCircleDown!!
        }
        _ArrowCircleDown = ImageVector.Builder(
            name = "ArrowCircleDown",
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
                moveTo(12f, 15.01f)
                curveTo(11.81f, 15.01f, 11.62f, 14.94f, 11.47f, 14.79f)
                lineTo(7.94f, 11.26f)
                curveTo(7.65f, 10.97f, 7.65f, 10.49f, 7.94f, 10.2f)
                curveTo(8.23f, 9.91f, 8.71f, 9.91f, 9f, 10.2f)
                lineTo(12f, 13.2f)
                lineTo(15f, 10.2f)
                curveTo(15.29f, 9.91f, 15.77f, 9.91f, 16.06f, 10.2f)
                curveTo(16.35f, 10.49f, 16.35f, 10.97f, 16.06f, 11.26f)
                lineTo(12.53f, 14.79f)
                curveTo(12.38f, 14.94f, 12.19f, 15.01f, 12f, 15.01f)
                close()
            }
        }.build()

        return _ArrowCircleDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleDown: ImageVector? = null
