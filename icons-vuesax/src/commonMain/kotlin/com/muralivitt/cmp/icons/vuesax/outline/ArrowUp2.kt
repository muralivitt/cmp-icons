package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.ArrowUp2: ImageVector
    get() {
        if (_ArrowUp2 != null) {
            return _ArrowUp2!!
        }
        _ArrowUp2 = ImageVector.Builder(
            name = "ArrowUp2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(19.92f, 15.8f)
                curveTo(19.729f, 15.8f, 19.539f, 15.73f, 19.389f, 15.58f)
                lineTo(12.87f, 9.06f)
                curveTo(12.389f, 8.58f, 11.609f, 8.58f, 11.13f, 9.06f)
                lineTo(4.61f, 15.58f)
                curveTo(4.32f, 15.87f, 3.84f, 15.87f, 3.55f, 15.58f)
                curveTo(3.26f, 15.29f, 3.26f, 14.81f, 3.55f, 14.52f)
                lineTo(10.069f, 8f)
                curveTo(11.13f, 6.94f, 12.859f, 6.94f, 13.929f, 8f)
                lineTo(20.449f, 14.52f)
                curveTo(20.74f, 14.81f, 20.74f, 15.29f, 20.449f, 15.58f)
                curveTo(20.299f, 15.72f, 20.11f, 15.8f, 19.92f, 15.8f)
                close()
            }
        }.build()

        return _ArrowUp2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUp2: ImageVector? = null
