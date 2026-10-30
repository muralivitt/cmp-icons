package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Menu: ImageVector
    get() {
        if (_Menu != null) {
            return _Menu!!
        }
        _Menu = ImageVector.Builder(
            name = "Menu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17.54f, 8.811f)
                curveTo(19.175f, 8.811f, 20.5f, 7.485f, 20.5f, 5.851f)
                curveTo(20.5f, 4.216f, 19.175f, 2.891f, 17.54f, 2.891f)
                curveTo(15.905f, 2.891f, 14.58f, 4.216f, 14.58f, 5.851f)
                curveTo(14.58f, 7.485f, 15.905f, 8.811f, 17.54f, 8.811f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(6.46f, 8.811f)
                curveTo(8.095f, 8.811f, 9.42f, 7.485f, 9.42f, 5.851f)
                curveTo(9.42f, 4.216f, 8.095f, 2.891f, 6.46f, 2.891f)
                curveTo(4.825f, 2.891f, 3.5f, 4.216f, 3.5f, 5.851f)
                curveTo(3.5f, 7.485f, 4.825f, 8.811f, 6.46f, 8.811f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17.54f, 21.111f)
                curveTo(19.175f, 21.111f, 20.5f, 19.786f, 20.5f, 18.151f)
                curveTo(20.5f, 16.517f, 19.175f, 15.191f, 17.54f, 15.191f)
                curveTo(15.905f, 15.191f, 14.58f, 16.517f, 14.58f, 18.151f)
                curveTo(14.58f, 19.786f, 15.905f, 21.111f, 17.54f, 21.111f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(6.46f, 21.111f)
                curveTo(8.095f, 21.111f, 9.42f, 19.786f, 9.42f, 18.151f)
                curveTo(9.42f, 16.517f, 8.095f, 15.191f, 6.46f, 15.191f)
                curveTo(4.825f, 15.191f, 3.5f, 16.517f, 3.5f, 18.151f)
                curveTo(3.5f, 19.786f, 4.825f, 21.111f, 6.46f, 21.111f)
                close()
            }
        }.build()

        return _Menu!!
    }

@Suppress("ObjectPropertyName")
private var _Menu: ImageVector? = null
