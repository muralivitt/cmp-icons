package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Cd: ImageVector
    get() {
        if (_Cd != null) {
            return _Cd!!
        }
        _Cd = ImageVector.Builder(
            name = "Cd",
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
                moveTo(12f, 14.5f)
                curveTo(10.62f, 14.5f, 9.5f, 13.38f, 9.5f, 12f)
                curveTo(9.5f, 10.62f, 10.62f, 9.5f, 12f, 9.5f)
                curveTo(13.38f, 9.5f, 14.5f, 10.62f, 14.5f, 12f)
                curveTo(14.5f, 13.38f, 13.38f, 14.5f, 12f, 14.5f)
                close()
            }
        }.build()

        return _Cd!!
    }

@Suppress("ObjectPropertyName")
private var _Cd: ImageVector? = null
