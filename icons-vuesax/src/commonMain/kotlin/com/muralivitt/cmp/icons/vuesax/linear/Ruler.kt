package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Ruler: ImageVector
    get() {
        if (_Ruler != null) {
            return _Ruler!!
        }
        _Ruler = ImageVector.Builder(
            name = "Ruler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(5f, 17f)
                horizontalLineTo(19f)
                curveTo(21f, 17f, 22f, 16f, 22f, 14f)
                verticalLineTo(10f)
                curveTo(22f, 8f, 21f, 7f, 19f, 7f)
                horizontalLineTo(5f)
                curveTo(3f, 7f, 2f, 8f, 2f, 10f)
                verticalLineTo(14f)
                curveTo(2f, 16f, 3f, 17f, 5f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(18f, 7f)
                verticalLineTo(12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(6f, 7f)
                verticalLineTo(11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(10.05f, 7f)
                lineTo(10f, 12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(14f, 7f)
                verticalLineTo(10f)
            }
        }.build()

        return _Ruler!!
    }

@Suppress("ObjectPropertyName")
private var _Ruler: ImageVector? = null
