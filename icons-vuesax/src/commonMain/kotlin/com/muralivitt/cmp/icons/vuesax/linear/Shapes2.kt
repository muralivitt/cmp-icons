package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Shapes2: ImageVector
    get() {
        if (_Shapes2 != null) {
            return _Shapes2!!
        }
        _Shapes2 = ImageVector.Builder(
            name = "Shapes2",
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
                moveTo(16.97f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(16.97f, 20.5f, 15.47f, 22f, 11.72f, 22f)
                horizontalLineTo(7.22f)
                curveTo(3.47f, 22f, 1.97f, 20.5f, 1.97f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(1.97f, 8.5f, 3.47f, 7f, 7.22f, 7f)
                horizontalLineTo(11.72f)
                curveTo(15.47f, 7f, 16.97f, 8.5f, 16.97f, 12.25f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21.97f, 7.5f)
                curveTo(21.97f, 10.37f, 19.78f, 12.72f, 16.97f, 12.97f)
                verticalLineTo(12.25f)
                curveTo(16.97f, 8.5f, 15.47f, 7f, 11.72f, 7f)
                horizontalLineTo(11f)
                curveTo(11.25f, 4.19f, 13.6f, 2f, 16.47f, 2f)
                curveTo(19.26f, 2f, 21.56f, 4.07f, 21.91f, 6.77f)
                curveTo(21.95f, 7f, 21.97f, 7.25f, 21.97f, 7.5f)
                close()
            }
        }.build()

        return _Shapes2!!
    }

@Suppress("ObjectPropertyName")
private var _Shapes2: ImageVector? = null
