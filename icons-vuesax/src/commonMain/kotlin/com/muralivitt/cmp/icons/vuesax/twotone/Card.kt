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

val VuesaxIconsTwotone.Card: ImageVector
    get() {
        if (_Card != null) {
            return _Card!!
        }
        _Card = ImageVector.Builder(
            name = "Card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 8.505f)
                horizontalLineTo(22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 16.505f)
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
                moveTo(10.5f, 16.505f)
                horizontalLineTo(14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.44f, 3.505f)
                horizontalLineTo(17.55f)
                curveTo(21.11f, 3.505f, 22f, 4.385f, 22f, 7.895f)
                verticalLineTo(16.105f)
                curveTo(22f, 19.615f, 21.11f, 20.495f, 17.56f, 20.495f)
                horizontalLineTo(6.44f)
                curveTo(2.89f, 20.505f, 2f, 19.625f, 2f, 16.115f)
                verticalLineTo(7.895f)
                curveTo(2f, 4.385f, 2.89f, 3.505f, 6.44f, 3.505f)
                close()
            }
        }.build()

        return _Card!!
    }

@Suppress("ObjectPropertyName")
private var _Card: ImageVector? = null
