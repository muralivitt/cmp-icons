package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.RecordCircle: ImageVector
    get() {
        if (_RecordCircle != null) {
            return _RecordCircle!!
        }
        _RecordCircle = ImageVector.Builder(
            name = "RecordCircle",
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
                moveTo(11.999f, 16.23f)
                curveTo(9.659f, 16.23f, 7.769f, 14.34f, 7.769f, 12f)
                curveTo(7.769f, 9.66f, 9.659f, 7.77f, 11.999f, 7.77f)
                curveTo(14.339f, 7.77f, 16.229f, 9.66f, 16.229f, 12f)
                curveTo(16.229f, 14.34f, 14.339f, 16.23f, 11.999f, 16.23f)
                close()
            }
        }.build()

        return _RecordCircle!!
    }

@Suppress("ObjectPropertyName")
private var _RecordCircle: ImageVector? = null
