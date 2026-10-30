package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Diagram: ImageVector
    get() {
        if (_Diagram != null) {
            return _Diagram!!
        }
        _Diagram = ImageVector.Builder(
            name = "Diagram",
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
                moveTo(2f, 2f)
                verticalLineTo(19f)
                curveTo(2f, 20.66f, 3.34f, 22f, 5f, 22f)
                horizontalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17f)
                lineTo(9.59f, 11.64f)
                curveTo(10.35f, 10.76f, 11.7f, 10.7f, 12.52f, 11.53f)
                lineTo(13.47f, 12.48f)
                curveTo(14.29f, 13.3f, 15.64f, 13.25f, 16.4f, 12.37f)
                lineTo(21f, 7f)
            }
        }.build()

        return _Diagram!!
    }

@Suppress("ObjectPropertyName")
private var _Diagram: ImageVector? = null
