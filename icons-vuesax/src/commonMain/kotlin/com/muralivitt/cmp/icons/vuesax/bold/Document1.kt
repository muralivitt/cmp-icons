package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Document1: ImageVector
    get() {
        if (_Document1 != null) {
            return _Document1!!
        }
        _Document1 = ImageVector.Builder(
            name = "Document1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.5f, 10.19f)
                horizontalLineTo(17.61f)
                curveTo(15.24f, 10.19f, 13.31f, 8.26f, 13.31f, 5.89f)
                verticalLineTo(3f)
                curveTo(13.31f, 2.45f, 12.86f, 2f, 12.31f, 2f)
                horizontalLineTo(8.07f)
                curveTo(4.99f, 2f, 2.5f, 4f, 2.5f, 7.57f)
                verticalLineTo(16.43f)
                curveTo(2.5f, 20f, 4.99f, 22f, 8.07f, 22f)
                horizontalLineTo(15.93f)
                curveTo(19.01f, 22f, 21.5f, 20f, 21.5f, 16.43f)
                verticalLineTo(11.19f)
                curveTo(21.5f, 10.64f, 21.05f, 10.19f, 20.5f, 10.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.8f, 2.21f)
                curveTo(15.39f, 1.8f, 14.68f, 2.08f, 14.68f, 2.65f)
                verticalLineTo(6.14f)
                curveTo(14.68f, 7.6f, 15.92f, 8.81f, 17.43f, 8.81f)
                curveTo(18.38f, 8.82f, 19.7f, 8.82f, 20.83f, 8.82f)
                curveTo(21.4f, 8.82f, 21.7f, 8.15f, 21.3f, 7.75f)
                curveTo(19.86f, 6.3f, 17.28f, 3.69f, 15.8f, 2.21f)
                close()
            }
        }.build()

        return _Document1!!
    }

@Suppress("ObjectPropertyName")
private var _Document1: ImageVector? = null
