package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.VideoOctagon: ImageVector
    get() {
        if (_VideoOctagon != null) {
            return _VideoOctagon!!
        }
        _VideoOctagon = ImageVector.Builder(
            name = "VideoOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(19.512f, 5.85f)
                lineTo(13.572f, 2.42f)
                curveTo(12.602f, 1.86f, 11.402f, 1.86f, 10.422f, 2.42f)
                lineTo(4.492f, 5.85f)
                curveTo(3.522f, 6.41f, 2.922f, 7.45f, 2.922f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(2.922f, 16.54f, 3.522f, 17.58f, 4.492f, 18.15f)
                lineTo(10.432f, 21.58f)
                curveTo(11.402f, 22.14f, 12.602f, 22.14f, 13.582f, 21.58f)
                lineTo(19.522f, 18.15f)
                curveTo(20.492f, 17.59f, 21.092f, 16.55f, 21.092f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(21.082f, 7.45f, 20.482f, 6.42f, 19.512f, 5.85f)
                close()
                moveTo(14.252f, 13.4f)
                lineTo(13.212f, 14f)
                lineTo(12.172f, 14.6f)
                curveTo(10.842f, 15.37f, 9.752f, 14.74f, 9.752f, 13.2f)
                verticalLineTo(12f)
                verticalLineTo(10.8f)
                curveTo(9.752f, 9.26f, 10.842f, 8.63f, 12.172f, 9.4f)
                lineTo(13.212f, 10f)
                lineTo(14.252f, 10.6f)
                curveTo(15.582f, 11.37f, 15.582f, 12.63f, 14.252f, 13.4f)
                close()
            }
        }.build()

        return _VideoOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _VideoOctagon: ImageVector? = null
