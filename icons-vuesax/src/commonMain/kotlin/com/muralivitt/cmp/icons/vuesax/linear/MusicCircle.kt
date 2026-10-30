package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.MusicCircle: ImageVector
    get() {
        if (_MusicCircle != null) {
            return _MusicCircle!!
        }
        _MusicCircle = ImageVector.Builder(
            name = "MusicCircle",
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
                moveTo(2.58f, 8.67f)
                curveTo(3.2f, 6.91f, 4.3f, 5.38f, 5.72f, 4.23f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 13.17f, 2.21f, 14.29f, 2.58f, 15.33f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.09f, 21.57f)
                curveTo(10.01f, 21.85f, 10.99f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 11.4f, 21.94f, 10.81f, 21.84f, 10.24f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.72f, 19.75f)
                curveTo(5.25f, 19.37f, 4.8f, 18.95f, 4.4f, 18.49f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.24f, 6.34f)
                curveTo(18.44f, 3.72f, 15.42f, 2f, 12f, 2f)
                curveTo(10.99f, 2f, 10.01f, 2.15f, 9.09f, 2.43f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.59f, 17.11f)
                curveTo(9.468f, 17.11f, 10.18f, 16.398f, 10.18f, 15.52f)
                curveTo(10.18f, 14.642f, 9.468f, 13.93f, 8.59f, 13.93f)
                curveTo(7.712f, 13.93f, 7f, 14.642f, 7f, 15.52f)
                curveTo(7f, 16.398f, 7.712f, 17.11f, 8.59f, 17.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 14.46f)
                verticalLineTo(8.25f)
                curveTo(16f, 6.93f, 15.17f, 6.74f, 14.33f, 6.97f)
                lineTo(11.15f, 7.84f)
                curveTo(10.57f, 8f, 10.17f, 8.45f, 10.17f, 9.12f)
                verticalLineTo(10.23f)
                verticalLineTo(10.97f)
                verticalLineTo(15.52f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.41f, 16.05f)
                curveTo(15.288f, 16.05f, 16f, 15.338f, 16f, 14.46f)
                curveTo(16f, 13.582f, 15.288f, 12.87f, 14.41f, 12.87f)
                curveTo(13.532f, 12.87f, 12.82f, 13.582f, 12.82f, 14.46f)
                curveTo(12.82f, 15.338f, 13.532f, 16.05f, 14.41f, 16.05f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.18f, 10.76f)
                lineTo(16f, 9.17f)
            }
        }.build()

        return _MusicCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MusicCircle: ImageVector? = null
