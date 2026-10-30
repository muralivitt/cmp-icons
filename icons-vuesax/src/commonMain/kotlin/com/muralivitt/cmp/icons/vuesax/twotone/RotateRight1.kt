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

val VuesaxIconsTwotone.RotateRight1: ImageVector
    get() {
        if (_RotateRight1 != null) {
            return _RotateRight1!!
        }
        _RotateRight1 = ImageVector.Builder(
            name = "RotateRight1",
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
                moveTo(16.75f, 22f)
                horizontalLineTo(12.25f)
                curveTo(8.5f, 22f, 7f, 20.5f, 7f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(7f, 8.5f, 8.5f, 7f, 12.25f, 7f)
                horizontalLineTo(16.75f)
                curveTo(20.5f, 7f, 22f, 8.5f, 22f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(22f, 20.5f, 20.5f, 22f, 16.75f, 22f)
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
                moveTo(2f, 9f)
                curveTo(2f, 5.13f, 5.13f, 2f, 9f, 2f)
                lineTo(7.95f, 3.75f)
            }
        }.build()

        return _RotateRight1!!
    }

@Suppress("ObjectPropertyName")
private var _RotateRight1: ImageVector? = null
