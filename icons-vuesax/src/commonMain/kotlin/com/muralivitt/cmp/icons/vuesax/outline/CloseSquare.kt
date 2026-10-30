package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.CloseSquare: ImageVector
    get() {
        if (_CloseSquare != null) {
            return _CloseSquare!!
        }
        _CloseSquare = ImageVector.Builder(
            name = "CloseSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(9.169f, 15.58f)
                curveTo(8.979f, 15.58f, 8.789f, 15.51f, 8.639f, 15.36f)
                curveTo(8.349f, 15.07f, 8.349f, 14.59f, 8.639f, 14.3f)
                lineTo(14.299f, 8.64f)
                curveTo(14.589f, 8.35f, 15.069f, 8.35f, 15.359f, 8.64f)
                curveTo(15.649f, 8.93f, 15.649f, 9.41f, 15.359f, 9.7f)
                lineTo(9.699f, 15.36f)
                curveTo(9.559f, 15.51f, 9.359f, 15.58f, 9.169f, 15.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14.829f, 15.58f)
                curveTo(14.639f, 15.58f, 14.449f, 15.51f, 14.299f, 15.36f)
                lineTo(8.639f, 9.7f)
                curveTo(8.349f, 9.41f, 8.349f, 8.93f, 8.639f, 8.64f)
                curveTo(8.929f, 8.35f, 9.409f, 8.35f, 9.699f, 8.64f)
                lineTo(15.359f, 14.3f)
                curveTo(15.649f, 14.59f, 15.649f, 15.07f, 15.359f, 15.36f)
                curveTo(15.209f, 15.51f, 15.019f, 15.58f, 14.829f, 15.58f)
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

        return _CloseSquare!!
    }

@Suppress("ObjectPropertyName")
private var _CloseSquare: ImageVector? = null
