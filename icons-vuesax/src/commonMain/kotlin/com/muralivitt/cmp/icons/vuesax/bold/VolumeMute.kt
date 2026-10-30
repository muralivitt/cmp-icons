package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.VolumeMute: ImageVector
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
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(17.52f, 3.782f)
                curveTo(16.4f, 3.162f, 14.97f, 3.322f, 13.51f, 4.232f)
                lineTo(10.59f, 6.062f)
                curveTo(10.39f, 6.182f, 10.16f, 6.252f, 9.93f, 6.252f)
                horizontalLineTo(9f)
                horizontalLineTo(8.5f)
                curveTo(6.08f, 6.252f, 4.75f, 7.582f, 4.75f, 10.002f)
                verticalLineTo(14.002f)
                curveTo(4.75f, 16.422f, 6.08f, 17.752f, 8.5f, 17.752f)
                horizontalLineTo(9f)
                horizontalLineTo(9.93f)
                curveTo(10.16f, 17.752f, 10.39f, 17.822f, 10.59f, 17.942f)
                lineTo(13.51f, 19.772f)
                curveTo(14.39f, 20.322f, 15.25f, 20.592f, 16.05f, 20.592f)
                curveTo(16.57f, 20.592f, 17.07f, 20.472f, 17.52f, 20.222f)
                curveTo(18.63f, 19.602f, 19.25f, 18.312f, 19.25f, 16.592f)
                verticalLineTo(7.412f)
                curveTo(19.25f, 5.692f, 18.63f, 4.402f, 17.52f, 3.782f)
                close()
            }
        }.build()

        return _VolumeMute!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeMute: ImageVector? = null
