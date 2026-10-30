package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.SmsStar: ImageVector
    get() {
        if (_SmsStar != null) {
            return _SmsStar!!
        }
        _SmsStar = ImageVector.Builder(
            name = "SmsStar",
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
                moveTo(22f, 11.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 19f, 20f, 20.5f, 17f, 20.5f)
                horizontalLineTo(7f)
                curveTo(4f, 20.5f, 2f, 19f, 2f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2f, 5f, 4f, 3.5f, 7f, 3.5f)
                horizontalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                lineTo(10.13f, 11.5f)
                curveTo(11.16f, 12.32f, 12.85f, 12.32f, 13.88f, 11.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.48f, 2.82f)
                lineTo(19.76f, 3.39f)
                curveTo(19.9f, 3.67f, 20.25f, 3.93f, 20.56f, 3.99f)
                lineTo(20.94f, 4.05f)
                curveTo(22.08f, 4.24f, 22.35f, 5.08f, 21.53f, 5.91f)
                lineTo(21.18f, 6.26f)
                curveTo(20.95f, 6.5f, 20.82f, 6.96f, 20.89f, 7.28f)
                lineTo(20.94f, 7.49f)
                curveTo(21.25f, 8.87f, 20.52f, 9.4f, 19.32f, 8.68f)
                lineTo(19.06f, 8.53f)
                curveTo(18.75f, 8.35f, 18.25f, 8.35f, 17.94f, 8.53f)
                lineTo(17.68f, 8.68f)
                curveTo(16.47f, 9.41f, 15.74f, 8.87f, 16.06f, 7.49f)
                lineTo(16.11f, 7.28f)
                curveTo(16.18f, 6.96f, 16.05f, 6.5f, 15.82f, 6.26f)
                lineTo(15.47f, 5.91f)
                curveTo(14.65f, 5.08f, 14.92f, 4.24f, 16.06f, 4.05f)
                lineTo(16.44f, 3.99f)
                curveTo(16.74f, 3.94f, 17.1f, 3.67f, 17.24f, 3.39f)
                lineTo(17.52f, 2.82f)
                curveTo(18.06f, 1.73f, 18.94f, 1.73f, 19.48f, 2.82f)
                close()
            }
        }.build()

        return _SmsStar!!
    }

@Suppress("ObjectPropertyName")
private var _SmsStar: ImageVector? = null
