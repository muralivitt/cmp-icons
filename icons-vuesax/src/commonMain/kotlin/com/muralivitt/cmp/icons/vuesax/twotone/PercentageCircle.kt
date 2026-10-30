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

val VuesaxIconsTwotone.PercentageCircle: ImageVector
    get() {
        if (_PercentageCircle != null) {
            return _PercentageCircle!!
        }
        _PercentageCircle = ImageVector.Builder(
            name = "PercentageCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _PercentageCircle!!
    }

@Suppress("ObjectPropertyName")
private var _PercentageCircle: ImageVector? = null
