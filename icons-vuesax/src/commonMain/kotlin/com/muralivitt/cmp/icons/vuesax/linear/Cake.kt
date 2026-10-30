package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Cake: ImageVector
    get() {
        if (_Cake != null) {
            return _Cake!!
        }
        _Cake = ImageVector.Builder(
            name = "Cake",
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
                moveTo(2f, 22f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.11f, 22f)
                verticalLineTo(13f)
                curveTo(3.11f, 11.34f, 4.6f, 10f, 6.44f, 10f)
                horizontalLineTo(17.55f)
                curveTo(19.39f, 10f, 20.88f, 11.34f, 20.88f, 13f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.56f, 10f)
                verticalLineTo(7.17f)
                curveTo(5.56f, 5.97f, 6.64f, 5f, 7.98f, 5f)
                horizontalLineTo(16.03f)
                curveTo(17.36f, 5f, 18.44f, 5.97f, 18.44f, 7.17f)
                verticalLineTo(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.53f, 13.98f)
                lineTo(3.9f, 13.99f)
                curveTo(4.64f, 14f, 5.23f, 14.6f, 5.23f, 15.34f)
                verticalLineTo(15.67f)
                curveTo(5.23f, 16.41f, 5.83f, 17.02f, 6.58f, 17.02f)
                curveTo(7.32f, 17.02f, 7.93f, 16.42f, 7.93f, 15.67f)
                verticalLineTo(15.36f)
                curveTo(7.93f, 14.62f, 8.53f, 14.01f, 9.28f, 14.01f)
                curveTo(10.02f, 14.01f, 10.63f, 14.61f, 10.63f, 15.36f)
                verticalLineTo(15.67f)
                curveTo(10.63f, 16.41f, 11.23f, 17.02f, 11.98f, 17.02f)
                curveTo(12.72f, 17.02f, 13.33f, 16.42f, 13.33f, 15.67f)
                verticalLineTo(15.36f)
                curveTo(13.33f, 14.62f, 13.93f, 14.01f, 14.68f, 14.01f)
                curveTo(15.42f, 14.01f, 16.03f, 14.61f, 16.03f, 15.36f)
                verticalLineTo(15.67f)
                curveTo(16.03f, 16.41f, 16.63f, 17.02f, 17.38f, 17.02f)
                curveTo(18.12f, 17.02f, 18.73f, 16.42f, 18.73f, 15.67f)
                verticalLineTo(15.36f)
                curveTo(18.73f, 14.62f, 19.33f, 14.01f, 20.08f, 14.01f)
                horizontalLineTo(20.53f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 5f)
                verticalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 5f)
                verticalLineTo(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                verticalLineTo(2f)
            }
        }.build()

        return _Cake!!
    }

@Suppress("ObjectPropertyName")
private var _Cake: ImageVector? = null
