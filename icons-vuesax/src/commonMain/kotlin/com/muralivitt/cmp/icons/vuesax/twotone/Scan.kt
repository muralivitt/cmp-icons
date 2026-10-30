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

val VuesaxIconsTwotone.Scan: ImageVector
    get() {
        if (_Scan != null) {
            return _Scan!!
        }
        _Scan = ImageVector.Builder(
            name = "Scan",
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
                moveTo(17f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(17f, 16.5f, 16f, 17.5f, 14f, 17.5f)
                horizontalLineTo(10f)
                curveTo(8f, 17.5f, 7f, 16.5f, 7f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(7f, 7.5f, 8f, 6.5f, 10f, 6.5f)
                horizontalLineTo(14f)
                curveTo(16f, 6.5f, 17f, 7.5f, 17f, 9.5f)
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
                moveTo(19f, 12f)
                horizontalLineTo(5f)
            }
        }.build()

        return _Scan!!
    }

@Suppress("ObjectPropertyName")
private var _Scan: ImageVector? = null
