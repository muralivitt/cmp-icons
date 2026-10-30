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

val VuesaxIconsTwotone.Like1: ImageVector
    get() {
        if (_Like1 != null) {
            return _Like1!!
        }
        _Like1 = ImageVector.Builder(
            name = "Like1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.5f
            ) {
                moveTo(7.48f, 18.35f)
                lineTo(10.58f, 20.75f)
                curveTo(10.981f, 21.15f, 11.88f, 21.35f, 12.481f, 21.35f)
                horizontalLineTo(16.281f)
                curveTo(17.48f, 21.35f, 18.781f, 20.45f, 19.08f, 19.25f)
                lineTo(21.48f, 11.95f)
                curveTo(21.98f, 10.55f, 21.08f, 9.35f, 19.58f, 9.35f)
                horizontalLineTo(15.58f)
                curveTo(14.981f, 9.35f, 14.481f, 8.85f, 14.58f, 8.15f)
                lineTo(15.08f, 4.95f)
                curveTo(15.281f, 4.05f, 14.681f, 3.05f, 13.781f, 2.75f)
                curveTo(12.981f, 2.45f, 11.981f, 2.85f, 11.58f, 3.45f)
                lineTo(7.48f, 9.55f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.381f, 18.35f)
                verticalLineTo(8.55f)
                curveTo(2.381f, 7.15f, 2.981f, 6.65f, 4.381f, 6.65f)
                horizontalLineTo(5.381f)
                curveTo(6.781f, 6.65f, 7.381f, 7.15f, 7.381f, 8.55f)
                verticalLineTo(18.35f)
                curveTo(7.381f, 19.75f, 6.781f, 20.25f, 5.381f, 20.25f)
                horizontalLineTo(4.381f)
                curveTo(2.981f, 20.25f, 2.381f, 19.75f, 2.381f, 18.35f)
                close()
            }
        }.build()

        return _Like1!!
    }

@Suppress("ObjectPropertyName")
private var _Like1: ImageVector? = null
