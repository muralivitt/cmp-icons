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

val VuesaxIconsTwotone.DirectUp: ImageVector
    get() {
        if (_DirectUp != null) {
            return _DirectUp!!
        }
        _DirectUp = ImageVector.Builder(
            name = "DirectUp",
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
                moveTo(9.169f, 4.71f)
                lineTo(3.069f, 16.3f)
                curveTo(1.619f, 19.05f, 4.549f, 22.04f, 7.329f, 20.65f)
                lineTo(10.569f, 19.03f)
                curveTo(11.469f, 18.58f, 12.529f, 18.58f, 13.429f, 19.03f)
                lineTo(16.669f, 20.65f)
                curveTo(19.449f, 22.04f, 22.369f, 19.05f, 20.929f, 16.3f)
                lineTo(14.829f, 4.71f)
                curveTo(13.629f, 2.43f, 10.369f, 2.43f, 9.169f, 4.71f)
                close()
            }
        }.build()

        return _DirectUp!!
    }

@Suppress("ObjectPropertyName")
private var _DirectUp: ImageVector? = null
