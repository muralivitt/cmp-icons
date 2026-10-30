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

val VuesaxIconsTwotone.ArrowBottom: ImageVector
    get() {
        if (_ArrowBottom != null) {
            return _ArrowBottom!!
        }
        _ArrowBottom = ImageVector.Builder(
            name = "ArrowBottom",
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
                moveTo(12f, 6f)
                horizontalLineTo(14.67f)
                curveTo(17.98f, 6f, 19.34f, 8.35f, 17.681f, 11.22f)
                lineTo(16.34f, 13.53f)
                lineTo(15f, 15.84f)
                curveTo(13.34f, 18.71f, 10.63f, 18.71f, 8.971f, 15.84f)
                lineTo(7.631f, 13.53f)
                lineTo(6.291f, 11.22f)
                curveTo(4.661f, 8.35f, 6.011f, 6f, 9.331f, 6f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _ArrowBottom!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottom: ImageVector? = null
