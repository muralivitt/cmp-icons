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

val VuesaxIconsTwotone.Link21: ImageVector
    get() {
        if (_Link21 != null) {
            return _Link21!!
        }
        _Link21 = ImageVector.Builder(
            name = "Link21",
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
                moveTo(13.06f, 10.94f)
                curveTo(15.31f, 13.19f, 15.31f, 16.83f, 13.06f, 19.07f)
                curveTo(10.81f, 21.31f, 7.17f, 21.32f, 4.93f, 19.07f)
                curveTo(2.69f, 16.82f, 2.68f, 13.18f, 4.93f, 10.94f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.591f, 13.41f)
                curveTo(8.251f, 11.07f, 8.251f, 7.27f, 10.591f, 4.92f)
                curveTo(12.931f, 2.57f, 16.731f, 2.58f, 19.081f, 4.92f)
                curveTo(21.431f, 7.26f, 21.421f, 11.06f, 19.081f, 13.41f)
            }
        }.build()

        return _Link21!!
    }

@Suppress("ObjectPropertyName")
private var _Link21: ImageVector? = null
