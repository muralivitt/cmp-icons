package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Tag: ImageVector
    get() {
        if (_Tag != null) {
            return _Tag!!
        }
        _Tag = ImageVector.Builder(
            name = "Tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(19.83f, 8.7f)
                lineTo(15.3f, 4.17f)
                curveTo(14.351f, 3.22f, 13.04f, 2.71f, 11.7f, 2.78f)
                lineTo(6.7f, 3.02f)
                curveTo(4.7f, 3.11f, 3.11f, 4.7f, 3.01f, 6.69f)
                lineTo(2.77f, 11.69f)
                curveTo(2.71f, 13.03f, 3.21f, 14.34f, 4.16f, 15.29f)
                lineTo(8.69f, 19.82f)
                curveTo(10.55f, 21.68f, 13.571f, 21.68f, 15.441f, 19.82f)
                lineTo(19.83f, 15.43f)
                curveTo(21.701f, 13.58f, 21.701f, 10.56f, 19.83f, 8.7f)
                close()
                moveTo(9.5f, 12.38f)
                curveTo(7.91f, 12.38f, 6.62f, 11.09f, 6.62f, 9.5f)
                curveTo(6.62f, 7.91f, 7.91f, 6.62f, 9.5f, 6.62f)
                curveTo(11.09f, 6.62f, 12.38f, 7.91f, 12.38f, 9.5f)
                curveTo(12.38f, 11.09f, 11.09f, 12.38f, 9.5f, 12.38f)
                close()
            }
        }.build()

        return _Tag!!
    }

@Suppress("ObjectPropertyName")
private var _Tag: ImageVector? = null
