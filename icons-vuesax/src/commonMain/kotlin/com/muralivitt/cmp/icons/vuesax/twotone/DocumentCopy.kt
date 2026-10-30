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

val VuesaxIconsTwotone.DocumentCopy: ImageVector
    get() {
        if (_DocumentCopy != null) {
            return _DocumentCopy!!
        }
        _DocumentCopy = ImageVector.Builder(
            name = "DocumentCopy",
            defaultWidth = 22.dp,
            defaultHeight = 22.dp,
            viewportWidth = 22f,
            viewportHeight = 22f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12.4f)
                verticalLineTo(15.4f)
                curveTo(16f, 19.4f, 14.4f, 21f, 10.4f, 21f)
                horizontalLineTo(6.6f)
                curveTo(2.6f, 21f, 1f, 19.4f, 1f, 15.4f)
                verticalLineTo(11.6f)
                curveTo(1f, 7.6f, 2.6f, 6f, 6.6f, 6f)
                horizontalLineTo(9.6f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 12.4f)
                horizontalLineTo(12.8f)
                curveTo(10.4f, 12.4f, 9.6f, 11.6f, 9.6f, 9.2f)
                verticalLineTo(6f)
                lineTo(16f, 12.4f)
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
                moveTo(6f, 4f)
                curveTo(6f, 2.34f, 7.34f, 1f, 9f, 1f)
                horizontalLineTo(15f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 7f)
                verticalLineTo(13.19f)
                curveTo(21f, 14.74f, 19.74f, 16f, 18.19f, 16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 7f)
                horizontalLineTo(18f)
                curveTo(15.75f, 7f, 15f, 6.25f, 15f, 4f)
                verticalLineTo(1f)
                lineTo(21f, 7f)
                close()
            }
        }.build()

        return _DocumentCopy!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCopy: ImageVector? = null
