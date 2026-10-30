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

val VuesaxIconsTwotone.Verify: ImageVector
    get() {
        if (_Verify != null) {
            return _Verify!!
        }
        _Verify = ImageVector.Builder(
            name = "Verify",
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
                moveTo(8.381f, 12f)
                lineTo(10.791f, 14.42f)
                lineTo(15.621f, 9.58f)
            }
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
                verticalLineTo(6.2f)
                curveTo(4.251f, 5.14f, 5.121f, 4.27f, 6.181f, 4.27f)
                horizontalLineTo(7.911f)
                curveTo(8.301f, 4.27f, 8.871f, 4.06f, 9.171f, 3.8f)
                lineTo(10.751f, 2.45f)
                close()
            }
        }.build()

        return _Verify!!
    }

@Suppress("ObjectPropertyName")
private var _Verify: ImageVector? = null
