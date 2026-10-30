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

val VuesaxIconsTwotone.SmsNotification: ImageVector
    get() {
        if (_SmsNotification != null) {
            return _SmsNotification!!
        }
        _SmsNotification = ImageVector.Builder(
            name = "SmsNotification",
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
                moveTo(22f, 10.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 19f, 20f, 20.5f, 17f, 20.5f)
                horizontalLineTo(7f)
                curveTo(4f, 20.5f, 2f, 19f, 2f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2f, 5f, 4f, 3.5f, 7f, 3.5f)
                horizontalLineTo(14f)
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
                lineTo(15.06f, 10.56f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.5f, 8f)
                curveTo(20.881f, 8f, 22f, 6.881f, 22f, 5.5f)
                curveTo(22f, 4.119f, 20.881f, 3f, 19.5f, 3f)
                curveTo(18.119f, 3f, 17f, 4.119f, 17f, 5.5f)
                curveTo(17f, 6.881f, 18.119f, 8f, 19.5f, 8f)
                close()
            }
        }.build()

        return _SmsNotification!!
    }

@Suppress("ObjectPropertyName")
private var _SmsNotification: ImageVector? = null
