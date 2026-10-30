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

val VuesaxIconsTwotone.Graph: ImageVector
    get() {
        if (_Graph != null) {
            return _Graph!!
        }
        _Graph = ImageVector.Builder(
            name = "Graph",
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
                moveTo(18.32f, 12f)
                curveTo(20.92f, 12f, 22f, 11f, 21.04f, 7.72f)
                curveTo(20.39f, 5.51f, 18.49f, 3.61f, 16.28f, 2.96f)
                curveTo(13f, 2f, 12f, 3.08f, 12f, 5.68f)
                verticalLineTo(8.56f)
                curveTo(12f, 11f, 13f, 12f, 15f, 12f)
                horizontalLineTo(18.32f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 14.7f)
                curveTo(19.07f, 19.33f, 14.63f, 22.69f, 9.58f, 21.87f)
                curveTo(5.79f, 21.26f, 2.74f, 18.21f, 2.12f, 14.42f)
                curveTo(1.31f, 9.39f, 4.65f, 4.95f, 9.26f, 4.01f)
            }
        }.build()

        return _Graph!!
    }

@Suppress("ObjectPropertyName")
private var _Graph: ImageVector? = null
