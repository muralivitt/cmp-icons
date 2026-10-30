package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.ArrowLeft2: ImageVector
    get() {
        if (_ArrowLeft2 != null) {
            return _ArrowLeft2!!
        }
        _ArrowLeft2 = ImageVector.Builder(
            name = "ArrowLeft2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14.999f, 20.67f)
                curveTo(14.809f, 20.67f, 14.619f, 20.6f, 14.469f, 20.45f)
                lineTo(7.949f, 13.93f)
                curveTo(6.889f, 12.87f, 6.889f, 11.13f, 7.949f, 10.07f)
                lineTo(14.469f, 3.55f)
                curveTo(14.759f, 3.26f, 15.239f, 3.26f, 15.529f, 3.55f)
                curveTo(15.819f, 3.84f, 15.819f, 4.32f, 15.529f, 4.61f)
                lineTo(9.009f, 11.13f)
                curveTo(8.529f, 11.61f, 8.529f, 12.39f, 9.009f, 12.87f)
                lineTo(15.529f, 19.39f)
                curveTo(15.819f, 19.68f, 15.819f, 20.16f, 15.529f, 20.45f)
                curveTo(15.379f, 20.59f, 15.189f, 20.67f, 14.999f, 20.67f)
                close()
            }
        }.build()

        return _ArrowLeft2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft2: ImageVector? = null
