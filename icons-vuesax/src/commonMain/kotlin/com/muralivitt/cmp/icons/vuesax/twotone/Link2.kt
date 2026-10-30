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

val VuesaxIconsTwotone.Link2: ImageVector
    get() {
        if (_Link2 != null) {
            return _Link2!!
        }
        _Link2 = ImageVector.Builder(
            name = "Link2",
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
                moveTo(13.5f, 12f)
                curveTo(13.5f, 15.18f, 10.93f, 17.75f, 7.75f, 17.75f)
                curveTo(4.57f, 17.75f, 2f, 15.18f, 2f, 12f)
                curveTo(2f, 8.82f, 4.57f, 6.25f, 7.75f, 6.25f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                curveTo(10f, 8.69f, 12.69f, 6f, 16f, 6f)
                curveTo(19.31f, 6f, 22f, 8.69f, 22f, 12f)
                curveTo(22f, 15.31f, 19.31f, 18f, 16f, 18f)
            }
        }.build()

        return _Link2!!
    }

@Suppress("ObjectPropertyName")
private var _Link2: ImageVector? = null
