package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowCircleDown: ImageVector
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
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                curveTo(2f, 17.51f, 6.49f, 22f, 12f, 22f)
                curveTo(17.51f, 22f, 22f, 17.51f, 22f, 12f)
                curveTo(22f, 6.49f, 17.51f, 2f, 12f, 2f)
                close()
                moveTo(16.06f, 11.27f)
                lineTo(12.53f, 14.8f)
                curveTo(12.38f, 14.95f, 12.19f, 15.02f, 12f, 15.02f)
                curveTo(11.81f, 15.02f, 11.62f, 14.95f, 11.47f, 14.8f)
                lineTo(7.94f, 11.27f)
                curveTo(7.65f, 10.98f, 7.65f, 10.5f, 7.94f, 10.21f)
                curveTo(8.23f, 9.92f, 8.71f, 9.92f, 9f, 10.21f)
                lineTo(12f, 13.21f)
                lineTo(15f, 10.21f)
                curveTo(15.29f, 9.92f, 15.77f, 9.92f, 16.06f, 10.21f)
                curveTo(16.35f, 10.5f, 16.35f, 10.97f, 16.06f, 11.27f)
                close()
            }
        }.build()

        return _ArrowCircleDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCircleDown: ImageVector? = null
