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

val VuesaxIconsTwotone.Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Logout",
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
                moveTo(8.9f, 7.56f)
                curveTo(9.21f, 3.96f, 11.06f, 2.49f, 15.11f, 2.49f)
                horizontalLineTo(15.24f)
                curveTo(19.71f, 2.49f, 21.5f, 4.28f, 21.5f, 8.75f)
                verticalLineTo(15.27f)
                curveTo(21.5f, 19.74f, 19.71f, 21.53f, 15.24f, 21.53f)
                horizontalLineTo(15.11f)
                curveTo(11.09f, 21.53f, 9.24f, 20.08f, 8.91f, 16.54f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.999f, 12f)
                horizontalLineTo(3.619f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.85f, 8.65f)
                lineTo(2.5f, 12f)
                lineTo(5.85f, 15.35f)
            }
        }.build()

        return _Logout!!
    }

@Suppress("ObjectPropertyName")
private var _Logout: ImageVector? = null
