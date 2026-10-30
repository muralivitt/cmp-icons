package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.BatteryEmpty: ImageVector
    get() {
        if (_BatteryEmpty != null) {
            return _BatteryEmpty!!
        }
        _BatteryEmpty = ImageVector.Builder(
            name = "BatteryEmpty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(13f, 19.75f)
                horizontalLineTo(7f)
                curveTo(2.59f, 19.75f, 1.25f, 18.41f, 1.25f, 14f)
                verticalLineTo(10f)
                curveTo(1.25f, 5.59f, 2.59f, 4.25f, 7f, 4.25f)
                horizontalLineTo(13f)
                curveTo(17.41f, 4.25f, 18.75f, 5.59f, 18.75f, 10f)
                verticalLineTo(14f)
                curveTo(18.75f, 18.41f, 17.41f, 19.75f, 13f, 19.75f)
                close()
                moveTo(7f, 5.75f)
                curveTo(3.42f, 5.75f, 2.75f, 6.43f, 2.75f, 10f)
                verticalLineTo(14f)
                curveTo(2.75f, 17.57f, 3.42f, 18.25f, 7f, 18.25f)
                horizontalLineTo(13f)
                curveTo(16.58f, 18.25f, 17.25f, 17.57f, 17.25f, 14f)
                verticalLineTo(10f)
                curveTo(17.25f, 6.43f, 16.58f, 5.75f, 13f, 5.75f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.5f, 15.25f)
                curveTo(20.09f, 15.25f, 19.75f, 14.91f, 19.75f, 14.5f)
                curveTo(19.75f, 14.09f, 20.09f, 13.75f, 20.5f, 13.75f)
                curveTo(21.09f, 13.75f, 21.22f, 13.66f, 21.23f, 13.66f)
                curveTo(21.25f, 13.6f, 21.25f, 13.25f, 21.25f, 13f)
                verticalLineTo(11f)
                curveTo(21.25f, 10.75f, 21.25f, 10.41f, 21.21f, 10.32f)
                curveTo(21.22f, 10.33f, 21.05f, 10.25f, 20.5f, 10.25f)
                curveTo(20.09f, 10.25f, 19.75f, 9.91f, 19.75f, 9.5f)
                curveTo(19.75f, 9.09f, 20.09f, 8.75f, 20.5f, 8.75f)
                curveTo(22.58f, 8.75f, 22.75f, 9.77f, 22.75f, 11f)
                verticalLineTo(13f)
                curveTo(22.75f, 14.23f, 22.58f, 15.25f, 20.5f, 15.25f)
                close()
            }
        }.build()

        return _BatteryEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryEmpty: ImageVector? = null
