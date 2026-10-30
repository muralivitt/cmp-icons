package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.HeartTick: ImageVector
    get() {
        if (_HeartTick != null) {
            return _HeartTick!!
        }
        _HeartTick = ImageVector.Builder(
            name = "HeartTick",
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
                moveTo(22f, 17.2f)
                curveTo(22f, 18.1f, 21.75f, 18.95f, 21.3f, 19.67f)
                curveTo(20.47f, 21.06f, 18.95f, 22f, 17.2f, 22f)
                curveTo(15.45f, 22f, 13.92f, 21.06f, 13.1f, 19.67f)
                curveTo(12.66f, 18.95f, 12.4f, 18.1f, 12.4f, 17.2f)
                curveTo(12.4f, 14.55f, 14.55f, 12.4f, 17.2f, 12.4f)
                curveTo(19.85f, 12.4f, 22f, 14.55f, 22f, 17.2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.33f, 17.2f)
                lineTo(16.51f, 18.38f)
                lineTo(19.07f, 16.02f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8.69f)
                curveTo(22f, 10.66f, 21.49f, 12.4f, 20.69f, 13.91f)
                curveTo(19.81f, 12.98f, 18.57f, 12.4f, 17.2f, 12.4f)
                curveTo(14.55f, 12.4f, 12.4f, 14.55f, 12.4f, 17.2f)
                curveTo(12.4f, 18.43f, 12.87f, 19.55f, 13.63f, 20.4f)
                curveTo(13.26f, 20.57f, 12.92f, 20.71f, 12.62f, 20.81f)
                curveTo(12.28f, 20.93f, 11.72f, 20.93f, 11.38f, 20.81f)
                curveTo(8.48f, 19.82f, 2f, 15.69f, 2f, 8.69f)
                curveTo(2f, 5.6f, 4.49f, 3.1f, 7.56f, 3.1f)
                curveTo(9.37f, 3.1f, 10.99f, 3.98f, 12f, 5.33f)
                curveTo(13.01f, 3.98f, 14.63f, 3.1f, 16.44f, 3.1f)
                curveTo(19.51f, 3.1f, 22f, 5.6f, 22f, 8.69f)
                close()
            }
        }.build()

        return _HeartTick!!
    }

@Suppress("ObjectPropertyName")
private var _HeartTick: ImageVector? = null
