package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.More: ImageVector
    get() {
        if (_More != null) {
            return _More!!
        }
        _More = ImageVector.Builder(
            name = "More",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(5f, 10f)
                curveTo(3.9f, 10f, 3f, 10.9f, 3f, 12f)
                curveTo(3f, 13.1f, 3.9f, 14f, 5f, 14f)
                curveTo(6.1f, 14f, 7f, 13.1f, 7f, 12f)
                curveTo(7f, 10.9f, 6.1f, 10f, 5f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(19f, 10f)
                curveTo(17.9f, 10f, 17f, 10.9f, 17f, 12f)
                curveTo(17f, 13.1f, 17.9f, 14f, 19f, 14f)
                curveTo(20.1f, 14f, 21f, 13.1f, 21f, 12f)
                curveTo(21f, 10.9f, 20.1f, 10f, 19f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(12f, 10f)
                curveTo(10.9f, 10f, 10f, 10.9f, 10f, 12f)
                curveTo(10f, 13.1f, 10.9f, 14f, 12f, 14f)
                curveTo(13.1f, 14f, 14f, 13.1f, 14f, 12f)
                curveTo(14f, 10.9f, 13.1f, 10f, 12f, 10f)
                close()
            }
        }.build()

        return _More!!
    }

@Suppress("ObjectPropertyName")
private var _More: ImageVector? = null
