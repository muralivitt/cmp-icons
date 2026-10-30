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

val VuesaxIconsTwotone.Backward: ImageVector
    get() {
        if (_Backward != null) {
            return _Backward!!
        }
        _Backward = ImageVector.Builder(
            name = "Backward",
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
                moveTo(22f, 8.34f)
                verticalLineTo(15.66f)
                curveTo(22f, 17.16f, 20.37f, 18.1f, 19.07f, 17.35f)
                lineTo(15.9f, 15.53f)
                lineTo(12.73f, 13.7f)
                curveTo(12.53f, 13.58f, 12.37f, 13.45f, 12.24f, 13.29f)
                verticalLineTo(10.73f)
                curveTo(12.37f, 10.57f, 12.53f, 10.44f, 12.73f, 10.32f)
                lineTo(15.9f, 8.49f)
                lineTo(19.07f, 6.67f)
                curveTo(20.37f, 5.9f, 22f, 6.84f, 22f, 8.34f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.239f, 8.34f)
                verticalLineTo(15.66f)
                curveTo(12.239f, 17.16f, 10.609f, 18.1f, 9.309f, 17.35f)
                lineTo(6.139f, 15.53f)
                lineTo(2.969f, 13.7f)
                curveTo(1.669f, 12.95f, 1.669f, 11.08f, 2.969f, 10.32f)
                lineTo(6.139f, 8.49f)
                lineTo(9.309f, 6.67f)
                curveTo(10.609f, 5.9f, 12.239f, 6.84f, 12.239f, 8.34f)
                close()
            }
        }.build()

        return _Backward!!
    }

@Suppress("ObjectPropertyName")
private var _Backward: ImageVector? = null
