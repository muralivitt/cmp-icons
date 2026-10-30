package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.PlayCircle: ImageVector
    get() {
        if (_PlayCircle != null) {
            return _PlayCircle!!
        }
        _PlayCircle = ImageVector.Builder(
            name = "PlayCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(11.969f, 2f)
                curveTo(6.449f, 2f, 1.969f, 6.48f, 1.969f, 12f)
                curveTo(1.969f, 17.52f, 6.449f, 22f, 11.969f, 22f)
                curveTo(17.489f, 22f, 21.969f, 17.52f, 21.969f, 12f)
                curveTo(21.969f, 6.48f, 17.499f, 2f, 11.969f, 2f)
                close()
                moveTo(14.969f, 14.23f)
                lineTo(12.069f, 15.9f)
                curveTo(11.709f, 16.11f, 11.309f, 16.21f, 10.919f, 16.21f)
                curveTo(10.519f, 16.21f, 10.129f, 16.11f, 9.769f, 15.9f)
                curveTo(9.049f, 15.48f, 8.619f, 14.74f, 8.619f, 13.9f)
                verticalLineTo(10.55f)
                curveTo(8.619f, 9.72f, 9.049f, 8.97f, 9.769f, 8.55f)
                curveTo(10.489f, 8.13f, 11.349f, 8.13f, 12.079f, 8.55f)
                lineTo(14.979f, 10.22f)
                curveTo(15.699f, 10.64f, 16.129f, 11.38f, 16.129f, 12.22f)
                curveTo(16.129f, 13.06f, 15.699f, 13.81f, 14.969f, 14.23f)
                close()
            }
        }.build()

        return _PlayCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PlayCircle: ImageVector? = null
