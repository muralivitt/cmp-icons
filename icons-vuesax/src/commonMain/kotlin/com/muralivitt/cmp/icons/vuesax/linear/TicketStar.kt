package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.TicketStar: ImageVector
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
                moveTo(16.995f, 4f)
                horizontalLineTo(6.995f)
                curveTo(3.165f, 4f, 2.095f, 4.92f, 2.005f, 8.5f)
                curveTo(3.935f, 8.5f, 5.495f, 10.07f, 5.495f, 12f)
                curveTo(5.495f, 13.93f, 3.935f, 15.49f, 2.005f, 15.5f)
                curveTo(2.095f, 19.08f, 3.165f, 20f, 6.995f, 20f)
                horizontalLineTo(16.995f)
                curveTo(20.995f, 20f, 21.995f, 19f, 21.995f, 15f)
                verticalLineTo(9f)
                curveTo(21.995f, 5f, 20.995f, 4f, 16.995f, 4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.993f, 4f)
                verticalLineTo(7.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.993f, 16.5f)
                verticalLineTo(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.025f, 9.33f)
                lineTo(15.645f, 10.58f)
                curveTo(15.705f, 10.7f, 15.825f, 10.79f, 15.955f, 10.81f)
                lineTo(17.335f, 11.01f)
                curveTo(17.675f, 11.06f, 17.815f, 11.48f, 17.565f, 11.72f)
                lineTo(16.565f, 12.69f)
                curveTo(16.465f, 12.78f, 16.425f, 12.92f, 16.445f, 13.06f)
                lineTo(16.685f, 14.43f)
                curveTo(16.745f, 14.77f, 16.385f, 15.03f, 16.085f, 14.87f)
                lineTo(14.855f, 14.22f)
                curveTo(14.735f, 14.16f, 14.585f, 14.16f, 14.465f, 14.22f)
                lineTo(13.235f, 14.87f)
                curveTo(12.925f, 15.03f, 12.575f, 14.77f, 12.635f, 14.43f)
                lineTo(12.875f, 13.06f)
                curveTo(12.895f, 12.92f, 12.855f, 12.79f, 12.755f, 12.69f)
                lineTo(11.765f, 11.72f)
                curveTo(11.515f, 11.48f, 11.655f, 11.06f, 11.995f, 11.01f)
                lineTo(13.375f, 10.81f)
                curveTo(13.515f, 10.79f, 13.625f, 10.71f, 13.685f, 10.58f)
                lineTo(14.295f, 9.33f)
                curveTo(14.435f, 9.02f, 14.875f, 9.02f, 15.025f, 9.33f)
                close()
            }
        }.build()

        return _TicketStar!!
    }

@Suppress("ObjectPropertyName")
private var _TicketStar: ImageVector? = null
