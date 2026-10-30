package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.StopCircle: ImageVector
    get() {
        if (_StopCircle != null) {
            return _StopCircle!!
        }
        _StopCircle = ImageVector.Builder(
            name = "StopCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(11.969f, 2f)
                curveTo(6.449f, 2f, 1.969f, 6.48f, 1.969f, 12f)
                curveTo(1.969f, 17.52f, 6.449f, 22f, 11.969f, 22f)
                curveTo(17.489f, 22f, 21.969f, 17.52f, 21.969f, 12f)
                curveTo(21.969f, 6.48f, 17.499f, 2f, 11.969f, 2f)
                close()
                moveTo(16.229f, 13.23f)
                curveTo(16.229f, 14.89f, 14.889f, 16.23f, 13.229f, 16.23f)
                horizontalLineTo(10.769f)
                curveTo(9.109f, 16.23f, 7.769f, 14.89f, 7.769f, 13.23f)
                verticalLineTo(10.77f)
                curveTo(7.769f, 9.11f, 9.109f, 7.77f, 10.769f, 7.77f)
                horizontalLineTo(13.229f)
                curveTo(14.889f, 7.77f, 16.229f, 9.11f, 16.229f, 10.77f)
                verticalLineTo(13.23f)
                close()
            }
        }.build()

        return _StopCircle!!
    }

@Suppress("ObjectPropertyName")
private var _StopCircle: ImageVector? = null
