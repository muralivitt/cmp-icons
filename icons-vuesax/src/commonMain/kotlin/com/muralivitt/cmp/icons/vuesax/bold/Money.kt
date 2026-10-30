package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Money: ImageVector
    get() {
        if (_Money != null) {
            return _Money!!
        }
        _Money = ImageVector.Builder(
            name = "Money",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17f, 3.5f)
                horizontalLineTo(7f)
                curveTo(4f, 3.5f, 2f, 5f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 19f, 4f, 20.5f, 7f, 20.5f)
                horizontalLineTo(17f)
                curveTo(20f, 20.5f, 22f, 19f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 5f, 20f, 3.5f, 17f, 3.5f)
                close()
                moveTo(6.25f, 14.5f)
                curveTo(6.25f, 14.91f, 5.91f, 15.25f, 5.5f, 15.25f)
                curveTo(5.09f, 15.25f, 4.75f, 14.91f, 4.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(4.75f, 9.09f, 5.09f, 8.75f, 5.5f, 8.75f)
                curveTo(5.91f, 8.75f, 6.25f, 9.09f, 6.25f, 9.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(12f, 15f)
                curveTo(10.34f, 15f, 9f, 13.66f, 9f, 12f)
                curveTo(9f, 10.34f, 10.34f, 9f, 12f, 9f)
                curveTo(13.66f, 9f, 15f, 10.34f, 15f, 12f)
                curveTo(15f, 13.66f, 13.66f, 15f, 12f, 15f)
                close()
                moveTo(19.25f, 14.5f)
                curveTo(19.25f, 14.91f, 18.91f, 15.25f, 18.5f, 15.25f)
                curveTo(18.09f, 15.25f, 17.75f, 14.91f, 17.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(17.75f, 9.09f, 18.09f, 8.75f, 18.5f, 8.75f)
                curveTo(18.91f, 8.75f, 19.25f, 9.09f, 19.25f, 9.5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _Money!!
    }

@Suppress("ObjectPropertyName")
private var _Money: ImageVector? = null
