package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Like: ImageVector
    get() {
        if (_Like != null) {
            return _Like!!
        }
        _Like = ImageVector.Builder(
            name = "Like",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                curveTo(4.34f, 2f, 3f, 3.33f, 3f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(3f, 17.52f, 4.34f, 18.85f, 6f, 18.85f)
                horizontalLineTo(6.76f)
                curveTo(7.56f, 18.85f, 8.32f, 19.16f, 8.88f, 19.72f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.18f, 12.64f, 22.18f, 13.42f, 21.41f)
                lineTo(15.13f, 19.72f)
                curveTo(15.69f, 19.16f, 16.46f, 18.85f, 17.25f, 18.85f)
                horizontalLineTo(18f)
                curveTo(19.66f, 18.85f, 21f, 17.52f, 21f, 15.88f)
                verticalLineTo(4.97f)
                curveTo(21f, 3.33f, 19.66f, 2f, 18f, 2f)
                close()
                moveTo(12.28f, 14.96f)
                curveTo(12.13f, 15.01f, 11.88f, 15.01f, 11.72f, 14.96f)
                curveTo(10.42f, 14.51f, 7.5f, 12.66f, 7.5f, 9.51f)
                curveTo(7.51f, 8.12f, 8.62f, 7f, 10f, 7f)
                curveTo(10.82f, 7f, 11.54f, 7.39f, 12f, 8f)
                curveTo(12.46f, 7.39f, 13.18f, 7f, 14f, 7f)
                curveTo(15.38f, 7f, 16.5f, 8.12f, 16.5f, 9.51f)
                curveTo(16.49f, 12.66f, 13.58f, 14.51f, 12.28f, 14.96f)
                close()
            }
        }.build()

        return _Like!!
    }

@Suppress("ObjectPropertyName")
private var _Like: ImageVector? = null
