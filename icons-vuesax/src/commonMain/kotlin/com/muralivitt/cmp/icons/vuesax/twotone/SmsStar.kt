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

val VuesaxIconsTwotone.SmsStar: ImageVector
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                lineTo(10.13f, 11.5f)
                curveTo(11.16f, 12.32f, 12.85f, 12.32f, 13.88f, 11.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.479f, 2.82f)
                lineTo(19.759f, 3.39f)
                curveTo(19.899f, 3.67f, 20.249f, 3.93f, 20.559f, 3.99f)
                lineTo(20.939f, 4.05f)
                curveTo(22.079f, 4.24f, 22.349f, 5.08f, 21.529f, 5.91f)
                lineTo(21.179f, 6.26f)
                curveTo(20.949f, 6.5f, 20.819f, 6.96f, 20.889f, 7.28f)
                lineTo(20.939f, 7.49f)
                curveTo(21.249f, 8.87f, 20.519f, 9.4f, 19.319f, 8.68f)
                lineTo(19.059f, 8.53f)
                curveTo(18.749f, 8.35f, 18.249f, 8.35f, 17.939f, 8.53f)
                lineTo(17.679f, 8.68f)
                curveTo(16.469f, 9.41f, 15.739f, 8.87f, 16.059f, 7.49f)
                lineTo(16.109f, 7.28f)
                curveTo(16.179f, 6.96f, 16.049f, 6.5f, 15.819f, 6.26f)
                lineTo(15.469f, 5.91f)
                curveTo(14.649f, 5.08f, 14.919f, 4.24f, 16.059f, 4.05f)
                lineTo(16.439f, 3.99f)
                curveTo(16.739f, 3.94f, 17.099f, 3.67f, 17.239f, 3.39f)
                lineTo(17.519f, 2.82f)
                curveTo(18.059f, 1.73f, 18.939f, 1.73f, 19.479f, 2.82f)
                close()
            }
        }.build()

        return _SmsStar!!
    }

@Suppress("ObjectPropertyName")
private var _SmsStar: ImageVector? = null
