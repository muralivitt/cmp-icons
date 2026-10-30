package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Chart: ImageVector
    get() {
        if (_Chart != null) {
            return _Chart!!
        }
        _Chart = ImageVector.Builder(
            name = "Chart",
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
                moveTo(12f, 8.75f)
                curveTo(11.59f, 8.75f, 11.25f, 8.41f, 11.25f, 8f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12f, 7.25f)
                curveTo(14.62f, 7.25f, 16.75f, 9.38f, 16.75f, 12f)
                curveTo(16.75f, 14.62f, 14.62f, 16.75f, 12f, 16.75f)
                curveTo(11.59f, 16.75f, 11.25f, 16.41f, 11.25f, 16f)
                curveTo(11.25f, 15.59f, 11.59f, 15.25f, 12f, 15.25f)
                curveTo(13.79f, 15.25f, 15.25f, 13.79f, 15.25f, 12f)
                curveTo(15.25f, 10.21f, 13.79f, 8.75f, 12f, 8.75f)
                close()
                moveTo(12f, 19.75f)
                curveTo(7.73f, 19.75f, 4.25f, 16.27f, 4.25f, 12f)
                curveTo(4.25f, 11.59f, 4.59f, 11.25f, 5f, 11.25f)
                curveTo(5.41f, 11.25f, 5.75f, 11.59f, 5.75f, 12f)
                curveTo(5.75f, 15.45f, 8.55f, 18.25f, 12f, 18.25f)
                curveTo(15.45f, 18.25f, 18.25f, 15.45f, 18.25f, 12f)
                curveTo(18.25f, 8.55f, 15.45f, 5.75f, 12f, 5.75f)
                curveTo(11.59f, 5.75f, 11.25f, 5.41f, 11.25f, 5f)
                curveTo(11.25f, 4.59f, 11.59f, 4.25f, 12f, 4.25f)
                curveTo(16.27f, 4.25f, 19.75f, 7.73f, 19.75f, 12f)
                curveTo(19.75f, 16.27f, 16.27f, 19.75f, 12f, 19.75f)
                close()
            }
        }.build()

        return _Chart!!
    }

@Suppress("ObjectPropertyName")
private var _Chart: ImageVector? = null
