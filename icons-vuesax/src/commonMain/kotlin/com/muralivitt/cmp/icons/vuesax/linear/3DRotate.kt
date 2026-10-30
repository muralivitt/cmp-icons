package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.`3DRotate`: ImageVector
    get() {
        if (_3DRotate != null) {
            return _3DRotate!!
        }
        _3DRotate = ImageVector.Builder(
            name = "3DRotate",
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
                moveTo(6.7f, 9.26f)
                lineTo(12f, 12.33f)
                lineTo(17.26f, 9.28f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17.77f)
                verticalLineTo(12.32f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.76f, 6.29f)
                lineTo(7.56f, 8.07f)
                curveTo(6.84f, 8.47f, 6.24f, 9.48f, 6.24f, 10.31f)
                verticalLineTo(13.7f)
                curveTo(6.24f, 14.53f, 6.83f, 15.54f, 7.56f, 15.94f)
                lineTo(10.76f, 17.72f)
                curveTo(11.44f, 18.1f, 12.56f, 18.1f, 13.25f, 17.72f)
                lineTo(16.45f, 15.94f)
                curveTo(17.17f, 15.54f, 17.77f, 14.53f, 17.77f, 13.7f)
                verticalLineTo(10.3f)
                curveTo(17.77f, 9.47f, 17.18f, 8.46f, 16.45f, 8.06f)
                lineTo(13.25f, 6.28f)
                curveTo(12.56f, 5.9f, 11.44f, 5.9f, 10.76f, 6.29f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 15f)
                curveTo(22f, 18.87f, 18.87f, 22f, 15f, 22f)
                lineTo(16.05f, 20.25f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9f)
                curveTo(2f, 5.13f, 5.13f, 2f, 9f, 2f)
                lineTo(7.95f, 3.75f)
            }
        }.build()

        return _3DRotate!!
    }

@Suppress("ObjectPropertyName")
private var _3DRotate: ImageVector? = null
