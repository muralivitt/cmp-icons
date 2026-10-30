package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.ArrowRight3: ImageVector
    get() {
        if (_ArrowRight3 != null) {
            return _ArrowRight3!!
        }
        _ArrowRight3 = ImageVector.Builder(
            name = "ArrowRight3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(8.91f, 20.67f)
                curveTo(8.72f, 20.67f, 8.53f, 20.6f, 8.38f, 20.45f)
                curveTo(8.09f, 20.16f, 8.09f, 19.68f, 8.38f, 19.39f)
                lineTo(14.9f, 12.87f)
                curveTo(15.38f, 12.39f, 15.38f, 11.61f, 14.9f, 11.13f)
                lineTo(8.38f, 4.61f)
                curveTo(8.09f, 4.32f, 8.09f, 3.84f, 8.38f, 3.55f)
                curveTo(8.67f, 3.26f, 9.15f, 3.26f, 9.44f, 3.55f)
                lineTo(15.96f, 10.07f)
                curveTo(16.47f, 10.58f, 16.76f, 11.27f, 16.76f, 12f)
                curveTo(16.76f, 12.73f, 16.48f, 13.42f, 15.96f, 13.93f)
                lineTo(9.44f, 20.45f)
                curveTo(9.29f, 20.59f, 9.1f, 20.67f, 8.91f, 20.67f)
                close()
            }
        }.build()

        return _ArrowRight3!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight3: ImageVector? = null
