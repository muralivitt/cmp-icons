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

val VuesaxIconsTwotone.Flash1: ImageVector
    get() {
        if (_Flash1 != null) {
            return _Flash1!!
        }
        _Flash1 = ImageVector.Builder(
            name = "Flash1",
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
                moveTo(6.089f, 13.28f)
                horizontalLineTo(9.179f)
                verticalLineTo(20.48f)
                curveTo(9.179f, 22.16f, 10.089f, 22.5f, 11.199f, 21.24f)
                lineTo(18.769f, 12.64f)
                curveTo(19.699f, 11.59f, 19.309f, 10.72f, 17.899f, 10.72f)
                horizontalLineTo(14.809f)
                verticalLineTo(3.52f)
                curveTo(14.809f, 1.84f, 13.899f, 1.5f, 12.789f, 2.76f)
                lineTo(5.219f, 11.36f)
                curveTo(4.299f, 12.42f, 4.689f, 13.28f, 6.089f, 13.28f)
                close()
            }
        }.build()

        return _Flash1!!
    }

@Suppress("ObjectPropertyName")
private var _Flash1: ImageVector? = null
