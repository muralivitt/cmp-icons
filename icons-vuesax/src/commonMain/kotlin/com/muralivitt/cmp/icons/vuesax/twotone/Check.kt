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

val VuesaxIconsTwotone.Check: ImageVector
    get() {
        if (_Check != null) {
            return _Check!!
        }
        _Check = ImageVector.Builder(
            name = "Check",
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
                moveTo(11.02f, 19.5f)
                horizontalLineTo(7.5f)
                curveTo(6.88f, 19.5f, 6.33f, 19.48f, 5.84f, 19.41f)
                curveTo(3.21f, 19.12f, 2.5f, 17.88f, 2.5f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(2.5f, 6.12f, 3.21f, 4.88f, 5.84f, 4.59f)
                curveTo(6.33f, 4.52f, 6.88f, 4.5f, 7.5f, 4.5f)
                horizontalLineTo(10.96f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.019f, 4.5f)
                horizontalLineTo(16.5f)
                curveTo(17.119f, 4.5f, 17.67f, 4.52f, 18.16f, 4.59f)
                curveTo(20.789f, 4.88f, 21.5f, 6.12f, 21.5f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(21.5f, 17.88f, 20.789f, 19.12f, 18.16f, 19.41f)
                curveTo(17.67f, 19.48f, 17.119f, 19.5f, 16.5f, 19.5f)
                horizontalLineTo(15.019f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 2f)
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
                moveTo(8f, 8.5f)
                verticalLineTo(15.5f)
            }
        }.build()

        return _Check!!
    }

@Suppress("ObjectPropertyName")
private var _Check: ImageVector? = null
