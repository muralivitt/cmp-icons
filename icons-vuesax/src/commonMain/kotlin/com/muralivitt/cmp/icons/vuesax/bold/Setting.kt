package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Setting: ImageVector
    get() {
        if (_Setting != null) {
            return _Setting!!
        }
        _Setting = ImageVector.Builder(
            name = "Setting",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18.94f, 5.421f)
                lineTo(13.77f, 2.431f)
                curveTo(12.78f, 1.861f, 11.23f, 1.861f, 10.24f, 2.431f)
                lineTo(5.02f, 5.441f)
                curveTo(2.95f, 6.841f, 2.83f, 7.051f, 2.83f, 9.281f)
                verticalLineTo(14.711f)
                curveTo(2.83f, 16.941f, 2.95f, 17.161f, 5.06f, 18.581f)
                lineTo(10.23f, 21.571f)
                curveTo(10.73f, 21.861f, 11.37f, 22.001f, 12f, 22.001f)
                curveTo(12.63f, 22.001f, 13.27f, 21.861f, 13.76f, 21.571f)
                lineTo(18.98f, 18.561f)
                curveTo(21.05f, 17.161f, 21.17f, 16.951f, 21.17f, 14.721f)
                verticalLineTo(9.281f)
                curveTo(21.17f, 7.051f, 21.05f, 6.841f, 18.94f, 5.421f)
                close()
                moveTo(12f, 15.251f)
                curveTo(10.21f, 15.251f, 8.75f, 13.791f, 8.75f, 12.001f)
                curveTo(8.75f, 10.211f, 10.21f, 8.751f, 12f, 8.751f)
                curveTo(13.79f, 8.751f, 15.25f, 10.211f, 15.25f, 12.001f)
                curveTo(15.25f, 13.791f, 13.79f, 15.251f, 12f, 15.251f)
                close()
            }
        }.build()

        return _Setting!!
    }

@Suppress("ObjectPropertyName")
private var _Setting: ImageVector? = null
