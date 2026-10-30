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

val VuesaxIconsTwotone.Link: ImageVector
    get() {
        if (_Link != null) {
            return _Link!!
        }
        _Link = ImageVector.Builder(
            name = "Link",
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
                moveTo(3.27f, 12f)
                curveTo(2.48f, 11.05f, 2f, 9.83f, 2f, 8.5f)
                curveTo(2f, 5.48f, 4.47f, 3f, 7.5f, 3f)
                horizontalLineTo(12.5f)
                curveTo(15.52f, 3f, 18f, 5.48f, 18f, 8.5f)
                curveTo(18f, 11.52f, 15.53f, 14f, 12.5f, 14f)
                horizontalLineTo(10f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.73f, 12f)
                curveTo(21.52f, 12.95f, 22f, 14.17f, 22f, 15.5f)
                curveTo(22f, 18.52f, 19.53f, 21f, 16.5f, 21f)
                horizontalLineTo(11.5f)
                curveTo(8.48f, 21f, 6f, 18.52f, 6f, 15.5f)
                curveTo(6f, 12.48f, 8.47f, 10f, 11.5f, 10f)
                horizontalLineTo(14f)
            }
        }.build()

        return _Link!!
    }

@Suppress("ObjectPropertyName")
private var _Link: ImageVector? = null
