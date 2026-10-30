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

val VuesaxIconsTwotone.DirectNotification: ImageVector
    get() {
        if (_DirectNotification != null) {
            return _DirectNotification!!
        }
        _DirectNotification = ImageVector.Builder(
            name = "DirectNotification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1.98f, 13f)
                horizontalLineTo(5.77f)
                curveTo(6.53f, 13f, 7.22f, 13.43f, 7.56f, 14.11f)
                lineTo(8.45f, 15.9f)
                curveTo(9f, 17f, 10f, 17f, 10.241f, 17f)
                horizontalLineTo(13.771f)
                curveTo(14.531f, 17f, 15.22f, 16.57f, 15.561f, 15.89f)
                lineTo(16.451f, 14.1f)
                curveTo(16.791f, 13.42f, 17.48f, 12.99f, 18.24f, 12.99f)
                horizontalLineTo(21.98f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 8f)
                curveTo(20.657f, 8f, 22f, 6.657f, 22f, 5f)
                curveTo(22f, 3.343f, 20.657f, 2f, 19f, 2f)
                curveTo(17.343f, 2f, 16f, 3.343f, 16f, 5f)
                curveTo(16f, 6.657f, 17.343f, 8f, 19f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(10f)
            }
        }.build()

        return _DirectNotification!!
    }

@Suppress("ObjectPropertyName")
private var _DirectNotification: ImageVector? = null
