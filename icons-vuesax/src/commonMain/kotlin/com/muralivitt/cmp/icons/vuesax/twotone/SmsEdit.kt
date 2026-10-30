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

val VuesaxIconsTwotone.SmsEdit: ImageVector
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
                moveTo(19.209f, 14.77f)
                lineTo(15.669f, 18.31f)
                curveTo(15.529f, 18.45f, 15.399f, 18.71f, 15.369f, 18.9f)
                lineTo(15.179f, 20.25f)
                curveTo(15.109f, 20.74f, 15.449f, 21.08f, 15.939f, 21.01f)
                lineTo(17.289f, 20.82f)
                curveTo(17.479f, 20.79f, 17.749f, 20.66f, 17.879f, 20.52f)
                lineTo(21.419f, 16.98f)
                curveTo(22.029f, 16.37f, 22.319f, 15.66f, 21.419f, 14.76f)
                curveTo(20.529f, 13.87f, 19.819f, 14.16f, 19.209f, 14.77f)
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
                moveTo(18.699f, 15.28f)
                curveTo(18.999f, 16.36f, 19.839f, 17.2f, 20.919f, 17.5f)
            }
        }.build()

        return _SmsEdit!!
    }

@Suppress("ObjectPropertyName")
private var _SmsEdit: ImageVector? = null
