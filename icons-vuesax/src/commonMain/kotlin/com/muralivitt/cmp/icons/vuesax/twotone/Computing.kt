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

val VuesaxIconsTwotone.Computing: ImageVector
    get() {
        if (_Computing != null) {
            return _Computing!!
        }
        _Computing = ImageVector.Builder(
            name = "Computing",
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
                moveTo(21.971f, 15f)
                verticalLineTo(9f)
                curveTo(21.971f, 4f, 19.971f, 2f, 14.971f, 2f)
                horizontalLineTo(8.971f)
                curveTo(3.971f, 2f, 1.971f, 4f, 1.971f, 9f)
                verticalLineTo(15f)
                curveTo(1.971f, 20f, 3.971f, 22f, 8.971f, 22f)
                horizontalLineTo(14.971f)
                curveTo(19.971f, 22f, 21.971f, 20f, 21.971f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.719f, 3.25f)
                lineTo(3.27f, 19.7f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.06f, 18f)
                verticalLineTo(13f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.5f, 15.5f)
                horizontalLineTo(13.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 7.5f)
                horizontalLineTo(5.5f)
            }
        }.build()

        return _Computing!!
    }

@Suppress("ObjectPropertyName")
private var _Computing: ImageVector? = null
