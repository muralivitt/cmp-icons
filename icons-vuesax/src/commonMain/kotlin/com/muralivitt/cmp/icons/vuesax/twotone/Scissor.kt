package com.muralivitt.cmp.icons.vuesax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.muralivitt.cmp.icons.vuesax.twotone.VuesaxIconsTwotone

import kotlin.Suppress

val VuesaxIconsTwotone.Scissor: ImageVector
    get() {
        if (_Scissor != null) {
            return _Scissor!!
        }
        _Scissor = ImageVector.Builder(
            name = "Scissor",
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
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.42f, 10.9f)
                curveTo(9.48f, 10.9f, 10.34f, 10.04f, 10.34f, 8.98f)
                curveTo(10.34f, 7.92f, 9.48f, 7.06f, 8.42f, 7.06f)
                curveTo(7.36f, 7.06f, 6.5f, 7.92f, 6.5f, 8.98f)
                curveTo(6.5f, 10.04f, 7.36f, 10.9f, 8.42f, 10.9f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.42f, 16.94f)
                curveTo(9.48f, 16.94f, 10.34f, 16.08f, 10.34f, 15.02f)
                curveTo(10.34f, 13.96f, 9.48f, 13.1f, 8.42f, 13.1f)
                curveTo(7.36f, 13.1f, 6.5f, 13.96f, 6.5f, 15.02f)
                curveTo(6.5f, 16.08f, 7.36f, 16.94f, 8.42f, 16.94f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 8.7f)
                lineTo(10.16f, 14.19f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 15.28f)
                lineTo(10.16f, 9.79f)
            }
        }.build()

        return _Scissor!!
    }

@Suppress("ObjectPropertyName")
private var _Scissor: ImageVector? = null
