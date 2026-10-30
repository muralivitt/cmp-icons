package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Gps: ImageVector
    get() {
        if (_Gps != null) {
            return _Gps!!
        }
        _Gps = ImageVector.Builder(
            name = "Gps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 11.25f)
                horizontalLineTo(19.96f)
                curveTo(19.6f, 7.44f, 16.56f, 4.39f, 12.75f, 4.04f)
                verticalLineTo(2f)
                curveTo(12.75f, 1.59f, 12.41f, 1.25f, 12f, 1.25f)
                curveTo(11.59f, 1.25f, 11.25f, 1.59f, 11.25f, 2f)
                verticalLineTo(4.04f)
                curveTo(7.44f, 4.4f, 4.39f, 7.44f, 4.04f, 11.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 11.25f, 1.25f, 11.59f, 1.25f, 12f)
                curveTo(1.25f, 12.41f, 1.59f, 12.75f, 2f, 12.75f)
                horizontalLineTo(4.04f)
                curveTo(4.4f, 16.56f, 7.44f, 19.61f, 11.25f, 19.96f)
                verticalLineTo(22f)
                curveTo(11.25f, 22.41f, 11.59f, 22.75f, 12f, 22.75f)
                curveTo(12.41f, 22.75f, 12.75f, 22.41f, 12.75f, 22f)
                verticalLineTo(19.96f)
                curveTo(16.56f, 19.6f, 19.61f, 16.56f, 19.96f, 12.75f)
                horizontalLineTo(22f)
                curveTo(22.41f, 12.75f, 22.75f, 12.41f, 22.75f, 12f)
                curveTo(22.75f, 11.59f, 22.41f, 11.25f, 22f, 11.25f)
                close()
                moveTo(12f, 15.12f)
                curveTo(10.28f, 15.12f, 8.88f, 13.72f, 8.88f, 12f)
                curveTo(8.88f, 10.28f, 10.28f, 8.88f, 12f, 8.88f)
                curveTo(13.72f, 8.88f, 15.12f, 10.28f, 15.12f, 12f)
                curveTo(15.12f, 13.72f, 13.72f, 15.12f, 12f, 15.12f)
                close()
            }
        }.build()

        return _Gps!!
    }

@Suppress("ObjectPropertyName")
private var _Gps: ImageVector? = null
