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

val VuesaxIconsTwotone.PercentageSquare: ImageVector
    get() {
        if (_PercentageSquare != null) {
            return _PercentageSquare!!
        }
        _PercentageSquare = ImageVector.Builder(
            name = "PercentageSquare",
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
                moveTo(9f, 2f)
                horizontalLineTo(15f)
                curveTo(20f, 2f, 22f, 4f, 22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 20f, 20f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(4f, 22f, 2f, 20f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 4f, 4f, 2f, 9f, 2f)
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
                moveTo(8.32f, 15.27f)
                lineTo(14.86f, 8.73f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.73f, 10.37f)
                curveTo(9.409f, 10.37f, 9.96f, 9.819f, 9.96f, 9.14f)
                curveTo(9.96f, 8.461f, 9.409f, 7.91f, 8.73f, 7.91f)
                curveTo(8.051f, 7.91f, 7.5f, 8.461f, 7.5f, 9.14f)
                curveTo(7.5f, 9.819f, 8.051f, 10.37f, 8.73f, 10.37f)
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
                moveTo(15.269f, 16.09f)
                curveTo(15.948f, 16.09f, 16.499f, 15.539f, 16.499f, 14.86f)
                curveTo(16.499f, 14.181f, 15.948f, 13.63f, 15.269f, 13.63f)
                curveTo(14.59f, 13.63f, 14.039f, 14.181f, 14.039f, 14.86f)
                curveTo(14.039f, 15.539f, 14.59f, 16.09f, 15.269f, 16.09f)
                close()
            }
        }.build()

        return _PercentageSquare!!
    }

@Suppress("ObjectPropertyName")
private var _PercentageSquare: ImageVector? = null
