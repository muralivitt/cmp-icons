package com.muralivitt.cmp.icons.vuesax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import kotlin.Suppress

val VuesaxIconsLinear.Eraser: ImageVector
    get() {
        if (_Eraser != null) {
            return _Eraser!!
        }
        _Eraser = ImageVector.Builder(
            name = "Eraser",
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
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                curveTo(20f, 22f, 22f, 20f, 22f, 15f)
                verticalLineTo(9f)
                curveTo(22f, 4f, 20f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(4f, 2f, 2f, 4f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 20f, 4f, 22f, 9f, 22f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.99f, 15.08f)
                lineTo(8.93f, 17.02f)
                curveTo(9.57f, 17.66f, 10.63f, 17.66f, 11.27f, 17.02f)
                lineTo(17.02f, 11.27f)
                curveTo(17.66f, 10.63f, 17.66f, 9.57f, 17.02f, 8.93f)
                lineTo(15.08f, 6.99f)
                curveTo(14.44f, 6.35f, 13.38f, 6.35f, 12.74f, 6.99f)
                lineTo(6.99f, 12.74f)
                curveTo(6.34f, 13.38f, 6.34f, 14.43f, 6.99f, 15.08f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.31f, 10.42f)
                lineTo(13.58f, 14.69f)
            }
        }.build()

        return _Eraser!!
    }

@Suppress("ObjectPropertyName")
private var _Eraser: ImageVector? = null
