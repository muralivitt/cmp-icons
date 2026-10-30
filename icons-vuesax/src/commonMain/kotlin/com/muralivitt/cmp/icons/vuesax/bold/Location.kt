package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Location: ImageVector
    get() {
        if (_Location != null) {
            return _Location!!
        }
        _Location = ImageVector.Builder(
            name = "Location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.621f, 8.45f)
                curveTo(19.571f, 3.83f, 15.541f, 1.75f, 12.001f, 1.75f)
                curveTo(12.001f, 1.75f, 12.001f, 1.75f, 11.991f, 1.75f)
                curveTo(8.461f, 1.75f, 4.421f, 3.82f, 3.371f, 8.44f)
                curveTo(2.201f, 13.6f, 5.361f, 17.97f, 8.221f, 20.72f)
                curveTo(9.281f, 21.74f, 10.641f, 22.25f, 12.001f, 22.25f)
                curveTo(13.361f, 22.25f, 14.721f, 21.74f, 15.771f, 20.72f)
                curveTo(18.631f, 17.97f, 21.791f, 13.61f, 20.621f, 8.45f)
                close()
                moveTo(12.001f, 13.46f)
                curveTo(10.261f, 13.46f, 8.851f, 12.05f, 8.851f, 10.31f)
                curveTo(8.851f, 8.57f, 10.261f, 7.16f, 12.001f, 7.16f)
                curveTo(13.741f, 7.16f, 15.151f, 8.57f, 15.151f, 10.31f)
                curveTo(15.151f, 12.05f, 13.741f, 13.46f, 12.001f, 13.46f)
                close()
            }
        }.build()

        return _Location!!
    }

@Suppress("ObjectPropertyName")
private var _Location: ImageVector? = null
