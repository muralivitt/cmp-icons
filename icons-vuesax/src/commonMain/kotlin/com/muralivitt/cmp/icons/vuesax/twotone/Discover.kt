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

val VuesaxIconsTwotone.Discover: ImageVector
    get() {
        if (_Discover != null) {
            return _Discover!!
        }
        _Discover = ImageVector.Builder(
            name = "Discover",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
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
                moveTo(13.5f, 8f)
                curveTo(10.47f, 8f, 8f, 10.48f, 8f, 13.5f)
                curveTo(8f, 14.87f, 9.12f, 16f, 10.5f, 16f)
                curveTo(13.52f, 16f, 16f, 13.52f, 16f, 10.5f)
                curveTo(16f, 9.13f, 14.87f, 8f, 13.5f, 8f)
                close()
            }
        }.build()

        return _Discover!!
    }

@Suppress("ObjectPropertyName")
private var _Discover: ImageVector? = null
