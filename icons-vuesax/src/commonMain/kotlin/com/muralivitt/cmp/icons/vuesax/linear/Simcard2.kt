package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Simcard2: ImageVector
    get() {
        if (_Simcard2 != null) {
            return _Simcard2!!
        }
        _Simcard2 = ImageVector.Builder(
            name = "Simcard2",
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
                moveTo(16f, 12.69f)
                verticalLineTo(18.08f)
                curveTo(16f, 20.42f, 14.44f, 21.97f, 12.11f, 21.97f)
                horizontalLineTo(5.89f)
                curveTo(3.56f, 21.97f, 2f, 20.42f, 2f, 18.08f)
                verticalLineTo(10.31f)
                curveTo(2f, 7.97f, 3.56f, 6.42f, 5.89f, 6.42f)
                horizontalLineTo(9.72f)
                curveTo(10.75f, 6.42f, 11.74f, 6.83f, 12.47f, 7.56f)
                lineTo(14.86f, 9.94f)
                curveTo(15.59f, 10.67f, 16f, 11.66f, 16f, 12.69f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8.25f)
                verticalLineTo(13.64f)
                curveTo(22f, 15.97f, 20.44f, 17.53f, 18.11f, 17.53f)
                horizontalLineTo(16f)
                verticalLineTo(12.69f)
                curveTo(16f, 11.66f, 15.59f, 10.67f, 14.86f, 9.94f)
                lineTo(12.47f, 7.56f)
                curveTo(11.74f, 6.83f, 10.75f, 6.42f, 9.72f, 6.42f)
                horizontalLineTo(8f)
                verticalLineTo(5.86f)
                curveTo(8f, 3.53f, 9.56f, 1.97f, 11.89f, 1.97f)
                horizontalLineTo(15.72f)
                curveTo(16.75f, 1.97f, 17.74f, 2.38f, 18.47f, 3.11f)
                lineTo(20.86f, 5.5f)
                curveTo(21.59f, 6.23f, 22f, 7.22f, 22f, 8.25f)
                close()
            }
        }.build()

        return _Simcard2!!
    }

@Suppress("ObjectPropertyName")
private var _Simcard2: ImageVector? = null
