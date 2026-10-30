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

val VuesaxIconsTwotone.Scanning: ImageVector
    get() {
        if (_Scanning != null) {
            return _Scanning!!
        }
        _Scanning = ImageVector.Builder(
            name = "Scanning",
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
                moveTo(2f, 9f)
                verticalLineTo(6.5f)
                curveTo(2f, 4.01f, 4.01f, 2f, 6.5f, 2f)
                horizontalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
                horizontalLineTo(17.5f)
                curveTo(19.99f, 2f, 22f, 4.01f, 22f, 6.5f)
                verticalLineTo(9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 16f)
                verticalLineTo(17.5f)
                curveTo(22f, 19.99f, 19.99f, 22f, 17.5f, 22f)
                horizontalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 22f)
                horizontalLineTo(6.5f)
                curveTo(4.01f, 22f, 2f, 19.99f, 2f, 17.5f)
                verticalLineTo(15f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 11f)
                curveTo(9.881f, 11f, 11f, 9.881f, 11f, 8.5f)
                curveTo(11f, 7.119f, 9.881f, 6f, 8.5f, 6f)
                curveTo(7.119f, 6f, 6f, 7.119f, 6f, 8.5f)
                curveTo(6f, 9.881f, 7.119f, 11f, 8.5f, 11f)
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
                moveTo(7.5f, 18f)
                curveTo(8.328f, 18f, 9f, 17.328f, 9f, 16.5f)
                curveTo(9f, 15.672f, 8.328f, 15f, 7.5f, 15f)
                curveTo(6.672f, 15f, 6f, 15.672f, 6f, 16.5f)
                curveTo(6f, 17.328f, 6.672f, 18f, 7.5f, 18f)
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
                moveTo(16.5f, 9f)
                curveTo(17.328f, 9f, 18f, 8.328f, 18f, 7.5f)
                curveTo(18f, 6.672f, 17.328f, 6f, 16.5f, 6f)
                curveTo(15.672f, 6f, 15f, 6.672f, 15f, 7.5f)
                curveTo(15f, 8.328f, 15.672f, 9f, 16.5f, 9f)
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
                moveTo(15.5f, 18f)
                curveTo(16.881f, 18f, 18f, 16.881f, 18f, 15.5f)
                curveTo(18f, 14.119f, 16.881f, 13f, 15.5f, 13f)
                curveTo(14.119f, 13f, 13f, 14.119f, 13f, 15.5f)
                curveTo(13f, 16.881f, 14.119f, 18f, 15.5f, 18f)
                close()
            }
        }.build()

        return _Scanning!!
    }

@Suppress("ObjectPropertyName")
private var _Scanning: ImageVector? = null
