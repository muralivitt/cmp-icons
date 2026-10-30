package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Mobile: ImageVector
    get() {
        if (_Mobile != null) {
            return _Mobile!!
        }
        _Mobile = ImageVector.Builder(
            name = "Mobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(4.59f, 22.75f, 3.25f, 21.41f, 3.25f, 17f)
                verticalLineTo(7f)
                curveTo(3.25f, 2.59f, 4.59f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(19.41f, 1.25f, 20.75f, 2.59f, 20.75f, 7f)
                verticalLineTo(17f)
                curveTo(20.75f, 21.41f, 19.41f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(5.42f, 2.75f, 4.75f, 3.43f, 4.75f, 7f)
                verticalLineTo(17f)
                curveTo(4.75f, 20.57f, 5.42f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(18.58f, 21.25f, 19.25f, 20.57f, 19.25f, 17f)
                verticalLineTo(7f)
                curveTo(19.25f, 3.43f, 18.58f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14f, 6.25f)
                horizontalLineTo(10f)
                curveTo(9.59f, 6.25f, 9.25f, 5.91f, 9.25f, 5.5f)
                curveTo(9.25f, 5.09f, 9.59f, 4.75f, 10f, 4.75f)
                horizontalLineTo(14f)
                curveTo(14.41f, 4.75f, 14.75f, 5.09f, 14.75f, 5.5f)
                curveTo(14.75f, 5.91f, 14.41f, 6.25f, 14f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 19.86f)
                curveTo(10.73f, 19.86f, 9.7f, 18.83f, 9.7f, 17.56f)
                curveTo(9.7f, 16.29f, 10.73f, 15.26f, 12f, 15.26f)
                curveTo(13.27f, 15.26f, 14.3f, 16.29f, 14.3f, 17.56f)
                curveTo(14.3f, 18.83f, 13.27f, 19.86f, 12f, 19.86f)
                close()
                moveTo(12f, 16.75f)
                curveTo(11.56f, 16.75f, 11.2f, 17.11f, 11.2f, 17.55f)
                curveTo(11.2f, 17.99f, 11.56f, 18.35f, 12f, 18.35f)
                curveTo(12.44f, 18.35f, 12.8f, 17.99f, 12.8f, 17.55f)
                curveTo(12.8f, 17.11f, 12.44f, 16.75f, 12f, 16.75f)
                close()
            }
        }.build()

        return _Mobile!!
    }

@Suppress("ObjectPropertyName")
private var _Mobile: ImageVector? = null
