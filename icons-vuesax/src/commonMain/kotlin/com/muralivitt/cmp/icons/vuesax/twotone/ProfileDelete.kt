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

val VuesaxIconsTwotone.ProfileDelete: ImageVector
    get() {
        if (_ProfileDelete != null) {
            return _ProfileDelete!!
        }
        _ProfileDelete = ImageVector.Builder(
            name = "ProfileDelete",
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
                moveTo(18.41f, 18.09f)
                lineTo(15.59f, 20.91f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.41f, 20.91f)
                lineTo(15.59f, 18.09f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.16f, 10.87f)
                curveTo(12.061f, 10.86f, 11.941f, 10.86f, 11.83f, 10.87f)
                curveTo(9.451f, 10.79f, 7.561f, 8.84f, 7.561f, 6.44f)
                curveTo(7.561f, 3.99f, 9.541f, 2f, 12f, 2f)
                curveTo(14.45f, 2f, 16.441f, 3.99f, 16.441f, 6.44f)
                curveTo(16.431f, 8.84f, 14.54f, 10.79f, 12.16f, 10.87f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.001f, 21.81f)
                curveTo(10.181f, 21.81f, 8.371f, 21.35f, 6.991f, 20.43f)
                curveTo(4.571f, 18.81f, 4.571f, 16.17f, 6.991f, 14.56f)
                curveTo(9.741f, 12.72f, 14.251f, 12.72f, 17.001f, 14.56f)
            }
        }.build()

        return _ProfileDelete!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileDelete: ImageVector? = null
