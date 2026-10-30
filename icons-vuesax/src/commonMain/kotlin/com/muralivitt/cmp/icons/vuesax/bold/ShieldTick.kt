package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ShieldTick: ImageVector
    get() {
        if (_ShieldTick != null) {
            return _ShieldTick!!
        }
        _ShieldTick = ImageVector.Builder(
            name = "ShieldTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18.541f, 4.12f)
                lineTo(13.041f, 2.06f)
                curveTo(12.471f, 1.85f, 11.541f, 1.85f, 10.971f, 2.06f)
                lineTo(5.471f, 4.12f)
                curveTo(4.411f, 4.52f, 3.551f, 5.76f, 3.551f, 6.89f)
                verticalLineTo(14.99f)
                curveTo(3.551f, 15.8f, 4.081f, 16.87f, 4.731f, 17.35f)
                lineTo(10.231f, 21.46f)
                curveTo(11.201f, 22.19f, 12.791f, 22.19f, 13.761f, 21.46f)
                lineTo(19.261f, 17.35f)
                curveTo(19.911f, 16.86f, 20.441f, 15.8f, 20.441f, 14.99f)
                verticalLineTo(6.89f)
                curveTo(20.451f, 5.76f, 19.591f, 4.52f, 18.541f, 4.12f)
                close()
                moveTo(15.481f, 9.72f)
                lineTo(11.181f, 14.02f)
                curveTo(11.031f, 14.17f, 10.841f, 14.24f, 10.651f, 14.24f)
                curveTo(10.461f, 14.24f, 10.271f, 14.17f, 10.121f, 14.02f)
                lineTo(8.521f, 12.4f)
                curveTo(8.231f, 12.11f, 8.231f, 11.63f, 8.521f, 11.34f)
                curveTo(8.811f, 11.05f, 9.291f, 11.05f, 9.581f, 11.34f)
                lineTo(10.661f, 12.42f)
                lineTo(14.431f, 8.65f)
                curveTo(14.721f, 8.36f, 15.201f, 8.36f, 15.491f, 8.65f)
                curveTo(15.781f, 8.94f, 15.781f, 9.43f, 15.481f, 9.72f)
                close()
            }
        }.build()

        return _ShieldTick!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldTick: ImageVector? = null
