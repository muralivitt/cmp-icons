package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.SmsEdit: ImageVector
    get() {
        if (_SmsEdit != null) {
            return _SmsEdit!!
        }
        _SmsEdit = ImageVector.Builder(
            name = "SmsEdit",
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
                moveTo(12f, 20.5f)
                horizontalLineTo(7f)
                curveTo(4f, 20.5f, 2f, 19f, 2f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2f, 5f, 4f, 3.5f, 7f, 3.5f)
                horizontalLineTo(17f)
                curveTo(20f, 3.5f, 22f, 5f, 22f, 8.5f)
                verticalLineTo(11.5f)
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
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.21f, 14.77f)
                lineTo(15.67f, 18.31f)
                curveTo(15.53f, 18.45f, 15.4f, 18.71f, 15.37f, 18.9f)
                lineTo(15.18f, 20.25f)
                curveTo(15.11f, 20.74f, 15.45f, 21.08f, 15.94f, 21.01f)
                lineTo(17.29f, 20.82f)
                curveTo(17.48f, 20.79f, 17.75f, 20.66f, 17.88f, 20.52f)
                lineTo(21.42f, 16.98f)
                curveTo(22.03f, 16.37f, 22.32f, 15.66f, 21.42f, 14.76f)
                curveTo(20.53f, 13.87f, 19.82f, 14.16f, 19.21f, 14.77f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.7f, 15.28f)
                curveTo(19f, 16.36f, 19.84f, 17.2f, 20.92f, 17.5f)
            }
        }.build()

        return _SmsEdit!!
    }

@Suppress("ObjectPropertyName")
private var _SmsEdit: ImageVector? = null
