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

val VuesaxIconsTwotone.Lock1: ImageVector
    get() {
        if (_Lock1 != null) {
            return _Lock1!!
        }
        _Lock1 = ImageVector.Builder(
            name = "Lock1",
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
                moveTo(6f, 10f)
                verticalLineTo(8f)
                curveTo(6f, 4.69f, 7f, 2f, 12f, 2f)
                curveTo(17f, 2f, 18f, 4.69f, 18f, 8f)
                verticalLineTo(10f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18.5f)
                curveTo(13.381f, 18.5f, 14.5f, 17.381f, 14.5f, 16f)
                curveTo(14.5f, 14.619f, 13.381f, 13.5f, 12f, 13.5f)
                curveTo(10.619f, 13.5f, 9.5f, 14.619f, 9.5f, 16f)
                curveTo(9.5f, 17.381f, 10.619f, 18.5f, 12f, 18.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 22f)
                horizontalLineTo(7f)
                curveTo(3f, 22f, 2f, 21f, 2f, 17f)
                verticalLineTo(15f)
                curveTo(2f, 11f, 3f, 10f, 7f, 10f)
                horizontalLineTo(17f)
                curveTo(21f, 10f, 22f, 11f, 22f, 15f)
                verticalLineTo(17f)
                curveTo(22f, 21f, 21f, 22f, 17f, 22f)
                close()
            }
        }.build()

        return _Lock1!!
    }

@Suppress("ObjectPropertyName")
private var _Lock1: ImageVector? = null
