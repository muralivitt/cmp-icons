package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Record: ImageVector
    get() {
        if (_Record != null) {
            return _Record!!
        }
        _Record = ImageVector.Builder(
            name = "Record",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(19.63f, 7.238f)
                curveTo(19.93f, 7.708f, 19.77f, 8.338f, 19.29f, 8.628f)
                lineTo(18.7f, 8.978f)
                lineTo(5.59f, 16.838f)
                curveTo(5.11f, 17.128f, 4.48f, 16.968f, 4.2f, 16.478f)
                curveTo(3.2f, 14.738f, 2.75f, 12.618f, 3.14f, 10.398f)
                curveTo(3.8f, 6.628f, 6.9f, 3.628f, 10.69f, 3.088f)
                curveTo(14.44f, 2.558f, 17.83f, 4.358f, 19.63f, 7.238f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.889f, 13.431f)
                curveTo(20.209f, 17.681f, 16.449f, 20.931f, 12.139f, 21.001f)
                curveTo(10.239f, 21.031f, 8.479f, 20.481f, 7.019f, 19.491f)
                curveTo(6.399f, 19.081f, 6.419f, 18.161f, 7.059f, 17.781f)
                lineTo(19.469f, 10.491f)
                curveTo(20.119f, 10.111f, 20.919f, 10.551f, 20.979f, 11.301f)
                curveTo(21.029f, 12.001f, 20.999f, 12.711f, 20.889f, 13.431f)
                close()
            }
        }.build()

        return _Record!!
    }

@Suppress("ObjectPropertyName")
private var _Record: ImageVector? = null
