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

val VuesaxIconsTwotone.Filter: ImageVector
    get() {
        if (_Filter != null) {
            return _Filter!!
        }
        _Filter = ImageVector.Builder(
            name = "Filter",
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
                moveTo(5.4f, 2.1f)
                horizontalLineTo(18.6f)
                curveTo(19.7f, 2.1f, 20.6f, 3f, 20.6f, 4.1f)
                verticalLineTo(6.3f)
                curveTo(20.6f, 7.1f, 20.1f, 8.1f, 19.6f, 8.6f)
                lineTo(15.3f, 12.4f)
                curveTo(14.7f, 12.9f, 14.3f, 13.9f, 14.3f, 14.7f)
                verticalLineTo(19f)
                curveTo(14.3f, 19.6f, 13.9f, 20.4f, 13.4f, 20.7f)
                lineTo(12f, 21.6f)
                curveTo(10.7f, 22.4f, 8.9f, 21.5f, 8.9f, 19.9f)
                verticalLineTo(14.6f)
                curveTo(8.9f, 13.9f, 8.5f, 13f, 8.1f, 12.5f)
                lineTo(4.3f, 8.5f)
                curveTo(3.8f, 8f, 3.4f, 7.1f, 3.4f, 6.5f)
                verticalLineTo(4.2f)
                curveTo(3.4f, 3f, 4.3f, 2.1f, 5.4f, 2.1f)
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
                moveTo(10.93f, 2.1f)
                lineTo(6f, 10f)
            }
        }.build()

        return _Filter!!
    }

@Suppress("ObjectPropertyName")
private var _Filter: ImageVector? = null
