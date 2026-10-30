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

val VuesaxIconsTwotone.MessageText1: ImageVector
    get() {
        if (_MessageText1 != null) {
            return _MessageText1!!
        }
        _MessageText1 = ImageVector.Builder(
            name = "MessageText1",
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
                moveTo(8.5f, 19f)
                horizontalLineTo(8f)
                curveTo(4f, 19f, 2f, 18f, 2f, 13f)
                verticalLineTo(8f)
                curveTo(2f, 4f, 4f, 2f, 8f, 2f)
                horizontalLineTo(16f)
                curveTo(20f, 2f, 22f, 4f, 22f, 8f)
                verticalLineTo(13f)
                curveTo(22f, 17f, 20f, 19f, 16f, 19f)
                horizontalLineTo(15.5f)
                curveTo(15.19f, 19f, 14.89f, 19.15f, 14.7f, 19.4f)
                lineTo(13.2f, 21.4f)
                curveTo(12.54f, 22.28f, 11.46f, 22.28f, 10.8f, 21.4f)
                lineTo(9.3f, 19.4f)
                curveTo(9.14f, 19.18f, 8.77f, 19f, 8.5f, 19f)
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
                moveTo(7f, 8f)
                horizontalLineTo(17f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 13f)
                horizontalLineTo(13f)
            }
        }.build()

        return _MessageText1!!
    }

@Suppress("ObjectPropertyName")
private var _MessageText1: ImageVector? = null
