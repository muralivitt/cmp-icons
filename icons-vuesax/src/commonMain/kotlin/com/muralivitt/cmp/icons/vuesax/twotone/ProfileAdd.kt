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

val VuesaxIconsTwotone.ProfileAdd: ImageVector
    get() {
        if (_ProfileAdd != null) {
            return _ProfileAdd!!
        }
        _ProfileAdd = ImageVector.Builder(
            name = "ProfileAdd",
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
                moveTo(18.5f, 19.5f)
                horizontalLineTo(14.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 21.5f)
                verticalLineTo(17.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.161f, 10.87f)
                curveTo(12.061f, 10.86f, 11.941f, 10.86f, 11.831f, 10.87f)
                curveTo(9.451f, 10.79f, 7.561f, 8.84f, 7.561f, 6.44f)
                curveTo(7.551f, 3.99f, 9.541f, 2f, 11.991f, 2f)
                curveTo(14.441f, 2f, 16.431f, 3.99f, 16.431f, 6.44f)
                curveTo(16.431f, 8.84f, 14.531f, 10.79f, 12.161f, 10.87f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.989f, 21.81f)
                curveTo(10.169f, 21.81f, 8.359f, 21.35f, 6.979f, 20.43f)
                curveTo(4.559f, 18.81f, 4.559f, 16.17f, 6.979f, 14.56f)
                curveTo(9.729f, 12.72f, 14.239f, 12.72f, 16.989f, 14.56f)
            }
        }.build()

        return _ProfileAdd!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileAdd: ImageVector? = null
