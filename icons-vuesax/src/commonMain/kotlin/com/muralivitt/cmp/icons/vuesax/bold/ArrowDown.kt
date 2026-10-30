package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowDown: ImageVector
    get() {
        if (_ArrowDown != null) {
            return _ArrowDown!!
        }
        _ArrowDown = ImageVector.Builder(
            name = "ArrowDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17.919f, 8.18f)
                horizontalLineTo(11.689f)
                horizontalLineTo(6.079f)
                curveTo(5.119f, 8.18f, 4.639f, 9.34f, 5.319f, 10.02f)
                lineTo(10.499f, 15.2f)
                curveTo(11.329f, 16.03f, 12.679f, 16.03f, 13.509f, 15.2f)
                lineTo(15.479f, 13.23f)
                lineTo(18.689f, 10.02f)
                curveTo(19.359f, 9.34f, 18.879f, 8.18f, 17.919f, 8.18f)
                close()
            }
        }.build()

        return _ArrowDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDown: ImageVector? = null
