package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.Bubble: ImageVector
    get() {
        if (_Bubble != null) {
            return _Bubble!!
        }
        _Bubble = ImageVector.Builder(
            name = "Bubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(15.591f, 12.26f)
                curveTo(18.424f, 12.26f, 20.721f, 9.963f, 20.721f, 7.13f)
                curveTo(20.721f, 4.297f, 18.424f, 2f, 15.591f, 2f)
                curveTo(12.758f, 2f, 10.461f, 4.297f, 10.461f, 7.13f)
                curveTo(10.461f, 9.963f, 12.758f, 12.26f, 15.591f, 12.26f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(6.359f, 19.44f)
                curveTo(8.06f, 19.44f, 9.439f, 18.061f, 9.439f, 16.36f)
                curveTo(9.439f, 14.659f, 8.06f, 13.28f, 6.359f, 13.28f)
                curveTo(4.658f, 13.28f, 3.279f, 14.659f, 3.279f, 16.36f)
                curveTo(3.279f, 18.061f, 4.658f, 19.44f, 6.359f, 19.44f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(16.621f, 22f)
                curveTo(18.034f, 22f, 19.181f, 20.854f, 19.181f, 19.44f)
                curveTo(19.181f, 18.026f, 18.034f, 16.88f, 16.621f, 16.88f)
                curveTo(15.207f, 16.88f, 14.061f, 18.026f, 14.061f, 19.44f)
                curveTo(14.061f, 20.854f, 15.207f, 22f, 16.621f, 22f)
                close()
            }
        }.build()

        return _Bubble!!
    }

@Suppress("ObjectPropertyName")
private var _Bubble: ImageVector? = null
