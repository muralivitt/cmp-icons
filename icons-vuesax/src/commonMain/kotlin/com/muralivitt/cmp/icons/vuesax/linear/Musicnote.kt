package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Musicnote: ImageVector
    get() {
        if (_Musicnote != null) {
            return _Musicnote!!
        }
        _Musicnote = ImageVector.Builder(
            name = "Musicnote",
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
                moveTo(7.97f, 22f)
                curveTo(10.179f, 22f, 11.97f, 20.209f, 11.97f, 18f)
                curveTo(11.97f, 15.791f, 10.179f, 14f, 7.97f, 14f)
                curveTo(5.761f, 14f, 3.97f, 15.791f, 3.97f, 18f)
                curveTo(3.97f, 20.209f, 5.761f, 22f, 7.97f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.97f, 18f)
                verticalLineTo(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.61f, 2.11f)
                lineTo(19.03f, 3.58f)
                curveTo(20.1f, 3.94f, 20.98f, 5.15f, 20.98f, 6.28f)
                verticalLineTo(7.45f)
                curveTo(20.98f, 8.98f, 19.8f, 9.83f, 18.35f, 9.35f)
                lineTo(13.93f, 7.88f)
                curveTo(12.86f, 7.52f, 11.98f, 6.31f, 11.98f, 5.18f)
                verticalLineTo(4f)
                curveTo(11.97f, 2.48f, 13.16f, 1.62f, 14.61f, 2.11f)
                close()
            }
        }.build()

        return _Musicnote!!
    }

@Suppress("ObjectPropertyName")
private var _Musicnote: ImageVector? = null
