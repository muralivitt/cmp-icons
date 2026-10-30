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

val VuesaxIconsTwotone.Information: ImageVector
    get() {
        if (_Information != null) {
            return _Information!!
        }
        _Information = ImageVector.Builder(
            name = "Information",
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
                moveTo(10.751f, 2.45f)
                curveTo(11.451f, 1.86f, 12.581f, 1.86f, 13.261f, 2.45f)
                lineTo(14.841f, 3.8f)
                curveTo(15.141f, 4.05f, 15.711f, 4.26f, 16.111f, 4.26f)
                horizontalLineTo(17.811f)
                curveTo(18.871f, 4.26f, 19.741f, 5.13f, 19.741f, 6.19f)
                verticalLineTo(7.89f)
                curveTo(19.741f, 8.29f, 19.951f, 8.85f, 20.201f, 9.15f)
                lineTo(21.551f, 10.73f)
                curveTo(22.141f, 11.43f, 22.141f, 12.56f, 21.551f, 13.24f)
                lineTo(20.201f, 14.82f)
                curveTo(19.951f, 15.12f, 19.741f, 15.68f, 19.741f, 16.08f)
                verticalLineTo(17.78f)
                curveTo(19.741f, 18.84f, 18.871f, 19.71f, 17.811f, 19.71f)
                horizontalLineTo(16.111f)
                curveTo(15.711f, 19.71f, 15.151f, 19.92f, 14.851f, 20.17f)
                lineTo(13.271f, 21.52f)
                curveTo(12.571f, 22.11f, 11.441f, 22.11f, 10.761f, 21.52f)
                lineTo(9.181f, 20.17f)
                curveTo(8.881f, 19.92f, 8.311f, 19.71f, 7.921f, 19.71f)
                horizontalLineTo(6.171f)
                curveTo(5.111f, 19.71f, 4.241f, 18.84f, 4.241f, 17.78f)
                verticalLineTo(16.07f)
                curveTo(4.241f, 15.68f, 4.041f, 15.11f, 3.791f, 14.82f)
                lineTo(2.441f, 13.23f)
                curveTo(1.861f, 12.54f, 1.861f, 11.42f, 2.441f, 10.73f)
                lineTo(3.791f, 9.14f)
                curveTo(4.041f, 8.84f, 4.241f, 8.28f, 4.241f, 7.89f)
                verticalLineTo(6.2f)
                curveTo(4.241f, 5.14f, 5.111f, 4.27f, 6.171f, 4.27f)
                horizontalLineTo(7.901f)
                curveTo(8.301f, 4.27f, 8.861f, 4.06f, 9.161f, 3.81f)
                lineTo(10.751f, 2.45f)
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
                moveTo(12f, 8.13f)
                verticalLineTo(12.96f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.994f, 16f)
                horizontalLineTo(12.003f)
            }
        }.build()

        return _Information!!
    }

@Suppress("ObjectPropertyName")
private var _Information: ImageVector? = null
