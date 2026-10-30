package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Cd: ImageVector
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
                moveTo(12f, 14.75f)
                curveTo(10.48f, 14.75f, 9.25f, 13.52f, 9.25f, 12f)
                curveTo(9.25f, 10.48f, 10.48f, 9.25f, 12f, 9.25f)
                curveTo(13.52f, 9.25f, 14.75f, 10.48f, 14.75f, 12f)
                curveTo(14.75f, 13.52f, 13.52f, 14.75f, 12f, 14.75f)
                close()
                moveTo(12f, 10.75f)
                curveTo(11.31f, 10.75f, 10.75f, 11.31f, 10.75f, 12f)
                curveTo(10.75f, 12.69f, 11.31f, 13.25f, 12f, 13.25f)
                curveTo(12.69f, 13.25f, 13.25f, 12.69f, 13.25f, 12f)
                curveTo(13.25f, 11.31f, 12.69f, 10.75f, 12f, 10.75f)
                close()
            }
        }.build()

        return _Cd!!
    }

@Suppress("ObjectPropertyName")
private var _Cd: ImageVector? = null
