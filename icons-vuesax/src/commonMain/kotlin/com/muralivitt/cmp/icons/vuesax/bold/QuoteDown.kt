package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.QuoteDown: ImageVector
    get() {
        if (_QuoteDown != null) {
            return _QuoteDown!!
        }
        _QuoteDown = ImageVector.Builder(
            name = "QuoteDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(15.908f, 12.371f)
                horizontalLineTo(20.598f)
                curveTo(20.518f, 17.041f, 19.598f, 17.811f, 16.728f, 19.511f)
                curveTo(16.398f, 19.711f, 16.288f, 20.131f, 16.488f, 20.471f)
                curveTo(16.688f, 20.801f, 17.108f, 20.911f, 17.448f, 20.711f)
                curveTo(20.828f, 18.711f, 22.008f, 17.491f, 22.008f, 11.671f)
                verticalLineTo(6.281f)
                curveTo(22.008f, 4.571f, 20.618f, 3.191f, 18.918f, 3.191f)
                horizontalLineTo(15.918f)
                curveTo(14.158f, 3.191f, 12.828f, 4.521f, 12.828f, 6.281f)
                verticalLineTo(9.281f)
                curveTo(12.818f, 11.041f, 14.148f, 12.371f, 15.908f, 12.371f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(5.09f, 12.371f)
                horizontalLineTo(9.78f)
                curveTo(9.7f, 17.041f, 8.78f, 17.811f, 5.91f, 19.511f)
                curveTo(5.58f, 19.711f, 5.47f, 20.131f, 5.67f, 20.471f)
                curveTo(5.87f, 20.801f, 6.29f, 20.911f, 6.63f, 20.711f)
                curveTo(10.01f, 18.711f, 11.19f, 17.491f, 11.19f, 11.671f)
                verticalLineTo(6.281f)
                curveTo(11.19f, 4.571f, 9.8f, 3.191f, 8.1f, 3.191f)
                horizontalLineTo(5.1f)
                curveTo(3.33f, 3.191f, 2f, 4.521f, 2f, 6.281f)
                verticalLineTo(9.281f)
                curveTo(2f, 11.041f, 3.33f, 12.371f, 5.09f, 12.371f)
                close()
            }
        }.build()

        return _QuoteDown!!
    }

@Suppress("ObjectPropertyName")
private var _QuoteDown: ImageVector? = null
