package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Speaker: ImageVector
    get() {
        if (_Speaker != null) {
            return _Speaker!!
        }
        _Speaker = ImageVector.Builder(
            name = "Speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(5.58f, 22.75f, 4.25f, 21.42f, 4.25f, 18f)
                verticalLineTo(6f)
                curveTo(4.25f, 2.58f, 5.58f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(18.42f, 1.25f, 19.75f, 2.58f, 19.75f, 6f)
                verticalLineTo(18f)
                curveTo(19.75f, 21.42f, 18.42f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(6.42f, 2.75f, 5.75f, 3.42f, 5.75f, 6f)
                verticalLineTo(18f)
                curveTo(5.75f, 20.58f, 6.42f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(17.58f, 21.25f, 18.25f, 20.58f, 18.25f, 18f)
                verticalLineTo(6f)
                curveTo(18.25f, 3.42f, 17.58f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 18.75f)
                curveTo(9.93f, 18.75f, 8.25f, 17.07f, 8.25f, 15f)
                curveTo(8.25f, 12.93f, 9.93f, 11.25f, 12f, 11.25f)
                curveTo(14.07f, 11.25f, 15.75f, 12.93f, 15.75f, 15f)
                curveTo(15.75f, 17.07f, 14.07f, 18.75f, 12f, 18.75f)
                close()
                moveTo(12f, 12.75f)
                curveTo(10.76f, 12.75f, 9.75f, 13.76f, 9.75f, 15f)
                curveTo(9.75f, 16.24f, 10.76f, 17.25f, 12f, 17.25f)
                curveTo(13.24f, 17.25f, 14.25f, 16.24f, 14.25f, 15f)
                curveTo(14.25f, 13.76f, 13.24f, 12.75f, 12f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 9.75f)
                curveTo(10.76f, 9.75f, 9.75f, 8.74f, 9.75f, 7.5f)
                curveTo(9.75f, 6.26f, 10.76f, 5.25f, 12f, 5.25f)
                curveTo(13.24f, 5.25f, 14.25f, 6.26f, 14.25f, 7.5f)
                curveTo(14.25f, 8.74f, 13.24f, 9.75f, 12f, 9.75f)
                close()
                moveTo(12f, 6.75f)
                curveTo(11.59f, 6.75f, 11.25f, 7.09f, 11.25f, 7.5f)
                curveTo(11.25f, 7.91f, 11.59f, 8.25f, 12f, 8.25f)
                curveTo(12.41f, 8.25f, 12.75f, 7.91f, 12.75f, 7.5f)
                curveTo(12.75f, 7.09f, 12.41f, 6.75f, 12f, 6.75f)
                close()
            }
        }.build()

        return _Speaker!!
    }

@Suppress("ObjectPropertyName")
private var _Speaker: ImageVector? = null
