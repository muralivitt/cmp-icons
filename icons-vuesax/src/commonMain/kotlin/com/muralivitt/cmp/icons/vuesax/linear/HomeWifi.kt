package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.HomeWifi: ImageVector
    get() {
        if (_HomeWifi != null) {
            return _HomeWifi!!
        }
        _HomeWifi = ImageVector.Builder(
            name = "HomeWifi",
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
                moveTo(10.07f, 2.82f)
                lineTo(3.14f, 8.37f)
                curveTo(2.36f, 8.99f, 1.86f, 10.3f, 2.03f, 11.28f)
                lineTo(3.36f, 19.24f)
                curveTo(3.6f, 20.66f, 4.96f, 21.81f, 6.4f, 21.81f)
                horizontalLineTo(17.6f)
                curveTo(19.03f, 21.81f, 20.4f, 20.65f, 20.64f, 19.24f)
                lineTo(21.97f, 11.28f)
                curveTo(22.13f, 10.3f, 21.63f, 8.99f, 20.86f, 8.37f)
                lineTo(13.93f, 2.83f)
                curveTo(12.86f, 1.97f, 11.13f, 1.97f, 10.07f, 2.82f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.88f, 14.38f)
                curveTo(11.15f, 13.17f, 12.85f, 13.17f, 14.12f, 14.38f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.24f, 12.26f)
                curveTo(15.7f, 11.73f, 15.1f, 11.32f, 14.48f, 11.02f)
                curveTo(12.89f, 10.26f, 11.11f, 10.26f, 9.51f, 11.02f)
                curveTo(8.89f, 11.32f, 8.3f, 11.73f, 7.75f, 12.26f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.995f, 17f)
                horizontalLineTo(12.005f)
            }
        }.build()

        return _HomeWifi!!
    }

@Suppress("ObjectPropertyName")
private var _HomeWifi: ImageVector? = null
