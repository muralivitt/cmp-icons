package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.More2: ImageVector
    get() {
        if (_More2 != null) {
            return _More2!!
        }
        _More2 = ImageVector.Builder(
            name = "More2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.97f,
                strokeAlpha = 0.97f
            ) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(8.31f, 16.31f)
                curveTo(7.59f, 16.31f, 7f, 15.72f, 7f, 15f)
                curveTo(7f, 14.28f, 7.59f, 13.69f, 8.31f, 13.69f)
                curveTo(9.03f, 13.69f, 9.62f, 14.28f, 9.62f, 15f)
                curveTo(9.62f, 15.72f, 9.03f, 16.31f, 8.31f, 16.31f)
                close()
                moveTo(12f, 10.31f)
                curveTo(11.28f, 10.31f, 10.69f, 9.72f, 10.69f, 9f)
                curveTo(10.69f, 8.28f, 11.28f, 7.69f, 12f, 7.69f)
                curveTo(12.72f, 7.69f, 13.31f, 8.28f, 13.31f, 9f)
                curveTo(13.31f, 9.72f, 12.72f, 10.31f, 12f, 10.31f)
                close()
                moveTo(15.69f, 16.31f)
                curveTo(14.97f, 16.31f, 14.38f, 15.72f, 14.38f, 15f)
                curveTo(14.38f, 14.28f, 14.97f, 13.69f, 15.69f, 13.69f)
                curveTo(16.41f, 13.69f, 17f, 14.28f, 17f, 15f)
                curveTo(17f, 15.72f, 16.41f, 16.31f, 15.69f, 16.31f)
                close()
            }
        }.build()

        return _More2!!
    }

@Suppress("ObjectPropertyName")
private var _More2: ImageVector? = null
