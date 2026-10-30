package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.MessageText: ImageVector
    get() {
        if (_MessageText != null) {
            return _MessageText!!
        }
        _MessageText = ImageVector.Builder(
            name = "MessageText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(4f, 2f, 2f, 4f, 2f, 8f)
                verticalLineTo(21f)
                curveTo(2f, 21.55f, 2.45f, 22f, 3f, 22f)
                horizontalLineTo(16f)
                curveTo(20f, 22f, 22f, 20f, 22f, 16f)
                verticalLineTo(8f)
                curveTo(22f, 4f, 20f, 2f, 16f, 2f)
                close()
                moveTo(14f, 15.25f)
                horizontalLineTo(7f)
                curveTo(6.59f, 15.25f, 6.25f, 14.91f, 6.25f, 14.5f)
                curveTo(6.25f, 14.09f, 6.59f, 13.75f, 7f, 13.75f)
                horizontalLineTo(14f)
                curveTo(14.41f, 13.75f, 14.75f, 14.09f, 14.75f, 14.5f)
                curveTo(14.75f, 14.91f, 14.41f, 15.25f, 14f, 15.25f)
                close()
                moveTo(17f, 10.25f)
                horizontalLineTo(7f)
                curveTo(6.59f, 10.25f, 6.25f, 9.91f, 6.25f, 9.5f)
                curveTo(6.25f, 9.09f, 6.59f, 8.75f, 7f, 8.75f)
                horizontalLineTo(17f)
                curveTo(17.41f, 8.75f, 17.75f, 9.09f, 17.75f, 9.5f)
                curveTo(17.75f, 9.91f, 17.41f, 10.25f, 17f, 10.25f)
                close()
            }
        }.build()

        return _MessageText!!
    }

@Suppress("ObjectPropertyName")
private var _MessageText: ImageVector? = null
