package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Woman: ImageVector
    get() {
        if (_Woman != null) {
            return _Woman!!
        }
        _Woman = ImageVector.Builder(
            name = "Woman",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(19f, 9f)
                curveTo(19f, 5.13f, 15.87f, 2f, 12f, 2f)
                curveTo(8.13f, 2f, 5f, 5.13f, 5f, 9f)
                curveTo(5f, 12.62f, 7.74f, 15.59f, 11.25f, 15.96f)
                verticalLineTo(18.25f)
                horizontalLineTo(9f)
                curveTo(8.59f, 18.25f, 8.25f, 18.59f, 8.25f, 19f)
                curveTo(8.25f, 19.41f, 8.59f, 19.75f, 9f, 19.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(22f)
                curveTo(11.25f, 22.41f, 11.59f, 22.75f, 12f, 22.75f)
                curveTo(12.41f, 22.75f, 12.75f, 22.41f, 12.75f, 22f)
                verticalLineTo(19.75f)
                horizontalLineTo(15f)
                curveTo(15.41f, 19.75f, 15.75f, 19.41f, 15.75f, 19f)
                curveTo(15.75f, 18.59f, 15.41f, 18.25f, 15f, 18.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.96f)
                curveTo(16.26f, 15.59f, 19f, 12.62f, 19f, 9f)
                close()
            }
        }.build()

        return _Woman!!
    }

@Suppress("ObjectPropertyName")
private var _Woman: ImageVector? = null
