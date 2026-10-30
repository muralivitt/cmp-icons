package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Screenmirroring: ImageVector
    get() {
        if (_Screenmirroring != null) {
            return _Screenmirroring!!
        }
        _Screenmirroring = ImageVector.Builder(
            name = "Screenmirroring",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(18.5f, 16.4f)
                curveTo(18.5f, 17.9f, 17.9f, 18.5f, 16.4f, 18.5f)
                horizontalLineTo(12.6f)
                curveTo(11.1f, 18.5f, 10.5f, 17.9f, 10.5f, 16.4f)
                verticalLineTo(14.6f)
                curveTo(10.5f, 13.1f, 11.1f, 12.5f, 12.6f, 12.5f)
                horizontalLineTo(16.4f)
                curveTo(17.9f, 12.5f, 18.5f, 13.1f, 18.5f, 14.6f)
                verticalLineTo(16.4f)
                close()
            }
        }.build()

        return _Screenmirroring!!
    }

@Suppress("ObjectPropertyName")
private var _Screenmirroring: ImageVector? = null
