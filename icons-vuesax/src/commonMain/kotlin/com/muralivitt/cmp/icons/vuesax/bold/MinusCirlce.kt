package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.MinusCirlce: ImageVector
    get() {
        if (_MinusCirlce != null) {
            return _MinusCirlce!!
        }
        _MinusCirlce = ImageVector.Builder(
            name = "MinusCirlce",
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
                moveTo(15.92f, 12.75f)
                horizontalLineTo(7.92f)
                curveTo(7.51f, 12.75f, 7.17f, 12.41f, 7.17f, 12f)
                curveTo(7.17f, 11.59f, 7.51f, 11.25f, 7.92f, 11.25f)
                horizontalLineTo(15.92f)
                curveTo(16.33f, 11.25f, 16.67f, 11.59f, 16.67f, 12f)
                curveTo(16.67f, 12.41f, 16.34f, 12.75f, 15.92f, 12.75f)
                close()
            }
        }.build()

        return _MinusCirlce!!
    }

@Suppress("ObjectPropertyName")
private var _MinusCirlce: ImageVector? = null
