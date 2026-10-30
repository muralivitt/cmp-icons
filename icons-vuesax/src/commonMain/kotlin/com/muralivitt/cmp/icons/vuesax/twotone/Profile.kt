package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.Profile: ImageVector
    get() {
        if (_Profile != null) {
            return _Profile!!
        }
        _Profile = ImageVector.Builder(
            name = "Profile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.16f, 10.87f)
                curveTo(12.061f, 10.86f, 11.941f, 10.86f, 11.83f, 10.87f)
                curveTo(9.451f, 10.79f, 7.561f, 8.84f, 7.561f, 6.44f)
                curveTo(7.561f, 3.99f, 9.541f, 2f, 12f, 2f)
                curveTo(14.45f, 2f, 16.441f, 3.99f, 16.441f, 6.44f)
                curveTo(16.431f, 8.84f, 14.54f, 10.79f, 12.16f, 10.87f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.161f, 14.56f)
                curveTo(4.741f, 16.18f, 4.741f, 18.82f, 7.161f, 20.43f)
                curveTo(9.911f, 22.27f, 14.421f, 22.27f, 17.171f, 20.43f)
                curveTo(19.591f, 18.81f, 19.591f, 16.17f, 17.171f, 14.56f)
                curveTo(14.431f, 12.73f, 9.921f, 12.73f, 7.161f, 14.56f)
                close()
            }
        }.build()

        return _Profile!!
    }

@Suppress("ObjectPropertyName")
private var _Profile: ImageVector? = null
