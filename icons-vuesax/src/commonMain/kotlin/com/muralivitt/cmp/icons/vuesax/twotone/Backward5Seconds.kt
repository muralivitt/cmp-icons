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

val VuesaxIconsTwotone.Backward5Seconds: ImageVector
    get() {
        if (_Backward5Seconds != null) {
            return _Backward5Seconds!!
        }
        _Backward5Seconds = ImageVector.Builder(
            name = "Backward5Seconds",
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
                moveTo(13.91f, 10.83f)
                horizontalLineTo(10.85f)
                lineTo(10.09f, 13.12f)
                horizontalLineTo(12.38f)
                curveTo(13.22f, 13.12f, 13.91f, 13.8f, 13.91f, 14.65f)
                curveTo(13.91f, 15.49f, 13.23f, 16.18f, 12.38f, 16.18f)
                horizontalLineTo(10.09f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.019f, 4.47f)
                lineTo(12f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.909f, 7.8f)
                curveTo(3.799f, 9.28f, 3.109f, 11.11f, 3.109f, 13.11f)
                curveTo(3.109f, 18.02f, 7.089f, 22f, 11.999f, 22f)
                curveTo(16.909f, 22f, 20.889f, 18.02f, 20.889f, 13.11f)
                curveTo(20.889f, 8.2f, 16.909f, 4.22f, 11.999f, 4.22f)
                curveTo(11.319f, 4.22f, 10.659f, 4.31f, 10.019f, 4.46f)
            }
        }.build()

        return _Backward5Seconds!!
    }

@Suppress("ObjectPropertyName")
private var _Backward5Seconds: ImageVector? = null
