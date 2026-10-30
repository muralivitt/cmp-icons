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

val VuesaxIconsTwotone.Cup: ImageVector
    get() {
        if (_Cup != null) {
            return _Cup!!
        }
        _Cup = ImageVector.Builder(
            name = "Cup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.15f, 16.5f)
                verticalLineTo(18.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(7.15f, 22f)
                horizontalLineTo(17.15f)
                verticalLineTo(21f)
                curveTo(17.15f, 19.9f, 16.25f, 19f, 15.15f, 19f)
                horizontalLineTo(9.15f)
                curveTo(8.05f, 19f, 7.15f, 19.9f, 7.15f, 21f)
                verticalLineTo(22f)
                verticalLineTo(22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.15f, 22f)
                horizontalLineTo(18.15f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                curveTo(8.13f, 16f, 5f, 12.87f, 5f, 9f)
                verticalLineTo(6f)
                curveTo(5f, 3.79f, 6.79f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(17.21f, 2f, 19f, 3.79f, 19f, 6f)
                verticalLineTo(9f)
                curveTo(19f, 12.87f, 15.87f, 16f, 12f, 16f)
                close()
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.469f, 11.65f)
                curveTo(4.719f, 11.41f, 4.059f, 10.97f, 3.539f, 10.45f)
                curveTo(2.639f, 9.45f, 2.039f, 8.25f, 2.039f, 6.85f)
                curveTo(2.039f, 5.45f, 3.139f, 4.35f, 4.539f, 4.35f)
                horizontalLineTo(5.189f)
                curveTo(4.989f, 4.81f, 4.889f, 5.32f, 4.889f, 5.85f)
                verticalLineTo(8.85f)
                curveTo(4.889f, 9.85f, 5.099f, 10.79f, 5.469f, 11.65f)
                close()
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.529f, 11.65f)
                curveTo(19.279f, 11.41f, 19.939f, 10.97f, 20.459f, 10.45f)
                curveTo(21.359f, 9.45f, 21.959f, 8.25f, 21.959f, 6.85f)
                curveTo(21.959f, 5.45f, 20.859f, 4.35f, 19.459f, 4.35f)
                horizontalLineTo(18.809f)
                curveTo(19.009f, 4.81f, 19.109f, 5.32f, 19.109f, 5.85f)
                verticalLineTo(8.85f)
                curveTo(19.109f, 9.85f, 18.899f, 10.79f, 18.529f, 11.65f)
                close()
            }
        }.build()

        return _Cup!!
    }

@Suppress("ObjectPropertyName")
private var _Cup: ImageVector? = null
