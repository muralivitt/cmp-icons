package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.CloudConnection: ImageVector
    get() {
        if (_CloudConnection != null) {
            return _CloudConnection!!
        }
        _CloudConnection = ImageVector.Builder(
            name = "CloudConnection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(19.201f, 14.781f)
                curveTo(18.341f, 15.571f, 17.201f, 16.011f, 16.031f, 16.001f)
                horizontalLineTo(6.371f)
                curveTo(2.301f, 15.711f, 2.291f, 9.801f, 6.371f, 9.511f)
                horizontalLineTo(6.411f)
                curveTo(3.621f, 1.751f, 15.411f, -1.339f, 16.761f, 6.801f)
                curveTo(20.531f, 7.281f, 22.061f, 12.291f, 19.201f, 14.781f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18.75f, 21f)
                curveTo(18.75f, 21.41f, 18.41f, 21.75f, 18f, 21.75f)
                horizontalLineTo(14f)
                curveTo(13.95f, 21.75f, 13.91f, 21.75f, 13.86f, 21.73f)
                curveTo(13.57f, 22.47f, 12.84f, 23f, 12f, 23f)
                curveTo(11.16f, 23f, 10.43f, 22.47f, 10.14f, 21.73f)
                curveTo(10.09f, 21.75f, 10.05f, 21.75f, 10f, 21.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 21.75f, 5.25f, 21.41f, 5.25f, 21f)
                curveTo(5.25f, 20.59f, 5.59f, 20.25f, 6f, 20.25f)
                horizontalLineTo(10f)
                curveTo(10.05f, 20.25f, 10.09f, 20.25f, 10.14f, 20.27f)
                curveTo(10.34f, 19.75f, 10.75f, 19.34f, 11.27f, 19.14f)
                curveTo(11.25f, 19.09f, 11.25f, 19.05f, 11.25f, 19f)
                verticalLineTo(16f)
                horizontalLineTo(12.75f)
                verticalLineTo(19f)
                curveTo(12.75f, 19.05f, 12.75f, 19.09f, 12.73f, 19.14f)
                curveTo(13.25f, 19.34f, 13.66f, 19.75f, 13.86f, 20.27f)
                curveTo(13.91f, 20.25f, 13.95f, 20.25f, 14f, 20.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 20.25f, 18.75f, 20.59f, 18.75f, 21f)
                close()
            }
        }.build()

        return _CloudConnection!!
    }

@Suppress("ObjectPropertyName")
private var _CloudConnection: ImageVector? = null
