package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.RotateLeft1: ImageVector
    get() {
        if (_RotateLeft1 != null) {
            return _RotateLeft1!!
        }
        _RotateLeft1 = ImageVector.Builder(
            name = "RotateLeft1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(7.25f, 22f)
                horizontalLineTo(11.75f)
                curveTo(15.5f, 22f, 17f, 20.5f, 17f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(17f, 8.5f, 15.5f, 7f, 11.75f, 7f)
                horizontalLineTo(7.25f)
                curveTo(3.5f, 7f, 2f, 8.5f, 2f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(2f, 20.5f, 3.5f, 22f, 7.25f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.25f, 10.5f)
                curveTo(20.84f, 10.5f, 20.5f, 10.16f, 20.5f, 9.75f)
                curveTo(20.5f, 6.79f, 18.44f, 4.31f, 15.67f, 3.66f)
                lineTo(15.94f, 4.11f)
                curveTo(16.15f, 4.47f, 16.04f, 4.93f, 15.68f, 5.14f)
                curveTo(15.32f, 5.35f, 14.86f, 5.24f, 14.65f, 4.88f)
                lineTo(13.6f, 3.13f)
                curveTo(13.46f, 2.9f, 13.46f, 2.61f, 13.59f, 2.38f)
                curveTo(13.73f, 2.15f, 13.98f, 2f, 14.25f, 2f)
                curveTo(18.52f, 2f, 22f, 5.48f, 22f, 9.75f)
                curveTo(22f, 10.16f, 21.66f, 10.5f, 21.25f, 10.5f)
                close()
            }
        }.build()

        return _RotateLeft1!!
    }

@Suppress("ObjectPropertyName")
private var _RotateLeft1: ImageVector? = null
