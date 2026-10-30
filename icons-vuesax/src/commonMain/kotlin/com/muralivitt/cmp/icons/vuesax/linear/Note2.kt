package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Note2: ImageVector
    get() {
        if (_Note2 != null) {
            return _Note2!!
        }
        _Note2 = ImageVector.Builder(
            name = "Note2",
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
                moveTo(21.66f, 10.44f)
                lineTo(20.68f, 14.62f)
                curveTo(19.84f, 18.23f, 18.18f, 19.69f, 15.06f, 19.39f)
                curveTo(14.56f, 19.35f, 14.02f, 19.26f, 13.44f, 19.12f)
                lineTo(11.76f, 18.72f)
                curveTo(7.59f, 17.73f, 6.3f, 15.67f, 7.28f, 11.49f)
                lineTo(8.26f, 7.3f)
                curveTo(8.46f, 6.45f, 8.7f, 5.71f, 9f, 5.1f)
                curveTo(10.17f, 2.68f, 12.16f, 2.03f, 15.5f, 2.82f)
                lineTo(17.17f, 3.21f)
                curveTo(21.36f, 4.19f, 22.64f, 6.26f, 21.66f, 10.44f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.06f, 19.39f)
                curveTo(14.44f, 19.81f, 13.66f, 20.16f, 12.71f, 20.47f)
                lineTo(11.13f, 20.99f)
                curveTo(7.16f, 22.27f, 5.07f, 21.2f, 3.78f, 17.23f)
                lineTo(2.5f, 13.28f)
                curveTo(1.22f, 9.31f, 2.28f, 7.21f, 6.25f, 5.93f)
                lineTo(7.83f, 5.41f)
                curveTo(8.24f, 5.28f, 8.63f, 5.17f, 9f, 5.1f)
                curveTo(8.7f, 5.71f, 8.46f, 6.45f, 8.26f, 7.3f)
                lineTo(7.28f, 11.49f)
                curveTo(6.3f, 15.67f, 7.59f, 17.73f, 11.76f, 18.72f)
                lineTo(13.44f, 19.12f)
                curveTo(14.02f, 19.26f, 14.56f, 19.35f, 15.06f, 19.39f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.64f, 8.53f)
                lineTo(17.49f, 9.76f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.66f, 12.4f)
                lineTo(14.56f, 13.14f)
            }
        }.build()

        return _Note2!!
    }

@Suppress("ObjectPropertyName")
private var _Note2: ImageVector? = null
