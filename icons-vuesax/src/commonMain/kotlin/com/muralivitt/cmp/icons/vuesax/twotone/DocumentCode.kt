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

val VuesaxIconsTwotone.DocumentCode: ImageVector
    get() {
        if (_DocumentCode != null) {
            return _DocumentCode!!
        }
        _DocumentCode = ImageVector.Builder(
            name = "DocumentCode",
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
                moveTo(21f, 7f)
                verticalLineTo(17f)
                curveTo(21f, 20f, 19.5f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(4.5f, 22f, 3f, 20f, 3f, 17f)
                verticalLineTo(7f)
                curveTo(3f, 4f, 4.5f, 2f, 8f, 2f)
                horizontalLineTo(16f)
                curveTo(19.5f, 2f, 21f, 4f, 21f, 7f)
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
                moveTo(14.5f, 4.5f)
                verticalLineTo(6.5f)
                curveTo(14.5f, 7.6f, 15.4f, 8.5f, 16.5f, 8.5f)
                horizontalLineTo(18.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 13f)
                lineTo(8f, 15f)
                lineTo(10f, 17f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13f)
                lineTo(16f, 15f)
                lineTo(14f, 17f)
            }
        }.build()

        return _DocumentCode!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCode: ImageVector? = null
