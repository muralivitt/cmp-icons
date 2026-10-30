package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Airpod: ImageVector
    get() {
        if (_Airpod != null) {
            return _Airpod!!
        }
        _Airpod = ImageVector.Builder(
            name = "Airpod",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.08f, 11.342f)
                horizontalLineTo(8.92f)
                curveTo(8.28f, 11.342f, 7.65f, 11.082f, 7.2f, 10.622f)
                curveTo(7.06f, 10.482f, 6.94f, 10.332f, 6.84f, 10.162f)
                curveTo(6.66f, 9.862f, 6.34f, 9.672f, 5.99f, 9.672f)
                horizontalLineTo(3.5f)
                curveTo(2.95f, 9.672f, 2.5f, 10.122f, 2.5f, 10.672f)
                verticalLineTo(17.502f)
                curveTo(2.5f, 19.992f, 4.51f, 22.002f, 7f, 22.002f)
                horizontalLineTo(17f)
                curveTo(19.49f, 22.002f, 21.5f, 19.992f, 21.5f, 17.502f)
                verticalLineTo(10.672f)
                curveTo(21.5f, 10.122f, 21.05f, 9.672f, 20.5f, 9.672f)
                horizontalLineTo(18f)
                curveTo(17.64f, 9.672f, 17.32f, 9.872f, 17.14f, 10.182f)
                curveTo(16.72f, 10.872f, 15.95f, 11.342f, 15.08f, 11.342f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(4.51f, 2f, 2.5f, 4.01f, 2.5f, 6.5f)
                verticalLineTo(7.17f)
                curveTo(2.5f, 7.72f, 2.95f, 8.17f, 3.5f, 8.17f)
                horizontalLineTo(6f)
                curveTo(6.36f, 8.17f, 6.68f, 7.97f, 6.86f, 7.66f)
                curveTo(7.28f, 6.97f, 8.05f, 6.5f, 8.92f, 6.5f)
                horizontalLineTo(14.91f)
                curveTo(15.52f, 6.5f, 16.4f, 6.82f, 16.82f, 7.25f)
                curveTo(16.95f, 7.38f, 17.05f, 7.52f, 17.15f, 7.67f)
                curveTo(17.33f, 7.97f, 17.65f, 8.17f, 18.01f, 8.17f)
                horizontalLineTo(20.51f)
                curveTo(21.06f, 8.17f, 21.51f, 7.72f, 21.51f, 7.17f)
                verticalLineTo(6.5f)
                curveTo(21.5f, 4.01f, 19.49f, 2f, 17f, 2f)
                close()
            }
        }.build()

        return _Airpod!!
    }

@Suppress("ObjectPropertyName")
private var _Airpod: ImageVector? = null
