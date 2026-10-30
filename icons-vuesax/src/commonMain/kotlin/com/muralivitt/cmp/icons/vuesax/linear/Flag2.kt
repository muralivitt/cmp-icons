package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Flag2: ImageVector
    get() {
        if (_Flag2 != null) {
            return _Flag2!!
        }
        _Flag2 = ImageVector.Builder(
            name = "Flag2",
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
                moveTo(6.45f, 2f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.95f, 4f)
                lineTo(15.05f, 7.5f)
                curveTo(18.35f, 8.9f, 18.35f, 11.3f, 15.25f, 12.9f)
                lineTo(6.95f, 17f)
            }
        }.build()

        return _Flag2!!
    }

@Suppress("ObjectPropertyName")
private var _Flag2: ImageVector? = null
