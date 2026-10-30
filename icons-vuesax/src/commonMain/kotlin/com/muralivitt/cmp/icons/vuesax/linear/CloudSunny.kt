package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CloudSunny: ImageVector
    get() {
        if (_CloudSunny != null) {
            return _CloudSunny!!
        }
        _CloudSunny = ImageVector.Builder(
            name = "CloudSunny",
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
                moveTo(20.27f, 18.68f)
                curveTo(19.28f, 19.59f, 17.98f, 20.09f, 16.63f, 20.08f)
                horizontalLineTo(5.54f)
                curveTo(0.87f, 19.74f, 0.86f, 12.94f, 5.54f, 12.6f)
                horizontalLineTo(5.59f)
                curveTo(2.89f, 5.06f, 12.12f, 1.34f, 16f, 6.03f)
                verticalLineTo(6.04f)
                curveTo(16.7f, 6.9f, 17.23f, 8.04f, 17.47f, 9.49f)
                curveTo(18.8f, 9.66f, 19.88f, 10.31f, 20.65f, 11.23f)
                curveTo(22.4f, 13.3f, 22.55f, 16.68f, 20.27f, 18.68f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.26f, 13.01f)
                curveTo(6.74f, 12.75f, 6.17f, 12.61f, 5.59f, 12.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.85f, 9.92f)
                curveTo(16.37f, 9.66f, 16.94f, 9.52f, 17.52f, 9.51f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.97f, 8.5f)
                curveTo(21.97f, 9.6f, 21.46f, 10.59f, 20.65f, 11.23f)
                curveTo(19.88f, 10.31f, 18.8f, 9.66f, 17.47f, 9.49f)
                curveTo(17.23f, 8.04f, 16.7f, 6.9f, 16f, 6.04f)
                verticalLineTo(6.03f)
                curveTo(16.63f, 5.39f, 17.51f, 5f, 18.47f, 5f)
                curveTo(20.4f, 5f, 21.97f, 6.57f, 21.97f, 8.5f)
                close()
            }
        }.build()

        return _CloudSunny!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSunny: ImageVector? = null
