package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ArrowLeft3: ImageVector
    get() {
        if (_ArrowLeft3 != null) {
            return _ArrowLeft3!!
        }
        _ArrowLeft3 = ImageVector.Builder(
            name = "ArrowLeft3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(13.978f, 5.319f)
                lineTo(10.768f, 8.529f)
                lineTo(8.798f, 10.489f)
                curveTo(7.968f, 11.319f, 7.968f, 12.669f, 8.798f, 13.499f)
                lineTo(13.978f, 18.679f)
                curveTo(14.658f, 19.359f, 15.818f, 18.869f, 15.818f, 17.919f)
                verticalLineTo(12.309f)
                verticalLineTo(6.079f)
                curveTo(15.818f, 5.119f, 14.658f, 4.639f, 13.978f, 5.319f)
                close()
            }
        }.build()

        return _ArrowLeft3!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft3: ImageVector? = null
