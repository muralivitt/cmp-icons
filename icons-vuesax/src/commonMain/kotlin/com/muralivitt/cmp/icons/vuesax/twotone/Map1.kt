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

val VuesaxIconsTwotone.Map1: ImageVector
    get() {
        if (_Map1 != null) {
            return _Map1!!
        }
        _Map1 = ImageVector.Builder(
            name = "Map1",
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
                moveTo(2.289f, 7.78f)
                verticalLineTo(17.51f)
                curveTo(2.289f, 19.41f, 3.639f, 20.19f, 5.279f, 19.25f)
                lineTo(7.629f, 17.91f)
                curveTo(8.139f, 17.62f, 8.989f, 17.59f, 9.519f, 17.86f)
                lineTo(14.769f, 20.49f)
                curveTo(15.299f, 20.75f, 16.149f, 20.73f, 16.659f, 20.44f)
                lineTo(20.989f, 17.96f)
                curveTo(21.539f, 17.64f, 21.999f, 16.86f, 21.999f, 16.22f)
                verticalLineTo(6.49f)
                curveTo(21.999f, 4.59f, 20.649f, 3.81f, 19.009f, 4.75f)
                lineTo(16.659f, 6.09f)
                curveTo(16.149f, 6.38f, 15.299f, 6.41f, 14.769f, 6.14f)
                lineTo(9.519f, 3.52f)
                curveTo(8.989f, 3.26f, 8.139f, 3.28f, 7.629f, 3.57f)
                lineTo(3.299f, 6.05f)
                curveTo(2.739f, 6.37f, 2.289f, 7.15f, 2.289f, 7.78f)
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
                moveTo(8.561f, 4f)
                verticalLineTo(17f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.731f, 6.62f)
                verticalLineTo(20f)
            }
        }.build()

        return _Map1!!
    }

@Suppress("ObjectPropertyName")
private var _Map1: ImageVector? = null
