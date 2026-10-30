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

val VuesaxIconsTwotone.Flash: ImageVector
    get() {
        if (_Flash != null) {
            return _Flash!!
        }
        _Flash = ImageVector.Builder(
            name = "Flash",
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
                moveTo(9.32f, 13.28f)
                horizontalLineTo(12.41f)
                verticalLineTo(20.48f)
                curveTo(12.41f, 21.54f, 13.73f, 22.04f, 14.43f, 21.24f)
                lineTo(22f, 12.64f)
                curveTo(22.66f, 11.89f, 22.13f, 10.72f, 21.13f, 10.72f)
                horizontalLineTo(18.04f)
                verticalLineTo(3.52f)
                curveTo(18.04f, 2.46f, 16.72f, 1.96f, 16.02f, 2.76f)
                lineTo(8.45f, 11.36f)
                curveTo(7.8f, 12.11f, 8.33f, 13.28f, 9.32f, 13.28f)
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
                moveTo(8.5f, 4f)
                horizontalLineTo(1.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 20f)
                horizontalLineTo(1.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 12f)
                horizontalLineTo(1.5f)
            }
        }.build()

        return _Flash!!
    }

@Suppress("ObjectPropertyName")
private var _Flash: ImageVector? = null
