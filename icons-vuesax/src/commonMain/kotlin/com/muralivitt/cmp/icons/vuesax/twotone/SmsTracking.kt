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

val VuesaxIconsTwotone.SmsTracking: ImageVector
    get() {
        if (_SmsTracking != null) {
            return _SmsTracking!!
        }
        _SmsTracking = ImageVector.Builder(
            name = "SmsTracking",
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
                moveTo(2f, 8.5f)
                curveTo(2f, 5f, 4f, 3.5f, 7f, 3.5f)
                horizontalLineTo(17f)
                curveTo(20f, 3.5f, 22f, 5f, 22f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 19f, 20f, 20.5f, 17f, 20.5f)
                horizontalLineTo(7f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 9f)
                lineTo(13.87f, 11.5f)
                curveTo(12.84f, 12.32f, 11.15f, 12.32f, 10.12f, 11.5f)
                lineTo(7f, 9f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 16.5f)
                horizontalLineTo(8f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 12.5f)
                horizontalLineTo(5f)
            }
        }.build()

        return _SmsTracking!!
    }

@Suppress("ObjectPropertyName")
private var _SmsTracking: ImageVector? = null
