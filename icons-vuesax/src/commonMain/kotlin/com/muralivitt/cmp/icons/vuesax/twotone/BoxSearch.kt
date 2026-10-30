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

val VuesaxIconsTwotone.BoxSearch: ImageVector
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
                moveTo(21.611f, 12.83f)
                verticalLineTo(9.17f)
                curveTo(21.611f, 7.79f, 20.621f, 6.11f, 19.411f, 5.44f)
                lineTo(14.071f, 2.48f)
                curveTo(12.931f, 1.84f, 11.071f, 1.84f, 9.931f, 2.48f)
                lineTo(4.591f, 5.44f)
                curveTo(3.381f, 6.11f, 2.391f, 7.79f, 2.391f, 9.17f)
                verticalLineTo(14.83f)
                curveTo(2.391f, 16.21f, 3.381f, 17.89f, 4.591f, 18.56f)
                lineTo(9.931f, 21.52f)
                curveTo(10.501f, 21.84f, 11.251f, 22f, 12.001f, 22f)
                curveTo(12.751f, 22f, 13.501f, 21.84f, 14.071f, 21.52f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
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
