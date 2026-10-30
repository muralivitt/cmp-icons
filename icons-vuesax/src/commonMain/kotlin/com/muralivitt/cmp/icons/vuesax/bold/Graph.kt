package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Graph: ImageVector
    get() {
        if (_Graph != null) {
            return _Graph!!
        }
        _Graph = ImageVector.Builder(
            name = "Graph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.67f, 6.949f)
                curveTo(21.03f, 4.779f, 19.22f, 2.969f, 17.05f, 2.329f)
                curveTo(15.4f, 1.849f, 14.26f, 1.889f, 13.47f, 2.479f)
                curveTo(12.52f, 3.189f, 12.41f, 4.469f, 12.41f, 5.379f)
                verticalLineTo(7.869f)
                curveTo(12.41f, 10.329f, 13.53f, 11.579f, 15.73f, 11.579f)
                horizontalLineTo(18.6f)
                curveTo(19.5f, 11.579f, 20.79f, 11.469f, 21.5f, 10.519f)
                curveTo(22.11f, 9.739f, 22.16f, 8.599f, 21.67f, 6.949f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18.909f, 13.361f)
                curveTo(18.649f, 13.061f, 18.269f, 12.891f, 17.879f, 12.891f)
                horizontalLineTo(14.299f)
                curveTo(12.539f, 12.891f, 11.109f, 11.461f, 11.109f, 9.701f)
                verticalLineTo(6.121f)
                curveTo(11.109f, 5.731f, 10.939f, 5.351f, 10.639f, 5.091f)
                curveTo(10.349f, 4.831f, 9.949f, 4.711f, 9.569f, 4.761f)
                curveTo(7.219f, 5.061f, 5.059f, 6.351f, 3.649f, 8.291f)
                curveTo(2.229f, 10.241f, 1.709f, 12.621f, 2.159f, 15.001f)
                curveTo(2.809f, 18.441f, 5.559f, 21.191f, 9.009f, 21.841f)
                curveTo(9.559f, 21.951f, 10.109f, 22.001f, 10.659f, 22.001f)
                curveTo(12.469f, 22.001f, 14.219f, 21.441f, 15.709f, 20.351f)
                curveTo(17.649f, 18.941f, 18.939f, 16.781f, 19.239f, 14.431f)
                curveTo(19.289f, 14.041f, 19.169f, 13.651f, 18.909f, 13.361f)
                close()
            }
        }.build()

        return _Graph!!
    }

@Suppress("ObjectPropertyName")
private var _Graph: ImageVector? = null
