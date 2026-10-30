package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Archive1: ImageVector
    get() {
        if (_Archive1 != null) {
            return _Archive1!!
        }
        _Archive1 = ImageVector.Builder(
            name = "Archive1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.82f, 2f)
                horizontalLineTo(7.18f)
                curveTo(5.05f, 2f, 3.32f, 3.74f, 3.32f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(3.32f, 21.75f, 4.61f, 22.51f, 6.19f, 21.64f)
                lineTo(11.07f, 18.93f)
                curveTo(11.59f, 18.64f, 12.43f, 18.64f, 12.94f, 18.93f)
                lineTo(17.82f, 21.64f)
                curveTo(19.4f, 22.52f, 20.69f, 21.76f, 20.69f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(20.68f, 3.74f, 18.95f, 2f, 16.82f, 2f)
                close()
                moveTo(15.01f, 9.75f)
                curveTo(14.04f, 10.1f, 13.02f, 10.28f, 12f, 10.28f)
                curveTo(10.98f, 10.28f, 9.96f, 10.1f, 8.99f, 9.75f)
                curveTo(8.6f, 9.61f, 8.4f, 9.18f, 8.54f, 8.79f)
                curveTo(8.69f, 8.4f, 9.12f, 8.2f, 9.51f, 8.34f)
                curveTo(11.12f, 8.92f, 12.89f, 8.92f, 14.5f, 8.34f)
                curveTo(14.89f, 8.2f, 15.32f, 8.4f, 15.46f, 8.79f)
                curveTo(15.6f, 9.18f, 15.4f, 9.61f, 15.01f, 9.75f)
                close()
            }
        }.build()

        return _Archive1!!
    }

@Suppress("ObjectPropertyName")
private var _Archive1: ImageVector? = null
