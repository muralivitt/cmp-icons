package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.AddCircle: ImageVector
    get() {
        if (_AddCircle != null) {
            return _AddCircle!!
        }
        _AddCircle = ImageVector.Builder(
            name = "AddCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                curveTo(2f, 17.51f, 6.49f, 22f, 12f, 22f)
                curveTo(17.51f, 22f, 22f, 17.51f, 22f, 12f)
                curveTo(22f, 6.49f, 17.51f, 2f, 12f, 2f)
                close()
                moveTo(16f, 12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(16f)
                curveTo(12.75f, 16.41f, 12.41f, 16.75f, 12f, 16.75f)
                curveTo(11.59f, 16.75f, 11.25f, 16.41f, 11.25f, 16f)
                verticalLineTo(12.75f)
                horizontalLineTo(8f)
                curveTo(7.59f, 12.75f, 7.25f, 12.41f, 7.25f, 12f)
                curveTo(7.25f, 11.59f, 7.59f, 11.25f, 8f, 11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(8f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12f, 7.25f)
                curveTo(12.41f, 7.25f, 12.75f, 7.59f, 12.75f, 8f)
                verticalLineTo(11.25f)
                horizontalLineTo(16f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16f, 12.75f)
                close()
            }
        }.build()

        return _AddCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AddCircle: ImageVector? = null
