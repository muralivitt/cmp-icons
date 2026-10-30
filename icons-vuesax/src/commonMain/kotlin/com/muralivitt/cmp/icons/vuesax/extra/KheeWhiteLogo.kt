package com.muralivitt.cmp.icons.vuesax.extra

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VuesaxExtra.KheeWhiteLogo: ImageVector
    get() {
        if (_KheeWhiteLogo != null) {
            return _KheeWhiteLogo!!
        }
        _KheeWhiteLogo = ImageVector.Builder(
            name = "KheeWhiteLogo",
            defaultWidth = 512.dp,
            defaultHeight = 512.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(512f)
                    verticalLineToRelative(512f)
                    horizontalLineToRelative(-512f)
                    close()
                }
            ) {
                path(
                    fill = SolidColor(Color(0xFF009688)),
                    fillAlpha = 0f
                ) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(512f)
                    verticalLineToRelative(512f)
                    horizontalLineToRelative(-512f)
                    close()
                }
                path(fill = SolidColor(Color.White)) {
                    moveTo(106.4f, 264.1f)
                    lineTo(106.4f, 371.3f)
                    lineTo(214.45f, 437.28f)
                    lineTo(214.45f, 196.38f)
                    lineTo(214.45f, 141.73f)
                    lineTo(106.4f, 74.72f)
                    lineTo(106.4f, 264.1f)
                    lineTo(106.4f, 264.1f)
                    close()
                }
                path(fill = SolidColor(Color.White)) {
                    moveTo(405.6f, 296.75f)
                    lineTo(405.6f, 429.03f)
                    lineTo(240.42f, 327.75f)
                    lineTo(240.42f, 194.26f)
                    lineTo(405.6f, 296.75f)
                    lineTo(405.6f, 296.75f)
                    close()
                }
                path(fill = SolidColor(Color.White)) {
                    moveTo(405.6f, 290.75f)
                    lineTo(405.6f, 290.58f)
                    lineTo(349.5f, 255.74f)
                    lineTo(405.6f, 219.42f)
                    lineTo(405.6f, 86.97f)
                    lineTo(405.6f, 86.97f)
                    lineTo(240.42f, 187.74f)
                    lineTo(240.42f, 188.26f)
                    lineTo(405.6f, 290.75f)
                    lineTo(405.6f, 290.75f)
                    close()
                }
            }
        }.build()

        return _KheeWhiteLogo!!
    }

@Suppress("ObjectPropertyName")
private var _KheeWhiteLogo: ImageVector? = null
