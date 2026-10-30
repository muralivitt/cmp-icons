package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Scissor1: ImageVector
    get() {
        if (_Scissor1 != null) {
            return _Scissor1!!
        }
        _Scissor1 = ImageVector.Builder(
            name = "Scissor1",
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
                moveTo(5.5f, 10f)
                curveTo(7.433f, 10f, 9f, 8.433f, 9f, 6.5f)
                curveTo(9f, 4.567f, 7.433f, 3f, 5.5f, 3f)
                curveTo(3.567f, 3f, 2f, 4.567f, 2f, 6.5f)
                curveTo(2f, 8.433f, 3.567f, 10f, 5.5f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 21f)
                curveTo(7.433f, 21f, 9f, 19.433f, 9f, 17.5f)
                curveTo(9f, 15.567f, 7.433f, 14f, 5.5f, 14f)
                curveTo(3.567f, 14f, 2f, 15.567f, 2f, 17.5f)
                curveTo(2f, 19.433f, 3.567f, 21f, 5.5f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 6f)
                lineTo(8.65f, 15.98f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 17.97f)
                lineTo(8.65f, 7.98f)
            }
        }.build()

        return _Scissor1!!
    }

@Suppress("ObjectPropertyName")
private var _Scissor1: ImageVector? = null
