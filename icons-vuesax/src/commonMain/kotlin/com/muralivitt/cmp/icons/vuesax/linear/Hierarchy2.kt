package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Hierarchy2: ImageVector
    get() {
        if (_Hierarchy2 != null) {
            return _Hierarchy2!!
        }
        _Hierarchy2 = ImageVector.Builder(
            name = "Hierarchy2",
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
                moveTo(5f, 15f)
                verticalLineTo(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.25f, 22f)
                curveTo(7.045f, 22f, 8.5f, 20.545f, 8.5f, 18.75f)
                curveTo(8.5f, 16.955f, 7.045f, 15.5f, 5.25f, 15.5f)
                curveTo(3.455f, 15.5f, 2f, 16.955f, 2f, 18.75f)
                curveTo(2f, 20.545f, 3.455f, 22f, 5.25f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                curveTo(6.657f, 8f, 8f, 6.657f, 8f, 5f)
                curveTo(8f, 3.343f, 6.657f, 2f, 5f, 2f)
                curveTo(3.343f, 2f, 2f, 3.343f, 2f, 5f)
                curveTo(2f, 6.657f, 3.343f, 8f, 5f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 8f)
                curveTo(20.657f, 8f, 22f, 6.657f, 22f, 5f)
                curveTo(22f, 3.343f, 20.657f, 2f, 19f, 2f)
                curveTo(17.343f, 2f, 16f, 3.343f, 16f, 5f)
                curveTo(16f, 6.657f, 17.343f, 8f, 19f, 8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.13f, 15f)
                curveTo(5.58f, 13.25f, 7.18f, 11.95f, 9.07f, 11.96f)
                lineTo(12.5f, 11.97f)
                curveTo(15.12f, 11.98f, 17.35f, 10.3f, 18.17f, 7.96f)
            }
        }.build()

        return _Hierarchy2!!
    }

@Suppress("ObjectPropertyName")
private var _Hierarchy2: ImageVector? = null
