package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Shapes1: ImageVector
    get() {
        if (_Shapes1 != null) {
            return _Shapes1!!
        }
        _Shapes1 = ImageVector.Builder(
            name = "Shapes1",
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
                moveTo(13.43f, 15f)
                horizontalLineTo(4.4f)
                curveTo(2.58f, 15f, 1.42f, 13.05f, 2.3f, 11.45f)
                lineTo(4.63f, 7.21f)
                lineTo(6.81f, 3.24f)
                curveTo(7.72f, 1.59f, 10.1f, 1.59f, 11.01f, 3.24f)
                lineTo(13.2f, 7.21f)
                lineTo(14.25f, 9.12f)
                lineTo(15.53f, 11.45f)
                curveTo(16.41f, 13.05f, 15.25f, 15f, 13.43f, 15f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 15.5f)
                curveTo(22f, 19.09f, 19.09f, 22f, 15.5f, 22f)
                curveTo(11.91f, 22f, 9f, 19.09f, 9f, 15.5f)
                curveTo(9f, 15.33f, 9.01f, 15.17f, 9.02f, 15f)
                horizontalLineTo(13.43f)
                curveTo(15.25f, 15f, 16.41f, 13.05f, 15.53f, 11.45f)
                lineTo(14.25f, 9.12f)
                curveTo(14.65f, 9.04f, 15.07f, 9f, 15.5f, 9f)
                curveTo(19.09f, 9f, 22f, 11.91f, 22f, 15.5f)
                close()
            }
        }.build()

        return _Shapes1!!
    }

@Suppress("ObjectPropertyName")
private var _Shapes1: ImageVector? = null
