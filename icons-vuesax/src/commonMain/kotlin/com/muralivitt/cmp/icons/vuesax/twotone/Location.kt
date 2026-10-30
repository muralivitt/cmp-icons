package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.Location: ImageVector
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
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(12.001f, 13.43f)
                curveTo(13.724f, 13.43f, 15.121f, 12.033f, 15.121f, 10.31f)
                curveTo(15.121f, 8.587f, 13.724f, 7.19f, 12.001f, 7.19f)
                curveTo(10.278f, 7.19f, 8.881f, 8.587f, 8.881f, 10.31f)
                curveTo(8.881f, 12.033f, 10.278f, 13.43f, 12.001f, 13.43f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(3.62f, 8.49f)
                curveTo(5.59f, -0.17f, 18.42f, -0.16f, 20.38f, 8.5f)
                curveTo(21.53f, 13.58f, 18.37f, 17.88f, 15.6f, 20.54f)
                curveTo(13.59f, 22.48f, 10.41f, 22.48f, 8.39f, 20.54f)
                curveTo(5.63f, 17.88f, 2.47f, 13.57f, 3.62f, 8.49f)
                close()
            }
        }.build()

        return _Location!!
    }

@Suppress("ObjectPropertyName")
private var _Location: ImageVector? = null
