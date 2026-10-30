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

val VuesaxIconsTwotone.MoneyChange: ImageVector
    get() {
        if (_MoneyChange != null) {
            return _MoneyChange!!
        }
        _MoneyChange = ImageVector.Builder(
            name = "MoneyChange",
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
                moveTo(2f, 11f)
                verticalLineTo(9f)
                curveTo(2f, 5.5f, 4f, 4f, 7f, 4f)
                horizontalLineTo(17f)
                curveTo(20f, 4f, 22f, 5.5f, 22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 18.5f, 20f, 20f, 17f, 20f)
                horizontalLineTo(12f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14.5f)
                curveTo(13.381f, 14.5f, 14.5f, 13.381f, 14.5f, 12f)
                curveTo(14.5f, 10.619f, 13.381f, 9.5f, 12f, 9.5f)
                curveTo(10.619f, 9.5f, 9.5f, 10.619f, 9.5f, 12f)
                curveTo(9.5f, 13.381f, 10.619f, 14.5f, 12f, 14.5f)
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
                moveTo(18.5f, 9.5f)
                verticalLineTo(14.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 15.5f)
                horizontalLineTo(7.34f)
                curveTo(7.98f, 15.5f, 8.5f, 16.02f, 8.5f, 16.66f)
                verticalLineTo(17.94f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.22f, 14.28f)
                lineTo(2f, 15.5f)
                lineTo(3.22f, 16.72f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 20.78f)
                horizontalLineTo(3.16f)
                curveTo(2.52f, 20.78f, 2f, 20.26f, 2f, 19.62f)
                verticalLineTo(18.34f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.279f, 22f)
                lineTo(8.499f, 20.78f)
                lineTo(7.279f, 19.56f)
            }
        }.build()

        return _MoneyChange!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyChange: ImageVector? = null
