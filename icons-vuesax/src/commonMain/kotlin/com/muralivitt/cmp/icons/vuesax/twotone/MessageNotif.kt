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

val VuesaxIconsTwotone.MessageNotif: ImageVector
    get() {
        if (_MessageNotif != null) {
            return _MessageNotif!!
        }
        _MessageNotif = ImageVector.Builder(
            name = "MessageNotif",
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
                moveTo(22f, 10f)
                verticalLineTo(13f)
                curveTo(22f, 17f, 20f, 19f, 16f, 19f)
                horizontalLineTo(15.5f)
                curveTo(15.19f, 19f, 14.89f, 19.15f, 14.7f, 19.4f)
                lineTo(13.2f, 21.4f)
                curveTo(12.54f, 22.28f, 11.46f, 22.28f, 10.8f, 21.4f)
                lineTo(9.3f, 19.4f)
                curveTo(9.14f, 19.18f, 8.77f, 19f, 8.5f, 19f)
                horizontalLineTo(8f)
                curveTo(4f, 19f, 2f, 18f, 2f, 13f)
                verticalLineTo(8f)
                curveTo(2f, 4f, 4f, 2f, 8f, 2f)
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
                moveTo(19.5f, 7f)
                curveTo(20.881f, 7f, 22f, 5.881f, 22f, 4.5f)
                curveTo(22f, 3.119f, 20.881f, 2f, 19.5f, 2f)
                curveTo(18.119f, 2f, 17f, 3.119f, 17f, 4.5f)
                curveTo(17f, 5.881f, 18.119f, 7f, 19.5f, 7f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.997f, 11f)
                horizontalLineTo(16.005f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.995f, 11f)
                horizontalLineTo(12.003f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.995f, 11f)
                horizontalLineTo(8.003f)
            }
        }.build()

        return _MessageNotif!!
    }

@Suppress("ObjectPropertyName")
private var _MessageNotif: ImageVector? = null
