package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Strongbox: ImageVector
    get() {
        if (_Strongbox != null) {
            return _Strongbox!!
        }
        _Strongbox = ImageVector.Builder(
            name = "Strongbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(13.25f, 12.58f)
                verticalLineTo(14.56f)
                curveTo(13.25f, 15.25f, 12.69f, 15.81f, 12f, 15.81f)
                curveTo(11.31f, 15.81f, 10.75f, 15.25f, 10.75f, 14.56f)
                verticalLineTo(12.58f)
                curveTo(10.39f, 12.36f, 10.11f, 12.04f, 9.91f, 11.66f)
                horizontalLineTo(3f)
                curveTo(2.45f, 11.66f, 2f, 12.11f, 2f, 12.66f)
                verticalLineTo(16.19f)
                curveTo(2f, 19.4f, 4.6f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.4f, 22f, 22f, 19.4f, 22f, 16.19f)
                verticalLineTo(12.66f)
                curveTo(22f, 12.11f, 21.55f, 11.66f, 21f, 11.66f)
                horizontalLineTo(14.09f)
                curveTo(13.89f, 12.04f, 13.61f, 12.36f, 13.25f, 12.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.6f, 2f, 2f, 4.6f, 2f, 7.81f)
                verticalLineTo(9.16f)
                curveTo(2f, 9.71f, 2.45f, 10.16f, 3f, 10.16f)
                horizontalLineTo(9.67f)
                curveTo(9.9f, 8.84f, 11.21f, 7.9f, 12.64f, 8.28f)
                curveTo(13.44f, 8.49f, 14.09f, 9.14f, 14.3f, 9.94f)
                curveTo(14.32f, 10.01f, 14.32f, 10.09f, 14.33f, 10.16f)
                horizontalLineTo(21f)
                curveTo(21.55f, 10.16f, 22f, 9.71f, 22f, 9.16f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.6f, 19.4f, 2f, 16.19f, 2f)
                close()
            }
        }.build()

        return _Strongbox!!
    }

@Suppress("ObjectPropertyName")
private var _Strongbox: ImageVector? = null
