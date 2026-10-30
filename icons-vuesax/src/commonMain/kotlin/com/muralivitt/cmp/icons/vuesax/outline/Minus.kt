package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Minus: ImageVector
    get() {
        if (_Minus != null) {
            return _Minus!!
        }
        _Minus = ImageVector.Builder(
            name = "Minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18f, 12.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 12.75f, 5.25f, 12.41f, 5.25f, 12f)
                curveTo(5.25f, 11.59f, 5.59f, 11.25f, 6f, 11.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 11.25f, 18.75f, 11.59f, 18.75f, 12f)
                curveTo(18.75f, 12.41f, 18.41f, 12.75f, 18f, 12.75f)
                close()
            }
        }.build()

        return _Minus!!
    }

@Suppress("ObjectPropertyName")
private var _Minus: ImageVector? = null
