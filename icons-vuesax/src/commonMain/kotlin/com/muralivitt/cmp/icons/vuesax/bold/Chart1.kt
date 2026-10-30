package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Chart1: ImageVector
    get() {
        if (_Chart1 != null) {
            return _Chart1!!
        }
        _Chart1 = ImageVector.Builder(
            name = "Chart1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21f, 22.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 22.75f, 2.25f, 22.41f, 2.25f, 22f)
                curveTo(2.25f, 21.59f, 2.59f, 21.25f, 3f, 21.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 21.25f, 21.75f, 21.59f, 21.75f, 22f)
                curveTo(21.75f, 22.41f, 21.41f, 22.75f, 21f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(5.6f, 8.379f)
                horizontalLineTo(4f)
                curveTo(3.45f, 8.379f, 3f, 8.829f, 3f, 9.379f)
                verticalLineTo(17.999f)
                curveTo(3f, 18.549f, 3.45f, 18.999f, 4f, 18.999f)
                horizontalLineTo(5.6f)
                curveTo(6.15f, 18.999f, 6.6f, 18.549f, 6.6f, 17.999f)
                verticalLineTo(9.379f)
                curveTo(6.6f, 8.819f, 6.15f, 8.379f, 5.6f, 8.379f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12.799f, 5.191f)
                horizontalLineTo(11.199f)
                curveTo(10.649f, 5.191f, 10.199f, 5.641f, 10.199f, 6.191f)
                verticalLineTo(18.001f)
                curveTo(10.199f, 18.551f, 10.649f, 19.001f, 11.199f, 19.001f)
                horizontalLineTo(12.799f)
                curveTo(13.349f, 19.001f, 13.799f, 18.551f, 13.799f, 18.001f)
                verticalLineTo(6.191f)
                curveTo(13.799f, 5.641f, 13.349f, 5.191f, 12.799f, 5.191f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20f, 2f)
                horizontalLineTo(18.4f)
                curveTo(17.85f, 2f, 17.4f, 2.45f, 17.4f, 3f)
                verticalLineTo(18f)
                curveTo(17.4f, 18.55f, 17.85f, 19f, 18.4f, 19f)
                horizontalLineTo(20f)
                curveTo(20.55f, 19f, 21f, 18.55f, 21f, 18f)
                verticalLineTo(3f)
                curveTo(21f, 2.45f, 20.55f, 2f, 20f, 2f)
                close()
            }
        }.build()

        return _Chart1!!
    }

@Suppress("ObjectPropertyName")
private var _Chart1: ImageVector? = null
