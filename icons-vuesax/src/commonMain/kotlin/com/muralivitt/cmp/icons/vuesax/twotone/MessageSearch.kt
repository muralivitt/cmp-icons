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

val VuesaxIconsTwotone.MessageSearch: ImageVector
    get() {
        if (_MessageSearch != null) {
            return _MessageSearch!!
        }
        _MessageSearch = ImageVector.Builder(
            name = "MessageSearch",
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
                moveTo(13.2f, 21.37f)
                curveTo(12.54f, 22.25f, 11.46f, 22.25f, 10.8f, 21.37f)
                lineTo(9.3f, 19.37f)
                curveTo(9.13f, 19.15f, 8.77f, 18.97f, 8.5f, 18.97f)
                horizontalLineTo(8f)
                curveTo(4f, 18.97f, 2f, 17.97f, 2f, 12.97f)
                verticalLineTo(7.97f)
                curveTo(2f, 3.97f, 4f, 1.97f, 8f, 1.97f)
                horizontalLineTo(16f)
                curveTo(20f, 1.97f, 22f, 3.97f, 22f, 7.97f)
                verticalLineTo(12.97f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.2f, 21.4f)
                curveTo(19.967f, 21.4f, 21.4f, 19.967f, 21.4f, 18.2f)
                curveTo(21.4f, 16.433f, 19.967f, 15f, 18.2f, 15f)
                curveTo(16.433f, 15f, 15f, 16.433f, 15f, 18.2f)
                curveTo(15f, 19.967f, 16.433f, 21.4f, 18.2f, 21.4f)
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
                moveTo(22f, 22f)
                lineTo(21f, 21f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.997f, 11f)
                horizontalLineTo(16.005f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.995f, 11f)
                horizontalLineTo(12.003f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.995f, 11f)
                horizontalLineTo(8.003f)
            }
        }.build()

        return _MessageSearch!!
    }

@Suppress("ObjectPropertyName")
private var _MessageSearch: ImageVector? = null
