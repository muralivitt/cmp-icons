package com.muralivitt.cmp.icons.vuesax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

import kotlin.Suppress

val VuesaxIconsBold.MouseCircle: ImageVector
    get() {
        if (_MouseCircle != null) {
            return _MouseCircle!!
        }
        _MouseCircle = ImageVector.Builder(
            name = "MouseCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.96f, 17.838f)
                lineTo(19.33f, 18.389f)
                curveTo(18.88f, 18.538f, 18.52f, 18.889f, 18.37f, 19.348f)
                lineTo(17.82f, 20.979f)
                curveTo(17.35f, 22.389f, 15.37f, 22.358f, 14.93f, 20.948f)
                lineTo(13.08f, 14.998f)
                curveTo(12.72f, 13.818f, 13.81f, 12.719f, 14.98f, 13.089f)
                lineTo(20.94f, 14.939f)
                curveTo(22.34f, 15.378f, 22.36f, 17.368f, 20.96f, 17.838f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32))) {
                moveTo(20.999f, 11.499f)
                curveTo(20.999f, 11.929f, 20.969f, 12.359f, 20.919f, 12.779f)
                curveTo(20.879f, 13.079f, 20.569f, 13.259f, 20.279f, 13.169f)
                lineTo(15.429f, 11.659f)
                curveTo(14.349f, 11.329f, 13.199f, 11.609f, 12.399f, 12.399f)
                curveTo(11.599f, 13.199f, 11.309f, 14.369f, 11.649f, 15.449f)
                lineTo(13.149f, 20.279f)
                curveTo(13.239f, 20.569f, 13.049f, 20.879f, 12.749f, 20.919f)
                curveTo(12.329f, 20.969f, 11.919f, 20.999f, 11.499f, 20.999f)
                curveTo(6.159f, 20.999f, 1.859f, 16.609f, 1.999f, 11.229f)
                curveTo(2.139f, 6.269f, 6.269f, 2.139f, 11.229f, 1.999f)
                curveTo(16.609f, 1.859f, 20.999f, 6.159f, 20.999f, 11.499f)
                close()
            }
        }.build()

        return _MouseCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MouseCircle: ImageVector? = null
