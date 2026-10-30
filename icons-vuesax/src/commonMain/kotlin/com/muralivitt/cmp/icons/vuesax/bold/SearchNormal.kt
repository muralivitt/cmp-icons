package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.SearchNormal: ImageVector
    get() {
        if (_SearchNormal != null) {
            return _SearchNormal!!
        }
        _SearchNormal = ImageVector.Builder(
            name = "SearchNormal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(11.01f, 20.02f)
                curveTo(15.986f, 20.02f, 20.02f, 15.986f, 20.02f, 11.01f)
                curveTo(20.02f, 6.034f, 15.986f, 2f, 11.01f, 2f)
                curveTo(6.034f, 2f, 2f, 6.034f, 2f, 11.01f)
                curveTo(2f, 15.986f, 6.034f, 20.02f, 11.01f, 20.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.99f, 18.95f)
                curveTo(21.66f, 18.34f, 20.96f, 18f, 20.02f, 18f)
                curveTo(19.31f, 18f, 18.7f, 18.29f, 18.34f, 18.79f)
                curveTo(17.98f, 19.29f, 17.9f, 19.96f, 18.12f, 20.63f)
                curveTo(18.55f, 21.93f, 19.3f, 22.22f, 19.71f, 22.27f)
                curveTo(19.77f, 22.28f, 19.83f, 22.28f, 19.9f, 22.28f)
                curveTo(20.34f, 22.28f, 21.02f, 22.09f, 21.68f, 21.1f)
                curveTo(22.21f, 20.33f, 22.31f, 19.56f, 21.99f, 18.95f)
                close()
            }
        }.build()

        return _SearchNormal!!
    }

@Suppress("ObjectPropertyName")
private var _SearchNormal: ImageVector? = null
