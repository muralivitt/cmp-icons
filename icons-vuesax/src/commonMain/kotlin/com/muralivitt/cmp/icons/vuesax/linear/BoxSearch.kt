package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.BoxSearch: ImageVector
    get() {
        if (_BoxSearch != null) {
            return _BoxSearch!!
        }
        _BoxSearch = ImageVector.Builder(
            name = "BoxSearch",
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
                moveTo(3.17f, 7.44f)
                lineTo(12f, 12.55f)
                lineTo(20.77f, 7.47f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21.61f)
                verticalLineTo(12.54f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.61f, 12.83f)
                verticalLineTo(9.17f)
                curveTo(21.61f, 7.79f, 20.62f, 6.11f, 19.41f, 5.44f)
                lineTo(14.07f, 2.48f)
                curveTo(12.93f, 1.84f, 11.07f, 1.84f, 9.93f, 2.48f)
                lineTo(4.59f, 5.44f)
                curveTo(3.38f, 6.11f, 2.39f, 7.79f, 2.39f, 9.17f)
                verticalLineTo(14.83f)
                curveTo(2.39f, 16.21f, 3.38f, 17.89f, 4.59f, 18.56f)
                lineTo(9.93f, 21.52f)
                curveTo(10.5f, 21.84f, 11.25f, 22f, 12f, 22f)
                curveTo(12.75f, 22f, 13.5f, 21.84f, 14.07f, 21.52f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.2f, 21.4f)
                curveTo(20.967f, 21.4f, 22.4f, 19.967f, 22.4f, 18.2f)
                curveTo(22.4f, 16.433f, 20.967f, 15f, 19.2f, 15f)
                curveTo(17.433f, 15f, 16f, 16.433f, 16f, 18.2f)
                curveTo(16f, 19.967f, 17.433f, 21.4f, 19.2f, 21.4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23f, 22f)
                lineTo(22f, 21f)
            }
        }.build()

        return _BoxSearch!!
    }

@Suppress("ObjectPropertyName")
private var _BoxSearch: ImageVector? = null
