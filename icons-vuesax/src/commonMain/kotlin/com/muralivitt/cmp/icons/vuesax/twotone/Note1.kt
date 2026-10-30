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

val VuesaxIconsTwotone.Note1: ImageVector
    get() {
        if (_Note1 != null) {
            return _Note1!!
        }
        _Note1 = ImageVector.Builder(
            name = "Note1",
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
                moveTo(20f, 8.25f)
                verticalLineTo(18f)
                curveTo(20f, 21f, 18.21f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(5.79f, 22f, 4f, 21f, 4f, 18f)
                verticalLineTo(8.25f)
                curveTo(4f, 5f, 5.79f, 4.25f, 8f, 4.25f)
                curveTo(8f, 4.87f, 8.25f, 5.43f, 8.66f, 5.84f)
                curveTo(9.07f, 6.25f, 9.63f, 6.5f, 10.25f, 6.5f)
                horizontalLineTo(13.75f)
                curveTo(14.99f, 6.5f, 16f, 5.49f, 16f, 4.25f)
                curveTo(18.21f, 4.25f, 20f, 5f, 20f, 8.25f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 4.25f)
                curveTo(16f, 5.49f, 14.99f, 6.5f, 13.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(9.63f, 6.5f, 9.07f, 6.25f, 8.66f, 5.84f)
                curveTo(8.25f, 5.43f, 8f, 4.87f, 8f, 4.25f)
                curveTo(8f, 3.01f, 9.01f, 2f, 10.25f, 2f)
                horizontalLineTo(13.75f)
                curveTo(14.37f, 2f, 14.93f, 2.25f, 15.34f, 2.66f)
                curveTo(15.75f, 3.07f, 16f, 3.63f, 16f, 4.25f)
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
                moveTo(8f, 13f)
                horizontalLineTo(12f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17f)
                horizontalLineTo(16f)
            }
        }.build()

        return _Note1!!
    }

@Suppress("ObjectPropertyName")
private var _Note1: ImageVector? = null
