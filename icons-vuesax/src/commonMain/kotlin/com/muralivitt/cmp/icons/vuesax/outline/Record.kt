package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Record: ImageVector
    get() {
        if (_Record != null) {
            return _Record!!
        }
        _Record = ImageVector.Builder(
            name = "Record",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 21.75f)
                curveTo(6.62f, 21.75f, 2.25f, 17.38f, 2.25f, 12f)
                curveTo(2.25f, 6.62f, 6.62f, 2.25f, 12f, 2.25f)
                curveTo(17.38f, 2.25f, 21.75f, 6.62f, 21.75f, 12f)
                curveTo(21.75f, 17.38f, 17.38f, 21.75f, 12f, 21.75f)
                close()
                moveTo(12f, 3.75f)
                curveTo(7.45f, 3.75f, 3.75f, 7.45f, 3.75f, 12f)
                curveTo(3.75f, 16.55f, 7.45f, 20.25f, 12f, 20.25f)
                curveTo(16.55f, 20.25f, 20.25f, 16.55f, 20.25f, 12f)
                curveTo(20.25f, 7.45f, 16.55f, 3.75f, 12f, 3.75f)
                close()
            }
        }.build()

        return _Record!!
    }

@Suppress("ObjectPropertyName")
private var _Record: ImageVector? = null
