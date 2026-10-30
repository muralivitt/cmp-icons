package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Play: ImageVector
    get() {
        if (_Play != null) {
            return _Play!!
        }
        _Play = ImageVector.Builder(
            name = "Play",
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
                moveTo(4f, 12f)
                verticalLineTo(8.44f)
                curveTo(4f, 4.02f, 7.13f, 2.21f, 10.96f, 4.42f)
                lineTo(14.05f, 6.2f)
                lineTo(17.14f, 7.98f)
                curveTo(20.97f, 10.19f, 20.97f, 13.81f, 17.14f, 16.02f)
                lineTo(14.05f, 17.8f)
                lineTo(10.96f, 19.58f)
                curveTo(7.13f, 21.79f, 4f, 19.98f, 4f, 15.56f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _Play!!
    }

@Suppress("ObjectPropertyName")
private var _Play: ImageVector? = null
