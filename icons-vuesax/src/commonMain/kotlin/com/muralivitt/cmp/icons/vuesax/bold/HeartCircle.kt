package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.HeartCircle: ImageVector
    get() {
        if (_HeartCircle != null) {
            return _HeartCircle!!
        }
        _HeartCircle = ImageVector.Builder(
            name = "HeartCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(12.33f, 17f)
                curveTo(12.15f, 17.06f, 11.84f, 17.06f, 11.66f, 17f)
                curveTo(10.1f, 16.47f, 6.6f, 14.24f, 6.6f, 10.46f)
                curveTo(6.6f, 8.79f, 7.94f, 7.44f, 9.6f, 7.44f)
                curveTo(10.58f, 7.44f, 11.45f, 7.91f, 12f, 8.65f)
                curveTo(12.54f, 7.92f, 13.42f, 7.44f, 14.4f, 7.44f)
                curveTo(16.06f, 7.44f, 17.4f, 8.79f, 17.4f, 10.46f)
                curveTo(17.4f, 14.24f, 13.9f, 16.47f, 12.33f, 17f)
                close()
            }
        }.build()

        return _HeartCircle!!
    }

@Suppress("ObjectPropertyName")
private var _HeartCircle: ImageVector? = null
