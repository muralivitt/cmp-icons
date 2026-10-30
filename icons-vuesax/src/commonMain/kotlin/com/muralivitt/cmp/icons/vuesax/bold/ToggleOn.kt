package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.ToggleOn: ImageVector
    get() {
        if (_ToggleOn != null) {
            return _ToggleOn!!
        }
        _ToggleOn = ImageVector.Builder(
            name = "ToggleOn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.65f, 3.859f)
                horizontalLineTo(7.35f)
                curveTo(3.25f, 3.859f, 2f, 5.109f, 2f, 9.209f)
                verticalLineTo(14.789f)
                curveTo(2f, 18.889f, 3.25f, 20.139f, 7.35f, 20.139f)
                horizontalLineTo(16.65f)
                curveTo(20.75f, 20.139f, 22f, 18.889f, 22f, 14.789f)
                verticalLineTo(9.209f)
                curveTo(22f, 5.109f, 20.75f, 3.859f, 16.65f, 3.859f)
                close()
                moveTo(18.74f, 13.119f)
                curveTo(18.74f, 15.369f, 17.69f, 16.419f, 15.44f, 16.419f)
                horizontalLineTo(13.21f)
                curveTo(10.96f, 16.419f, 9.91f, 15.369f, 9.91f, 13.119f)
                verticalLineTo(10.889f)
                curveTo(9.91f, 8.639f, 10.96f, 7.589f, 13.21f, 7.589f)
                horizontalLineTo(15.44f)
                curveTo(17.69f, 7.589f, 18.74f, 8.639f, 18.74f, 10.889f)
                verticalLineTo(13.119f)
                close()
            }
        }.build()

        return _ToggleOn!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleOn: ImageVector? = null
