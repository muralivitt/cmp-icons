package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Pause: ImageVector
    get() {
        if (_Pause != null) {
            return _Pause!!
        }
        _Pause = ImageVector.Builder(
            name = "Pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(10.65f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(10.65f, 3.54f, 10.08f, 3f, 8.64f, 3f)
                horizontalLineTo(5.01f)
                curveTo(3.57f, 3f, 3f, 3.54f, 3f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(3f, 20.46f, 3.57f, 21f, 5.01f, 21f)
                horizontalLineTo(8.64f)
                curveTo(10.08f, 21f, 10.65f, 20.46f, 10.65f, 19.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.002f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(21.002f, 3.54f, 20.432f, 3f, 18.992f, 3f)
                horizontalLineTo(15.362f)
                curveTo(13.932f, 3f, 13.352f, 3.54f, 13.352f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(13.352f, 20.46f, 13.922f, 21f, 15.362f, 21f)
                horizontalLineTo(18.992f)
                curveTo(20.432f, 21f, 21.002f, 20.46f, 21.002f, 19.11f)
                close()
            }
        }.build()

        return _Pause!!
    }

@Suppress("ObjectPropertyName")
private var _Pause: ImageVector? = null
