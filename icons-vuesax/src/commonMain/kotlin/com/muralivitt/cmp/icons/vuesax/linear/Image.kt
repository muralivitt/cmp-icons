package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Image: ImageVector
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
                moveTo(21.68f, 16.96f)
                lineTo(18.55f, 9.65f)
                curveTo(17.49f, 7.17f, 15.54f, 7.07f, 14.23f, 9.43f)
                lineTo(12.34f, 12.84f)
                curveTo(11.38f, 14.57f, 9.59f, 14.72f, 8.35f, 13.17f)
                lineTo(8.13f, 12.89f)
                curveTo(6.84f, 11.27f, 5.02f, 11.47f, 4.09f, 13.32f)
                lineTo(2.37f, 16.77f)
                curveTo(1.16f, 19.17f, 2.91f, 22f, 5.59f, 22f)
                horizontalLineTo(18.35f)
                curveTo(20.95f, 22f, 22.7f, 19.35f, 21.68f, 16.96f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.97f, 8f)
                curveTo(8.627f, 8f, 9.97f, 6.657f, 9.97f, 5f)
                curveTo(9.97f, 3.343f, 8.627f, 2f, 6.97f, 2f)
                curveTo(5.313f, 2f, 3.97f, 3.343f, 3.97f, 5f)
                curveTo(3.97f, 6.657f, 5.313f, 8f, 6.97f, 8f)
                close()
            }
        }.build()

        return _Image!!
    }

@Suppress("ObjectPropertyName")
private var _Image: ImageVector? = null
