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

val VuesaxIconsTwotone.Text: ImageVector
    get() {
        if (_Text != null) {
            return _Text!!
        }
        _Text = ImageVector.Builder(
            name = "Text",
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
                moveTo(2.67f, 7.17f)
                verticalLineTo(5.35f)
                curveTo(2.67f, 4.2f, 3.6f, 3.28f, 4.74f, 3.28f)
                horizontalLineTo(19.26f)
                curveTo(20.41f, 3.28f, 21.33f, 4.21f, 21.33f, 5.35f)
                verticalLineTo(7.17f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20.72f)
                verticalLineTo(4.11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.061f, 20.72f)
                horizontalLineTo(15.941f)
            }
        }.build()

        return _Text!!
    }

@Suppress("ObjectPropertyName")
private var _Text: ImageVector? = null
