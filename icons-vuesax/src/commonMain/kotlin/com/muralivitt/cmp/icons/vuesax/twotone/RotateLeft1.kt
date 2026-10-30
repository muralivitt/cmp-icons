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

val VuesaxIconsTwotone.RotateLeft1: ImageVector
    get() {
        if (_RotateLeft1 != null) {
            return _RotateLeft1!!
        }
        _RotateLeft1 = ImageVector.Builder(
            name = "RotateLeft1",
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
                moveTo(7.25f, 22f)
                horizontalLineTo(11.75f)
                curveTo(15.5f, 22f, 17f, 20.5f, 17f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(17f, 8.5f, 15.5f, 7f, 11.75f, 7f)
                horizontalLineTo(7.25f)
                curveTo(3.5f, 7f, 2f, 8.5f, 2f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(2f, 20.5f, 3.5f, 22f, 7.25f, 22f)
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
                moveTo(22f, 9f)
                curveTo(22f, 5.13f, 18.87f, 2f, 15f, 2f)
                lineTo(16.05f, 3.75f)
            }
        }.build()

        return _RotateLeft1!!
    }

@Suppress("ObjectPropertyName")
private var _RotateLeft1: ImageVector? = null
