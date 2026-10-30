package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Settings: ImageVector
    get() {
        if (_Settings != null) {
            return _Settings!!
        }
        _Settings = ImageVector.Builder(
            name = "Settings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 16.5f)
                curveTo(14.485f, 16.5f, 16.5f, 14.485f, 16.5f, 12f)
                curveTo(16.5f, 9.515f, 14.485f, 7.5f, 12f, 7.5f)
                curveTo(9.515f, 7.5f, 7.5f, 9.515f, 7.5f, 12f)
                curveTo(7.5f, 14.485f, 9.515f, 16.5f, 12f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(10f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 11.25f, 10.75f, 11.59f, 10.75f, 12f)
                curveTo(10.75f, 12.41f, 10.41f, 12.75f, 10f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(22f, 12.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 12.75f, 13.25f, 12.41f, 13.25f, 12f)
                curveTo(13.25f, 11.59f, 13.59f, 11.25f, 14f, 11.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22f, 12.75f)
                close()
            }
        }.build()

        return _Settings!!
    }

@Suppress("ObjectPropertyName")
private var _Settings: ImageVector? = null
