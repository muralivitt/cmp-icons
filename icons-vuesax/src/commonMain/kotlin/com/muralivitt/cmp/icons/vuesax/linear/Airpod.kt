package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Airpod: ImageVector
    get() {
        if (_Airpod != null) {
            return _Airpod!!
        }
        _Airpod = ImageVector.Builder(
            name = "Airpod",
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
                moveTo(2.62f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(2.62f, 7.48f, 2.65f, 6.79f, 2.73f, 6.18f)
                curveTo(3.1f, 2.89f, 4.65f, 2f, 8.88f, 2f)
                horizontalLineTo(15.13f)
                curveTo(19.35f, 2f, 20.91f, 2.89f, 21.27f, 6.18f)
                curveTo(21.36f, 6.79f, 21.38f, 7.48f, 21.38f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(21.38f, 16.52f, 21.35f, 17.21f, 21.27f, 17.83f)
                curveTo(20.9f, 21.11f, 19.35f, 22f, 15.12f, 22f)
                horizontalLineTo(8.88f)
                curveTo(4.66f, 22f, 3.1f, 21.11f, 2.74f, 17.83f)
                curveTo(2.65f, 17.21f, 2.62f, 16.52f, 2.62f, 15.75f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.23f, 8.92f)
                horizontalLineTo(17.13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.87f, 8.92f)
                horizontalLineTo(2.77f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.13f, 8.92f)
                curveTo(17.13f, 10.05f, 16.21f, 10.97f, 15.08f, 10.97f)
                horizontalLineTo(8.92f)
                curveTo(8.36f, 10.97f, 7.84f, 10.74f, 7.47f, 10.36f)
                curveTo(7.1f, 10f, 6.87f, 9.49f, 6.87f, 8.92f)
                curveTo(6.87f, 7.79f, 7.79f, 6.87f, 8.92f, 6.87f)
                horizontalLineTo(15.07f)
                curveTo(15.63f, 6.87f, 16.15f, 7.1f, 16.52f, 7.48f)
                curveTo(16.9f, 7.85f, 17.13f, 8.36f, 17.13f, 8.92f)
                close()
            }
        }.build()

        return _Airpod!!
    }

@Suppress("ObjectPropertyName")
private var _Airpod: ImageVector? = null
