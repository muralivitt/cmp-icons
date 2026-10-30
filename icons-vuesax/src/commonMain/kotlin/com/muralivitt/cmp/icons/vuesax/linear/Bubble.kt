package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Bubble: ImageVector
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
                moveTo(15.59f, 12.26f)
                curveTo(18.423f, 12.26f, 20.72f, 9.963f, 20.72f, 7.13f)
                curveTo(20.72f, 4.297f, 18.423f, 2f, 15.59f, 2f)
                curveTo(12.757f, 2f, 10.46f, 4.297f, 10.46f, 7.13f)
                curveTo(10.46f, 9.963f, 12.757f, 12.26f, 15.59f, 12.26f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(6.36f, 19.44f)
                curveTo(8.061f, 19.44f, 9.44f, 18.061f, 9.44f, 16.36f)
                curveTo(9.44f, 14.659f, 8.061f, 13.28f, 6.36f, 13.28f)
                curveTo(4.659f, 13.28f, 3.28f, 14.659f, 3.28f, 16.36f)
                curveTo(3.28f, 18.061f, 4.659f, 19.44f, 6.36f, 19.44f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(16.62f, 22f)
                curveTo(18.034f, 22f, 19.18f, 20.854f, 19.18f, 19.44f)
                curveTo(19.18f, 18.026f, 18.034f, 16.88f, 16.62f, 16.88f)
                curveTo(15.206f, 16.88f, 14.06f, 18.026f, 14.06f, 19.44f)
                curveTo(14.06f, 20.854f, 15.206f, 22f, 16.62f, 22f)
                close()
            }
        }.build()

        return _Bubble!!
    }

@Suppress("ObjectPropertyName")
private var _Bubble: ImageVector? = null
