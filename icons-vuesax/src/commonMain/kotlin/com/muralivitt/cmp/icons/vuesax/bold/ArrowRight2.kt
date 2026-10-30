package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowRight2: ImageVector
    get() {
        if (_ArrowRight2 != null) {
            return _ArrowRight2!!
        }
        _ArrowRight2 = ImageVector.Builder(
            name = "ArrowRight2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.2f, 10.492f)
                lineTo(13.23f, 8.522f)
                lineTo(10.02f, 5.312f)
                curveTo(9.34f, 4.642f, 8.18f, 5.122f, 8.18f, 6.082f)
                verticalLineTo(12.312f)
                verticalLineTo(17.922f)
                curveTo(8.18f, 18.882f, 9.34f, 19.362f, 10.02f, 18.682f)
                lineTo(15.2f, 13.502f)
                curveTo(16.03f, 12.682f, 16.03f, 11.322f, 15.2f, 10.492f)
                close()
            }
        }.build()

        return _ArrowRight2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight2: ImageVector? = null
