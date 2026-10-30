package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Notification1: ImageVector
    get() {
        if (_Notification1 != null) {
            return _Notification1!!
        }
        _Notification1 = ImageVector.Builder(
            name = "Notification1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(19f, 8.75f)
                curveTo(16.93f, 8.75f, 15.25f, 7.07f, 15.25f, 5f)
                curveTo(15.25f, 2.93f, 16.93f, 1.25f, 19f, 1.25f)
                curveTo(21.07f, 1.25f, 22.75f, 2.93f, 22.75f, 5f)
                curveTo(22.75f, 7.07f, 21.07f, 8.75f, 19f, 8.75f)
                close()
                moveTo(19f, 2.75f)
                curveTo(17.76f, 2.75f, 16.75f, 3.76f, 16.75f, 5f)
                curveTo(16.75f, 6.24f, 17.76f, 7.25f, 19f, 7.25f)
                curveTo(20.24f, 7.25f, 21.25f, 6.24f, 21.25f, 5f)
                curveTo(21.25f, 3.76f, 20.24f, 2.75f, 19f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 1.25f, 14.75f, 1.59f, 14.75f, 2f)
                curveTo(14.75f, 2.41f, 14.41f, 2.75f, 14f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(10f)
                curveTo(21.25f, 9.59f, 21.59f, 9.25f, 22f, 9.25f)
                curveTo(22.41f, 9.25f, 22.75f, 9.59f, 22.75f, 10f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
        }.build()

        return _Notification1!!
    }

@Suppress("ObjectPropertyName")
private var _Notification1: ImageVector? = null
