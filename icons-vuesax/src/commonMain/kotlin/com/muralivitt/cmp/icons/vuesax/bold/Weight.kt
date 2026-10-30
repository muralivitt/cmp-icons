package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Weight: ImageVector
    get() {
        if (_Weight != null) {
            return _Weight!!
        }
        _Weight = ImageVector.Builder(
            name = "Weight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(5f, 2f, 3f, 4f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 20f, 5f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(19f, 22f, 21f, 20f, 21f, 17f)
                verticalLineTo(7f)
                curveTo(21f, 4f, 19f, 2f, 16f, 2f)
                close()
                moveTo(17.57f, 8.48f)
                lineTo(15.39f, 11.98f)
                curveTo(15.33f, 12.07f, 15.23f, 12.14f, 15.13f, 12.15f)
                curveTo(15.11f, 12.15f, 15.09f, 12.15f, 15.08f, 12.15f)
                curveTo(14.99f, 12.15f, 14.9f, 12.12f, 14.83f, 12.06f)
                curveTo(13.22f, 10.63f, 10.8f, 10.63f, 9.19f, 12.06f)
                curveTo(9.11f, 12.13f, 9f, 12.17f, 8.89f, 12.15f)
                curveTo(8.78f, 12.13f, 8.68f, 12.07f, 8.63f, 11.98f)
                lineTo(6.45f, 8.48f)
                curveTo(6.33f, 8.33f, 6.36f, 8.13f, 6.5f, 8f)
                curveTo(9.63f, 5.21f, 14.36f, 5.21f, 17.5f, 8f)
                curveTo(17.64f, 8.13f, 17.67f, 8.33f, 17.57f, 8.48f)
                close()
            }
        }.build()

        return _Weight!!
    }

@Suppress("ObjectPropertyName")
private var _Weight: ImageVector? = null
