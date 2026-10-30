package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Import: ImageVector
    get() {
        if (_Import != null) {
            return _Import!!
        }
        _Import = ImageVector.Builder(
            name = "Import",
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
                moveTo(17.53f, 7.53f)
                lineTo(9.81f, 15.25f)
                horizontalLineTo(12.83f)
                curveTo(13.24f, 15.25f, 13.58f, 15.59f, 13.58f, 16f)
                curveTo(13.58f, 16.41f, 13.24f, 16.75f, 12.83f, 16.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 16.75f, 7.25f, 16.41f, 7.25f, 16f)
                verticalLineTo(11.17f)
                curveTo(7.25f, 10.76f, 7.59f, 10.42f, 8f, 10.42f)
                curveTo(8.41f, 10.42f, 8.75f, 10.76f, 8.75f, 11.17f)
                verticalLineTo(14.19f)
                lineTo(16.47f, 6.47f)
                curveTo(16.62f, 6.32f, 16.81f, 6.25f, 17f, 6.25f)
                curveTo(17.19f, 6.25f, 17.38f, 6.32f, 17.53f, 6.47f)
                curveTo(17.82f, 6.76f, 17.82f, 7.24f, 17.53f, 7.53f)
                close()
            }
        }.build()

        return _Import!!
    }

@Suppress("ObjectPropertyName")
private var _Import: ImageVector? = null
