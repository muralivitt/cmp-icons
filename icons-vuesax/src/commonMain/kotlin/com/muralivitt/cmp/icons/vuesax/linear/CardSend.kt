package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.CardSend: ImageVector
    get() {
        if (_CardSend != null) {
            return _CardSend!!
        }
        _CardSend = ImageVector.Builder(
            name = "CardSend",
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
                horizontalLineTo(14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16.5f)
                horizontalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 16.5f)
                horizontalLineTo(14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 14.03f)
                verticalLineTo(16.11f)
                curveTo(22f, 19.62f, 21.11f, 20.5f, 17.56f, 20.5f)
                horizontalLineTo(6.44f)
                curveTo(2.89f, 20.5f, 2f, 19.62f, 2f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(2f, 4.38f, 2.89f, 3.5f, 6.44f, 3.5f)
                horizontalLineTo(14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 9.5f)
                verticalLineTo(3.5f)
                lineTo(22f, 5.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 3.5f)
                lineTo(18f, 5.5f)
            }
        }.build()

        return _CardSend!!
    }

@Suppress("ObjectPropertyName")
private var _CardSend: ImageVector? = null
