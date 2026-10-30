package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Messages: ImageVector
    get() {
        if (_Messages != null) {
            return _Messages!!
        }
        _Messages = ImageVector.Builder(
            name = "Messages",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.999f, 12.859f)
                curveTo(21.999f, 15.149f, 20.819f, 17.18f, 18.999f, 18.459f)
                lineTo(17.659f, 21.41f)
                curveTo(17.349f, 22.08f, 16.449f, 22.209f, 15.979f, 21.639f)
                lineTo(14.499f, 19.86f)
                curveTo(12.639f, 19.86f, 10.929f, 19.229f, 9.629f, 18.18f)
                lineTo(10.229f, 17.469f)
                curveTo(14.849f, 17.119f, 18.499f, 13.46f, 18.499f, 9f)
                curveTo(18.499f, 8.24f, 18.389f, 7.49f, 18.189f, 6.77f)
                curveTo(20.459f, 7.97f, 21.999f, 10.25f, 21.999f, 12.859f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(16.3f, 6.07f)
                curveTo(15.13f, 3.67f, 12.52f, 2f, 9.5f, 2f)
                curveTo(5.36f, 2f, 2f, 5.13f, 2f, 9f)
                curveTo(2f, 11.29f, 3.18f, 13.32f, 5f, 14.6f)
                lineTo(6.34f, 17.55f)
                curveTo(6.65f, 18.22f, 7.55f, 18.34f, 8.02f, 17.78f)
                lineTo(8.57f, 17.12f)
                lineTo(9.5f, 16f)
                curveTo(13.64f, 16f, 17f, 12.87f, 17f, 9f)
                curveTo(17f, 7.95f, 16.75f, 6.96f, 16.3f, 6.07f)
                close()
                moveTo(12f, 9.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 9.75f, 6.25f, 9.41f, 6.25f, 9f)
                curveTo(6.25f, 8.59f, 6.59f, 8.25f, 7f, 8.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 8.25f, 12.75f, 8.59f, 12.75f, 9f)
                curveTo(12.75f, 9.41f, 12.41f, 9.75f, 12f, 9.75f)
                close()
            }
        }.build()

        return _Messages!!
    }

@Suppress("ObjectPropertyName")
private var _Messages: ImageVector? = null
