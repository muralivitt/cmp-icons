package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Import2: ImageVector
    get() {
        if (_Import2 != null) {
            return _Import2!!
        }
        _Import2 = ImageVector.Builder(
            name = "Import2",
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
                moveTo(9.32f, 11.68f)
                lineTo(11.88f, 14.24f)
                lineTo(14.44f, 11.68f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.88f, 4f)
                verticalLineTo(14.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12.18f)
                curveTo(20f, 16.6f, 17f, 20.18f, 12f, 20.18f)
                curveTo(7f, 20.18f, 4f, 16.6f, 4f, 12.18f)
            }
        }.build()

        return _Import2!!
    }

@Suppress("ObjectPropertyName")
private var _Import2: ImageVector? = null
