package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Ticket2: ImageVector
    get() {
        if (_Ticket2 != null) {
            return _Ticket2!!
        }
        _Ticket2 = ImageVector.Builder(
            name = "Ticket2",
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
                moveTo(18.91f, 14.692f)
                curveTo(18.91f, 15.982f, 19.97f, 17.032f, 21.26f, 17.032f)
                curveTo(21.26f, 20.782f, 20.32f, 21.722f, 16.57f, 21.722f)
                horizontalLineTo(7.19f)
                curveTo(3.44f, 21.722f, 2.5f, 20.782f, 2.5f, 17.032f)
                verticalLineTo(16.572f)
                curveTo(3.79f, 16.572f, 4.85f, 15.512f, 4.85f, 14.222f)
                curveTo(4.85f, 12.932f, 3.79f, 11.872f, 2.5f, 11.872f)
                verticalLineTo(11.412f)
                curveTo(2.51f, 7.662f, 3.44f, 6.722f, 7.19f, 6.722f)
                horizontalLineTo(16.56f)
                curveTo(20.31f, 6.722f, 21.25f, 7.662f, 21.25f, 11.412f)
                verticalLineTo(12.352f)
                curveTo(19.96f, 12.352f, 18.91f, 13.392f, 18.91f, 14.692f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.211f, 6.722f)
                horizontalLineTo(7.121f)
                lineTo(10.051f, 3.793f)
                curveTo(12.441f, 1.403f, 13.641f, 1.403f, 16.031f, 3.793f)
                lineTo(16.631f, 4.392f)
                curveTo(16.001f, 5.023f, 15.851f, 5.952f, 16.211f, 6.722f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.879f, 6.723f)
                lineTo(9.879f, 21.723f)
            }
        }.build()

        return _Ticket2!!
    }

@Suppress("ObjectPropertyName")
private var _Ticket2: ImageVector? = null
