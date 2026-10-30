package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BoxTick: ImageVector
    get() {
        if (_BoxTick != null) {
            return _BoxTick!!
        }
        _BoxTick = ImageVector.Builder(
            name = "BoxTick",
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
                moveTo(23f, 17.91f)
                curveTo(23.02f, 18.66f, 22.82f, 19.37f, 22.46f, 19.98f)
                curveTo(22.26f, 20.34f, 21.99f, 20.67f, 21.69f, 20.94f)
                curveTo(21f, 21.58f, 20.09f, 21.97f, 19.08f, 22f)
                curveTo(17.62f, 22.03f, 16.33f, 21.28f, 15.62f, 20.13f)
                curveTo(15.24f, 19.54f, 15.01f, 18.83f, 15f, 18.08f)
                curveTo(14.97f, 16.82f, 15.53f, 15.68f, 16.43f, 14.93f)
                curveTo(17.11f, 14.37f, 17.97f, 14.02f, 18.91f, 14f)
                curveTo(21.12f, 13.95f, 22.95f, 15.7f, 23f, 17.91f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.44f, 18.03f)
                lineTo(18.45f, 18.99f)
                lineTo(20.54f, 16.97f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.17f, 7.44f)
                lineTo(12f, 12.55f)
                lineTo(20.77f, 7.47f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21.61f)
                verticalLineTo(12.54f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.61f, 9.17f)
                verticalLineTo(14.83f)
                curveTo(21.61f, 14.88f, 21.61f, 14.92f, 21.6f, 14.97f)
                curveTo(20.9f, 14.36f, 20f, 14f, 19f, 14f)
                curveTo(18.06f, 14f, 17.19f, 14.33f, 16.5f, 14.88f)
                curveTo(15.58f, 15.61f, 15f, 16.74f, 15f, 18f)
                curveTo(15f, 18.75f, 15.21f, 19.46f, 15.58f, 20.06f)
                curveTo(15.67f, 20.22f, 15.78f, 20.37f, 15.9f, 20.51f)
                lineTo(14.07f, 21.52f)
                curveTo(12.93f, 22.16f, 11.07f, 22.16f, 9.93f, 21.52f)
                lineTo(4.59f, 18.56f)
                curveTo(3.38f, 17.89f, 2.39f, 16.21f, 2.39f, 14.83f)
                verticalLineTo(9.17f)
                curveTo(2.39f, 7.79f, 3.38f, 6.11f, 4.59f, 5.44f)
                lineTo(9.93f, 2.48f)
                curveTo(11.07f, 1.84f, 12.93f, 1.84f, 14.07f, 2.48f)
                lineTo(19.41f, 5.44f)
                curveTo(20.62f, 6.11f, 21.61f, 7.79f, 21.61f, 9.17f)
                close()
            }
        }.build()

        return _BoxTick!!
    }

@Suppress("ObjectPropertyName")
private var _BoxTick: ImageVector? = null
