package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.RotateRight1: ImageVector
    get() {
        if (_RotateRight1 != null) {
            return _RotateRight1!!
        }
        _RotateRight1 = ImageVector.Builder(
            name = "RotateRight1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.75f, 22f)
                horizontalLineTo(12.25f)
                curveTo(8.5f, 22f, 7f, 20.5f, 7f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(7f, 8.5f, 8.5f, 7f, 12.25f, 7f)
                horizontalLineTo(16.75f)
                curveTo(20.5f, 7f, 22f, 8.5f, 22f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(22f, 20.5f, 20.5f, 22f, 16.75f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(2.75f, 10.5f)
                curveTo(3.16f, 10.5f, 3.5f, 10.16f, 3.5f, 9.75f)
                curveTo(3.5f, 6.79f, 5.56f, 4.31f, 8.33f, 3.66f)
                lineTo(8.06f, 4.11f)
                curveTo(7.85f, 4.47f, 7.96f, 4.93f, 8.32f, 5.14f)
                curveTo(8.68f, 5.35f, 9.14f, 5.24f, 9.35f, 4.88f)
                lineTo(10.4f, 3.13f)
                curveTo(10.54f, 2.9f, 10.54f, 2.61f, 10.41f, 2.38f)
                curveTo(10.27f, 2.15f, 10.02f, 2f, 9.75f, 2f)
                curveTo(5.48f, 2f, 2f, 5.48f, 2f, 9.75f)
                curveTo(2f, 10.16f, 2.34f, 10.5f, 2.75f, 10.5f)
                close()
            }
        }.build()

        return _RotateRight1!!
    }

@Suppress("ObjectPropertyName")
private var _RotateRight1: ImageVector? = null
