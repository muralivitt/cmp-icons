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

val VuesaxIconsTwotone.Pause: ImageVector
    get() {
        if (_Pause != null) {
            return _Pause!!
        }
        _Pause = ImageVector.Builder(
            name = "Pause",
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
                moveTo(10.65f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(10.65f, 3.54f, 10.08f, 3f, 8.64f, 3f)
                horizontalLineTo(5.01f)
                curveTo(3.57f, 3f, 3f, 3.54f, 3f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(3f, 20.46f, 3.57f, 21f, 5.01f, 21f)
                horizontalLineTo(8.64f)
                curveTo(10.08f, 21f, 10.65f, 20.46f, 10.65f, 19.11f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(21f, 3.54f, 20.43f, 3f, 18.99f, 3f)
                horizontalLineTo(15.36f)
                curveTo(13.93f, 3f, 13.35f, 3.54f, 13.35f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(13.35f, 20.46f, 13.92f, 21f, 15.36f, 21f)
                horizontalLineTo(18.99f)
                curveTo(20.43f, 21f, 21f, 20.46f, 21f, 19.11f)
                close()
            }
        }.build()

        return _Pause!!
    }

@Suppress("ObjectPropertyName")
private var _Pause: ImageVector? = null
