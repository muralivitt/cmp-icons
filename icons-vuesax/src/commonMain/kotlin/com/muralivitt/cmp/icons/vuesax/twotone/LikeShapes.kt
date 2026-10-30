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

val VuesaxIconsTwotone.LikeShapes: ImageVector
    get() {
        if (_LikeShapes != null) {
            return _LikeShapes!!
        }
        _LikeShapes = ImageVector.Builder(
            name = "LikeShapes",
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
                curveTo(11.441f, 1.86f, 12.571f, 1.86f, 13.271f, 2.45f)
                lineTo(14.851f, 3.81f)
                curveTo(15.151f, 4.07f, 15.711f, 4.28f, 16.111f, 4.28f)
                horizontalLineTo(17.811f)
                curveTo(18.871f, 4.28f, 19.741f, 5.15f, 19.741f, 6.21f)
                verticalLineTo(7.91f)
                curveTo(19.741f, 8.3f, 19.951f, 8.87f, 20.211f, 9.17f)
                lineTo(21.571f, 10.75f)
                curveTo(22.161f, 11.44f, 22.161f, 12.57f, 21.571f, 13.27f)
                lineTo(20.211f, 14.85f)
                curveTo(19.951f, 15.15f, 19.741f, 15.71f, 19.741f, 16.11f)
                verticalLineTo(17.81f)
                curveTo(19.741f, 18.87f, 18.871f, 19.74f, 17.811f, 19.74f)
                horizontalLineTo(16.111f)
                curveTo(15.721f, 19.74f, 15.151f, 19.95f, 14.851f, 20.21f)
                lineTo(13.271f, 21.57f)
                curveTo(12.581f, 22.16f, 11.451f, 22.16f, 10.751f, 21.57f)
                lineTo(9.171f, 20.21f)
                curveTo(8.871f, 19.95f, 8.311f, 19.74f, 7.911f, 19.74f)
                horizontalLineTo(6.181f)
                curveTo(5.121f, 19.74f, 4.251f, 18.87f, 4.251f, 17.81f)
                verticalLineTo(16.1f)
                curveTo(4.251f, 15.71f, 4.041f, 15.15f, 3.791f, 14.85f)
                lineTo(2.441f, 13.26f)
                curveTo(1.861f, 12.57f, 1.861f, 11.45f, 2.441f, 10.76f)
                lineTo(3.791f, 9.17f)
                curveTo(4.041f, 8.87f, 4.251f, 8.31f, 4.251f, 7.92f)
                verticalLineTo(6.21f)
                curveTo(4.251f, 5.15f, 5.121f, 4.28f, 6.181f, 4.28f)
                horizontalLineTo(7.911f)
                curveTo(8.301f, 4.28f, 8.871f, 4.07f, 9.171f, 3.81f)
                lineTo(10.751f, 2.45f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(9.891f, 14.82f)
                lineTo(11.341f, 15.94f)
                curveTo(11.531f, 16.13f, 11.951f, 16.22f, 12.231f, 16.22f)
                horizontalLineTo(14.001f)
                curveTo(14.561f, 16.22f, 15.171f, 15.8f, 15.311f, 15.24f)
                lineTo(16.431f, 11.82f)
                curveTo(16.661f, 11.17f, 16.241f, 10.6f, 15.541f, 10.6f)
                horizontalLineTo(13.671f)
                curveTo(13.391f, 10.6f, 13.161f, 10.37f, 13.201f, 10.04f)
                lineTo(13.431f, 8.54f)
                curveTo(13.521f, 8.12f, 13.241f, 7.65f, 12.821f, 7.51f)
                curveTo(12.451f, 7.37f, 11.981f, 7.56f, 11.791f, 7.84f)
                lineTo(9.871f, 10.69f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 14.82f)
                verticalLineTo(10.24f)
                curveTo(7.5f, 9.58f, 7.78f, 9.35f, 8.44f, 9.35f)
                horizontalLineTo(8.91f)
                curveTo(9.56f, 9.35f, 9.85f, 9.58f, 9.85f, 10.24f)
                verticalLineTo(14.82f)
                curveTo(9.85f, 15.47f, 9.57f, 15.71f, 8.91f, 15.71f)
                horizontalLineTo(8.44f)
                curveTo(7.78f, 15.71f, 7.5f, 15.48f, 7.5f, 14.82f)
                close()
            }
        }.build()

        return _LikeShapes!!
    }

@Suppress("ObjectPropertyName")
private var _LikeShapes: ImageVector? = null
