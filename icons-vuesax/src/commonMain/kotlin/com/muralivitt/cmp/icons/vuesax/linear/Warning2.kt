package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Warning2: ImageVector
    get() {
        if (_Warning2 != null) {
            return _Warning2!!
        }
        _Warning2 = ImageVector.Builder(
            name = "Warning2",
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
                moveTo(12f, 7.75f)
                verticalLineTo(13f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.08f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(21.08f, 16.54f, 20.48f, 17.58f, 19.51f, 18.15f)
                lineTo(13.57f, 21.58f)
                curveTo(12.6f, 22.14f, 11.4f, 22.14f, 10.42f, 21.58f)
                lineTo(4.48f, 18.15f)
                curveTo(3.51f, 17.59f, 2.91f, 16.55f, 2.91f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(2.91f, 7.46f, 3.51f, 6.42f, 4.48f, 5.85f)
                lineTo(10.42f, 2.42f)
                curveTo(11.39f, 1.86f, 12.59f, 1.86f, 13.57f, 2.42f)
                lineTo(19.51f, 5.85f)
                curveTo(20.48f, 6.42f, 21.08f, 7.45f, 21.08f, 8.58f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16.2f)
                verticalLineTo(16.3f)
            }
        }.build()

        return _Warning2!!
    }

@Suppress("ObjectPropertyName")
private var _Warning2: ImageVector? = null
