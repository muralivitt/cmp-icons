package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.Note2: ImageVector
    get() {
        if (_Note2 != null) {
            return _Note2!!
        }
        _Note2 = ImageVector.Builder(
            name = "Note2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(13.55f, 20.162f)
                curveTo(13.29f, 20.272f, 13.01f, 20.372f, 12.71f, 20.472f)
                lineTo(11.13f, 20.992f)
                curveTo(7.16f, 22.272f, 5.07f, 21.202f, 3.78f, 17.232f)
                lineTo(2.5f, 13.282f)
                curveTo(1.22f, 9.312f, 2.28f, 7.212f, 6.25f, 5.932f)
                lineTo(7.79f, 5.422f)
                curveTo(7.6f, 5.902f, 7.44f, 6.452f, 7.29f, 7.072f)
                lineTo(6.31f, 11.262f)
                curveTo(5.21f, 15.972f, 6.82f, 18.572f, 11.53f, 19.692f)
                lineTo(13.21f, 20.092f)
                curveTo(13.32f, 20.122f, 13.44f, 20.142f, 13.55f, 20.162f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17.17f, 3.209f)
                lineTo(15.5f, 2.819f)
                curveTo(12.16f, 2.029f, 10.17f, 2.679f, 9f, 5.099f)
                curveTo(8.7f, 5.709f, 8.46f, 6.449f, 8.26f, 7.299f)
                lineTo(7.28f, 11.488f)
                curveTo(6.3f, 15.668f, 7.59f, 17.729f, 11.76f, 18.719f)
                lineTo(13.44f, 19.118f)
                curveTo(14.02f, 19.258f, 14.56f, 19.348f, 15.06f, 19.389f)
                curveTo(18.18f, 19.688f, 19.84f, 18.229f, 20.68f, 14.618f)
                lineTo(21.66f, 10.439f)
                curveTo(22.64f, 6.259f, 21.36f, 4.189f, 17.17f, 3.209f)
                close()
            }
        }.build()

        return _Note2!!
    }

@Suppress("ObjectPropertyName")
private var _Note2: ImageVector? = null
