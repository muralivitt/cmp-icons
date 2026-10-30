package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Brush: ImageVector
    get() {
        if (_Brush != null) {
            return _Brush!!
        }
        _Brush = ImageVector.Builder(
            name = "Brush",
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
                moveTo(21.81f, 3.94f)
                curveTo(20.27f, 7.78f, 16.41f, 13f, 13.18f, 15.59f)
                lineTo(11.21f, 17.17f)
                curveTo(10.96f, 17.35f, 10.71f, 17.51f, 10.43f, 17.62f)
                curveTo(10.43f, 17.44f, 10.42f, 17.24f, 10.39f, 17.05f)
                curveTo(10.28f, 16.21f, 9.9f, 15.43f, 9.23f, 14.76f)
                curveTo(8.55f, 14.08f, 7.72f, 13.68f, 6.87f, 13.57f)
                curveTo(6.67f, 13.56f, 6.47f, 13.54f, 6.27f, 13.56f)
                curveTo(6.38f, 13.25f, 6.55f, 12.96f, 6.76f, 12.72f)
                lineTo(8.32f, 10.75f)
                curveTo(10.9f, 7.52f, 16.14f, 3.64f, 19.97f, 2.11f)
                curveTo(20.56f, 1.89f, 21.13f, 2.05f, 21.49f, 2.42f)
                curveTo(21.87f, 2.79f, 22.05f, 3.36f, 21.81f, 3.94f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.43f, 17.62f)
                curveTo(10.43f, 18.72f, 10.01f, 19.77f, 9.22f, 20.57f)
                curveTo(8.61f, 21.18f, 7.78f, 21.6f, 6.79f, 21.73f)
                lineTo(4.33f, 22f)
                curveTo(2.99f, 22.15f, 1.84f, 21.01f, 2f, 19.65f)
                lineTo(2.27f, 17.19f)
                curveTo(2.51f, 15f, 4.34f, 13.6f, 6.28f, 13.56f)
                curveTo(6.48f, 13.55f, 6.69f, 13.56f, 6.88f, 13.57f)
                curveTo(7.73f, 13.68f, 8.56f, 14.07f, 9.24f, 14.76f)
                curveTo(9.91f, 15.43f, 10.29f, 16.21f, 10.4f, 17.05f)
                curveTo(10.41f, 17.24f, 10.43f, 17.43f, 10.43f, 17.62f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.24f, 14.47f)
                curveTo(14.24f, 11.86f, 12.12f, 9.74f, 9.51f, 9.74f)
            }
        }.build()

        return _Brush!!
    }

@Suppress("ObjectPropertyName")
private var _Brush: ImageVector? = null
