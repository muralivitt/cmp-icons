package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MagicStar: ImageVector
    get() {
        if (_MagicStar != null) {
            return _MagicStar!!
        }
        _MagicStar = ImageVector.Builder(
            name = "MagicStar",
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
                moveTo(17.29f, 4.14f)
                lineTo(17.22f, 7.93f)
                curveTo(17.21f, 8.45f, 17.54f, 9.14f, 17.96f, 9.45f)
                lineTo(20.44f, 11.33f)
                curveTo(22.03f, 12.53f, 21.77f, 14f, 19.87f, 14.6f)
                lineTo(16.64f, 15.61f)
                curveTo(16.1f, 15.78f, 15.53f, 16.37f, 15.39f, 16.92f)
                lineTo(14.62f, 19.86f)
                curveTo(14.01f, 22.18f, 12.49f, 22.41f, 11.23f, 20.37f)
                lineTo(9.47f, 17.52f)
                curveTo(9.15f, 17f, 8.39f, 16.61f, 7.79f, 16.64f)
                lineTo(4.45f, 16.81f)
                curveTo(2.06f, 16.93f, 1.38f, 15.55f, 2.94f, 13.73f)
                lineTo(4.92f, 11.43f)
                curveTo(5.29f, 11f, 5.46f, 10.2f, 5.29f, 9.66f)
                lineTo(4.28f, 6.43f)
                curveTo(3.69f, 4.53f, 4.75f, 3.48f, 6.64f, 4.1f)
                lineTo(9.59f, 5.07f)
                curveTo(10.09f, 5.23f, 10.84f, 5.12f, 11.26f, 4.81f)
                lineTo(14.34f, 2.59f)
                curveTo(16f, 1.39f, 17.33f, 2.09f, 17.29f, 4.14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.91f, 22f)
                lineTo(18.88f, 18.97f)
            }
        }.build()

        return _MagicStar!!
    }

@Suppress("ObjectPropertyName")
private var _MagicStar: ImageVector? = null
