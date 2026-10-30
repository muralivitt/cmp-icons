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

val VuesaxIconsTwotone.MessageProgramming: ImageVector
    get() {
        if (_MessageProgramming != null) {
            return _MessageProgramming!!
        }
        _MessageProgramming = ImageVector.Builder(
            name = "MessageProgramming",
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
                moveTo(8.5f, 18.97f)
                horizontalLineTo(8f)
                curveTo(4f, 18.97f, 2f, 17.97f, 2f, 12.97f)
                verticalLineTo(7.97f)
                curveTo(2f, 3.97f, 4f, 1.97f, 8f, 1.97f)
                horizontalLineTo(16f)
                curveTo(20f, 1.97f, 22f, 3.97f, 22f, 7.97f)
                verticalLineTo(12.97f)
                curveTo(22f, 16.97f, 20f, 18.97f, 16f, 18.97f)
                horizontalLineTo(15.5f)
                curveTo(15.19f, 18.97f, 14.89f, 19.12f, 14.7f, 19.37f)
                lineTo(13.2f, 21.37f)
                curveTo(12.54f, 22.25f, 11.46f, 22.25f, 10.8f, 21.37f)
                lineTo(9.3f, 19.37f)
                curveTo(9.14f, 19.15f, 8.78f, 18.97f, 8.5f, 18.97f)
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
                moveTo(8f, 8.7f)
                lineTo(6f, 10.7f)
                lineTo(8f, 12.7f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8.7f)
                lineTo(18f, 10.7f)
                lineTo(16f, 12.7f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 8.37f)
                lineTo(11f, 13.03f)
            }
        }.build()

        return _MessageProgramming!!
    }

@Suppress("ObjectPropertyName")
private var _MessageProgramming: ImageVector? = null
