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

val VuesaxIconsTwotone.StopCircle: ImageVector
    get() {
        if (_StopCircle != null) {
            return _StopCircle!!
        }
        _StopCircle = ImageVector.Builder(
            name = "StopCircle",
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
                moveTo(11.971f, 22f)
                curveTo(17.494f, 22f, 21.971f, 17.523f, 21.971f, 12f)
                curveTo(21.971f, 6.477f, 17.494f, 2f, 11.971f, 2f)
                curveTo(6.448f, 2f, 1.971f, 6.477f, 1.971f, 12f)
                curveTo(1.971f, 17.523f, 6.448f, 22f, 11.971f, 22f)
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
                moveTo(10.729f, 16.23f)
                horizontalLineTo(13.269f)
                curveTo(15.389f, 16.23f, 16.229f, 15.38f, 16.229f, 13.27f)
                verticalLineTo(10.73f)
                curveTo(16.229f, 8.61f, 15.38f, 7.77f, 13.269f, 7.77f)
                horizontalLineTo(10.729f)
                curveTo(8.61f, 7.77f, 7.77f, 8.62f, 7.77f, 10.73f)
                verticalLineTo(13.27f)
                curveTo(7.77f, 15.38f, 8.62f, 16.23f, 10.729f, 16.23f)
                close()
            }
        }.build()

        return _StopCircle!!
    }

@Suppress("ObjectPropertyName")
private var _StopCircle: ImageVector? = null
