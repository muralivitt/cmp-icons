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

val VuesaxIconsTwotone.Award: ImageVector
    get() {
        if (_Award != null) {
            return _Award!!
        }
        _Award = ImageVector.Builder(
            name = "Award",
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
                moveTo(4.26f, 11.02f)
                verticalLineTo(15.99f)
                curveTo(4.26f, 17.81f, 4.26f, 17.81f, 5.98f, 18.97f)
                lineTo(10.71f, 21.7f)
                curveTo(11.42f, 22.11f, 12.58f, 22.11f, 13.29f, 21.7f)
                lineTo(18.02f, 18.97f)
                curveTo(19.74f, 17.81f, 19.74f, 17.81f, 19.74f, 15.99f)
                verticalLineTo(11.02f)
                curveTo(19.74f, 9.2f, 19.74f, 9.2f, 18.02f, 8.04f)
                lineTo(13.29f, 5.31f)
                curveTo(12.58f, 4.9f, 11.42f, 4.9f, 10.71f, 5.31f)
                lineTo(5.98f, 8.04f)
                curveTo(4.26f, 9.2f, 4.26f, 9.2f, 4.26f, 11.02f)
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
                moveTo(17.5f, 7.63f)
                verticalLineTo(5f)
                curveTo(17.5f, 3f, 16.5f, 2f, 14.5f, 2f)
                horizontalLineTo(9.5f)
                curveTo(7.5f, 2f, 6.5f, 3f, 6.5f, 5f)
                verticalLineTo(7.56f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.63f, 10.99f)
                lineTo(13.2f, 11.88f)
                curveTo(13.29f, 12.02f, 13.49f, 12.16f, 13.64f, 12.2f)
                lineTo(14.66f, 12.46f)
                curveTo(15.29f, 12.62f, 15.46f, 13.16f, 15.05f, 13.66f)
                lineTo(14.38f, 14.47f)
                curveTo(14.28f, 14.6f, 14.2f, 14.83f, 14.21f, 14.99f)
                lineTo(14.27f, 16.04f)
                curveTo(14.31f, 16.69f, 13.85f, 17.02f, 13.25f, 16.78f)
                lineTo(12.27f, 16.39f)
                curveTo(12.12f, 16.33f, 11.87f, 16.33f, 11.72f, 16.39f)
                lineTo(10.74f, 16.78f)
                curveTo(10.14f, 17.02f, 9.68f, 16.68f, 9.72f, 16.04f)
                lineTo(9.78f, 14.99f)
                curveTo(9.79f, 14.83f, 9.71f, 14.59f, 9.61f, 14.47f)
                lineTo(8.94f, 13.66f)
                curveTo(8.53f, 13.16f, 8.7f, 12.62f, 9.33f, 12.46f)
                lineTo(10.35f, 12.2f)
                curveTo(10.51f, 12.16f, 10.71f, 12.01f, 10.79f, 11.88f)
                lineTo(11.36f, 10.99f)
                curveTo(11.72f, 10.45f, 12.28f, 10.45f, 12.63f, 10.99f)
                close()
            }
        }.build()

        return _Award!!
    }

@Suppress("ObjectPropertyName")
private var _Award: ImageVector? = null
