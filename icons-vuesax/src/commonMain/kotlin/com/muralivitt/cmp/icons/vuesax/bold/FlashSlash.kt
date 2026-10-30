package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.FlashSlash: ImageVector
    get() {
        if (_FlashSlash != null) {
            return _FlashSlash!!
        }
        _FlashSlash = ImageVector.Builder(
            name = "FlashSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(21.771f, 2.229f)
                curveTo(21.471f, 1.929f, 20.981f, 1.929f, 20.681f, 2.229f)
                lineTo(2.231f, 20.689f)
                curveTo(1.931f, 20.989f, 1.931f, 21.479f, 2.231f, 21.779f)
                curveTo(2.381f, 21.919f, 2.571f, 21.999f, 2.771f, 21.999f)
                curveTo(2.971f, 21.999f, 3.161f, 21.919f, 3.311f, 21.769f)
                lineTo(21.771f, 3.309f)
                curveTo(22.081f, 3.009f, 22.081f, 2.529f, 21.771f, 2.229f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(14.821f, 3.521f)
                verticalLineTo(9.181f)
                lineTo(9.181f, 14.821f)
                verticalLineTo(13.281f)
                horizontalLineTo(6.09f)
                curveTo(4.69f, 13.281f, 4.3f, 12.421f, 5.231f, 11.371f)
                lineTo(12f, 3.671f)
                lineTo(12.8f, 2.761f)
                curveTo(13.91f, 1.501f, 14.821f, 1.841f, 14.821f, 3.521f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(18.77f, 12.629f)
                lineTo(12f, 20.329f)
                lineTo(11.2f, 21.239f)
                curveTo(10.09f, 22.499f, 9.18f, 22.159f, 9.18f, 20.479f)
                verticalLineTo(17.819f)
                lineTo(16.28f, 10.719f)
                horizontalLineTo(17.91f)
                curveTo(19.31f, 10.719f, 19.7f, 11.579f, 18.77f, 12.629f)
                close()
            }
        }.build()

        return _FlashSlash!!
    }

@Suppress("ObjectPropertyName")
private var _FlashSlash: ImageVector? = null
