package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Money2: ImageVector
    get() {
        if (_Money2 != null) {
            return _Money2!!
        }
        _Money2 = ImageVector.Builder(
            name = "Money2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 15f)
                curveTo(13.657f, 15f, 15f, 13.657f, 15f, 12f)
                curveTo(15f, 10.343f, 13.657f, 9f, 12f, 9f)
                curveTo(10.343f, 9f, 9f, 10.343f, 9f, 12f)
                curveTo(9f, 13.657f, 10.343f, 15f, 12f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17f, 3.5f)
                horizontalLineTo(7f)
                curveTo(4f, 3.5f, 2f, 5f, 2f, 8.5f)
                verticalLineTo(9f)
                verticalLineTo(15f)
                verticalLineTo(15.5f)
                curveTo(2f, 19f, 4f, 20.5f, 7f, 20.5f)
                horizontalLineTo(17f)
                curveTo(20f, 20.5f, 22f, 19f, 22f, 15.5f)
                verticalLineTo(15f)
                verticalLineTo(9f)
                verticalLineTo(8.5f)
                curveTo(22f, 5f, 20f, 3.5f, 17f, 3.5f)
                close()
                moveTo(7f, 19f)
                curveTo(7f, 16.18f, 6.09f, 15.14f, 3.5f, 15.02f)
                verticalLineTo(15f)
                verticalLineTo(9f)
                verticalLineTo(8.98f)
                curveTo(6.09f, 8.86f, 7f, 7.82f, 7f, 5f)
                horizontalLineTo(17f)
                curveTo(17f, 7.82f, 17.91f, 8.86f, 20.5f, 8.98f)
                verticalLineTo(9f)
                verticalLineTo(15f)
                verticalLineTo(15.02f)
                curveTo(17.91f, 15.14f, 17f, 16.18f, 17f, 19f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Money2!!
    }

@Suppress("ObjectPropertyName")
private var _Money2: ImageVector? = null
