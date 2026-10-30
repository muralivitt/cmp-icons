package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.MessageText1: ImageVector
    get() {
        if (_MessageText1 != null) {
            return _MessageText1!!
        }
        _MessageText1 = ImageVector.Builder(
            name = "MessageText1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(4.24f, 2f, 2f, 4.23f, 2f, 6.98f)
                verticalLineTo(12.96f)
                verticalLineTo(13.96f)
                curveTo(2f, 16.71f, 4.24f, 18.94f, 7f, 18.94f)
                horizontalLineTo(8.5f)
                curveTo(8.77f, 18.94f, 9.13f, 19.12f, 9.3f, 19.34f)
                lineTo(10.8f, 21.33f)
                curveTo(11.46f, 22.21f, 12.54f, 22.21f, 13.2f, 21.33f)
                lineTo(14.7f, 19.34f)
                curveTo(14.89f, 19.09f, 15.19f, 18.94f, 15.5f, 18.94f)
                horizontalLineTo(17f)
                curveTo(19.76f, 18.94f, 22f, 16.71f, 22f, 13.96f)
                verticalLineTo(6.98f)
                curveTo(22f, 4.23f, 19.76f, 2f, 17f, 2f)
                close()
                moveTo(13f, 13.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 13.75f, 6.25f, 13.41f, 6.25f, 13f)
                curveTo(6.25f, 12.59f, 6.59f, 12.25f, 7f, 12.25f)
                horizontalLineTo(13f)
                curveTo(13.41f, 12.25f, 13.75f, 12.59f, 13.75f, 13f)
                curveTo(13.75f, 13.41f, 13.41f, 13.75f, 13f, 13.75f)
                close()
                moveTo(17f, 8.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 8.75f, 6.25f, 8.41f, 6.25f, 8f)
                curveTo(6.25f, 7.59f, 6.59f, 7.25f, 7f, 7.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 7.25f, 17.75f, 7.59f, 17.75f, 8f)
                curveTo(17.75f, 8.41f, 17.41f, 8.75f, 17f, 8.75f)
                close()
            }
        }.build()

        return _MessageText1!!
    }

@Suppress("ObjectPropertyName")
private var _MessageText1: ImageVector? = null
