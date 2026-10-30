package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Forward15Seconds: ImageVector
    get() {
        if (_Forward15Seconds != null) {
            return _Forward15Seconds!!
        }
        _Forward15Seconds = ImageVector.Builder(
            name = "Forward15Seconds",
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
                moveTo(15.96f, 10.83f)
                horizontalLineTo(12.9f)
                lineTo(12.14f, 13.12f)
                horizontalLineTo(14.43f)
                curveTo(15.27f, 13.12f, 15.96f, 13.8f, 15.96f, 14.65f)
                curveTo(15.96f, 15.49f, 15.28f, 16.18f, 14.43f, 16.18f)
                horizontalLineTo(12.14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.54f, 16.17f)
                verticalLineTo(10.83f)
                lineTo(8.04f, 12.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.98f, 4.47f)
                lineTo(12f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.09f, 7.8f)
                curveTo(20.2f, 9.28f, 20.89f, 11.11f, 20.89f, 13.11f)
                curveTo(20.89f, 18.02f, 16.91f, 22f, 12f, 22f)
                curveTo(7.09f, 22f, 3.11f, 18.02f, 3.11f, 13.11f)
                curveTo(3.11f, 8.2f, 7.09f, 4.22f, 12f, 4.22f)
                curveTo(12.68f, 4.22f, 13.34f, 4.31f, 13.98f, 4.46f)
            }
        }.build()

        return _Forward15Seconds!!
    }

@Suppress("ObjectPropertyName")
private var _Forward15Seconds: ImageVector? = null
