package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.`3Dcube`: ImageVector
    get() {
        if (_3Dcube != null) {
            return _3Dcube!!
        }
        _3Dcube = ImageVector.Builder(
            name = "3Dcube",
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
                moveTo(12.92f, 2.26f)
                lineTo(19.43f, 5.77f)
                curveTo(20.19f, 6.18f, 20.19f, 7.35f, 19.43f, 7.76f)
                lineTo(12.92f, 11.27f)
                curveTo(12.34f, 11.58f, 11.66f, 11.58f, 11.08f, 11.27f)
                lineTo(4.57f, 7.76f)
                curveTo(3.81f, 7.35f, 3.81f, 6.18f, 4.57f, 5.77f)
                lineTo(11.08f, 2.26f)
                curveTo(11.66f, 1.95f, 12.34f, 1.95f, 12.92f, 2.26f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.61f, 10.13f)
                lineTo(9.66f, 13.16f)
                curveTo(10.41f, 13.54f, 10.89f, 14.31f, 10.89f, 15.15f)
                verticalLineTo(20.87f)
                curveTo(10.89f, 21.7f, 10.02f, 22.23f, 9.28f, 21.86f)
                lineTo(3.23f, 18.83f)
                curveTo(2.48f, 18.45f, 2f, 17.68f, 2f, 16.84f)
                verticalLineTo(11.12f)
                curveTo(2f, 10.29f, 2.87f, 9.76f, 3.61f, 10.13f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.39f, 10.13f)
                lineTo(14.34f, 13.16f)
                curveTo(13.59f, 13.54f, 13.11f, 14.31f, 13.11f, 15.15f)
                verticalLineTo(20.87f)
                curveTo(13.11f, 21.7f, 13.98f, 22.23f, 14.72f, 21.86f)
                lineTo(20.77f, 18.83f)
                curveTo(21.52f, 18.45f, 22f, 17.68f, 22f, 16.84f)
                verticalLineTo(11.12f)
                curveTo(22f, 10.29f, 21.13f, 9.76f, 20.39f, 10.13f)
                close()
            }
        }.build()

        return _3Dcube!!
    }

@Suppress("ObjectPropertyName")
private var _3Dcube: ImageVector? = null
