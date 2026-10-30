package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Chart: ImageVector
    get() {
        if (_Chart != null) {
            return _Chart!!
        }
        _Chart = ImageVector.Builder(
            name = "Chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(7f, 14.69f)
                curveTo(6.59f, 14.69f, 6.25f, 14.35f, 6.25f, 13.94f)
                verticalLineTo(10.73f)
                curveTo(6.25f, 10.32f, 6.59f, 9.98f, 7f, 9.98f)
                curveTo(7.41f, 9.98f, 7.75f, 10.32f, 7.75f, 10.73f)
                verticalLineTo(13.94f)
                curveTo(7.75f, 14.36f, 7.41f, 14.69f, 7f, 14.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 16.43f)
                curveTo(11.59f, 16.43f, 11.25f, 16.09f, 11.25f, 15.68f)
                verticalLineTo(9f)
                curveTo(11.25f, 8.59f, 11.59f, 8.25f, 12f, 8.25f)
                curveTo(12.41f, 8.25f, 12.75f, 8.59f, 12.75f, 9f)
                verticalLineTo(15.68f)
                curveTo(12.75f, 16.09f, 12.41f, 16.43f, 12f, 16.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17f, 14.69f)
                curveTo(16.59f, 14.69f, 16.25f, 14.35f, 16.25f, 13.94f)
                verticalLineTo(10.73f)
                curveTo(16.25f, 10.32f, 16.59f, 9.98f, 17f, 9.98f)
                curveTo(17.41f, 9.98f, 17.75f, 10.32f, 17.75f, 10.73f)
                verticalLineTo(13.94f)
                curveTo(17.75f, 14.36f, 17.41f, 14.69f, 17f, 14.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _Chart!!
    }

@Suppress("ObjectPropertyName")
private var _Chart: ImageVector? = null
