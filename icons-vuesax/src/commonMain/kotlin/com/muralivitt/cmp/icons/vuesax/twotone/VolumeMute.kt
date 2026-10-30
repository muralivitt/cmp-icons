package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.VolumeMute: ImageVector
    get() {
        if (_VolumeMute != null) {
            return _VolumeMute!!
        }
        _VolumeMute = ImageVector.Builder(
            name = "VolumeMute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(5.5f, 10f)
                verticalLineTo(14f)
                curveTo(5.5f, 16f, 6.5f, 17f, 8.5f, 17f)
                horizontalLineTo(9.93f)
                curveTo(10.3f, 17f, 10.67f, 17.11f, 10.99f, 17.3f)
                lineTo(13.91f, 19.13f)
                curveTo(16.43f, 20.71f, 18.5f, 19.56f, 18.5f, 16.59f)
                verticalLineTo(7.41f)
                curveTo(18.5f, 4.43f, 16.43f, 3.29f, 13.91f, 4.87f)
                lineTo(10.99f, 6.7f)
                curveTo(10.67f, 6.89f, 10.3f, 7f, 9.93f, 7f)
                horizontalLineTo(8.5f)
                curveTo(6.5f, 7f, 5.5f, 8f, 5.5f, 10f)
                close()
            }
        }.build()

        return _VolumeMute!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeMute: ImageVector? = null
