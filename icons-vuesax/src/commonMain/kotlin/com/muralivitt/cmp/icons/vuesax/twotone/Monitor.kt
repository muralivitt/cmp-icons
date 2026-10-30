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

val VuesaxIconsTwotone.Monitor: ImageVector
    get() {
        if (_Monitor != null) {
            return _Monitor!!
        }
        _Monitor = ImageVector.Builder(
            name = "Monitor",
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
                moveTo(6.44f, 2f)
                horizontalLineTo(17.55f)
                curveTo(21.11f, 2f, 22f, 2.89f, 22f, 6.44f)
                verticalLineTo(12.77f)
                curveTo(22f, 16.33f, 21.11f, 17.21f, 17.56f, 17.21f)
                horizontalLineTo(6.44f)
                curveTo(2.89f, 17.22f, 2f, 16.33f, 2f, 12.78f)
                verticalLineTo(6.44f)
                curveTo(2f, 2.89f, 2.89f, 2f, 6.44f, 2f)
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
                moveTo(12f, 17.22f)
                verticalLineTo(22f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 13f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 22f)
                horizontalLineTo(16.5f)
            }
        }.build()

        return _Monitor!!
    }

@Suppress("ObjectPropertyName")
private var _Monitor: ImageVector? = null
