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

val VuesaxIconsTwotone.TicketStar: ImageVector
    get() {
        if (_TicketStar != null) {
            return _TicketStar!!
        }
        _TicketStar = ImageVector.Builder(
            name = "TicketStar",
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
                moveTo(16.996f, 4f)
                horizontalLineTo(6.996f)
                curveTo(3.166f, 4f, 2.096f, 4.92f, 2.006f, 8.5f)
                curveTo(3.936f, 8.5f, 5.496f, 10.07f, 5.496f, 12f)
                curveTo(5.496f, 13.93f, 3.936f, 15.49f, 2.006f, 15.5f)
                curveTo(2.096f, 19.08f, 3.166f, 20f, 6.996f, 20f)
                horizontalLineTo(16.996f)
                curveTo(20.996f, 20f, 21.996f, 19f, 21.996f, 15f)
                verticalLineTo(9f)
                curveTo(21.996f, 5f, 20.996f, 4f, 16.996f, 4f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.994f, 4f)
                verticalLineTo(7.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.994f, 16.5f)
                verticalLineTo(20f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.024f, 9.33f)
                lineTo(15.644f, 10.58f)
                curveTo(15.704f, 10.7f, 15.824f, 10.79f, 15.954f, 10.81f)
                lineTo(17.334f, 11.01f)
                curveTo(17.674f, 11.06f, 17.814f, 11.48f, 17.564f, 11.72f)
                lineTo(16.564f, 12.69f)
                curveTo(16.464f, 12.78f, 16.424f, 12.92f, 16.444f, 13.06f)
                lineTo(16.684f, 14.43f)
                curveTo(16.744f, 14.77f, 16.384f, 15.03f, 16.084f, 14.87f)
                lineTo(14.854f, 14.22f)
                curveTo(14.734f, 14.16f, 14.584f, 14.16f, 14.464f, 14.22f)
                lineTo(13.234f, 14.87f)
                curveTo(12.924f, 15.03f, 12.574f, 14.77f, 12.634f, 14.43f)
                lineTo(12.874f, 13.06f)
                curveTo(12.894f, 12.92f, 12.854f, 12.79f, 12.754f, 12.69f)
                lineTo(11.764f, 11.72f)
                curveTo(11.514f, 11.48f, 11.654f, 11.06f, 11.994f, 11.01f)
                lineTo(13.374f, 10.81f)
                curveTo(13.514f, 10.79f, 13.624f, 10.71f, 13.684f, 10.58f)
                lineTo(14.294f, 9.33f)
                curveTo(14.434f, 9.02f, 14.874f, 9.02f, 15.024f, 9.33f)
                close()
            }
        }.build()

        return _TicketStar!!
    }

@Suppress("ObjectPropertyName")
private var _TicketStar: ImageVector? = null
