package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.DirectDown: ImageVector
    get() {
        if (_DirectDown != null) {
            return _DirectDown!!
        }
        _DirectDown = ImageVector.Builder(
            name = "DirectDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17.019f, 2.718f)
                lineTo(13.539f, 4.458f)
                curveTo(12.569f, 4.938f, 11.439f, 4.938f, 10.469f, 4.458f)
                lineTo(6.979f, 2.708f)
                curveTo(3.999f, 1.218f, 0.849f, 4.438f, 2.409f, 7.388f)
                lineTo(3.229f, 8.928f)
                curveTo(3.339f, 9.138f, 3.519f, 9.308f, 3.739f, 9.408f)
                lineTo(16.389f, 15.098f)
                curveTo(16.909f, 15.328f, 17.519f, 15.118f, 17.779f, 14.618f)
                lineTo(21.589f, 7.378f)
                curveTo(23.139f, 4.438f, 19.999f, 1.218f, 17.019f, 2.718f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.6f, 16.309f)
                lineTo(7.32f, 12.579f)
                curveTo(6.39f, 12.159f, 5.45f, 13.159f, 5.93f, 14.059f)
                lineTo(8.97f, 19.829f)
                curveTo(10.26f, 22.279f, 13.76f, 22.279f, 15.05f, 19.829f)
                lineTo(16.12f, 17.789f)
                curveTo(16.4f, 17.239f, 16.16f, 16.569f, 15.6f, 16.309f)
                close()
            }
        }.build()

        return _DirectDown!!
    }

@Suppress("ObjectPropertyName")
private var _DirectDown: ImageVector? = null
