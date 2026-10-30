package com.muralivitt.cmp.icons.vuesax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsOutline.Frame: ImageVector
    get() {
        if (_Frame != null) {
            return _Frame!!
        }
        _Frame = ImageVector.Builder(
            name = "Frame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                curveTo(12.75f, 2.41f, 12.41f, 2.75f, 12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 11.59f, 21.59f, 11.25f, 22f, 11.25f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(13.8f, 10.95f)
                curveTo(13.61f, 10.95f, 13.42f, 10.88f, 13.27f, 10.73f)
                curveTo(12.98f, 10.44f, 12.98f, 9.96f, 13.27f, 9.67f)
                lineTo(21.47f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.53f, 1.47f)
                curveTo(22.82f, 1.76f, 22.82f, 2.24f, 22.53f, 2.53f)
                lineTo(14.33f, 10.73f)
                curveTo(14.19f, 10.87f, 14f, 10.95f, 13.8f, 10.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17.83f, 11.75f)
                horizontalLineTo(13f)
                curveTo(12.59f, 11.75f, 12.25f, 11.41f, 12.25f, 11f)
                verticalLineTo(6.17f)
                curveTo(12.25f, 5.76f, 12.59f, 5.42f, 13f, 5.42f)
                curveTo(13.41f, 5.42f, 13.75f, 5.76f, 13.75f, 6.17f)
                verticalLineTo(10.25f)
                horizontalLineTo(17.83f)
                curveTo(18.24f, 10.25f, 18.58f, 10.59f, 18.58f, 11f)
                curveTo(18.58f, 11.41f, 18.24f, 11.75f, 17.83f, 11.75f)
                close()
            }
        }.build()

        return _Frame!!
    }

@Suppress("ObjectPropertyName")
private var _Frame: ImageVector? = null
