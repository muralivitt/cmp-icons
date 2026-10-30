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

val VuesaxIconsTwotone.Blend: ImageVector
    get() {
        if (_Blend != null) {
            return _Blend!!
        }
        _Blend = ImageVector.Builder(
            name = "Blend",
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
                moveTo(21.971f, 12f)
                curveTo(21.971f, 15.31f, 19.281f, 18f, 15.971f, 18f)
                curveTo(14.431f, 18f, 13.031f, 17.42f, 11.971f, 16.46f)
                curveTo(13.201f, 15.37f, 13.971f, 13.77f, 13.971f, 12f)
                curveTo(13.971f, 10.23f, 13.201f, 8.63f, 11.971f, 7.54f)
                curveTo(13.031f, 6.58f, 14.431f, 6f, 15.971f, 6f)
                curveTo(19.281f, 6f, 21.971f, 8.69f, 21.971f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.971f, 12f)
                curveTo(13.971f, 13.77f, 13.201f, 15.37f, 11.971f, 16.46f)
                curveTo(10.911f, 17.42f, 9.511f, 18f, 7.971f, 18f)
                curveTo(4.661f, 18f, 1.971f, 15.31f, 1.971f, 12f)
                curveTo(1.971f, 8.69f, 4.661f, 6f, 7.971f, 6f)
                curveTo(9.511f, 6f, 10.911f, 6.58f, 11.971f, 7.54f)
                curveTo(13.201f, 8.63f, 13.971f, 10.23f, 13.971f, 12f)
                close()
            }
        }.build()

        return _Blend!!
    }

@Suppress("ObjectPropertyName")
private var _Blend: ImageVector? = null
