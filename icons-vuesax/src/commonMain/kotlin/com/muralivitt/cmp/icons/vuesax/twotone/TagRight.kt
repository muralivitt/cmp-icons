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

val VuesaxIconsTwotone.TagRight: ImageVector
    get() {
        if (_TagRight != null) {
            return _TagRight!!
        }
        _TagRight = ImageVector.Builder(
            name = "TagRight",
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
                moveTo(4.219f, 3.1f)
                horizontalLineTo(15.659f)
                curveTo(16.339f, 3.1f, 17.189f, 3.57f, 17.549f, 4.15f)
                lineTo(21.729f, 10.83f)
                curveTo(22.129f, 11.48f, 22.089f, 12.5f, 21.629f, 13.11f)
                lineTo(16.449f, 20.01f)
                curveTo(16.079f, 20.5f, 15.279f, 20.9f, 14.669f, 20.9f)
                horizontalLineTo(4.219f)
                curveTo(2.469f, 20.9f, 1.409f, 18.98f, 2.329f, 17.49f)
                lineTo(5.099f, 13.06f)
                curveTo(5.469f, 12.47f, 5.469f, 11.51f, 5.099f, 10.92f)
                lineTo(2.329f, 6.49f)
                curveTo(1.409f, 5.02f, 2.479f, 3.1f, 4.219f, 3.1f)
                close()
            }
        }.build()

        return _TagRight!!
    }

@Suppress("ObjectPropertyName")
private var _TagRight: ImageVector? = null
