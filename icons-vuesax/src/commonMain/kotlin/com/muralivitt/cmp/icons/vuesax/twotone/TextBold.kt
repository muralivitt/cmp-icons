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

val VuesaxIconsTwotone.TextBold: ImageVector
    get() {
        if (_TextBold != null) {
            return _TextBold!!
        }
        _TextBold = ImageVector.Builder(
            name = "TextBold",
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
                moveTo(4.881f, 4.5f)
                curveTo(4.881f, 3.4f, 5.781f, 2.5f, 6.881f, 2.5f)
                horizontalLineTo(12.001f)
                curveTo(14.621f, 2.5f, 16.751f, 4.63f, 16.751f, 7.25f)
                curveTo(16.751f, 9.87f, 14.621f, 12f, 12.001f, 12f)
                horizontalLineTo(4.881f)
                verticalLineTo(4.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.881f, 12f)
                horizontalLineTo(14.381f)
                curveTo(17.001f, 12f, 19.131f, 14.13f, 19.131f, 16.75f)
                curveTo(19.131f, 19.37f, 17.001f, 21.5f, 14.381f, 21.5f)
                horizontalLineTo(6.881f)
                curveTo(5.781f, 21.5f, 4.881f, 20.6f, 4.881f, 19.5f)
                verticalLineTo(12f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _TextBold!!
    }

@Suppress("ObjectPropertyName")
private var _TextBold: ImageVector? = null
