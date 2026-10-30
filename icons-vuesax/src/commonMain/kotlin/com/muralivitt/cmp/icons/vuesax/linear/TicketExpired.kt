package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.TicketExpired: ImageVector
    get() {
        if (_TicketExpired != null) {
            return _TicketExpired!!
        }
        _TicketExpired = ImageVector.Builder(
            name = "TicketExpired",
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
                moveTo(10.902f, 19.87f)
                horizontalLineTo(17.372f)
                curveTo(21.072f, 19.87f, 21.992f, 18.95f, 21.992f, 15.25f)
                curveTo(20.712f, 15.25f, 19.682f, 14.21f, 19.682f, 12.94f)
                curveTo(19.682f, 11.66f, 20.712f, 10.62f, 21.992f, 10.62f)
                verticalLineTo(9.7f)
                curveTo(21.992f, 6f, 21.072f, 5.08f, 17.372f, 5.08f)
                horizontalLineTo(10.992f)
                verticalLineTo(11.87f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.994f, 16.87f)
                verticalLineTo(19.87f)
                horizontalLineTo(8.224f)
                curveTo(6.744f, 19.87f, 5.874f, 18.86f, 4.914f, 16.54f)
                lineTo(4.734f, 16.09f)
                curveTo(5.944f, 15.61f, 6.534f, 14.21f, 6.024f, 13f)
                curveTo(5.534f, 11.79f, 4.144f, 11.21f, 2.924f, 11.71f)
                lineTo(2.754f, 11.28f)
                curveTo(1.314f, 7.76f, 1.814f, 6.53f, 5.334f, 5.08f)
                lineTo(7.974f, 4f)
                lineTo(10.994f, 11.32f)
                verticalLineTo(13.87f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.162f, 19.87f)
                horizontalLineTo(7.992f)
            }
        }.build()

        return _TicketExpired!!
    }

@Suppress("ObjectPropertyName")
private var _TicketExpired: ImageVector? = null
