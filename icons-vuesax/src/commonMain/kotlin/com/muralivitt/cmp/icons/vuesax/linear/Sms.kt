package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Sms: ImageVector
    get() {
        if (_Sms != null) {
            return _Sms!!
        }
        _Sms = ImageVector.Builder(
            name = "Sms",
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
                moveTo(17f, 20.5f)
                horizontalLineTo(7f)
                curveTo(4f, 20.5f, 2f, 19f, 2f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2f, 5f, 4f, 3.5f, 7f, 3.5f)
                horizontalLineTo(17f)
                curveTo(20f, 3.5f, 22f, 5f, 22f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 19f, 20f, 20.5f, 17f, 20.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 9f)
                lineTo(13.87f, 11.5f)
                curveTo(12.84f, 12.32f, 11.15f, 12.32f, 10.12f, 11.5f)
                lineTo(7f, 9f)
            }
        }.build()

        return _Sms!!
    }

@Suppress("ObjectPropertyName")
private var _Sms: ImageVector? = null
