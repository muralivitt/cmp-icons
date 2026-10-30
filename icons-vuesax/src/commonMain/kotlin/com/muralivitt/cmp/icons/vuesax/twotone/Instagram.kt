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

val VuesaxIconsTwotone.Instagram: ImageVector
    get() {
        if (_Instagram != null) {
            return _Instagram!!
        }
        _Instagram = ImageVector.Builder(
            name = "Instagram",
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
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                close()
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15.5f)
                curveTo(13.933f, 15.5f, 15.5f, 13.933f, 15.5f, 12f)
                curveTo(15.5f, 10.067f, 13.933f, 8.5f, 12f, 8.5f)
                curveTo(10.067f, 8.5f, 8.5f, 10.067f, 8.5f, 12f)
                curveTo(8.5f, 13.933f, 10.067f, 15.5f, 12f, 15.5f)
                close()
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.636f, 7f)
                horizontalLineTo(17.648f)
            }
        }.build()

        return _Instagram!!
    }

@Suppress("ObjectPropertyName")
private var _Instagram: ImageVector? = null
