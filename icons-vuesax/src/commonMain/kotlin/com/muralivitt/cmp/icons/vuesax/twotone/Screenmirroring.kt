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

val VuesaxIconsTwotone.Screenmirroring: ImageVector
    get() {
        if (_Screenmirroring != null) {
            return _Screenmirroring!!
        }
        _Screenmirroring = ImageVector.Builder(
            name = "Screenmirroring",
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.6f, 18.5f)
                horizontalLineTo(16.4f)
                curveTo(17.9f, 18.5f, 18.5f, 17.9f, 18.5f, 16.4f)
                verticalLineTo(14.6f)
                curveTo(18.5f, 13.1f, 17.9f, 12.5f, 16.4f, 12.5f)
                horizontalLineTo(12.6f)
                curveTo(11.1f, 12.5f, 10.5f, 13.1f, 10.5f, 14.6f)
                verticalLineTo(16.4f)
                curveTo(10.5f, 17.9f, 11.1f, 18.5f, 12.6f, 18.5f)
                close()
            }
        }.build()

        return _Screenmirroring!!
    }

@Suppress("ObjectPropertyName")
private var _Screenmirroring: ImageVector? = null
