package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Hierarchy: ImageVector
    get() {
        if (_Hierarchy != null) {
            return _Hierarchy!!
        }
        _Hierarchy = ImageVector.Builder(
            name = "Hierarchy",
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
                moveTo(5f, 9f)
                verticalLineTo(16f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.25f, 8.5f)
                curveTo(7.045f, 8.5f, 8.5f, 7.045f, 8.5f, 5.25f)
                curveTo(8.5f, 3.455f, 7.045f, 2f, 5.25f, 2f)
                curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
                curveTo(2f, 7.045f, 3.455f, 8.5f, 5.25f, 8.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 22f)
                curveTo(6.657f, 22f, 8f, 20.657f, 8f, 19f)
                curveTo(8f, 17.343f, 6.657f, 16f, 5f, 16f)
                curveTo(3.343f, 16f, 2f, 17.343f, 2f, 19f)
                curveTo(2f, 20.657f, 3.343f, 22f, 5f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22f)
                curveTo(20.657f, 22f, 22f, 20.657f, 22f, 19f)
                curveTo(22f, 17.343f, 20.657f, 16f, 19f, 16f)
                curveTo(17.343f, 16f, 16f, 17.343f, 16f, 19f)
                curveTo(16f, 20.657f, 17.343f, 22f, 19f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.13f, 9f)
                curveTo(5.58f, 10.75f, 7.18f, 12.05f, 9.07f, 12.04f)
                lineTo(12.5f, 12.03f)
                curveTo(15.12f, 12.02f, 17.35f, 13.7f, 18.17f, 16.04f)
            }
        }.build()

        return _Hierarchy!!
    }

@Suppress("ObjectPropertyName")
private var _Hierarchy: ImageVector? = null
