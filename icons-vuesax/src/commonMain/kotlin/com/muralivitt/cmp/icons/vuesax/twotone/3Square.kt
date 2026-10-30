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

val VuesaxIconsTwotone.`3Square`: ImageVector
    get() {
        if (_3Square != null) {
            return _3Square!!
        }
        _3Square = ImageVector.Builder(
            name = "3Square",
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
                moveTo(12f, 17f)
                verticalLineTo(19.38f)
                curveTo(12f, 21.25f, 11.25f, 22f, 9.37f, 22f)
                horizontalLineTo(4.62f)
                curveTo(2.75f, 22f, 2f, 21.25f, 2f, 19.38f)
                verticalLineTo(14.63f)
                curveTo(2f, 12.75f, 2.75f, 12f, 4.62f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(14.37f)
                curveTo(7f, 16.25f, 7.75f, 17f, 9.62f, 17f)
                horizontalLineTo(12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 12f)
                verticalLineTo(14.37f)
                curveTo(17f, 16.25f, 16.25f, 17f, 14.37f, 17f)
                horizontalLineTo(9.62f)
                curveTo(7.75f, 17f, 7f, 16.25f, 7f, 14.37f)
                verticalLineTo(9.62f)
                curveTo(7f, 7.75f, 7.75f, 7f, 9.62f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(9.37f)
                curveTo(12f, 11.25f, 12.75f, 12f, 14.62f, 12f)
                horizontalLineTo(17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 4.62f)
                verticalLineTo(9.37f)
                curveTo(22f, 11.25f, 21.25f, 12f, 19.37f, 12f)
                horizontalLineTo(14.62f)
                curveTo(12.75f, 12f, 12f, 11.25f, 12f, 9.37f)
                verticalLineTo(4.62f)
                curveTo(12f, 2.75f, 12.75f, 2f, 14.62f, 2f)
                horizontalLineTo(19.37f)
                curveTo(21.25f, 2f, 22f, 2.75f, 22f, 4.62f)
                close()
            }
        }.build()

        return _3Square!!
    }

@Suppress("ObjectPropertyName")
private var _3Square: ImageVector? = null
