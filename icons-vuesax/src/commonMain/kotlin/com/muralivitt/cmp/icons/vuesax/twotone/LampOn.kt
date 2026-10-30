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

val VuesaxIconsTwotone.LampOn: ImageVector
    get() {
        if (_LampOn != null) {
            return _LampOn!!
        }
        _LampOn = ImageVector.Builder(
            name = "LampOn",
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
                moveTo(8.3f, 18.04f)
                verticalLineTo(16.88f)
                curveTo(6f, 15.49f, 4.11f, 12.78f, 4.11f, 9.9f)
                curveTo(4.11f, 4.95f, 8.66f, 1.07f, 13.8f, 2.19f)
                curveTo(16.06f, 2.69f, 18.04f, 4.19f, 19.07f, 6.26f)
                curveTo(21.16f, 10.46f, 18.96f, 14.92f, 15.73f, 16.87f)
                verticalLineTo(18.03f)
                curveTo(15.73f, 18.32f, 15.84f, 18.99f, 14.77f, 18.99f)
                horizontalLineTo(9.26f)
                curveTo(8.16f, 19f, 8.3f, 18.57f, 8.3f, 18.04f)
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
                moveTo(8.5f, 22f)
                curveTo(10.79f, 21.35f, 13.21f, 21.35f, 15.5f, 22f)
            }
        }.build()

        return _LampOn!!
    }

@Suppress("ObjectPropertyName")
private var _LampOn: ImageVector? = null
