package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Mobile: ImageVector
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
                moveTo(16.24f, 2f)
                horizontalLineTo(7.76f)
                curveTo(5f, 2f, 4f, 3f, 4f, 5.81f)
                verticalLineTo(18.19f)
                curveTo(4f, 21f, 5f, 22f, 7.76f, 22f)
                horizontalLineTo(16.23f)
                curveTo(19f, 22f, 20f, 21f, 20f, 18.19f)
                verticalLineTo(5.81f)
                curveTo(20f, 3f, 19f, 2f, 16.24f, 2f)
                close()
                moveTo(12f, 19.3f)
                curveTo(11.04f, 19.3f, 10.25f, 18.51f, 10.25f, 17.55f)
                curveTo(10.25f, 16.59f, 11.04f, 15.8f, 12f, 15.8f)
                curveTo(12.96f, 15.8f, 13.75f, 16.59f, 13.75f, 17.55f)
                curveTo(13.75f, 18.51f, 12.96f, 19.3f, 12f, 19.3f)
                close()
                moveTo(14f, 6.25f)
                horizontalLineTo(10f)
                curveTo(9.59f, 6.25f, 9.25f, 5.91f, 9.25f, 5.5f)
                curveTo(9.25f, 5.09f, 9.59f, 4.75f, 10f, 4.75f)
                horizontalLineTo(14f)
                curveTo(14.41f, 4.75f, 14.75f, 5.09f, 14.75f, 5.5f)
                curveTo(14.75f, 5.91f, 14.41f, 6.25f, 14f, 6.25f)
                close()
            }
        }.build()

        return _Mobile!!
    }

@Suppress("ObjectPropertyName")
private var _Mobile: ImageVector? = null
