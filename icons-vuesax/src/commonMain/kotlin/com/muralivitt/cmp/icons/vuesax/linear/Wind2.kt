package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Wind2: ImageVector
    get() {
        if (_Wind2 != null) {
            return _Wind2!!
        }
        _Wind2 = ImageVector.Builder(
            name = "Wind2",
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
                moveTo(2f, 13.1f)
                lineTo(4.5f, 11.6f)
                curveTo(6.04f, 10.68f, 7.96f, 10.68f, 9.5f, 11.6f)
                curveTo(11.04f, 12.52f, 12.96f, 12.52f, 14.5f, 11.6f)
                curveTo(16.04f, 10.68f, 17.96f, 10.68f, 19.5f, 11.6f)
                lineTo(22f, 13.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 3.9f)
                lineTo(4.5f, 5.4f)
                curveTo(6.04f, 6.32f, 7.96f, 6.32f, 9.5f, 5.4f)
                curveTo(11.04f, 4.48f, 12.96f, 4.48f, 14.5f, 5.4f)
                curveTo(16.04f, 6.32f, 17.96f, 6.32f, 19.5f, 5.4f)
                lineTo(22f, 3.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 20.1f)
                lineTo(4.5f, 18.6f)
                curveTo(6.04f, 17.68f, 7.96f, 17.68f, 9.5f, 18.6f)
                curveTo(11.04f, 19.52f, 12.96f, 19.52f, 14.5f, 18.6f)
                curveTo(16.04f, 17.68f, 17.96f, 17.68f, 19.5f, 18.6f)
                lineTo(22f, 20.1f)
            }
        }.build()

        return _Wind2!!
    }

@Suppress("ObjectPropertyName")
private var _Wind2: ImageVector? = null
