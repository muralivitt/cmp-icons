package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.MoreCircle: ImageVector
    get() {
        if (_MoreCircle != null) {
            return _MoreCircle!!
        }
        _MoreCircle = ImageVector.Builder(
            name = "MoreCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                curveTo(2f, 17.51f, 6.49f, 22f, 12f, 22f)
                curveTo(17.51f, 22f, 22f, 17.51f, 22f, 12f)
                curveTo(22f, 6.49f, 17.51f, 2f, 12f, 2f)
                close()
                moveTo(8f, 13f)
                curveTo(7.44f, 13f, 7f, 12.55f, 7f, 12f)
                curveTo(7f, 11.45f, 7.45f, 11f, 8f, 11f)
                curveTo(8.55f, 11f, 9f, 11.45f, 9f, 12f)
                curveTo(9f, 12.55f, 8.56f, 13f, 8f, 13f)
                close()
                moveTo(12f, 13f)
                curveTo(11.44f, 13f, 11f, 12.55f, 11f, 12f)
                curveTo(11f, 11.45f, 11.45f, 11f, 12f, 11f)
                curveTo(12.55f, 11f, 13f, 11.45f, 13f, 12f)
                curveTo(13f, 12.55f, 12.56f, 13f, 12f, 13f)
                close()
                moveTo(16f, 13f)
                curveTo(15.44f, 13f, 15f, 12.55f, 15f, 12f)
                curveTo(15f, 11.45f, 15.45f, 11f, 16f, 11f)
                curveTo(16.55f, 11f, 17f, 11.45f, 17f, 12f)
                curveTo(17f, 12.55f, 16.56f, 13f, 16f, 13f)
                close()
            }
        }.build()

        return _MoreCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MoreCircle: ImageVector? = null
