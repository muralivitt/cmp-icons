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

val VuesaxIconsTwotone.DirectDown: ImageVector
    get() {
        if (_DirectDown != null) {
            return _DirectDown!!
        }
        _DirectDown = ImageVector.Builder(
            name = "DirectDown",
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
                moveTo(9.169f, 19.29f)
                lineTo(3.069f, 7.7f)
                curveTo(1.619f, 4.95f, 4.549f, 1.96f, 7.329f, 3.35f)
                lineTo(10.569f, 4.97f)
                curveTo(11.469f, 5.42f, 12.529f, 5.42f, 13.429f, 4.97f)
                lineTo(16.669f, 3.35f)
                curveTo(19.449f, 1.96f, 22.369f, 4.95f, 20.929f, 7.7f)
                lineTo(14.829f, 19.29f)
                curveTo(13.629f, 21.57f, 10.369f, 21.57f, 9.169f, 19.29f)
                close()
            }
        }.build()

        return _DirectDown!!
    }

@Suppress("ObjectPropertyName")
private var _DirectDown: ImageVector? = null
