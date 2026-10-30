package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.BucketCircle: ImageVector
    get() {
        if (_BucketCircle != null) {
            return _BucketCircle!!
        }
        _BucketCircle = ImageVector.Builder(
            name = "BucketCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(11.63f, 16.25f)
                curveTo(10.78f, 17.1f, 9.92f, 17.1f, 9.06f, 16.25f)
                lineTo(6.5f, 13.68f)
                curveTo(6.06f, 13.24f, 5.85f, 12.8f, 5.86f, 12.35f)
                curveTo(5.87f, 11.93f, 6.09f, 11.52f, 6.5f, 11.11f)
                lineTo(10.1f, 7.51f)
                lineTo(9.54f, 6.96f)
                curveTo(9.35f, 6.77f, 9.35f, 6.47f, 9.54f, 6.28f)
                curveTo(9.73f, 6.09f, 10.03f, 6.09f, 10.22f, 6.28f)
                lineTo(10.77f, 6.83f)
                lineTo(15.47f, 11.53f)
                curveTo(15.57f, 11.63f, 15.64f, 11.78f, 15.64f, 11.92f)
                curveTo(15.65f, 12.09f, 15.6f, 12.26f, 15.47f, 12.39f)
                lineTo(11.63f, 16.25f)
                close()
                moveTo(16.64f, 17.86f)
                curveTo(15.81f, 17.86f, 15.14f, 17.19f, 15.14f, 16.36f)
                curveTo(15.14f, 15.52f, 16.13f, 14.41f, 16.33f, 14.19f)
                curveTo(16.49f, 14.01f, 16.8f, 14.01f, 16.97f, 14.19f)
                curveTo(17.17f, 14.4f, 18.16f, 15.52f, 18.16f, 16.36f)
                curveTo(18.14f, 17.19f, 17.47f, 17.86f, 16.64f, 17.86f)
                close()
            }
        }.build()

        return _BucketCircle!!
    }

@Suppress("ObjectPropertyName")
private var _BucketCircle: ImageVector? = null
