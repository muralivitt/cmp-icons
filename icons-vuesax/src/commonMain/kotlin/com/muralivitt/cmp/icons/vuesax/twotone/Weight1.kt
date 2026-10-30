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

val VuesaxIconsTwotone.Weight1: ImageVector
    get() {
        if (_Weight1 != null) {
            return _Weight1!!
        }
        _Weight1 = ImageVector.Builder(
            name = "Weight1",
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
                moveTo(17.18f, 18f)
                curveTo(19.58f, 18f, 20.18f, 16.65f, 20.18f, 15f)
                verticalLineTo(9f)
                curveTo(20.18f, 7.35f, 19.58f, 6f, 17.18f, 6f)
                curveTo(14.78f, 6f, 14.18f, 7.35f, 14.18f, 9f)
                verticalLineTo(15f)
                curveTo(14.18f, 16.65f, 14.78f, 18f, 17.18f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.82f, 18f)
                curveTo(4.42f, 18f, 3.82f, 16.65f, 3.82f, 15f)
                verticalLineTo(9f)
                curveTo(3.82f, 7.35f, 4.42f, 6f, 6.82f, 6f)
                curveTo(9.22f, 6f, 9.82f, 7.35f, 9.82f, 9f)
                verticalLineTo(15f)
                curveTo(9.82f, 16.65f, 9.22f, 18f, 6.82f, 18f)
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
                moveTo(9.82f, 12f)
                horizontalLineTo(14.18f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22.5f, 14.5f)
                verticalLineTo(9.5f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(1.5f, 14.5f)
                verticalLineTo(9.5f)
            }
        }.build()

        return _Weight1!!
    }

@Suppress("ObjectPropertyName")
private var _Weight1: ImageVector? = null
