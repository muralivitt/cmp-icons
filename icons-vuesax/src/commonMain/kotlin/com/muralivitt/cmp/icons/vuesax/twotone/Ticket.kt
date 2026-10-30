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

val VuesaxIconsTwotone.Ticket: ImageVector
    get() {
        if (_Ticket != null) {
            return _Ticket!!
        }
        _Ticket = ImageVector.Builder(
            name = "Ticket",
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
                moveTo(19.5f, 12.5f)
                curveTo(19.5f, 11.12f, 20.62f, 10f, 22f, 10f)
                verticalLineTo(9f)
                curveTo(22f, 5f, 21f, 4f, 17f, 4f)
                horizontalLineTo(7f)
                curveTo(3f, 4f, 2f, 5f, 2f, 9f)
                verticalLineTo(9.5f)
                curveTo(3.38f, 9.5f, 4.5f, 10.62f, 4.5f, 12f)
                curveTo(4.5f, 13.38f, 3.38f, 14.5f, 2f, 14.5f)
                verticalLineTo(15f)
                curveTo(2f, 19f, 3f, 20f, 7f, 20f)
                horizontalLineTo(17f)
                curveTo(21f, 20f, 22f, 19f, 22f, 15f)
                curveTo(20.62f, 15f, 19.5f, 13.88f, 19.5f, 12.5f)
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
                moveTo(10f, 4f)
                lineTo(10f, 20f)
            }
        }.build()

        return _Ticket!!
    }

@Suppress("ObjectPropertyName")
private var _Ticket: ImageVector? = null
