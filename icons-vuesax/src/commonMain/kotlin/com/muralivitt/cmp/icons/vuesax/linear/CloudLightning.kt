package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CloudLightning: ImageVector
    get() {
        if (_CloudLightning != null) {
            return _CloudLightning!!
        }
        _CloudLightning = ImageVector.Builder(
            name = "CloudLightning",
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
                moveTo(16.61f, 20f)
                curveTo(17.95f, 20.01f, 19.24f, 19.51f, 20.23f, 18.61f)
                curveTo(23.5f, 15.75f, 21.75f, 10.01f, 17.44f, 9.47f)
                curveTo(15.9f, 0.13f, 2.43f, 3.67f, 5.62f, 12.56f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.28f, 12.97f)
                curveTo(6.75f, 12.7f, 6.16f, 12.56f, 5.57f, 12.57f)
                curveTo(0.91f, 12.9f, 0.92f, 19.68f, 5.57f, 20.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.82f, 9.89f)
                curveTo(16.34f, 9.63f, 16.9f, 9.49f, 17.48f, 9.48f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.23f, 19.16f)
                horizontalLineTo(10.23f)
                verticalLineTo(21.49f)
                curveTo(10.23f, 21.83f, 10.66f, 22f, 10.88f, 21.74f)
                lineTo(13.33f, 18.95f)
                curveTo(13.63f, 18.61f, 13.5f, 18.33f, 13.05f, 18.33f)
                horizontalLineTo(12.05f)
                verticalLineTo(16f)
                curveTo(12.05f, 15.66f, 11.62f, 15.49f, 11.4f, 15.75f)
                lineTo(8.95f, 18.54f)
                curveTo(8.65f, 18.88f, 8.78f, 19.16f, 9.23f, 19.16f)
                close()
            }
        }.build()

        return _CloudLightning!!
    }

@Suppress("ObjectPropertyName")
private var _CloudLightning: ImageVector? = null
