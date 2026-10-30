package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Group10: ImageVector
    get() {
        if (_Group10 != null) {
            return _Group10!!
        }
        _Group10 = ImageVector.Builder(
            name = "Group10",
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
                moveTo(10.07f, 2.82f)
                lineTo(3.14f, 8.37f)
                curveTo(2.36f, 8.99f, 1.86f, 10.3f, 2.03f, 11.28f)
                lineTo(3.36f, 19.24f)
                curveTo(3.6f, 20.66f, 4.96f, 21.81f, 6.4f, 21.81f)
                horizontalLineTo(17.6f)
                curveTo(19.03f, 21.81f, 20.4f, 20.65f, 20.64f, 19.24f)
                lineTo(21.97f, 11.28f)
                curveTo(22.13f, 10.3f, 21.63f, 8.99f, 20.86f, 8.37f)
                lineTo(13.93f, 2.83f)
                curveTo(12.86f, 1.97f, 11.13f, 1.97f, 10.07f, 2.82f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15.5f)
                curveTo(13.381f, 15.5f, 14.5f, 14.381f, 14.5f, 13f)
                curveTo(14.5f, 11.619f, 13.381f, 10.5f, 12f, 10.5f)
                curveTo(10.619f, 10.5f, 9.5f, 11.619f, 9.5f, 13f)
                curveTo(9.5f, 14.381f, 10.619f, 15.5f, 12f, 15.5f)
                close()
            }
        }.build()

        return _Group10!!
    }

@Suppress("ObjectPropertyName")
private var _Group10: ImageVector? = null
