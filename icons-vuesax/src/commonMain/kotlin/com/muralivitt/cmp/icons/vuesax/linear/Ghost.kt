package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Ghost: ImageVector
    get() {
        if (_Ghost != null) {
            return _Ghost!!
        }
        _Ghost = ImageVector.Builder(
            name = "Ghost",
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
                moveTo(22f, 20.07f)
                verticalLineTo(12.18f)
                curveTo(22f, 6.58f, 17.5f, 2f, 12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.58f, 2f, 12.18f)
                verticalLineTo(20.07f)
                curveTo(2f, 21.33f, 2.75f, 21.67f, 3.67f, 20.83f)
                lineTo(4.67f, 19.92f)
                curveTo(5.04f, 19.58f, 5.64f, 19.58f, 6.01f, 19.92f)
                lineTo(8.01f, 21.75f)
                curveTo(8.38f, 22.09f, 8.98f, 22.09f, 9.35f, 21.75f)
                lineTo(11.35f, 19.92f)
                curveTo(11.72f, 19.58f, 12.32f, 19.58f, 12.69f, 19.92f)
                lineTo(14.69f, 21.75f)
                curveTo(15.06f, 22.09f, 15.66f, 22.09f, 16.03f, 21.75f)
                lineTo(18.03f, 19.92f)
                curveTo(18.4f, 19.58f, 19f, 19.58f, 19.37f, 19.92f)
                lineTo(20.37f, 20.83f)
                curveTo(21.25f, 21.67f, 22f, 21.33f, 22f, 20.07f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14f)
                curveTo(10.37f, 15.78f, 13.63f, 15.78f, 16f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11f)
                curveTo(13.105f, 11f, 14f, 10.105f, 14f, 9f)
                curveTo(14f, 7.895f, 13.105f, 7f, 12f, 7f)
                curveTo(10.895f, 7f, 10f, 7.895f, 10f, 9f)
                curveTo(10f, 10.105f, 10.895f, 11f, 12f, 11f)
                close()
            }
        }.build()

        return _Ghost!!
    }

@Suppress("ObjectPropertyName")
private var _Ghost: ImageVector? = null
