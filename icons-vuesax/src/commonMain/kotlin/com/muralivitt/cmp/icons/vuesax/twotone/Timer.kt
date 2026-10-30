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

val VuesaxIconsTwotone.Timer: ImageVector
    get() {
        if (_Timer != null) {
            return _Timer!!
        }
        _Timer = ImageVector.Builder(
            name = "Timer",
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
                moveTo(15.24f, 2f)
                horizontalLineTo(8.76f)
                curveTo(5f, 2f, 4.71f, 5.38f, 6.74f, 7.22f)
                lineTo(17.26f, 16.78f)
                curveTo(19.29f, 18.62f, 19f, 22f, 15.24f, 22f)
                horizontalLineTo(8.76f)
                curveTo(5f, 22f, 4.71f, 18.62f, 6.74f, 16.78f)
                lineTo(17.26f, 7.22f)
                curveTo(19.29f, 5.38f, 19f, 2f, 15.24f, 2f)
                close()
            }
        }.build()

        return _Timer!!
    }

@Suppress("ObjectPropertyName")
private var _Timer: ImageVector? = null
