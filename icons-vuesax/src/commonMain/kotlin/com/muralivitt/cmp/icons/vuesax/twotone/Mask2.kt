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

val VuesaxIconsTwotone.Mask2: ImageVector
    get() {
        if (_Mask2 != null) {
            return _Mask2!!
        }
        _Mask2 = ImageVector.Builder(
            name = "Mask2",
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
                moveTo(21.969f, 12f)
                curveTo(21.969f, 14.94f, 20.689f, 17.6f, 18.649f, 19.41f)
                curveTo(16.889f, 21.01f, 14.559f, 21.97f, 11.999f, 21.97f)
                curveTo(6.499f, 21.97f, 2.029f, 17.5f, 2.029f, 12f)
                curveTo(2.029f, 6.5f, 6.499f, 2.03f, 11.999f, 2.03f)
                curveTo(14.559f, 2.03f, 16.889f, 2.99f, 18.649f, 4.59f)
                curveTo(20.689f, 6.4f, 21.969f, 9.06f, 21.969f, 12f)
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
                moveTo(11.969f, 16.39f)
                curveTo(11.949f, 18.04f, 10.719f, 18.44f, 9.569f, 17.98f)
                curveTo(7.199f, 17.03f, 5.529f, 14.71f, 5.529f, 12f)
                curveTo(5.529f, 9.29f, 7.199f, 6.97f, 9.569f, 6.01f)
                curveTo(10.719f, 5.55f, 11.949f, 5.96f, 11.969f, 7.6f)
                verticalLineTo(16.39f)
                close()
            }
        }.build()

        return _Mask2!!
    }

@Suppress("ObjectPropertyName")
private var _Mask2: ImageVector? = null
