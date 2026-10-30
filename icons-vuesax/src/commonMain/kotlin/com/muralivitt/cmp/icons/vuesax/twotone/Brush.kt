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

val VuesaxIconsTwotone.Brush: ImageVector
    get() {
        if (_Brush != null) {
            return _Brush!!
        }
        _Brush = ImageVector.Builder(
            name = "Brush",
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
                moveTo(6f, 2f)
                horizontalLineTo(18f)
                curveTo(19.1f, 2f, 20f, 2.9f, 20f, 4f)
                verticalLineTo(8.32f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.9f, 2f, 6f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 8.32f)
                verticalLineTo(11.88f)
                curveTo(4f, 12.96f, 4.58f, 13.96f, 5.53f, 14.49f)
                lineTo(8.49f, 16.16f)
                curveTo(9.12f, 16.51f, 9.51f, 17.18f, 9.51f, 17.9f)
                verticalLineTo(20f)
                curveTo(9.51f, 21.1f, 10.41f, 22f, 11.51f, 22f)
                horizontalLineTo(12.51f)
                curveTo(13.61f, 22f, 14.51f, 21.1f, 14.51f, 20f)
                verticalLineTo(17.9f)
                curveTo(14.51f, 17.18f, 14.9f, 16.51f, 15.53f, 16.16f)
                lineTo(18.49f, 14.49f)
                curveTo(19.43f, 13.96f, 20.02f, 12.96f, 20.02f, 11.88f)
                verticalLineTo(8.32f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _Brush!!
    }

@Suppress("ObjectPropertyName")
private var _Brush: ImageVector? = null
