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

val VuesaxIconsTwotone.Airpods: ImageVector
    get() {
        if (_Airpods != null) {
            return _Airpods!!
        }
        _Airpods = ImageVector.Builder(
            name = "Airpods",
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
                moveTo(6.72f, 9.56f)
                horizontalLineTo(5.78f)
                curveTo(3.7f, 9.56f, 2f, 7.86f, 2f, 5.78f)
                curveTo(2f, 3.7f, 3.7f, 2f, 5.78f, 2f)
                horizontalLineTo(7.67f)
                curveTo(9.23f, 2f, 10.5f, 3.28f, 10.5f, 4.83f)
                verticalLineTo(7.39f)
                verticalLineTo(17.1f)
                curveTo(10.5f, 18.14f, 9.65f, 18.99f, 8.61f, 18.99f)
                curveTo(7.57f, 18.99f, 6.72f, 18.14f, 6.72f, 17.1f)
                verticalLineTo(9.56f)
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
                moveTo(5.78f, 6.72f)
                curveTo(5.26f, 6.72f, 4.84f, 6.3f, 4.84f, 5.78f)
                curveTo(4.84f, 5.26f, 5.26f, 4.84f, 5.78f, 4.84f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.28f, 9.56f)
                horizontalLineTo(18.22f)
                curveTo(20.3f, 9.56f, 22f, 7.86f, 22f, 5.78f)
                curveTo(22f, 3.7f, 20.3f, 2f, 18.22f, 2f)
                horizontalLineTo(16.33f)
                curveTo(14.77f, 2f, 13.5f, 3.28f, 13.5f, 4.83f)
                verticalLineTo(7.39f)
                verticalLineTo(17.1f)
                curveTo(13.5f, 18.14f, 14.35f, 18.99f, 15.39f, 18.99f)
                curveTo(16.43f, 18.99f, 17.28f, 18.14f, 17.28f, 17.1f)
                verticalLineTo(9.56f)
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
                moveTo(18.22f, 6.72f)
                curveTo(18.74f, 6.72f, 19.16f, 6.3f, 19.16f, 5.78f)
                curveTo(19.16f, 5.26f, 18.74f, 4.84f, 18.22f, 4.84f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 22f)
                verticalLineTo(19f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 22f)
                verticalLineTo(19f)
            }
        }.build()

        return _Airpods!!
    }

@Suppress("ObjectPropertyName")
private var _Airpods: ImageVector? = null
