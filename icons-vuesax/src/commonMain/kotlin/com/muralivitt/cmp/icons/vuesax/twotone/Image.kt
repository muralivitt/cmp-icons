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

val VuesaxIconsTwotone.Image: ImageVector
    get() {
        if (_Image != null) {
            return _Image!!
        }
        _Image = ImageVector.Builder(
            name = "Image",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.681f, 16.96f)
                lineTo(18.551f, 9.65f)
                curveTo(17.491f, 7.17f, 15.541f, 7.07f, 14.231f, 9.43f)
                lineTo(12.341f, 12.84f)
                curveTo(11.381f, 14.57f, 9.591f, 14.72f, 8.351f, 13.17f)
                lineTo(8.131f, 12.89f)
                curveTo(6.841f, 11.27f, 5.021f, 11.47f, 4.091f, 13.32f)
                lineTo(2.371f, 16.77f)
                curveTo(1.161f, 19.17f, 2.911f, 22f, 5.591f, 22f)
                horizontalLineTo(18.351f)
                curveTo(20.951f, 22f, 22.701f, 19.35f, 21.681f, 16.96f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.971f, 8f)
                curveTo(8.628f, 8f, 9.971f, 6.657f, 9.971f, 5f)
                curveTo(9.971f, 3.343f, 8.628f, 2f, 6.971f, 2f)
                curveTo(5.314f, 2f, 3.971f, 3.343f, 3.971f, 5f)
                curveTo(3.971f, 6.657f, 5.314f, 8f, 6.971f, 8f)
                close()
            }
        }.build()

        return _Image!!
    }

@Suppress("ObjectPropertyName")
private var _Image: ImageVector? = null
